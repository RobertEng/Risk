import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

import BreezySwing.GBFrame;
import BreezySwing.GBPanel;
import BreezySwing.IntegerField;

public class WorldGraphics extends GBFrame{

	private Control con;


	
	private ActionPanel actionActPanel;
	private DonePanel doneActPanel;
	private WorldPanel mapActPanel;

	
	private GBPanel actionPanel;
	private GBPanel donePanel;
	private GBPanel mapPanel;
	private GBPanel spacerPanel;
	
	private IntegerField armyField;
	
	private JLabel info;
	

	
	private World world;

	/**
	 * default constructor
	 */
	public WorldGraphics(int ownershipSetup, int numPlayers, int numAI, World world) {
		
		
		con = new Control(world);
		
		this.world = world;
		
		ArrayList<Country>countryList = world.getCountryList();
		ArrayList<Player>playerList = new ArrayList<Player>();
		
		for(int a=0; a<countryList.size(); a++){
			world.getCountryList().get(a).setPlayerList(playerList);
		}
		
		
		
		//create ownership of countries

		
		ArrayList[]ownedLists = new ArrayList[numPlayers+numAI];
		for(int a=0; a<ownedLists.length; a++){
			ownedLists[a]=new ArrayList<Country>();
		}
		
		if(ownershipSetup==0){//preset
			for(int a=0; a<countryList.size(); a++){
				ownedLists[a%(numPlayers+numAI)].add(countryList.get(a));
			}
		}else if(ownershipSetup==1){
			

			System.out.println("Before"+countryList.size());
			ArrayList<Country> copy = (ArrayList<Country>) countryList.clone();
			Random gen = new Random();
			
			
			
			System.out.println("after copy"+countryList.size());
			while(copy.size()>0){
				int currCoun = gen.nextInt(copy.size());
				ownedLists[copy.size()%(numPlayers+numAI)].add(copy.get(currCoun));
				copy.remove(currCoun);
			}

		}
		
		
		for(int a=0; a<numPlayers; a++){
			playerList.add(new Player(ownedLists[a]));
		}
		for(int a=0; a<numAI; a++){
			playerList.add(new StanleyAI(ownedLists[numPlayers+a],this));
		}

		Color[] colors = new Color[]{Color.red, Color.blue, Color.yellow, Color.magenta, Color.orange, Color.pink};
		

		
		for(int a=0; a<playerList.size(); a++){
			playerList.get(a).setCon(con);
		}
		
		
		//oodlesssssss
		//setcolor
		for(int a=0; a<playerList.size(); a++){
			playerList.get(a).setColor(colors[a]);
		}
		
	
		con.setCountryList(countryList);
		con.setPlayerList(playerList);
		
		con.setPlayerInd(con.getPlayerList().size()-1);
		con.setToMode(1);
		//con.setPlayerInd(0);
		

		

		// space these later!
		//spaceout();

		//final BufferedImage imageR;
		JLabel reinforceLabel;
		/*try {
			imageR = ImageIO.read(new File(new File(".").getCanonicalPath()+"\\resources\\reinforce.png"));
			reinforceLabel = new JLabel((Icon)(new ImageIcon(imageR))){
				public void paintComponent(Graphics g){
					g.drawImage(imageR,0,0,null);
				}
			};
			reinforceLabel.repaint();
			
			System.out.println("Work");
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		reinforceLabel = addLabel("", 3,1,1,1);
		
		info = addLabel("<html>Reinforcements: "+con.getReinforcements()+"<br/>hello</html>",3,1,2,1);
		Dimension d = info.getPreferredSize();
		//info.setPreferredSize(new Dimension((int)d.getWidth()+80,(int)d.getHeight()+80));
		info.setMinimumSize(new Dimension(200, 100));
		info.setMaximumSize(new Dimension(200, 100));
		info.setPreferredSize(new Dimension(200,100));
		info.setOpaque(true);
		info.setBackground(Color.black);
		
		JLabel phaseLabel = addLabel("REINFORCE",2,1,2,1);
		phaseLabel.setMinimumSize(new Dimension(200, 100));
		phaseLabel.setMaximumSize(new Dimension(200, 100));
		phaseLabel.setPreferredSize(new Dimension(200,100));
		con.setPhaseLabel(phaseLabel);
		
		mapActPanel = new WorldPanel(con, info, world);
		mapPanel = addPanel(mapActPanel, 1,1,7,1);
		mapPanel.setMinimumSize(new Dimension(900, 700));
		mapPanel.setMaximumSize(new Dimension(900, 700));
		mapPanel.setPreferredSize(new Dimension(900,700));
	//	Dimension e = mapPanel.getPreferredSize();
	//	mapPanel.setPreferredSize(new Dimension(600,400));
		
	//	setLayout(null);
		

		
	//	mapPanel.setMinimumSize(new Dimension(600, 400));
	//	mapPanel.setMaximumSize(new Dimension(600, 400));
	//	mapPanel.setPreferredSize(new Dimension(600, 400));
		//	setResizable(false); //COOL BEANS!!!!!!!!!!!!!!!!!!!!!!
		
	//	mapPanel.setOpaque(true);
		
		doneActPanel = new DonePanel(con);
		donePanel = addPanel(doneActPanel,2,6,2,2);
		donePanel.setMinimumSize(new Dimension(200, 200));
		donePanel.setMaximumSize(new Dimension(200, 200));
		donePanel.setPreferredSize(new Dimension(200,200));
		
		armyField = addIntegerField(0, 2,3,1,1);
		armyField.setMinimumSize(new Dimension(100, 100));
		armyField.setMaximumSize(new Dimension(100, 100));
		armyField.setPreferredSize(new Dimension(100,100));
		
		ArrayList<GBPanel> countryPanelList = new ArrayList<GBPanel>();
		
		countryPanelList.add(mapActPanel);
		
		actionActPanel = new ActionPanel(con, countryPanelList, armyField, info, doneActPanel);
		doneActPanel.setActionActPanel(actionActPanel);
		actionPanel = addPanel(actionActPanel,2,4,2,2);
		actionPanel.setMinimumSize(new Dimension(200, 200));
		actionPanel.setMaximumSize(new Dimension(200, 200));
		actionPanel.setPreferredSize(new Dimension(200,200));


		
	}


	

	
	public void redraw(){
		System.out.println("Redraw!");
		//if(actionActPanel!=null){
			actionActPanel.repaint();
		//	System.out.println("Ooga");
		//}
			
		//if(doneActPanel!=null){
			doneActPanel.repaint();
		//	System.out.println("Booga");
		//}
		
	//		mapActPanel.detect(true);
	//		mapActPanel.validate();
	//		validate();
	//	if(mapActPanel!=null){
	//		mapActPanel.repaint();
			mapPanel.repaint();
	//		mapActPanel.paintComponent(mapActPanel.getGraphics());// THIS works!!
		//	System.out.println("Mooga");
	//	}
			
	//	con.relabel(info);
		

	}


}
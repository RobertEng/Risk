import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

import BreezySwing.GBPanel;
import BreezySwing.IntegerField;

public class ActionPanel extends GBPanel {

	private Control con;
	private ArrayList<GBPanel> counPanelList;
	private IntegerField armyField;
	private JLabel info;
	private DonePanel donePanel;
	//private BufferedImage image;
	
	public ActionPanel(Control control,
			ArrayList<GBPanel> countryPanelList, IntegerField armIntField, JLabel information, DonePanel donePanel) {
		con = control;
		counPanelList = countryPanelList;
		armyField = armIntField;
		info=information;
		this.donePanel = donePanel;
		
		setBackground(Color.black);
		
		//try {
		//	image = ImageIO.read(new File(new File(".").getCanonicalPath()+"\\resources\\reinforce.png"));
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
		
		
		String fontNames[]=Toolkit.getDefaultToolkit().getFontList();
		int i;
		for(i=0;i<fontNames.length; i++){
			System.out.println(fontNames[i]);
		}
		

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int posX=10;
        int posY=50;
        

		try {
			Font font =Font.createFont(Font.TRUETYPE_FONT, new File("DS-DIGI.ttf"));
			font=font.deriveFont(Font.PLAIN,50);
			g.setFont(font);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       // g.setFont( new Font("DS-Digital",Font.PLAIN,50));
        g.setColor(new Color(54,18,11));
        g.drawString("88888888", posX, posY);
        g.setColor(Color.darkGray);
        
        
        int length = 8; //how many letters max
        int x=posX-10;
        int y=posY-g.getFont().getSize()+5;
        int width=g.getFont().getSize()*length/2+20;
        int height=g.getFont().getSize()+5;
        g.drawRect(x,y,width,height);
        g.drawRect(x+1,y+1,width-2,height-2);
        g.drawRect(x+2,y+2,width-4,height-4);
		g.setColor(Color.yellow);
		
		
		if (con.getMode() == 1) {
			g.drawString("PLACE", posX, posY);
		} else if (con.getMode() == 2) {
			g.drawString("I NVADE", posX, posY);
		}else if (con.getMode() == 3){
			g.drawString("TRANSFER", posX, posY);
		}else if(con.getMode() == 4){
			g.drawString("MOVE", posX,posY);
		}
		
		//repaint the other panels
		for (int a = 0; a < counPanelList.size(); a++) {
			
				((WorldPanel)(counPanelList.get(a))).repaint();
			
			
		}
		donePanel.repaint();
		System.out.println("I has reinforcements: "+con.getReinforcements());
		con.relabel(info);
		
		//g.drawImage(image, 0, 0, null);
		
	}

	public void mouseClicked(int x, int y) {
		if (con.getMode() == 1) { // Checks if reinforcement phase
			if (con.getCurrCoun()!=null) {// Checks if anything is selected
				if (con.getPlayerList().get(con.getPlayerInd()).isOwned(con.getCurrCoun())) { //Checks if owned by player
					if (armyField.getNumber() <= con.getReinforcements()) { //Checks if available reinforcements
						con.getCurrCoun().setArmies(con.getCurrCoun().getArmies()+ armyField.getNumber());
						con.setReinforcements(con.getReinforcements() - armyField.getNumber());
						
						System.out.println(con.getReinforcements());
					}
				}
			}
			if (con.getReinforcements() <= 0) {
				con.setToMode(2);
			}
			System.out.println("Mode=1 " + armyField.getNumber());
		} else if (con.getMode() == 2) {
			if(con.getFromCountry()!=null&&con.getToCountry()!=null){//Checks if there are selected countries
				if (con.getFromCountry().isNextTo(con.getToCountry())) { // Checks the countries are next to
																		// each other
					if(con.getFromCountry().getArmies()>armyField.getNumber()){
						con.getFromCountry().attack(con.getToCountry(),armyField.getNumber());
						System.out.println("Atttackkkk");
						if(con.getToCountry().getArmies()<=0){
							
							if(con.getFromCountry().getArmies()==4){
								con.getFromCountry().fortify(con.getToCountry(),3);

							}else if(con.getFromCountry().getArmies()==3){
								con.getFromCountry().fortify(con.getToCountry(),2);

							}else if(con.getFromCountry().getArmies()==2){
								con.getFromCountry().fortify(con.getToCountry(),1);

							}else{
								con.setToMode(4);
								if(con.isEnd())
									counPanelList.get(0).repaint();
							}
							
							
							System.out.println("HOOO");
							for(int a=0; a<con.getPlayerList().size(); a++){//remove and add the defense country
								System.out.println("BARKK");
								for(int e=0; e<con.getPlayerList().get(a).getOwned().size(); e++){
									System.out.println("OINKKK");
									if(con.getPlayerList().get(a).getOwned().get(e).equals(con.getToCountry())){
										con.getPlayerList().get(con.getPlayerInd()).getOwned().add(con.getToCountry());
										con.getPlayerList().get(a).getOwned().remove(e);
										//repaint the other panels
										for (int i = 0; i < counPanelList.size(); i++) {
										//	if(counPanelList.get(i) instanceof CountryPanel){
									//			((CountryPanel)(counPanelList.get(i))).repaint();
										//	}else{
												((WorldPanel)(counPanelList.get(i))).repaint();
											//}
											System.out.println("neigh neigh neigh");
										}
										donePanel.repaint();
									}
								}
							}
						}
					}
				}
				System.out.println(con.getFromCountry().isNextTo(con.getToCountry()));
			}
			
			System.out.println("Mode=2");
		} else if (con.getMode() == 3) {
			if(con.getFromCountry()!=null&&con.getToCountry()!=null){
				
				//check if enough armies
				if(con.getFromCountry().getArmies()>armyField.getNumber()){
					
					if(con.getFromCountry().isConnectedTo(con.getToCountry(),con.getPlayerInd())){
						con.getFromCountry().fortify(con.getToCountry(),armyField.getNumber());
						con.setToMode(1);
						donePanel.repaint();
					}
				}
			}
			
			System.out.println("Mode=3");
		} else if(con.getMode() == 4){
			if(armyField.getNumber()<con.getFromCountry().getArmies()&&armyField.getNumber()>=3){

					con.getFromCountry().fortify(con.getToCountry(),armyField.getNumber());
					con.setToMode(2);
				}
				
			
			
			
			System.out.println("Mode=4");
		}else{
			System.out.println("Oh noes");
		}

		repaint();
	}
	

}

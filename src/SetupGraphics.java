import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import BreezySwing.GBFrame;
import BreezySwing.IntegerField;


public class SetupGraphics extends GBFrame{
	private JButton play;
	private JComboBox mapBox;
	private IntegerField playerField;
	private IntegerField aiField;
	private JLabel playerLabel, ownershipSetupLabel, aiLabel;
	private JButton setupLeft;
	private JButton setupRight;
	private JComboBox ownershipSetupBox;
	
	public SetupGraphics(){
		
		playerLabel = addLabel("Players",3,1,2,1);
		playerField = addIntegerField(1,   3,3,2,1);
		aiLabel = addLabel("AI", 5,1,2,1);
		aiField = addIntegerField(1,    5,3,2,1);
		ownershipSetupLabel = addLabel("Ownership Setup",4,1,2,1);
		
		String[] ownStrings = {"Preset", "Random"};
		ownershipSetupBox = addComboBox(4,3,2,1);
		for(int a=0; a<ownStrings.length; a++){
			ownershipSetupBox.addItem(ownStrings[a]);
		}
		
		String[] mapStrings = {"Global World", "Europe World", "Mini World"};
		mapBox = addComboBox(1,1,4,1);
		for(int a=0; a<mapStrings.length; a++){
			mapBox.addItem(mapStrings[a]);
		}
		
		play=addButton("PLAY", 4,3,1,1);
		
	}
	
	public void buttonClicked(JButton buttonObj){
		if(buttonObj.equals(play)){
			System.out.println("Playy!");
			
			int ownMode=0;
			if(ownershipSetupBox.getSelectedItem().equals("Preset")){
				ownMode=0; //Preset
			}else if(ownershipSetupBox.getSelectedItem().equals("Random")){
				ownMode=1;
			}else{
				//add other modes later
			}
			
			setVisible(false);
			

			if(mapBox.getSelectedItem().equals("Global World")){
				WorldGraphics globe = new WorldGraphics(ownMode, playerField.getNumber(), aiField.getNumber(), new GlobalWorld());
				globe.setSize(900,900);
				globe.getContentPane().setBackground(Color.black);
				globe.setVisible(true);
			}else if(mapBox.getSelectedItem().equals("Europe World")){
				WorldGraphics globe = new WorldGraphics(ownMode, playerField.getNumber(), aiField.getNumber(), new EuropeWorld());
				globe.setSize(900,900);
				globe.getContentPane().setBackground(Color.black);
				globe.setVisible(true);
				System.out.println("IT WORKS");
			}else if(mapBox.getSelectedItem().equals("Mini World")){
				WorldGraphics globe = new WorldGraphics(ownMode, playerField.getNumber(), aiField.getNumber(), new MiniWorld());
				globe.setSize(900,900);
				globe.getContentPane().setBackground(Color.black);
				globe.setVisible(true);
				System.out.println("IT WORKS");
			}
			System.out.println("#ofPlayers:"+playerField.getNumber()+"\n"+"#ofAI:"+aiField.getNumber()+"\n"+"OwnMode:"+ownMode);
		}
	}
	
}

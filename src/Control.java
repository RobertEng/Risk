
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;


public class Control {

	private ArrayList<Country> countryList;
	private ArrayList<Player> playerList;
	private Country fromCountry;
	private Country toCountry;
	private int mode; //mode 1: reinforce; mode 2: attack; mode 3: fortify mode 4: moving armies
	private Country currCoun;
	private int reinforcements;
	private int playerInd;
	private World world;
	private boolean end;
	private JLabel phaseLabel;
	
	public Control(World world){
		
		this.world = world;
		
		countryList = new ArrayList<Country>();
		playerList = new ArrayList<Player>();
		
		
		
		mode = 1;
		fromCountry=null;
		fromCountry=null;
		currCoun = null;
		playerInd = 0;
		end = false;
		
		System.out.println("reinforcements" + reinforcements);
		
	}
	
	public void setToMode(int mod){

		try {
			Font font =Font.createFont(Font.TRUETYPE_FONT, new File("DS-DIGI.ttf"));
			font=font.deriveFont(Font.PLAIN,20);
	//		phaseLabel.setFont(font);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		while(playerList.get(playerInd).getOwned().size()<=0){
			playerList.remove(playerInd);
			if(playerInd>=playerList.size()-1){
				playerInd=0;
			}else{
				playerInd++;
			}
		}
		
		if(mod==1){
			mode=1;
			if(playerInd==playerList.size()-1)
				playerInd=0;
			else
				playerInd++;
			currCoun=null;
			fromCountry=null;
			toCountry=null;
		//	phaseLabel.setText("REINFORCE");
			System.out.println("Meow");
			
			reinforcements=playerList.get(playerInd).getOwned().size()/3+1;
			reinforcements+=bonus(playerList.get(playerInd).getOwned());
			if(reinforcements<3){
				reinforcements=3;
			}
			
			if(playerList.get(playerInd) instanceof StanleyAI){
				((AI) playerList.get(playerInd)).move();
				
			}
			
			System.out.println("New Turn");
		}else if(mod==2){
			mode=2;
			currCoun=null;
			fromCountry=null;
			toCountry=null;
			phaseLabel.setText("ATTACK");
		}else if(mod==3){
			mode=3;
			currCoun=null;
			fromCountry=null;
			toCountry=null;
			phaseLabel.setText("FORTIFY");
		}else if(mod==4){
			if(endGame())
				end=true;
			mode=4;
		}
		
	}
	
	private int bonus(ArrayList<Country> owned) {
		int sum=0;
		
		//process the owned list
		for(int a=0; a<owned.size(); a++){
			boolean flag=false;
			for(int e=0; e<world.getContinentBonus().size(); e++){
				flag=world.getContinentBonus().get(e).process(owned.get(a));
				if(flag)
					e=world.getContinentBonus().size()+1;
			}
		}
		//check for bonuses
		for(int a=0; a<world.getContinentBonus().size(); a++){
			sum+=world.getContinentBonus().get(a).calcBonus();
		}
		//reset everything
		for(int a=0; a<world.getContinentBonus().size(); a++){
			world.getContinentBonus().get(a).reset();
		}
		//return the value
		return sum;
	}

	public void relabel(JLabel info){
		
		info.setBackground(playerList.get(playerInd).getColor());
		
		try {
			Font font =Font.createFont(Font.TRUETYPE_FONT, new File("DS-DIGI.ttf"));
			font=font.deriveFont(Font.PLAIN,15);
			info.setFont(font);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		info.setText("<html>Player: "+(playerInd+1)+"<br/>");
		
		if(mode==1){
			info.setText(info.getText()+"Reinforcements: "+reinforcements + "<br/>" +
				"Current Country: ");
			if(currCoun!=null){
				info.setText(info.getText()+" "+currCoun.getName());
			}
		}else if(mode>=2){
			info.setText(info.getText()+"From Country: ");
			if(fromCountry!=null){
				info.setText(info.getText()+fromCountry.getName());
			}
			info.setText(info.getText()+"<br/>");
			info.setText(info.getText()+"To Country: ");
			if(toCountry!=null){
				info.setText(info.getText()+toCountry.getName());
			}
		}
		info.setText(info.getText() + " </html>");
		
	}
	
	/**
	 * Locates the index of a country from a given directory Integer. Returns -1
	 * if no index is found. Should never happen.
	 * 
	 * @param dir
	 * @return
	 */
	public int findCountryInd(Country find) {
		for (int a = 0; a < countryList.size(); a++) {
			if (countryList.get(a).getName().equals(find)) {
				return a;
			}
		}
		return -1;
	}
	
	public boolean endGame() {
		if (playerList.get(playerInd).getOwned().size() >= countryList.size())
			return true;
		return false;
	}

	public ArrayList<Country> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<Country> countryList) {
		this.countryList = countryList;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getReinforcements() {
		return reinforcements;
	}

	public void setReinforcements(int reinforcements) {
		this.reinforcements = reinforcements;
	}

	public int getPlayerInd() {
		return playerInd;
	}

	public void setPlayerInd(int playerInd) {
		this.playerInd = playerInd;
	}

	public Country getFromCountry() {
		return fromCountry;
	}

	public void setFromCountry(Country fromCountry) {
		this.fromCountry = fromCountry;
	}

	public Country getToCountry() {
		return toCountry;
	}

	public void setToCountry(Country toCountry) {
		this.toCountry = toCountry;
	}

	public Country getCurrCoun() {
		return currCoun;
	}

	public void setCurrCoun(Country currCoun) {
		this.currCoun = currCoun;
	}

	public boolean isEnd() {
		return end;
	}

	public void setEnd(boolean end) {
		this.end = end;
	}

	public JLabel getPhaseLabel() {
		return phaseLabel;
	}

	public void setPhaseLabel(JLabel phaseLabel) {
		this.phaseLabel = phaseLabel;
	}
}

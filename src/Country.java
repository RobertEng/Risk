import java.util.ArrayList;
import java.util.Random;

public class Country {
	
	private String name;
	private int armies;
	private ArrayList<Player> playerList;
	private ArrayList<Country> borderCountry;

	
	public Country(int armies, String name){
		this.name = name;
		this.armies=armies;
		borderCountry= new ArrayList<Country>();
		
	}
	
	public void attack(Country defense, int attackers){
		
		int[] atkDiceRoll;
		int[] defDiceRoll;
		if (attackers > 2)
			atkDiceRoll = new int[3];
		else
			atkDiceRoll = new int[attackers];

		if (defense.getArmies() > 1)
			defDiceRoll = new int[2];
		else
			defDiceRoll = new int[defense.getArmies()];
		
		for(int a=0; a<atkDiceRoll.length; a++) {
			atkDiceRoll[a] = diceRoll();
		}
		
		for(int e=0; e<defDiceRoll.length; e++) {
			defDiceRoll[e] = diceRoll();
		}
		
		bubbleSort(atkDiceRoll);
		bubbleSort(defDiceRoll);
		
		if (defDiceRoll.length > atkDiceRoll.length) {
	    	for(int i=0; i<atkDiceRoll.length; i++) {
	    		if (atkDiceRoll[i] > defDiceRoll[i])
		    		defense.setArmies(defense.getArmies()-1);
		    	else
		    		armies--;
	    	}	
		}
		
		else {
	    	for(int u=0; u<defDiceRoll.length; u++)
	    		if (atkDiceRoll[u] > defDiceRoll[u])
		    		defense.setArmies(defense.getArmies()-1);
		    	else
		    		armies--;
	    }	
	}
	
	public int diceRoll() {
		Random generator = new Random();
		return generator.nextInt(5)+1;
	}
	
	// sorted from greatest to least
	public void bubbleSort(int [] list) {
		for (int outer=0; outer<list.length-1; outer++) {
			for (int inner=0; inner<list.length-outer-1; inner++) {
				if (list[inner] < list[inner+1]){
					int temp = list[inner];
					list[inner] = list[inner+1];
					list[inner+1] = temp;
				}
			}
		}
	}
	
	public void fortify(Country to, int transfers){
		armies-=transfers;
		to.setArmies(to.getArmies()+transfers);
	}
	
	
	public boolean isNextTo(Country other){
		for(int a=0; a<borderCountry.size(); a++){
			if(other.equals(borderCountry.get(a))){
				return true;
			}
		}
		return false;
	}
	
	
	
	/**
	 *	for use in the actionPanel class ...
	 *
	 *	if from.isConnectedTo(to) {
	 *		have user input number of fortifyArmies
	 *		from.fortify(to, fortifyArmies)
	 *	}
	 *	
	 *	else
	 *		print to the command panel "these two countries aren't connected"
	 *
	 */

	
	public boolean isConnectedTo(Country other, int playerInd) {
		ArrayList <Country> ownedNeighbors = new ArrayList <Country>();
		for (int a=0; a<findOwnedNeighbors(playerInd, ownedNeighbors).size(); a++) {
			if (other.equals(findOwnedNeighbors(playerInd,ownedNeighbors).get(a))) {
				// displayOwnedNeighbors();
				return true;
			}
		}
		return false;
	}
	    	
	public ArrayList <Country> findOwnedNeighbors(int playerInd, ArrayList <Country> ownedNeighbors) {
		for (Country c : borderCountry) {
			if (playerList.get(playerInd).equals(c.getOwner()) && !equals(c) && !ownedNeighbors.contains(c)) {
				ownedNeighbors.add(c);
				c.findOwnedNeighbors(playerInd, ownedNeighbors);
				//displayOwnedNeighbors();
			}
		}
		return ownedNeighbors;
	}
	
	public ArrayList <Country> findEnemyNeighbors(int playerInd, ArrayList <Country> enemyNeighbors) {
		for (Country c : borderCountry) {
			if (!playerList.get(playerInd).equals(c.getOwner()) && !equals(c) && !enemyNeighbors.contains(c)) {
				enemyNeighbors.add(c);
				c.findEnemyNeighbors(playerInd, enemyNeighbors);
			}
		}
		return enemyNeighbors;
	}
	
	/*public void displayOwnedNeighbors() {
		for (int i = 0; i < ownedNeighbors.size(); i++) {
			System.out.println(toString(ownedNeighbors.get(i)));
		}
	}*/
	
	public String toString() {
		return name;
	}
	

	
	
	
	
	
	public boolean equals(Country other){
		if(name.equals(other.getName()))
			return true;
		return false;
	}
	
	public Player getOwner(){
		for(int a=0; a<playerList.size(); a++){
			for(int e=0; e<playerList.get(a).getOwned().size(); e++){
				if(equals(playerList.get(a).getOwned().get(e))){
					return playerList.get(a);
				}
			}
		}
		System.out.println("No owner?! what is this...");
		return null;
	}

	public int getArmies() {
		return armies;
	}

	public void setArmies(int armies) {
		this.armies = armies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}

	public ArrayList<Country> getBorderCountry() {
		return borderCountry;
	}

	public void setBorderCountry(ArrayList<Country> borderCountry) {
		this.borderCountry = borderCountry;
	}
}

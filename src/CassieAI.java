
import java.awt.Color;
import java.util.ArrayList;

public class CassieAI extends AI {
	
	private double moveValue;
	
	public CassieAI(ArrayList<Country> ownedLists, WorldGraphics graph) {
		super(ownedLists, graph);
		moveValue = 0;
	}
	
	public Country getReinCoun() {
		ArrayList <Double> reinCountryValue = new ArrayList <Double>();
		getReinValue(reinCountryValue);
		int highIndex = 0;
		for (int a=1; a < reinCountryValue.size(); a++) {
			if (reinCountryValue.get(a) > reinCountryValue.get(highIndex)) {
				highIndex = a;
			}
		}
		return owned.get(highIndex);
	}
	
	public ArrayList <Country> getReinValue(ArrayList <Country> reinCountryValue) {
		ArrayList <Country> ownedNeighbors = new ArrayList <Country>();
		ArrayList <Country> enemyNeighbors = new ArrayList <Country>();
		
		for (Country c : owned) {
			int numOwnedNeighbors = c.findOwnedNeighbors(con.getPlayerInd(), ownedNeighbors).size();
			int numEnemyNeighbors = c.findEnemyNeighbors(con.getPlayerInd(), enemyNeighbors).size();
			int numOwnedArmies = 0;
			int numEnemyArmies = 0;
			for (Country d : ownedNeighbors) {
				numOwnedArmies += d.getArmies();
			}
			for (Country e : enemyNeighbors) {
				numEnemyArmies += e.getArmies();
			}
			moveValue = numOwnedNeighbors + numOwnedArmies - numEnemyNeighbors - numEnemyArmies;
			reinCountryValue.add(moveValue);
		}
		return reinCountryValue;
	}
	
	public int getReinNum(){
		return con.getReinforcements();
	}
	
	public Country getAIAttacker(){
		
	}
	public Country getBorderEnemy(){
		
	}
	public int getAttackingArmies(){
		
	}
	
	public int getMoveArmies(){
		
	}
	
	public Country selectFromFort(){
		
	}
	
	public Country selectToFort(){
		
	}
	
	public int getFortArmies(){
		
	}
}

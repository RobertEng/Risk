/**
 * @(#)stanleyAI.java
 *
 *
 * @author 
 * @version 1.00 2012/5/1
 */

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class StanleyAI extends AI {

    
    public StanleyAI(ArrayList<Country> ownedLists, WorldGraphics graph) {
    	super(ownedLists, graph);
    }
    
    Random generator = new Random();
    
    public boolean attackChoice() {
    	// 90% chance Stanley will choose to attack
		if (generator.nextInt(10) < 9) {
		   	return true;
		}
		else return false;
    }
    
    public Country getReinCoun(){
    	return owned.get(generator.nextInt(owned.size()));
    }
    
    public int getReinNum(){
    	return generator.nextInt(con.getReinforcements()+1);
    }
    
    public Country getAIAttacker(){
    	Country attacker = owned.get(generator.nextInt(owned.size()));
    	if(attacker.getArmies()<=1)
    		return null;
    	return attacker;
    }
    
    public Country getBorderEnemy(){
    	ArrayList <Country> enemyBorderCountryAI = new ArrayList <Country> ();
    	
    	for (int a=0; a<con.getFromCountry().getBorderCountry().size(); a++) {
    		if (!isOwned(con.getFromCountry().getBorderCountry().get(a))) {
    			enemyBorderCountryAI.add(con.getFromCountry().getBorderCountry().get(a));
    		}	
    	}
    	if(enemyBorderCountryAI.size()<=0){
    		con.setFromCountry(null);
    		return null;
    	}
    	return enemyBorderCountryAI.get(generator.nextInt(enemyBorderCountryAI.size()));
    }
    
    public int getAttackingArmies(){
    	return generator.nextInt(con.getFromCountry().getArmies());
    }
    
    public int getMoveArmies(){
    	return generator.nextInt(con.getFromCountry().getArmies()-4)+4;
    }

    public Country selectFromFort(){
    	return owned.get(generator.nextInt(owned.size()));
    }
    
    public Country selectToFort(){
    	ArrayList <Country> ownedNeighbors = new ArrayList <Country>();
    	if(con.getFromCountry().findOwnedNeighbors(con.getPlayerInd(), ownedNeighbors).size()<=0){
    		fortifyWant=false;
    		return null;
    	}else{
    		return ownedNeighbors.get(generator.nextInt(ownedNeighbors.size()));
    	}
    }
    
    public int getFortArmies(){
    	return generator.nextInt(con.getFromCountry().getArmies());
    }
    
}
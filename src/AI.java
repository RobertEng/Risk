import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;

/**
 * @(#)AI.java
 *
 *
 * @author 
 * @version 1.00 2012/5/1
 */


public abstract class AI extends Player implements ActionListener{

	protected WorldGraphics graph;
	private Timer timer;
	protected int index;
	
	protected int newReinforcements;
	protected Country countryAttackingAI;
	protected Country enemyCountry;
	protected int attackingArmies;
	protected boolean attackWant;
	protected boolean fortifyWant;
	protected int stuckCounter;
	
    public AI(ArrayList<Country> ownedLists, WorldGraphics graph) {
    	super(ownedLists);
    	this.graph = graph;
    	
		timer = new Timer(500, this);
		timer.setRepeats(true);
		
		fortifyWant=true;
		attackWant=true;
		stuckCounter=0;
		
		index=0;

    }
    
    public void move() {
    	
  //  	timer = new Timer(1000, this);
   // 	timer.setInitialDelay(1000);
		timer.start();
		
		/*
		reinforceAI();
    	redraw();
    	con.setToMode(2);
    	
    	attackAI();
    	redraw();
       	con.setToMode(3);
    	fortifyAI();
    	
    	redraw();
    	con.setToMode(1);
    */
    	
    }
    
  //  public abstract void reinforceAI();
    
 //   public abstract void attackAI();
    
  //  public abstract void fortifyAI();
    
    
  //  public void redraw(){
    //	System.out.print("Start the timer");
    	/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	graph.redraw();*/
    //	index++;
    //	System.out.println(" Ind:"+index);
    //	timer.restart();
  //  }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("actionPerformed happened");
		index++;
		System.out.println(" Ind:"+index);
		
		
		if(con.getMode()==1){
			if(con.getReinforcements()<=0){
				con.setToMode(2);
			}
			else if(con.getCurrCoun()==null){
				con.setCurrCoun(getReinCoun());
			}else{
				newReinforcements = getReinNum();
				con.getCurrCoun().setArmies(con.getCurrCoun().getArmies() + newReinforcements);
		    	con.setReinforcements(con.getReinforcements() - newReinforcements);
		    	con.setCurrCoun(null);
			}
		}else if(con.getMode()==2){
			if(stuckCounter>=80){
				attackWant=false;
			}
			if(!attackWant){
				attackWant=true;
				stuckCounter=0;
				con.setToMode(3);
			}else if(con.getFromCountry()==null){
				con.setFromCountry(getAIAttacker());
			}else if(con.getToCountry()==null){
				con.setToCountry(getBorderEnemy());
			}else{
				attackingArmies = getAttackingArmies();
				con.getFromCountry().attack(con.getToCountry(),attackingArmies);
				if(con.getToCountry().getArmies()<=0){
	    			if (con.getFromCountry().getArmies() == 4) {
	    				con.getFromCountry().fortify(con.getToCountry(),3);
	    			}
	    			else if (con.getFromCountry().getArmies() == 3) {
	    				con.getFromCountry().fortify(con.getToCountry(),2);
	    			}
	    			else if (con.getFromCountry().getArmies() == 2) {
	    				con.getFromCountry().fortify(con.getToCountry(),1);
	    			}
	    			else {
	    				int numFortifyArmies = getMoveArmies();
	    				con.getFromCountry().fortify(con.getToCountry(),numFortifyArmies);
	    				ArrayList<Country> removeCoun = con.getToCountry().getOwner().getOwned();
	    				for(int a=0; a<removeCoun.size();a++){
	    					if(removeCoun.get(a).equals(con.getToCountry())){
	    						removeCoun.remove(a);
	    					}
	    				}
	    				con.getPlayerList().get(con.getPlayerInd()).getOwned().add(enemyCountry);
	    			}
	    		}
				con.setFromCountry(null);
				con.setToCountry(null);
				attackWant=attackChoice();
			}
			stuckCounter++;
		}else if(con.getMode()==3){
			if(fortifyWant){
				if(con.getFromCountry()==null){
					con.setFromCountry(selectFromFort());
				}else if(con.getToCountry()==null){
					con.setToCountry(selectToFort());
				}else{
					con.getFromCountry().fortify(con.getToCountry(), getFortArmies());
					fortifyWant=true;
					timer.stop();
					con.setToMode(1);
				}
			}else{
				fortifyWant=true;
				timer.stop();
				con.setToMode(1);
			}
			
		}
		
		graph.redraw();
	}

	public abstract int getReinNum();

	public abstract Country getReinCoun();
	
	public abstract boolean attackChoice();
	
	public abstract Country getAIAttacker();
    
	public abstract Country getBorderEnemy();
	
	public abstract int getAttackingArmies();
	
	public abstract int getMoveArmies();
	
	public abstract Country selectFromFort();
	
	public abstract Country selectToFort();
	
	public abstract int getFortArmies();
	
}
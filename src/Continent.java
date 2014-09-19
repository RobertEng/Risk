
public class Continent {
	
	private Country[] countries;
	private int bonus;
	private boolean[] contain;
	
	public Continent(Country[] countries, int bonus){
		this.countries = countries;
		this.bonus = bonus;
		contain = new boolean[countries.length];
		for(int a=0; a<countries.length; a++){
			contain[a]=false;
		}
	}
	
	public boolean process(Country current){
		for(int a=0; a<countries.length; a++){
			if(countries[a].equals(current)){
				contain[a]=true;
				return true;
			}
		}
		return false;
	}
	
	public int calcBonus(){
		for(int a=0; a<contain.length; a++){
			if(!contain[a])
				return 0;
		}
		return bonus;
	}
	
	public void reset(){
		for(int a=0; a<contain.length; a++){
			contain[a]=false;
		}
	}
}

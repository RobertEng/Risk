import java.awt.Color;
import java.util.ArrayList;

public class Player {

	protected ArrayList<Country> owned;
	private Color color;
	protected Control con;

	public Player() {
		owned = new ArrayList<Country>();
	}

	public Player(ArrayList<Country> claimed) {
		owned = claimed;
		
	}

	public boolean isOwned(Country country){
		for(int a=0; a<owned.size(); a++){
			if(owned.get(a).equals(country))
				return true;
		}
		return false;
	}
	
	public void displayOwned() {
		for (int i = 0; i < owned.size(); i++) {
			System.out.println(owned.get(i));
		}
	}

	public ArrayList<Country> getOwned() {
		return owned;
	}

	public void setOwned(ArrayList<Country> owned) {
		this.owned = owned;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Control getCon() {
		return con;
	}

	public void setCon(Control con) {
		this.con = con;
	}
}

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public abstract class World {
	
	protected ArrayList<Country> countryList;
	protected ArrayList<Country[][]> mapSections;
	protected int[] xCornerCoord;
	protected int[] yCornerCoord;
	protected int[] xcoord;
	protected int[] ycoord;
	protected BufferedImage image;
	protected ArrayList<Continent> continentBonus;
	protected int numRowSections;
	protected int numColSections;
	
	public World(){
		
	}
	
	abstract Country findCountryFromCoord(int e);

	abstract Country findCountry(int x, int y, int width, int height);

	public ArrayList<Country> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<Country> countryList) {
		this.countryList = countryList;
	}

	public ArrayList<Country[][]> getMapSections() {
		return mapSections;
	}

	public void setMapSections(ArrayList<Country[][]> mapSections) {
		this.mapSections = mapSections;
	}

	public int[] getxCornerCoord() {
		return xCornerCoord;
	}

	public void setxCornerCoord(int[] xCornerCoord) {
		this.xCornerCoord = xCornerCoord;
	}

	public int[] getyCornerCoord() {
		return yCornerCoord;
	}

	public void setyCornerCoord(int[] yCornerCoord) {
		this.yCornerCoord = yCornerCoord;
	}

	public int[] getXcoord() {
		return xcoord;
	}

	public void setXcoord(int[] xcoord) {
		this.xcoord = xcoord;
	}

	public int[] getYcoord() {
		return ycoord;
	}

	public void setYcoord(int[] ycoord) {
		this.ycoord = ycoord;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public ArrayList<Continent> getContinentBonus() {
		return continentBonus;
	}

	public void setContinentBonus(ArrayList<Continent> continentBonus) {
		this.continentBonus = continentBonus;
	}

	public int getNumRowSections() {
		return numRowSections;
	}

	public void setNumRowSections(int numRowSections) {
		this.numRowSections = numRowSections;
	}

	public int getNumColSections() {
		return numColSections;
	}

	public void setNumColSections(int numColSections) {
		this.numColSections = numColSections;
	}


}

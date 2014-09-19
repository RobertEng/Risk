import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class MiniWorld extends World{
	
	
	public MiniWorld(){
		super();
		
		//create the countries
			Country north = new Country(3, "North");
			Country south = new Country(3, "South");
			Country west = new Country(3, "West");
			Country east = new Country(3, "East");
			Country middle = new Country(3, "Middle");
			
			//give countries some bordering countries
			north.getBorderCountry().add(middle);
			south.getBorderCountry().add(middle);
			west.getBorderCountry().add(middle);
			east.getBorderCountry().add(middle);
			middle.getBorderCountry().add(north);
			middle.getBorderCountry().add(south);
			middle.getBorderCountry().add(east);
			middle.getBorderCountry().add(west);
			
			xCornerCoord = new int[1];
			yCornerCoord = new int[1];
			
			//map
			xCornerCoord[0]=0;
			yCornerCoord[0]=0;
			Country[][]miniMap = new Country[][]{
			/*25*/	{ null     , null     , null     , null     , null     },
					{ null     , null     , north    , null     , null     },
					{ null     , west     , middle   , east     , null     },
					{ null     , null     , south    , null     , null     },
					{ null     , null     , null     , null     , null     },
			};
				
			
			
			mapSections = new ArrayList<Country[][]>();
			
			mapSections.add(miniMap);

			numRowSections=1;
			numColSections=1; ///FNISH THIS LATTTERRRRRRRRRRR
			
			//populate countryList
			countryList = new ArrayList<Country>();
			
			countryList.add(north);
			countryList.add(south);
			countryList.add(west);
			countryList.add(east);
			countryList.add(middle);
			
				
			
			continentBonus = new ArrayList<Continent>();
			
			
			
			xcoord = new int[]{  1,  2,  2,  2,  3};
			ycoord = new int[]{  2,  1,  2,  3,  2};
			
			try {
				image = ImageIO.read(new File("mini.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public Country findCountryFromCoord(int e) {
		
		return mapSections.get(0)[ycoord[e]][xcoord[e]];
		
		
	}
	public Country findCountry(int x, int y, int width, int height) {
		return mapSections.get(0)[5*y/height][5*x/width];
		

	}
}

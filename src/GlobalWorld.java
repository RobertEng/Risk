import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class GlobalWorld extends World{
	
	
	public GlobalWorld(){
		super();
		
		//create the countries
		Country alaska = new Country(3, "Alaska");
		Country alberta = new Country(3, "Alberta");
		Country centralAm = new Country(3, "Central America");
		Country eastUS = new Country(3, "Eastern US");
		Country greenland = new Country(3, "Greenland");
		Country northwest = new Country(3, "NW Territory");
		Country ontario = new Country(3, "Ontario");
		Country quebec = new Country(3, "Quebec");
		Country westUS = new Country(3, "Western US");
		Country argentina = new Country(3, "Argentina");
		Country brazil = new Country(3, "Brazil");
		Country peru = new Country(3, "Peru");
		Country venezuela = new Country(3, "Venezuela");
		Country britain = new Country(3, "Great Britain");
		Country iceland = new Country(3, "Iceland");
		Country northEU = new Country(3, "Northern Europe");
		Country scandinavia = new Country(3, "Scandinavia");
		Country southEU = new Country(3, "Southern Europe");
		Country ukraine = new Country(3, "Ukraine");
		Country westEU = new Country(3, "Western Europe");
		Country congo = new Country(3, "Congo");
		Country eastAF = new Country(3, "East Africa");
		Country egypt = new Country(3, "Egypt");
		Country madagascar = new Country(3, "Madagascar");
		Country northAF = new Country(3, "North Africa");
		Country southAF = new Country(3, "South Africa");
		Country afghanistan = new Country(3, "Afghanistan");
		Country china = new Country(3, "China");
		Country india = new Country(3, "India");
		Country irkutsk = new Country(3, "Irkutsk");
		Country japan = new Country(3, "Japan");
		Country kamchatka = new Country(3, "Kamchatka");
		Country middleEast = new Country(3, "Middle East");
		Country mongolia = new Country(3, "Mongolia");
		Country siam = new Country(3, "Siam");
		Country siberia = new Country(3, "Siberia");
		Country ural = new Country(3, "Ural");
		Country yakutsk = new Country(3, "Yakutsk");
		Country eastAU = new Country(3, "Eastern Australia");
		Country indonesia = new Country(3, "Indonesia");
		Country newGuinea = new Country(3, "New Guinea");
		Country westAU = new Country(3, "Western Australia");
		
		//give countries some bordering countries
		alaska.getBorderCountry().add(northwest);
		alaska.getBorderCountry().add(alberta);
		alaska.getBorderCountry().add(kamchatka);
		alberta.getBorderCountry().add(alaska);
		alberta.getBorderCountry().add(northwest);
		alberta.getBorderCountry().add(ontario);
		alberta.getBorderCountry().add(westUS);
		centralAm.getBorderCountry().add(westUS);
		centralAm.getBorderCountry().add(eastUS);
		centralAm.getBorderCountry().add(venezuela);
		eastUS.getBorderCountry().add(westUS);
		eastUS.getBorderCountry().add(centralAm);
		eastUS.getBorderCountry().add(ontario);
		eastUS.getBorderCountry().add(quebec);
		greenland.getBorderCountry().add(iceland);
		greenland.getBorderCountry().add(northwest);
		greenland.getBorderCountry().add(ontario);
		greenland.getBorderCountry().add(quebec);
		northwest.getBorderCountry().add(alaska);
		northwest.getBorderCountry().add(alberta);
		northwest.getBorderCountry().add(ontario);
		northwest.getBorderCountry().add(greenland);
		ontario.getBorderCountry().add(northwest);
		ontario.getBorderCountry().add(alberta);
		ontario.getBorderCountry().add(westUS);
		ontario.getBorderCountry().add(greenland);
		ontario.getBorderCountry().add(quebec);
		ontario.getBorderCountry().add(eastUS);
		quebec.getBorderCountry().add(eastUS);
		quebec.getBorderCountry().add(ontario);
		quebec.getBorderCountry().add(greenland);
		westUS.getBorderCountry().add(alberta);
		westUS.getBorderCountry().add(ontario);
		westUS.getBorderCountry().add(eastUS);
		westUS.getBorderCountry().add(centralAm);
		argentina.getBorderCountry().add(brazil);
		argentina.getBorderCountry().add(peru);
		brazil.getBorderCountry().add(peru);
		brazil.getBorderCountry().add(argentina);
		brazil.getBorderCountry().add(venezuela);
		brazil.getBorderCountry().add(northAF);
		peru.getBorderCountry().add(brazil);
		peru.getBorderCountry().add(venezuela);
		peru.getBorderCountry().add(argentina);
		venezuela.getBorderCountry().add(brazil);
		venezuela.getBorderCountry().add(centralAm);
		venezuela.getBorderCountry().add(peru);
		britain.getBorderCountry().add(iceland);
		britain.getBorderCountry().add(northEU);
		britain.getBorderCountry().add(scandinavia);
		britain.getBorderCountry().add(westEU);
		iceland.getBorderCountry().add(britain);
		iceland.getBorderCountry().add(greenland);
		iceland.getBorderCountry().add(scandinavia);
		northEU.getBorderCountry().add(britain);
		northEU.getBorderCountry().add(scandinavia);
		northEU.getBorderCountry().add(ukraine);
		northEU.getBorderCountry().add(southEU);
		northEU.getBorderCountry().add(westEU);
		scandinavia.getBorderCountry().add(britain);
		scandinavia.getBorderCountry().add(ukraine);
		scandinavia.getBorderCountry().add(iceland);
		scandinavia.getBorderCountry().add(northEU);
		southEU.getBorderCountry().add(westEU);
		southEU.getBorderCountry().add(northEU);
		southEU.getBorderCountry().add(ukraine);
		southEU.getBorderCountry().add(middleEast);
		southEU.getBorderCountry().add(egypt);
		southEU.getBorderCountry().add(northAF);
		ukraine.getBorderCountry().add(scandinavia);
		ukraine.getBorderCountry().add(northEU);
		ukraine.getBorderCountry().add(southEU);
		ukraine.getBorderCountry().add(middleEast);
		ukraine.getBorderCountry().add(afghanistan);
		ukraine.getBorderCountry().add(ural);
		westEU.getBorderCountry().add(britain);
		westEU.getBorderCountry().add(northEU);
		westEU.getBorderCountry().add(southEU);
		westEU.getBorderCountry().add(northAF);
		congo.getBorderCountry().add(northAF);
		congo.getBorderCountry().add(eastAF);
		congo.getBorderCountry().add(southAF);
		eastAF.getBorderCountry().add(congo);
		eastAF.getBorderCountry().add(northAF);
		eastAF.getBorderCountry().add(egypt);
		eastAF.getBorderCountry().add(middleEast);
		eastAF.getBorderCountry().add(southAF);
		eastAF.getBorderCountry().add(madagascar);
		egypt.getBorderCountry().add(eastAF);
		egypt.getBorderCountry().add(middleEast);
		egypt.getBorderCountry().add(southEU);
		egypt.getBorderCountry().add(northAF);
		madagascar.getBorderCountry().add(eastAF);
		madagascar.getBorderCountry().add(southAF);
		northAF.getBorderCountry().add(congo);
		northAF.getBorderCountry().add(eastAF);
		northAF.getBorderCountry().add(egypt);
		northAF.getBorderCountry().add(southEU);
		northAF.getBorderCountry().add(westEU);
		northAF.getBorderCountry().add(brazil);
		southAF.getBorderCountry().add(madagascar);
		southAF.getBorderCountry().add(congo);
		southAF.getBorderCountry().add(eastAF);
		afghanistan.getBorderCountry().add(ukraine);
		afghanistan.getBorderCountry().add(ural);
		afghanistan.getBorderCountry().add(china);
		afghanistan.getBorderCountry().add(india);
		afghanistan.getBorderCountry().add(middleEast);
		china.getBorderCountry().add(afghanistan);
		china.getBorderCountry().add(ural);
		china.getBorderCountry().add(siberia);
		china.getBorderCountry().add(mongolia);
		china.getBorderCountry().add(siam);
		china.getBorderCountry().add(india);
		india.getBorderCountry().add(china);
		india.getBorderCountry().add(siam);
		india.getBorderCountry().add(middleEast);
		india.getBorderCountry().add(afghanistan);
		irkutsk.getBorderCountry().add(siberia);
		irkutsk.getBorderCountry().add(yakutsk);
		irkutsk.getBorderCountry().add(kamchatka);
		irkutsk.getBorderCountry().add(mongolia);
		japan.getBorderCountry().add(kamchatka);
		japan.getBorderCountry().add(mongolia);
		kamchatka.getBorderCountry().add(japan);
		kamchatka.getBorderCountry().add(yakutsk);
		kamchatka.getBorderCountry().add(irkutsk);
		kamchatka.getBorderCountry().add(mongolia);
		kamchatka.getBorderCountry().add(alaska); //yay
		middleEast.getBorderCountry().add(eastAF);
		middleEast.getBorderCountry().add(egypt);
		middleEast.getBorderCountry().add(southEU);
		middleEast.getBorderCountry().add(ukraine);
		middleEast.getBorderCountry().add(afghanistan);
		middleEast.getBorderCountry().add(india);
		mongolia.getBorderCountry().add(china);
		mongolia.getBorderCountry().add(siberia);
		mongolia.getBorderCountry().add(irkutsk);
		mongolia.getBorderCountry().add(kamchatka);
		mongolia.getBorderCountry().add(japan);
		siam.getBorderCountry().add(china);
		siam.getBorderCountry().add(india);
		siam.getBorderCountry().add(indonesia);
		siberia.getBorderCountry().add(ural);
		siberia.getBorderCountry().add(china);
		siberia.getBorderCountry().add(mongolia);
		siberia.getBorderCountry().add(irkutsk);
		siberia.getBorderCountry().add(yakutsk);
		ural.getBorderCountry().add(ukraine);
		ural.getBorderCountry().add(afghanistan);
		ural.getBorderCountry().add(china);
		ural.getBorderCountry().add(siberia);
		yakutsk.getBorderCountry().add(siberia);
		yakutsk.getBorderCountry().add(irkutsk);
		yakutsk.getBorderCountry().add(kamchatka);
		eastAU.getBorderCountry().add(newGuinea);
		eastAU.getBorderCountry().add(westAU);
		indonesia.getBorderCountry().add(westAU);
		indonesia.getBorderCountry().add(siam);
		indonesia.getBorderCountry().add(newGuinea);
		newGuinea.getBorderCountry().add(westAU);
		newGuinea.getBorderCountry().add(eastAU);
		newGuinea.getBorderCountry().add(indonesia);
		westAU.getBorderCountry().add(eastAU);
		westAU.getBorderCountry().add(newGuinea);
		westAU.getBorderCountry().add(indonesia);
		
		xCornerCoord = new int[6];
		yCornerCoord = new int[6];
		
		//map
		xCornerCoord[1]=0;
		yCornerCoord[1]=25;
		Country[][]southwestMap = new Country[][]{
		/*25*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, null     , venezuela, venezuela, venezuela, venezuela, null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, venezuela, venezuela, venezuela, venezuela, venezuela, venezuela, null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , venezuela, venezuela, venezuela, venezuela, venezuela, venezuela, venezuela, venezuela, null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , venezuela, venezuela, venezuela, venezuela, venezuela, venezuela, brazil   , venezuela, brazil   , brazil   , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , venezuela, venezuela, venezuela, venezuela, brazil   , brazil   , brazil   , brazil   , brazil   , brazil   , null     },
		/*30*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , peru     , peru     , peru     , peru     , brazil   , brazil   , brazil   , brazil   , brazil   , brazil   , brazil   },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , peru     , peru     , brazil   , brazil   , brazil   , brazil   , brazil   , brazil   , brazil   , brazil   },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , peru     , peru     , peru     , brazil   , brazil   , brazil   , brazil   , brazil   , brazil   , brazil   },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , peru     , peru     , peru     , peru     , brazil   , brazil   , brazil   , brazil   , brazil   },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , peru     , peru     , peru     , peru     , peru     , brazil   , brazil   , brazil   , brazil   },
		/*35*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , peru     , peru     , peru     , peru     , brazil   , brazil   , brazil   },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , peru     , peru     , peru     , argentina, brazil   , brazil   , brazil   },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, argentina, brazil   , brazil   },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, argentina, brazil   , brazil   },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, argentina, brazil   , brazil   },
		/*40*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, argentina, brazil   , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, argentina, brazil   , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, argentina, argentina, null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, argentina, null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, null     , null     },
		/*45*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, argentina, null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , argentina, argentina, argentina, null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
		};
			
		
		xCornerCoord[0]=0;
		yCornerCoord[0]=0;
		Country[][]northwestMap = new Country[][]{
			//          00         01         02         03         04         05         06         07         08         09         10         11         12         13         14         15         16         17         18         19         20         21         22         23         24   	 	 	
		/*00*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , northwest, northwest, northwest, northwest, northwest, northwest},
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest},
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest},
				{ null     , null     , null     , null     , null     , alaska   , alaska   , alaska   , alaska   , alaska   , northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest},
		/*05*/	{ null     , null     , null     , null     , alaska   , alaska   , alaska   , alaska   , alaska   , northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, null     },
				{ null     , null     , null     , alaska   , alaska   , alaska   , alaska   , alaska   , alaska   , northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, null     , null     , northwest},
				{ null     , null     , alaska   , alaska   , alaska   , alaska   , alaska   , alaska   , northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, northwest, null     , null     , null     , null     , null     , quebec   , null     , null     },
				{ null     , null     , alaska   , alaska   , alaska   , null     , null     , alaska   , alberta  , alberta  , alberta  , alberta  , alberta  , alberta  , ontario  , ontario  , ontario  , ontario  , ontario  , null     , null     , quebec   , quebec   , quebec   , null     },
				{ null     , alaska   , alaska   , null     , null     , null     , null     , alberta  , alberta  , alberta  , alberta  , alberta  , alberta  , alberta  , ontario  , ontario  , ontario  , ontario  , ontario  , ontario  , quebec   , quebec   , quebec   , quebec   , quebec   },
		/*10*/	{ null     , null     , null     , null     , null     , null     , null     , alberta  , alberta  , alberta  , alberta  , alberta  , alberta  , alberta  , ontario  , ontario  , ontario  , ontario  , ontario  , quebec   , quebec   , quebec   , quebec   , quebec   , quebec   },
				{ null     , null     , null     , null     , null     , null     , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , ontario  , ontario  , ontario  , quebec   , quebec   , quebec   , quebec   , quebec   , quebec   , quebec   },
				{ null     , null     , null     , null     , null     , null     , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , eastUS   , eastUS   , ontario  , ontario  , quebec   , eastUS   , eastUS   , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , eastUS   , eastUS   , eastUS   , eastUS   , eastUS   , eastUS   , null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , eastUS   , eastUS   , eastUS   , eastUS   , eastUS   , null     , null     , null     , null     , null     , null     },
		/*15*/	{ null     , null     , null     , null     , null     , null     , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , westUS   , eastUS   , eastUS   , eastUS   , eastUS   , eastUS   , null     , null     , null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , westUS   , westUS   , westUS   , westUS   , westUS   , eastUS   , eastUS   , eastUS   , eastUS   , eastUS   , eastUS   , null     , null     , null     , null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, eastUS   , eastUS   , eastUS   , eastUS   , eastUS   , eastUS   , null     , null     , null     , null     , null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, centralAm, eastUS   , null     , null     , null     , eastUS   , null     , null     , null     , null     , null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, centralAm, null     , null     , null     , null     , eastUS   , null     , null     , null     , null     , null     , null     , null     , null     , null     },
		/*20*/	{ null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, centralAm, centralAm, null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, centralAm, centralAm, centralAm, centralAm, centralAm, centralAm, centralAm, null     , null     , null     , null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, centralAm, centralAm, null     , null     , null     , centralAm, centralAm, centralAm, centralAm, null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, centralAm, null     , null     , null     , null     , null     , null     , centralAm, null     , null     , null     , null     },
				{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , centralAm, centralAm, centralAm, null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
		};
				
		
		xCornerCoord[2]=25;
		yCornerCoord[2]=0;
			Country[][]northMap = new Country[][]{
			//          25           26           27           28           29           30           31           32           33           34           35           36           37           38           39           40           41           42           43           44           45           46           47           48           49   	 	 	
		/*00*/	{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ northwest  , northwest  , northwest  , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ northwest  , northwest  , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , null       , null       , null       , null       , ukraine    , ukraine    , ukraine    , null       , null       , null       , null       , null       , null       , null       },
				{ northwest  , null       , null       , null       , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , null       , null       , null       , scandinavia, scandinavia, scandinavia, null       , null       , null       , null       , null       , ukraine    , null       , null       , null       },
				{ null       , null       , null       , null       , greenland  , greenland  , greenland  , greenland  , greenland  , greenland  , null       , null       , null       , scandinavia, scandinavia, scandinavia, ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
		/*05*/	{ null       , null       , null       , greenland  , greenland  , greenland  , greenland  , iceland    , iceland    , iceland    , iceland    , null       , scandinavia, scandinavia, scandinavia, scandinavia, ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
				{ null       , null       , null       , greenland  , greenland  , null       , null       , iceland    , iceland    , iceland    , iceland    , scandinavia, scandinavia, scandinavia, scandinavia, scandinavia, ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
				{ null       , null       , null       , null       , null       , null       , null       , iceland    , iceland    , iceland    , iceland    , scandinavia, scandinavia, scandinavia, scandinavia, scandinavia, ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
				{ null       , null       , null       , null       , null       , null       , britain    , britain    , britain    , null       , null       , scandinavia, scandinavia, scandinavia, scandinavia, ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
				{ null       , null       , null       , null       , null       , null       , britain    , britain    , britain    , null       , null       , northEU    , northEU    , northEU    , northEU    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
		/*10*/	{ null       , null       , null       , null       , null       , null       , britain    , britain    , britain    , null       , westEU     , northEU    , northEU    , northEU    , northEU    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
				{ null       , null       , null       , null       , null       , null       , null       , null       , westEU     , westEU     , westEU     , northEU    , northEU    , northEU    , northEU    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , afghanistan, afghanistan, afghanistan},
				{ null       , null       , null       , null       , null       , null       , null       , westEU     , westEU     , westEU     , westEU     , southEU    , southEU    , southEU    , southEU    , southEU    , southEU    , null       , ukraine    , ukraine    , ukraine    , ukraine    , afghanistan, afghanistan, afghanistan},
				{ null       , null       , null       , null       , null       , null       , westEU     , westEU     , westEU     , westEU     , westEU     , southEU    , southEU    , southEU    , southEU    , southEU    , southEU    , null       , null       , null       , ukraine    , ukraine    , ukraine    , afghanistan, afghanistan},
				{ null       , null       , null       , null       , null       , null       , westEU     , westEU     , westEU     , westEU     , westEU     , southEU    , southEU    , southEU    , southEU    , southEU    , southEU    , middleEast , middleEast , middleEast , middleEast , middleEast , ukraine    , afghanistan, afghanistan},
		/*15*/	{ null       , null       , null       , null       , null       , null       , westEU     , westEU     , westEU     , westEU     , null       , southEU    , southEU    , southEU    , southEU    , southEU    , southEU    , middleEast , middleEast , middleEast , middleEast , middleEast , middleEast , middleEast , afghanistan},
				{ null       , null       , null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , null       , null       , null       , null       , null       , null       , middleEast , middleEast , middleEast , middleEast , middleEast , middleEast , middleEast },
				{ null       , null       , null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , middleEast , middleEast , middleEast , middleEast , middleEast , middleEast , middleEast },
				{ null       , null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , middleEast , middleEast , middleEast , middleEast , middleEast , middleEast },
				{ null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , middleEast , middleEast , middleEast , middleEast , middleEast , middleEast },
		/*20*/	{ null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , egypt      , eastAF     , middleEast , middleEast , middleEast , middleEast , middleEast },
				{ null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , egypt      , eastAF     , eastAF     , eastAF     , eastAF     , middleEast , middleEast , middleEast , middleEast , middleEast },
				{ null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , middleEast , middleEast , middleEast , middleEast },
				{ null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , middleEast , middleEast , middleEast },
				{ null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , middleEast , eastAF     , eastAF     },
		};
			
		
		xCornerCoord[3]=25;
		yCornerCoord[3]=25;
		Country[][]southMap = new Country[][]{
		//          25           26           27           28           29           30           31           32           33           34           35           36           37           38           39           40           41           42           43           44           45           46           47           48           49   	 	 	
		/*25*/	{ null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , congo      , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     },
				{ null       , null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , northAF    , congo      , congo      , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , northAF    , northAF    , northAF    , northAF    , congo      , congo      , congo      , congo      , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , northAF    , northAF    , northAF    , congo      , congo      , congo      , congo      , eastAF     , eastAF     , eastAF     , eastAF     , eastAF     , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , northAF    , northAF    , northAF    , congo      , congo      , congo      , congo      , eastAF     , eastAF     , eastAF     , eastAF     , null       , null       , null       },
		/*30*/	{ brazil     , brazil     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , northAF    , congo      , congo      , congo      , congo      , congo      , eastAF     , eastAF     , eastAF     , null       , null       , null       , null       },
				{ brazil     , brazil     , brazil     , brazil     , null       , null       , null       , null       , null       , null       , null       , null       , congo      , congo      , congo      , congo      , congo      , congo      , eastAF     , eastAF     , eastAF     , null       , null       , null       , null       },
				{ brazil     , brazil     , brazil     , null       , null       , null       , null       , null       , null       , null       , null       , null       , congo      , congo      , congo      , congo      , congo      , congo      , congo      , eastAF     , eastAF     , null       , null       , null       , null       },
				{ brazil     , brazil     , brazil     , null       , null       , null       , null       , null       , null       , null       , null       , null       , congo      , congo      , congo      , congo      , congo      , congo      , congo      , southAF    , southAF    , null       , null       , madagascar , null       },
				{ brazil     , brazil     , brazil     , null       , null       , null       , null       , null       , null       , null       , null       , null       , congo      , congo      , congo      , congo      , congo      , congo      , southAF    , southAF    , southAF    , null       , madagascar , madagascar , null       },
		/*35*/	{ brazil     , brazil     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , congo      , congo      , congo      , congo      , congo      , southAF    , southAF    , southAF    , null       , null       , madagascar , madagascar , null       },
				{ brazil     , brazil     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , null       , madagascar , madagascar , madagascar , null       },
				{ brazil     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , null       , madagascar , madagascar , madagascar , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , null       , null       , madagascar , madagascar , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , southAF    , southAF    , southAF    , southAF    , southAF    , southAF    , null       , null       , null       , null       , null       , null       },
		/*40*/	{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , southAF    , southAF    , southAF    , southAF    , southAF    , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , southAF    , southAF    , southAF    , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
		/*45*/	{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
		};
		
		
		xCornerCoord[4]=50;
		yCornerCoord[4]=0;
		Country[][]northeastMap = new Country[][]{
		//          50           51           52           53           54           55           56           57           58           59           60           61           62           63           64           65           66           67           68           69           70           71           72           73           74   	 	 	
		/*00*/	{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , siberia    , null       , null       , null       , null       , null       , null       , yakutsk    , yakutsk    , yakutsk    , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , siberia    , siberia    , siberia    , siberia    , siberia    , siberia    , null       , null       , null       , null       , yakutsk    , yakutsk    , yakutsk    , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ ural       , siberia    , siberia    , siberia    , siberia    , siberia    , siberia    , siberia    , siberia    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , null       , null       , null       , null       , null       , null       , null       , null       , null       },
		/*05*/	{ ural       , ural       , siberia    , siberia    , siberia    , siberia    , siberia    , siberia    , siberia    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , null       , null       },
				{ ural       , ural       , ural       , siberia    , siberia    , siberia    , siberia    , siberia    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , null       , null       },
				{ ural       , ural       , ural       , siberia    , siberia    , siberia    , siberia    , siberia    , siberia    , irkutsk    , irkutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , yakutsk    , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , null       , null       },
				{ ural       , ural       , ural       , siberia    , siberia    , siberia    , siberia    , siberia    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , null       , null       },
				{ ural       , ural       , ural       , ural       , siberia    , siberia    , siberia    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , kamchatka  , null       , null       , null       },
		/*10*/	{ ural       , ural       , ural       , ural       , ural       , siberia    , siberia    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , irkutsk    , mongolia   , mongolia   , irkutsk    , irkutsk    , kamchatka  , kamchatka  , null       , null       , kamchatka  , kamchatka  , null       , null       , null       },
				{ afghanistan, ural       , ural       , ural       , ural       , ural       , siberia    , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , kamchatka  , kamchatka  , japan      , japan      , null       , null       , null       , null       , null       },
				{ afghanistan, ural       , ural       , ural       , ural       , ural       , china      , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , kamchatka  , japan      , japan      , null       , null       , null       , null       , null       },
				{ afghanistan, afghanistan, ural       , ural       , ural       , china      , china      , china      , china      , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , mongolia   , kamchatka  , japan      , japan      , japan      , null       , null       , null       , null       },
				{ afghanistan, afghanistan, afghanistan, afghanistan, afghanistan, china      , china      , china      , china      , china      , china      , china      , china      , china      , china      , mongolia   , mongolia   , mongolia   , japan      , japan      , japan      , null       , null       , null       , null       },
		/*15*/	{ afghanistan, afghanistan, afghanistan, afghanistan, india      , china      , china      , china      , china      , china      , china      , china      , china      , china      , china      , china      , mongolia   , mongolia   , japan      , japan      , japan      , null       , null       , null       , null       },
				{ middleEast , india      , india      , india      , india      , india      , china      , china      , china      , china      , china      , china      , china      , china      , china      , china      , mongolia   , mongolia   , japan      , japan      , japan      , null       , null       , null       , null       },
				{ middleEast , india      , india      , india      , india      , india      , china      , china      , china      , china      , china      , china      , china      , china      , china      , china      , null       , japan      , japan      , japan      , null       , null       , null       , null       , null       },
				{ middleEast , middleEast , india      , india      , india      , india      , india      , india      , india      , india      , china      , china      , china      , china      , china      , china      , null       , japan      , japan      , null       , null       , null       , null       , null       , null       },
				{ middleEast , middleEast , india      , india      , india      , india      , india      , india      , india      , india      , siam       , china      , china      , china      , china      , china      , null       , null       , null       , null       , null       , null       , null       , null       , null       },
		/*20*/	{ middleEast , null       , india      , india      , india      , india      , india      , india      , india      , siam       , siam       , siam       , siam       , china      , china      , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ middleEast , null       , india      , india      , india      , india      , india      , india      , india      , siam       , siam       , siam       , siam       , siam       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ middleEast , null       , null       , null       , india      , india      , india      , india      , null       , siam       , siam       , siam       , siam       , siam       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , india      , india      , india      , india      , null       , null       , siam       , siam       , siam       , siam       , siam       , null       , indonesia  , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , india      , india      , null       , null       , null       , siam       , siam       , siam       , siam       , siam       , null       , indonesia  , indonesia  , null       , null       , null       , null       , null       , null       , null       },
		};
		
		
		xCornerCoord[5]=50;
		yCornerCoord[5]=25;
		Country[][]southeastMap = new Country[][]{
		//          50           51           52           53           54           55           56           57           58           59           60           61           62           63           64           65           66           67           68           69           70           71           72           73           74   	 	 	
		/*25*/	{ null       , null       , null       , null       , null       , india      , india      , null       , null       , null       , null       , siam       , siam       , siam       , siam       , null       , indonesia  , indonesia  , indonesia  , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , india      , india      , null       , null       , null       , indonesia  , indonesia  , siam       , siam       , null       , null       , indonesia  , indonesia  , indonesia  , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , indonesia  , indonesia  , null       , null       , null       , indonesia  , indonesia  , indonesia  , indonesia  , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , newGuinea  , newGuinea  , newGuinea  , null       , null       , null       },
		/*30*/	{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , newGuinea  , newGuinea  , newGuinea  , newGuinea  , newGuinea  , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , newGuinea  , newGuinea  , newGuinea  , newGuinea  , newGuinea  , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , indonesia  , newGuinea  , newGuinea  , newGuinea  , newGuinea  , newGuinea  , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , indonesia  , indonesia  , indonesia  , indonesia  , westAU     , null       , null       , newGuinea  , newGuinea  , newGuinea  , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , westAU     , eastAU     , eastAU     , newGuinea   , null       , null       , null       },
		/*35*/	{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , westAU     , westAU     , eastAU     , eastAU     , eastAU     , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , westAU     , westAU     , westAU     , eastAU     , eastAU     , eastAU     , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , westAU     , westAU     , westAU     , eastAU     , eastAU     , eastAU     , eastAU     , eastAU     , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , westAU     , westAU     , westAU     , westAU     , eastAU     , eastAU     , eastAU     , eastAU     , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , westAU     , westAU     , westAU     , westAU     , westAU     , eastAU     , eastAU     , eastAU     , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , westAU     , westAU     , westAU     , westAU     , eastAU     , eastAU     , eastAU     , eastAU     , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , westAU     , westAU     , westAU     , eastAU     , eastAU     , eastAU     , eastAU     , eastAU     , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , westAU     , westAU     , null       , null       , null       , eastAU     , eastAU     , eastAU     , eastAU     , eastAU     , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , eastAU     , eastAU     , eastAU     , eastAU     , eastAU     , null       , eastAU     , eastAU     },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , eastAU     , eastAU     , eastAU     , eastAU     , null       , null       , eastAU     , eastAU     },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , eastAU     , eastAU     , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
		};		
	
		mapSections = new ArrayList<Country[][]>();
	
		mapSections.add(northwestMap);
		mapSections.add(southwestMap);
		mapSections.add(northMap);
		mapSections.add(southMap);
		mapSections.add(northeastMap);
		mapSections.add(southeastMap);
		
		numRowSections=2;
		numColSections=3;
		
		//populate countryList
		countryList = new ArrayList<Country>();
		
		countryList.add(alaska);
		countryList.add(alberta);
		countryList.add(centralAm);
		countryList.add(eastUS);
		countryList.add(greenland);
		countryList.add(northwest);
		countryList.add(ontario);
		countryList.add(quebec);
		countryList.add(westUS);
		countryList.add(argentina);
		countryList.add(brazil);
		countryList.add(peru);
		countryList.add(venezuela);
		countryList.add(britain);
		countryList.add(iceland);
		countryList.add(northEU);
		countryList.add(scandinavia);
		countryList.add(southEU);
		countryList.add(ukraine);
		countryList.add(westEU);
		
		countryList.add(congo);
		countryList.add(eastAF);
		countryList.add(egypt);
		countryList.add(madagascar);
		countryList.add(northAF);
		countryList.add(southAF);
		countryList.add(afghanistan);
		countryList.add(china);
		countryList.add(india);
		countryList.add(irkutsk);
		countryList.add(japan);
		countryList.add(kamchatka);
		countryList.add(middleEast);
		countryList.add(mongolia);
		countryList.add(siam);
		countryList.add(siberia);
		countryList.add(ural);
		countryList.add(yakutsk);
		countryList.add(eastAU);
		countryList.add(indonesia);
		countryList.add(newGuinea);
		countryList.add(westAU);
				
		Country[] northAmerica = new Country[]{alaska, alberta, centralAm, eastUS, greenland, northwest, ontario, quebec, westUS};
		Country[] southAmerica = new Country[]{argentina, brazil, peru, venezuela};
		Country[] europe = new Country[]{britain, iceland, northEU, scandinavia, southEU, ukraine, westEU};
		Country[] africa = new Country[]{congo, eastAF, egypt, madagascar, northAF, southAF};
		Country[] asia = new Country[]{afghanistan, china, india, irkutsk, japan, kamchatka, middleEast, mongolia, siam, siberia, ural, yakutsk};
		Country[] australia = new Country[]{eastAU, indonesia, newGuinea, westAU};
		
		continentBonus = new ArrayList<Continent>();
		
		continentBonus.add(new Continent(northAmerica, 5));
		continentBonus.add(new Continent(southAmerica, 2));
		continentBonus.add(new Continent(europe, 5));
		continentBonus.add(new Continent(africa, 3));
		continentBonus.add(new Continent(asia, 7));
		continentBonus.add(new Continent(australia, 2));
		
		xcoord = new int[]{  3,  8,  9, 10, 14, 15, 17, 21, 22, 16, 17, 19, 31, 31, 32, 32, 32, 37, 37, 38, 39, 43, 46, 49, 38, 39, 43, 46, 51, 54, 54, 59, 60, 61, 61, 67, 68, 61, 63, 64, 68, 70};
		ycoord = new int[]{  8, 15, 10, 23, 16, 11,  5, 11, 34, 34, 28, 43,  4, 10,  7, 15, 23, 11,  7, 15, 20, 10, 20, 15, 34, 40, 27, 37, 11,  8, 22, 10, 18,  6, 13,  9, 16, 25, 40, 31, 43, 32};
		
		
		/*try {
			image = ImageIO.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("resources/countries5.PNG"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		/*try {
			image = ImageIO.read(ClassLoader.getSystemResource("resources/countries5.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		try {
			System.out.println(getClass());
			image = ImageIO.read(new File("countries5.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//getClass().getResource(path)
		/*try {
			image = ImageIO.read(new File(new File(".").getCanonicalPath()
					+ "\\resources\\countries5.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	
	public Country findCountryFromCoord(int e) {
		if(ycoord[e]<25){
			if(xcoord[e]<25){
				return mapSections.get(0)[ycoord[e]][xcoord[e]];
			}else if(xcoord[e]<50){
				return mapSections.get(2)[ycoord[e]][xcoord[e]-25];
			}else{
				return mapSections.get(4)[ycoord[e]][xcoord[e]-50];
			}
		}else{
			if(xcoord[e]<25){
				return mapSections.get(1)[ycoord[e]-25][xcoord[e]];
			}else if(xcoord[e]<50){
				return mapSections.get(3)[ycoord[e]-25][xcoord[e]-25];
			}else{
				return mapSections.get(5)[ycoord[e]-25][xcoord[e]-50];
			}
		}
	}
	public Country findCountry(int x, int y, int width, int height) {
		if (y < height / 2) {
			if (x < width / 3) {
				// northwestMap
				return mapSections.get(0)[50 * y / height][75 * x / width];
			} else if (x < width * 2 / 3) {
				// northMap
				return mapSections.get(2)[50 * y / height][75 * x / width-25];
			} else {
				// northeastMap
				return mapSections.get(4)[50 * y / height][75 * x / width-50];
			}
		} else {
			if (x < width / 3) {
				// southwestMap
				return mapSections.get(1)[50 * y / height - 25][75 * x
						/ width];
			} else if (x < width * 2 / 3) {
				// southMap
				return mapSections.get(3)[50 * y / height-25][75 * x / width-25];
			} else {
				// southeastMap
				return mapSections.get(5)[50 * y / height-25][75 * x / width-50];
			}
		}

	}
}

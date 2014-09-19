import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class EuropeWorld extends World{
	
	
	public EuropeWorld(){
		super();
		
		//create the countries
		Country portugal = new Country(3, "Portugal");
		Country spain = new Country(3, "Spain");
		Country balearic = new Country(3, "Balearic Islands");
		Country sardinia = new Country(3, "Sardinia");
		Country italy = new Country(3, "Italy");
		Country greece = new Country(3, "Greece");
		Country balkans = new Country(3, "Balkans");
		
		Country france = new Country(3, "France");
		Country switzerland = new Country(3, "Switzerland");
		Country belgium = new Country(3, "Belgium");
		
		Country england = new Country(3, "England");
		Country ireland = new Country(3, "Ireland");
		Country scotland = new Country(3, "Scotland");
		Country iceland = new Country(3, "Iceland");
		
		Country germany = new Country(3, "Germany");
		Country austria = new Country(3, "Austria");
		Country czech = new Country(3, "Czech Republic");
		Country hungary = new Country(3, "Hungary");
		Country poland = new Country(3, "Poland");
		
		Country norway = new Country(3, "Norway");
		Country sweden = new Country(3, "Sweden");
		Country finland = new Country(3, "Finland");
		Country denmark = new Country(3, "Denmark");
		Country baltic = new Country(3, "Baltic");
		
		Country turkey = new Country(3, "Turkey");
		Country bulgaria = new Country(3, "Bulgaria");
		Country romania = new Country(3, "Romania");
		Country moldova = new Country(3, "Moldova");
		Country ukraine = new Country(3, "Ukraine");
		Country belarus = new Country(3, "Belarus");
		Country lithuania = new Country(3, "Lithuania");
		
		Country georgia = new Country(3, "Georgia");
		Country kazakhstan = new Country(3, "Kazakhstan");
		Country caspian = new Country(3, "Caspian");
		Country karelia = new Country(3, "Karelia");
		Country russia = new Country(3, "Russia");
		
		//give countries some bordering countries
		portugal.getBorderCountry().add(spain);
		spain.getBorderCountry().add(portugal);
		spain.getBorderCountry().add(france);
		spain.getBorderCountry().add(balearic);
		balearic.getBorderCountry().add(spain);
		balearic.getBorderCountry().add(sardinia);
		sardinia.getBorderCountry().add(balearic);
		sardinia.getBorderCountry().add(italy);
		italy.getBorderCountry().add(sardinia);
		italy.getBorderCountry().add(france);
		italy.getBorderCountry().add(balkans);
		italy.getBorderCountry().add(greece);
		greece.getBorderCountry().add(italy);
		greece.getBorderCountry().add(balkans);
		greece.getBorderCountry().add(turkey);
		greece.getBorderCountry().add(bulgaria);
		balkans.getBorderCountry().add(greece);
		balkans.getBorderCountry().add(italy);
		balkans.getBorderCountry().add(bulgaria);
		balkans.getBorderCountry().add(austria);
		balkans.getBorderCountry().add(hungary);
		
		france.getBorderCountry().add(spain);
		france.getBorderCountry().add(italy);
		france.getBorderCountry().add(belgium);
		france.getBorderCountry().add(switzerland);
		france.getBorderCountry().add(england);
		france.getBorderCountry().add(germany);
		switzerland.getBorderCountry().add(france);
		switzerland.getBorderCountry().add(germany);
		switzerland.getBorderCountry().add(austria);
		belgium.getBorderCountry().add(france);
		belgium.getBorderCountry().add(germany);
			
		england.getBorderCountry().add(france);
		england.getBorderCountry().add(scotland);
		england.getBorderCountry().add(ireland);
		ireland.getBorderCountry().add(england);
		ireland.getBorderCountry().add(scotland);
		scotland.getBorderCountry().add(england);
		scotland.getBorderCountry().add(ireland);
		scotland.getBorderCountry().add(iceland);
		
		germany.getBorderCountry().add(belgium);
		germany.getBorderCountry().add(france);
		germany.getBorderCountry().add(denmark);
		germany.getBorderCountry().add(austria);
		germany.getBorderCountry().add(czech);
		germany.getBorderCountry().add(poland);
		germany.getBorderCountry().add(switzerland);
		austria.getBorderCountry().add(germany);
		austria.getBorderCountry().add(hungary);
		austria.getBorderCountry().add(czech);
		austria.getBorderCountry().add(balkans);
		czech.getBorderCountry().add(germany);
		czech.getBorderCountry().add(austria);
		czech.getBorderCountry().add(hungary);
		czech.getBorderCountry().add(poland);
		hungary.getBorderCountry().add(austria);
		hungary.getBorderCountry().add(balkans);
		hungary.getBorderCountry().add(czech);
		hungary.getBorderCountry().add(poland);
		hungary.getBorderCountry().add(ukraine);
		hungary.getBorderCountry().add(romania);
		poland.getBorderCountry().add(germany);
		poland.getBorderCountry().add(czech);
		poland.getBorderCountry().add(hungary);
		poland.getBorderCountry().add(ukraine);
		
		norway.getBorderCountry().add(iceland);
		norway.getBorderCountry().add(sweden);
		norway.getBorderCountry().add(finland);
		norway.getBorderCountry().add(karelia);
		sweden.getBorderCountry().add(norway);
		sweden.getBorderCountry().add(denmark);
		sweden.getBorderCountry().add(finland);
		finland.getBorderCountry().add(norway);
		finland.getBorderCountry().add(sweden);
		finland.getBorderCountry().add(baltic);
		finland.getBorderCountry().add(karelia);
		denmark.getBorderCountry().add(germany);
		denmark.getBorderCountry().add(sweden);
		baltic.getBorderCountry().add(finland);
		baltic.getBorderCountry().add(lithuania);
		baltic.getBorderCountry().add(belarus);
		baltic.getBorderCountry().add(russia);
		
		turkey.getBorderCountry().add(greece);
		turkey.getBorderCountry().add(bulgaria);
		turkey.getBorderCountry().add(georgia);
		bulgaria.getBorderCountry().add(greece);
		bulgaria.getBorderCountry().add(turkey);
		bulgaria.getBorderCountry().add(balkans);
		romania.getBorderCountry().add(hungary);
		romania.getBorderCountry().add(moldova);
		romania.getBorderCountry().add(ukraine);
		moldova.getBorderCountry().add(romania);
		moldova.getBorderCountry().add(ukraine);
		ukraine.getBorderCountry().add(moldova);
		ukraine.getBorderCountry().add(romania);
		ukraine.getBorderCountry().add(poland);
		ukraine.getBorderCountry().add(hungary);
		ukraine.getBorderCountry().add(belarus);
		ukraine.getBorderCountry().add(caspian);
		ukraine.getBorderCountry().add(russia);
		belarus.getBorderCountry().add(ukraine);
		belarus.getBorderCountry().add(lithuania);
		belarus.getBorderCountry().add(baltic);
		belarus.getBorderCountry().add(russia);
		lithuania.getBorderCountry().add(belarus);
		lithuania.getBorderCountry().add(baltic);
		
		georgia.getBorderCountry().add(turkey);
		georgia.getBorderCountry().add(caspian);
		kazakhstan.getBorderCountry().add(caspian);
		kazakhstan.getBorderCountry().add(russia);
		caspian.getBorderCountry().add(russia);
		caspian.getBorderCountry().add(ukraine);
		caspian.getBorderCountry().add(georgia);
		caspian.getBorderCountry().add(kazakhstan);
		karelia.getBorderCountry().add(finland);
		karelia.getBorderCountry().add(norway);
		karelia.getBorderCountry().add(russia);
		russia.getBorderCountry().add(karelia);
		russia.getBorderCountry().add(baltic);
		russia.getBorderCountry().add(belarus);
		russia.getBorderCountry().add(ukraine);
		russia.getBorderCountry().add(caspian);
		russia.getBorderCountry().add(kazakhstan);
		
		xCornerCoord = new int[6];
		yCornerCoord = new int[6];
		
		//map
				
		
		xCornerCoord[0]=0;
		yCornerCoord[0]=0;
		Country[][]northwestMap = new Country[][]{
			//          00         01         02         03         04         05         06         07         08         09         10         11         12         13         14         15         16         17         18         19         20         21         22         23         24   	 	 	
			/*00*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , iceland  , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , iceland  , iceland  , iceland  , iceland  , iceland  , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			/*05*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , iceland  , iceland  , iceland  , iceland  , iceland  , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , iceland  , iceland  , iceland  , iceland  , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			/*10*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , scotland , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			/*15*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , scotland , scotland , null     , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , scotland , scotland , scotland , scotland , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , scotland , scotland , scotland , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , scotland , scotland , scotland , scotland , null     , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , ireland  , ireland  , ireland  , scotland , scotland , england  , england  , null     , null     , null     , null     , null     , null     , null     , null     },
			/*20*/	{ null     , null     , null     , null     , null     , null     , null     , null     , ireland  , ireland  , ireland  , ireland  , null     , null     , null     , england  , england  , england  , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , ireland  , ireland  , ireland  , ireland  , null     , null     , null     , england  , england  , england  , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , ireland  , ireland  , ireland  , ireland  , null     , null     , england  , england  , england  , england  , england  , null     , null     , null     , null     , null     , null     , null     },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , ireland  , ireland  , ireland  , england  , england  , england  , england  , england  , england  , england  , null     , null     , null     , belgium  , belgium  , belgium  },
					{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , england  , england  , england  , england  , england  , england  , null     , null     , null     , belgium  , belgium  , belgium  },
			};
		
		
			xCornerCoord[1]=0;
			yCornerCoord[1]=25;
			Country[][]southwestMap = new Country[][]{
//		          00         01         02         03         04         05         06         07         08         09         10         11         12         13         14         15         16         17         18         19         20         21         22         23         24   	 	 	
	/*25*/	{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , england  , england  , england  , england  , england  , england  , null     , null     , null     , belgium  , belgium  , belgium  , germany  },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , england  , england  , england  , null     , null     , null     , null     , france   , france   , france   , belgium  , belgium  , belgium  , belgium  , germany  },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , null     , null     , france   , france   , france   , france   , belgium  , belgium  , belgium  , germany  },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , belgium  , belgium  , germany  },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france  ,switzerland},
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , france ,switzerland,switzerland},
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france  ,switzerland},
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , france   , null     , null     , null     },
			{ null     , null     , null     , spain    , spain    , spain    , spain    , spain    , null     , null     , null     , null     , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , null     , italy    , italy    },
			{ null     , null     , null     , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , france   , italy    , italy    },
			{ null     , null     , null     , portugal , portugal , portugal , spain    , spain    , spain    , spain    , spain    , spain    , spain    , france   , france   , france   , france   , france   , france   , null     , france   , france   , france   , null     , null     },
			{ null     , null     , null     , portugal , portugal , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , france   , france   , null     , null     , null     , null     , null     , null     , null     },
			{ null     , null     , portugal , portugal , portugal , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , null     , null     , null     , null     , null     , null     , null     },
			{ null     , portugal , portugal , portugal , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			{ null     , portugal , portugal , portugal , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			{ null     , portugal , portugal , portugal , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , null     , null     , null     , null     , null     , balearic , null     , null     , null     , null     , null     , null     },
			{ null     , portugal , portugal , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , null     , null     , balearic , balearic , balearic , null     , null     , null     , null     , null     , null     , null     },
			{ null     , null     , null     , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , null     , null     , null     , balearic , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			{ null     , null     , null     , null     , spain    , spain    , spain    , spain    , spain    , spain    , spain    , spain    , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			{ null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     , null     },
			};
			
			xCornerCoord[2]=25;
			yCornerCoord[2]=0;
				Country[][]northMap = new Country[][]{
			//          25           26           27           28           29           30           31           32           33           34           35           36           37           38           39           40           41           42           43           44           45           46           47           48           49   	 	 	
		/*00*/	{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , norway     , norway     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , norway     , norway     , norway     , norway     , norway     , norway     , norway     , karelia    , null       , null       , null       , null       , null       , null       , russia     },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , norway     , norway     , norway     , norway     , norway     , finland    , finland    , karelia    , karelia    , karelia    , karelia    , karelia    , karelia    , karelia    , karelia    , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , norway     , norway     , sweden     , sweden     , sweden     , finland    , finland    , finland    , finland    , karelia    , karelia    , karelia    , karelia    , karelia    , karelia    , karelia    , null       },
				{ null       , null       , null       , null       , null       , null       , null       , null       , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , finland    , finland    , finland    , karelia    , karelia    , karelia    , null       , null       , null       , null       , russia     },
	/*05*/		{ null       , null       , null       , null       , null       , null       , null       , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , finland    , finland    , finland    , finland    , karelia    , karelia    , karelia    , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , null       , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , finland    , finland    , finland    , karelia    , karelia    , karelia    , karelia    , karelia    , null       , russia     },
				{ null       , null       , null       , null       , null       , norway     , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , finland    , finland    , finland    , finland    , karelia    , karelia    , karelia    , karelia    , karelia    , karelia    },
				{ null       , null       , null       , null       , norway     , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , finland    , finland    , finland    , finland    , finland    , finland    , finland    , karelia    , karelia    , karelia    , karelia    },
				{ null       , null       , norway     , norway     , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , finland    , finland    , finland    , finland    , finland    , finland    , finland    , finland    , karelia    , karelia    , karelia    , karelia    },
	/*10*/		{ null       , norway     , norway     , norway     , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , finland    , finland    , finland    , finland    , finland    , finland    , finland    , karelia    , karelia    , karelia    , karelia    , karelia    },
				{ norway     , norway     , norway     , norway     , norway     , norway     , sweden     , sweden     , sweden     , sweden     , null       , null       , null       , null       , finland    , finland    , finland    , finland    , finland    , finland    , karelia    , karelia    , karelia    , karelia    , karelia    },
				{ norway     , norway     , norway     , norway     , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , null       , finland    , finland    , finland    , baltic     , null       , null       , null       , russia     , russia     , russia     , russia     },
				{ norway     , norway     , norway     , norway     , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , null       , null       , null       , baltic     , baltic     , baltic     , russia     , russia     , russia     , russia     , russia     },
				{ norway     , norway     , norway     , norway     , norway     , norway     , sweden     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , null       , baltic     , baltic     , baltic     , baltic     , baltic     , russia     , russia     , russia     , russia     , russia     },
	/*15*/		{ norway     , norway     , norway     , null       , null       , sweden     , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , null       , null       , baltic     , null       , baltic     , baltic     , baltic     , russia     , russia     , russia     , russia     , russia     },
				{ null       , null       , null       , null       , null       , sweden     , sweden     , sweden     , sweden     , sweden     , null       , null       , null       , null       , null       , baltic     , null       , baltic     , baltic     , baltic     , baltic     , russia     , russia     , russia     , russia     },
				{ null       , null       , denmark    , denmark    , null       , null       , sweden     , sweden     , sweden     , sweden     , null       , null       , null       , null       , null       , baltic     , baltic     , baltic     , baltic     , baltic     , baltic     , belarus    , russia     , russia     , russia     },
				{ null       , null       , denmark    , denmark    , denmark    , null       , denmark    , sweden     , sweden     , sweden     , null       , null       , null       , null       , null       , lithuania  , lithuania  , lithuania  , lithuania  , lithuania  , belarus    , belarus    , belarus    , belarus    , belarus    },
				{ null       , null       , denmark    , denmark    , null       , denmark    , null       , sweden     , null       , null       , null       , null       , null       , null       , null       , lithuania  , lithuania  , lithuania  , lithuania  , lithuania  , belarus    , belarus    , belarus    , belarus    , belarus    },
		/*20*/	{ null       , null       , denmark    , null       , null       , denmark    , null       , null       , sweden     , null       , null       , null       , null       , null       , lithuania  , lithuania  , lithuania  , lithuania  , lithuania  , lithuania  , belarus    , belarus    , belarus    , belarus    , belarus    },
				{ null       , null       , germany    , germany    , denmark    , null       , denmark    , null       , null       , null       , poland     , poland     , poland     , null       , null       , null       , null       , null       , null       , belarus    , belarus    , belarus    , belarus    , belarus    , belarus    },
				{ belgium    , null       , germany    , germany    , germany    , germany    , germany    , germany    , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , null       , belarus    , belarus    , belarus    , belarus    , belarus    , belarus    },
				{ belgium    , germany    , germany    , germany    , germany    , germany    , germany    , germany    , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , null       , belarus    , belarus    , belarus    , belarus    , belarus    , belarus    },
				{ germany    , germany    , germany    , germany    , germany    , germany    , germany    , germany    , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , null       , null       , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
				};
					
				
				xCornerCoord[3]=25;
				yCornerCoord[3]=25;
				Country[][]southMap = new Country[][]{
				//          25           26           27           28           29           30           31           32           33           34           35           36           37           38           39           40           41           42           43           44           45           46           47           48           49   	 	 	
				/*25*/	{ germany    , germany    , germany    , germany    , germany    , germany    , germany    , germany    , germany    , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
						{ germany    , germany    , germany    , germany    , germany    , germany    , germany    , germany    , germany    , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , poland     , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
						{ germany    , germany    , germany    , germany    , germany    , germany    , czech      , czech      , czech      , czech      , czech      , czech      , poland     , poland     , poland     , poland     , poland     , poland     , poland     , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
						{ germany    , germany    , germany    , germany    , germany    , germany    , czech      , czech      , czech      , czech      , czech      , czech      , czech      , czech      , poland     , poland     , poland     , poland     , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    },
						{ germany    , germany    , germany    , germany    , germany    , germany    , czech      , czech      , czech      , czech      , czech      , czech      , czech      , hungary    , hungary    , hungary    , hungary    , hungary    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , moldova    , moldova    },
			/*30*/		{ germany    , germany    , germany    , germany    , germany    , germany    , germany    , czech      , austria    , austria    , austria    , hungary    , hungary    , hungary    , hungary    , hungary    , hungary    , hungary    , ukraine    , ukraine    , ukraine    , ukraine    , romania    , romania    , moldova    },
						{ germany    , germany    , germany    , germany    , germany    , germany    , austria    , austria    , austria    , austria    , austria    , austria    , hungary    , hungary    , hungary    , hungary    , hungary    , hungary    , romania    , romania    , romania    , romania    , romania    , romania    , romania    },
						{ switzerland, switzerland, austria    , austria    , austria    , austria    , austria    , austria    , austria    , austria    , austria    , hungary    , hungary    , hungary    , hungary    , hungary    , hungary    , hungary    , romania    , romania    , romania    , romania    , romania    , romania    , romania    },
						{ switzerland, switzerland, switzerland, null       , null       , null       , null       , null       , austria    , austria    , balkans    , hungary    , hungary    , hungary    , hungary    , hungary    , hungary    , romania    , romania    , romania    , romania    , romania    , romania    , romania    , romania    },
						{ null       , null       , null       , null       , italy      , italy      , italy      , balkans    , balkans    , balkans    , balkans    , balkans    , hungary    , hungary    , balkans    , balkans    , hungary    , romania    , romania    , romania    , romania    , romania    , romania    , romania    , romania    },
			/*35*/		{ null       , italy      , italy      , italy      , italy      , italy      , null       , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , null       , null       , null       , romania    , romania    , romania    , romania    , romania    , romania    },
						{ italy      , italy      , italy      , italy      , italy      , italy      , null       , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , null       , null       , romania    , romania    , romania    , null       , null       },
						{ null       , italy      , italy      , italy      , italy      , italy      , null       , null       , null       , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , null       , null       , null       , null       , null       , bulgaria   },
						{ null       , null       , italy      , italy      , italy      , italy      , italy      , null       , null       , null       , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , bulgaria   , bulgaria   , bulgaria   , bulgaria   , bulgaria   },
						{ null       , null       , null       , italy      , italy      , italy      , italy      , italy      , null       , null       , null       , null       , null       , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , balkans    , bulgaria   , bulgaria   , bulgaria   , bulgaria   , bulgaria   },
			/*40*/		{ sardinia   , sardinia   , null       , null       , italy      , italy      , italy      , italy      , null       , null       , null       , null       , null       , null       , null       , balkans    , balkans    , balkans    , balkans    , balkans    , bulgaria   , bulgaria   , bulgaria   , bulgaria   , bulgaria   },
						{ sardinia   , sardinia   , null       , null       , null       , italy      , italy      , italy      , italy      , italy      , null       , null       , null       , null       , null       , null       , balkans    , balkans    , balkans    , balkans    , greece     , greece     , greece     , greece     , greece     },
						{ sardinia   , null       , null       , null       , null       , null       , italy      , italy      , italy      , italy      , italy      , italy      , null       , null       , null       , balkans    , balkans    , balkans    , greece     , greece     , greece     , greece     , null       , null       , null       },
						{ sardinia   , sardinia   , null       , null       , null       , null       , null       , null       , italy      , italy      , italy      , italy      , italy      , italy      , null       , null       , balkans    , greece     , greece     , greece     , null       , null       , null       , null       , null       },
						{ sardinia   , sardinia   , null       , null       , null       , null       , null       , null       , null       , italy      , italy      , italy      , null       , null       , null       , null       , null       , greece     , greece     , greece     , greece     , null       , null       , null       , null       },
			/*45*/		{ sardinia   , sardinia   , null       , null       , null       , null       , null       , null       , null       , null       , italy      , italy      , italy      , null       , null       , null       , null       , null       , greece     , greece     , greece     , null       , null       , null       , null       },
						{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , italy      , italy      , null       , null       , null       , null       , null       , null       , null       , greece     , greece     , greece     , null       , null       , null       },
						{ null       , null       , null       , null       , null       , italy      , italy      , italy      , italy      , italy      , italy      , null       , null       , null       , null       , null       , null       , null       , null       , greece     , greece     , null       , null       , null       , null       },
						{ null       , null       , null       , null       , null       , null       , italy      , italy      , italy      , italy      , null       , null       , null       , null       , null       , null       , null       , null       , null       , greece     , greece     , greece     , null       , null       , null       },
						{ null       , null       , null       , null       , null       , null       , null       , null       , italy      , italy      , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				};
				
				
				xCornerCoord[4]=50;
				yCornerCoord[4]=0;
				Country[][]northeastMap = new Country[][]{
		//          50           51           52           53           54           55           56           57           58           59           60           61           62           63           64           65           66           67           68           69           70           71           72           73           74   	 	 	
		/*00*/	{ null       , null       , null       , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     },
				{ russia     , null       , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     },
				{ russia     , null       , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     },
	/*05*/		{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan },
				{ karelia    , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan },
	/*10*/		{ karelia    , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan },
				{ karelia    , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan , kazakhstan },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan },
	/*15*/		{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan },
				{ russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan },
	/*20*/		{ belarus    , belarus    , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , russia     , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan },
				{ belarus    , belarus    , russia     , russia     , russia     , russia     , russia     , russia     , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , russia     , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan },
				{ belarus    , belarus    , ukraine    , ukraine    , russia     , russia     , russia     , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan },
				{ belarus    , ukraine    , ukraine    , ukraine    , ukraine    , russia     , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan , kazakhstan },
				{ ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , kazakhstan , kazakhstan , null       , null       , kazakhstan , kazakhstan },
				};
				
				
				xCornerCoord[5]=50;
				yCornerCoord[5]=25;
				Country[][]southeastMap = new Country[][]{
		//          50           51           52           53           54           55           56           57           58           59           60           61           62           63           64           65           66           67           68           69           70           71           72           73           74   	 	 	
		/*25*/	{ ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , kazakhstan , null       , null       , null       , kazakhstan },
				{ ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , null       , null       , kazakhstan , kazakhstan },
				{ ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , null       , null       , null       , kazakhstan , kazakhstan },
				{ ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , null       , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , null       , null       , null       , null       , kazakhstan },
				{ moldova    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , null       , null       , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , null       , null       , null       , null       },
		/*30*/	{ moldova    , moldova    ,ukraine     , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , ukraine    , null       , null       , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , null       , null       , null       },
				{ moldova    , moldova    , moldova    , ukraine    , null       , ukraine    , null       , ukraine    , ukraine    , null       , null       , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , caspian    , null       , null       },
				{ romania    , moldova    , ukraine    , ukraine    , null       , null       , ukraine    , ukraine    , ukraine    , null       , null       , null       , null       , caspian    , caspian    , caspian    , caspian    , georgia    , caspian    , georgia    , georgia    , caspian    , caspian    , georgia    , georgia    },
				{ romania    , ukraine    , ukraine    , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , georgia    , georgia    , georgia    , georgia    , georgia    , georgia    , georgia    , georgia    , georgia    },
				{ romania    , romania    , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , georgia    , georgia    , georgia    , georgia    , georgia    , georgia    , georgia    , georgia    },
		/*35*/	{ romania    , romania    , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , turkey     , turkey     , turkey     , georgia    , georgia    , georgia    , georgia    , georgia    },
				{ null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , turkey     , turkey     , turkey     , turkey     , turkey     , georgia    , georgia    , georgia    , georgia    },
				{ bulgaria   , bulgaria   , null       , null       , null       , null       , null       , null       , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , georgia    , georgia    , georgia    , georgia    },
				{ bulgaria   , null       , null       , null       , null       , null       , null       , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , georgia    , georgia    , null       },
				{ turkey     , turkey     , null       , null       , null       , null       , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , georgia    , null       , null       },
/*40*/			{ turkey     , turkey     , turkey     , null       , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , null       , null       , null       , null       },
				{ turkey     , null       , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , null       , null       , null       , null       , null       , null       },
				{ turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , null       , null       , null       , null       , null       , null       , null       },
				{ null       , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
/*45*/			{ null       , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , turkey     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , turkey     , turkey     , turkey     , turkey     , turkey     , null       , null       , turkey     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
				{ null       , null       , null       , null       , null       , turkey     , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       , null       },
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
			
			countryList.add(portugal);
			countryList.add(spain);
			countryList.add(balearic);
			countryList.add(sardinia);
			countryList.add(italy);
			countryList.add(greece);
			countryList.add(balkans);
			countryList.add(france);
			countryList.add(switzerland);
			countryList.add(belgium);
			countryList.add(england);
			countryList.add(ireland);
			countryList.add(scotland);
			countryList.add(iceland);
			countryList.add(germany);
			countryList.add(austria);
			countryList.add(czech);
			countryList.add(hungary);
			countryList.add(poland);
			countryList.add(norway);		
			countryList.add(sweden);
			countryList.add(finland);
			countryList.add(denmark);
			countryList.add(baltic);
			countryList.add(turkey);
			countryList.add(bulgaria);
			countryList.add(romania);
			countryList.add(moldova);
			countryList.add(ukraine);
			countryList.add(belarus);
			countryList.add(lithuania);
			countryList.add(georgia);
			countryList.add(kazakhstan);
			countryList.add(caspian);
			countryList.add(karelia);
			countryList.add(russia);

				
			Country[] southEurope = new Country[]{portugal, spain, balearic, sardinia, italy, greece, balkans};
			Country[] westEurope = new Country[]{france, switzerland, belgium};
			Country[] greatBritain = new Country[]{england, ireland, scotland, iceland};
			Country[] centralEurope = new Country[]{germany, austria, czech, hungary, poland};
			Country[] northEurope = new Country[]{norway, sweden, finland, denmark, baltic};
			Country[] eastEurope = new Country[]{turkey, bulgaria, romania, moldova, ukraine, belarus, lithuania};
			Country[] westRussia = new Country[]{georgia, kazakhstan, caspian, karelia, russia};
			
			continentBonus = new ArrayList<Continent>();
			
			continentBonus.add(new Continent(southEurope, 4));
			continentBonus.add(new Continent(westEurope, 3));
			continentBonus.add(new Continent(greatBritain, 2));
			continentBonus.add(new Continent(centralEurope, 5));
			continentBonus.add(new Continent(northEurope, 5));
			continentBonus.add(new Continent(eastEurope, 7));
			continentBonus.add(new Continent(westRussia, 4));
			
			xcoord = new int[]{ 1, 7, 8,10,14,15,15,16,21,25,26,27,27,31,32,32,33,37,38,38,40,41,42,43,45,45,46,46,50,51,57,59,64,70,71};
			ycoord = new int[]{43,44,22, 6,18,24,45,34,27,44,28,13,20,42,15,32,29,26,33,39,11,20,16,45,22,35,10,40,31,28,44,12,30,22,36};
			
			try {
				image = ImageIO.read(new File("europe2.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
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

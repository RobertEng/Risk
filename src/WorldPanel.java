import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

import BreezySwing.GBPanel;

public class WorldPanel extends GBPanel {

	private BufferedImage image;
	private Control con;
	private JLabel info;

	private World world;
	private int mouseX, mouseY;
	
	//private boolean detect;

	public WorldPanel(Control con, JLabel info, World world) {

		this.con = con;
		this.info = info;

		this.world = world;

	//	detect=false;
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		System.out.println("World Panel paintComponent was called");
		
//		setMinimumSize(new Dimension(900, 600));
//		setMaximumSize(new Dimension(900, 600));
//		setPreferredSize(new Dimension(900, 600));
		
		Dimension f = getSize();
		g.drawImage(world.getImage(), 0,0, (int) f.getWidth(), (int) f.getHeight(), null);
		
		//g.drawImage(image, 0, 0, null);
		double widthSize = world.getMapSections().get(0).length*world.getNumColSections();
		double heightSize = world.getMapSections().get(0)[0].length*world.getNumRowSections();
		
		for(int b=0; b<world.getMapSections().size(); b++){
			for(int a=0;a<world.getMapSections().get(0).length;a++){
				for(int e=0;e<world.getMapSections().get(0)[0].length;e++){
					if(world.getMapSections().get(b)[a][e]!=null){
						
						g.setColor(world.getMapSections().get(b)[a][e].getOwner().getColor());
						g.drawRect((int)Math.round(((double)e+world.getxCornerCoord()[b])*getWidth()/widthSize+1),(int)Math.round(((double)a+world.getyCornerCoord()[b])*getHeight()/heightSize+1),(int)Math.round(((double)getWidth())/widthSize-2),(int)Math.round(((double)getHeight())/heightSize-2));
						g.drawRect((int)Math.round(((double)e+world.getxCornerCoord()[b])*getWidth()/widthSize),(int)Math.round(((double)a+world.getyCornerCoord()[b])*getHeight()/heightSize),(int)Math.round(((double)getWidth())/widthSize),(int)Math.round(((double)getHeight())/heightSize));
						g.drawOval((int)Math.round(((double)e+world.getxCornerCoord()[b])*getWidth()/widthSize),(int)Math.round(((double)a+world.getyCornerCoord()[b])*getHeight()/heightSize),(int)Math.round(((double)getWidth())/widthSize),(int)Math.round(((double)getHeight())/heightSize));
						if(con.getCurrCoun()!=null&&(con.getToCountry()==null&&con.getFromCountry()==null)){
							if(con.getCurrCoun().equals(world.getMapSections().get(b)[a][e])){
								g.setColor(Color.white);
								g.drawRect((int)Math.round((e+world.getxCornerCoord()[b])*getWidth()/widthSize),(int)Math.round((a+world.getyCornerCoord()[b])*getHeight()/heightSize),(int)Math.round(getWidth()/widthSize),(int)Math.round(getHeight()/heightSize));
						
							}
						}
						if(con.getToCountry()!=null){
							if(con.getToCountry().equals(world.getMapSections().get(b)[a][e])){
								g.setColor(Color.white);
								g.drawRect((int)Math.round((e+world.getxCornerCoord()[b])*getWidth()/widthSize),(int)Math.round((a+world.getyCornerCoord()[b])*getHeight()/heightSize),(int)Math.round(getWidth()/widthSize),(int)Math.round(getHeight()/heightSize));
						
							}
						}
						if(con.getFromCountry()!=null){
							if(con.getFromCountry().equals(world.getMapSections().get(b)[a][e])){
								g.setColor(Color.white);
								g.drawRect((int)Math.round((e+world.getxCornerCoord()[b])*getWidth()/widthSize),(int)Math.round((a+world.getyCornerCoord()[b])*getHeight()/heightSize),(int)Math.round(getWidth()/widthSize),(int)Math.round(getHeight()/heightSize));
							}
						}
					}
				
				
				}
			}
		}
		
		//print armies
		//caution: hardcoded in locations
		/*
		for(int a=0; a<25; a++){
			for(int b=0; b<25; b++){
				System.out.print(world.getMapSections().get(0)[a][b]);
			}
			System.out.println();
		}*/
		
		try {
			Font font =Font.createFont(Font.TRUETYPE_FONT, new File("DS-DIGI.ttf"));
			font=font.deriveFont(Font.PLAIN,40);
			g.setFont(font);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//	g.setFont( new Font("DS-Digital",Font.PLAIN,40));
			for(int e=0; e<world.getXcoord().length; e++){
				g.setColor(Color.black);
				//System.out.println(world.findCountryFromCoord(e)+" xcoord[e]="+ world.getXcoord()[e] + "ycod=" +world.getYcoord()[e]);
				//System.out.println("blah"+world.findCountryFromCoord(e)+" e="+e+" xcoord length="+world.getXcoord().length);
				g.drawString(world.findCountryFromCoord(e).getArmies()+"",(int)Math.round(world.getXcoord()[e]*getWidth()/widthSize)+2,(int)Math.round((world.getYcoord()[e])*getHeight()/heightSize)+2);
				g.setColor(Color.white);
				g.drawString(world.findCountryFromCoord(e).getArmies()+"",(int)Math.round(world.getXcoord()[e]*getWidth()/widthSize),(int)Math.round((world.getYcoord()[e])*getHeight()/heightSize));

			}
		
		/*g.setFont( new Font("DS-Digital",Font.PLAIN,40));
		Country[][] currMap = northwestMap;
	//	int[]xcoord = new int[]{  3,  8,  9, 10, 14, 15, 17, 21};
	//	int[]ycoord = new int[]{  8, 15, 10, 23, 16, 11,  5, 11};
		for(int a=0; a<xcoord.length; a++){
			g.setColor(Color.black);
			g.drawString(currMap[ycoord[a]][xcoord[a]].getArmies()+"", (int)Math.round(xcoord[a]*getWidth()/75.0)+2,(int)Math.round((ycoord[a])*getHeight()/50.0)+2);
			g.setColor(Color.white);
			g.drawString(currMap[ycoord[a]][xcoord[a]].getArmies()+"", (int)Math.round(xcoord[a]*getWidth()/75.0),(int)Math.round((ycoord[a])*getHeight()/50.0));
		}
		currMap = southwestMap;
	//	xcoord = new int[]{ 22, 16, 17, 19};
	//	ycoord = new int[]{ 34, 34, 28, 43};
		for(int a=0; a<xcoord.length; a++){
			g.setColor(Color.black);
			g.drawString(currMap[ycoord[a]-25][xcoord[a]].getArmies()+"", (int)Math.round(xcoord[a]*getWidth()/75.0)+2,(int)Math.round((ycoord[a])*getHeight()/50.0)+2);
			g.setColor(Color.white);
			g.drawString(currMap[ycoord[a]-25][xcoord[a]].getArmies()+"", (int)Math.round(xcoord[a]*getWidth()/75.0),(int)Math.round((ycoord[a])*getHeight()/50.0));
		}
		currMap = northMap;
	//	xcoord = new int[]{  31,  31,  32,  32,  32, 37, 37, 38, 39, 43, 46, 49};
	//	ycoord = new int[]{  4, 10,  7, 15, 23, 11,  7, 15, 20, 10, 20, 15};
		for(int a=0; a<xcoord.length; a++){
			g.setColor(Color.black);
			g.drawString(currMap[ycoord[a]][xcoord[a]-25].getArmies()+"", (int)Math.round((xcoord[a])*getWidth()/75.0)+2,(int)Math.round((ycoord[a])*getHeight()/50.0)+2);
			g.setColor(Color.white);
			g.drawString(currMap[ycoord[a]][xcoord[a]-25].getArmies()+"", (int)Math.round((xcoord[a])*getWidth()/75.0),(int)Math.round((ycoord[a])*getHeight()/50.0));
		}
		currMap = southMap;
	//	xcoord = new int[]{ 38, 39, 43, 46};
	//	ycoord = new int[]{ 34, 40, 27, 37};
		for(int a=0; a<xcoord.length; a++){
			g.setColor(Color.black);
			g.drawString(currMap[ycoord[a]-25][xcoord[a]-25].getArmies()+"", (int)Math.round((xcoord[a])*getWidth()/75.0)+2,(int)Math.round((ycoord[a])*getHeight()/50.0)+2);
			g.setColor(Color.white);
			g.drawString(currMap[ycoord[a]-25][xcoord[a]-25].getArmies()+"", (int)Math.round((xcoord[a])*getWidth()/75.0),(int)Math.round((ycoord[a])*getHeight()/50.0));
		}
		currMap = northeastMap;
	//	xcoord = new int[]{ 51, 54, 54, 59, 60, 61, 61, 67, 68};
	//	ycoord = new int[]{ 11,  8, 22, 10, 18,  6, 13,  9, 16};
		for(int a=0; a<xcoord.length; a++){
			g.setColor(Color.black);
			g.drawString(currMap[ycoord[a]][xcoord[a]-50].getArmies()+"", (int)Math.round((xcoord[a])*getWidth()/75.0)+2,(int)Math.round((ycoord[a])*getHeight()/50.0)+2);
			g.setColor(Color.white);
			g.drawString(currMap[ycoord[a]][xcoord[a]-50].getArmies()+"", (int)Math.round((xcoord[a])*getWidth()/75.0),(int)Math.round((ycoord[a])*getHeight()/50.0));
		}
		currMap = southeastMap;
	//	xcoord = new int[]{ 61, 63, 64, 68, 70};
	//	ycoord = new int[]{ 25, 40, 31, 43, 32};
		for(int a=0; a<xcoord.length; a++){
			g.setColor(Color.black);
			g.drawString(currMap[ycoord[a]-25][xcoord[a]-50].getArmies()+"", (int)Math.round((xcoord[a])*getWidth()/75.0)+2,(int)Math.round((ycoord[a])*getHeight()/50.0)+2);
			g.setColor(Color.white);
			g.drawString(currMap[ycoord[a]-25][xcoord[a]-50].getArmies()+"", (int)Math.round((xcoord[a])*getWidth()/75.0),(int)Math.round((ycoord[a])*getHeight()/50.0));
		}
*/
		if(con.isEnd()){

			g.drawString("YOU WIN", 40, 100);
		}
		
		
		g.drawString("(" + mouseX + "," + mouseY + ")", mouseX-40, mouseY);
		
		//System.out.println("Detect:" + detect);
	//	if(detect)g.drawRect(0, 0, 100, 100);
	}

	public void mouseClicked(int x, int y) {

		// find current country

		con.setCurrCoun(world.findCountry(x, y, getWidth(), getHeight()));

		/*
		 * Cases:
		 * from=null to=null current=isOwned then from=east
		 * from=null to=null current=!isOwned then to=east
		 * from=null to=other current=isOwned then from=east
		 * from=null to=east then to=null :)
		 * from=other to=null then to=east :)
		 * from=other to=other then check for stuff :)
		 * from=other to=east then to=null :)
		 * from=east to=null then from=null :)
		 * from=east to=other then from=null :)
		 */

		if (con.getMode() == 2) {
			if(con.getCurrCoun()!=null){
				if(con.getPlayerList().get(con.getPlayerInd()).isOwned(con.getCurrCoun())){
					if(con.getFromCountry()==null){
						con.setFromCountry(con.getCurrCoun());
					}else if(con.getFromCountry().equals(con.getCurrCoun())){
						con.setFromCountry(null);
						con.setCurrCoun(null);
					}else{
						con.setFromCountry(con.getCurrCoun());
					}
				}else{
					if(con.getToCountry()==null){
						con.setToCountry(con.getCurrCoun());
					}else if(con.getToCountry().equals(con.getCurrCoun())){
						con.setToCountry(null);
						con.setCurrCoun(null);
					}else{
						con.setToCountry(con.getCurrCoun());
					}
				}
			}else{
				con.setFromCountry(null);
				con.setToCountry(null);
			}
			
		}else if(con.getMode()==3){
			if(con.getCurrCoun()!=null){
				if(con.getPlayerList().get(con.getPlayerInd()).isOwned(con.getCurrCoun())){
					if(con.getFromCountry()==null){
						con.setFromCountry(con.getCurrCoun());
					}else if(con.getToCountry()==null){
						con.setToCountry(con.getCurrCoun());
					}else if(con.getFromCountry().equals(con.getCurrCoun())){
						con.setFromCountry(null);
						con.setCurrCoun(null);
					}else if(con.getToCountry().equals(con.getCurrCoun())){
						con.setToCountry(null);
						con.setCurrCoun(null);
					}else{
						con.setToCountry(con.getCurrCoun());
					}
				}
			}else{
				con.setFromCountry(null);
				con.setToCountry(null);
			}
		}
			
			/*
			
			if (con.getFromCountry() != null && con.getCurrCoun() !=null
					&& con.getCurrCoun().equals(con.getFromCountry())) {
				con.setFromCountry(null);
				System.out.println("remove from");
			} else if (con.getToCountry() != null && con.getCurrCoun()!=null
					&& con.getCurrCoun().equals(con.getToCountry())) {
				con.setToCountry(null);
				System.out.println("remove to");
			} else if (con.getFromCountry() == null) {
				if (con.getPlayerList().get(con.getPlayerInd())
						.isOwned(con.getCurrCoun())) {
					con.setFromCountry(con.getCurrCoun());
					System.out.println("set from");
				} else
					System.out.println("can't set from");
			} else if (con.getToCountry() == null) {
				if (!con.getPlayerList().get(con.getPlayerInd())
						.isOwned(con.getCurrCoun())) {
					con.setToCountry(con.getCurrCoun());
					System.out.println("set to");
				} else
					System.out.println("can't set to");
			} else {//check for stuff
				if(con.getPlayerList().get(con.getPlayerInd()).isOwned(con.getCurrCoun())){
					con.setFromCountry(con.getCurrCoun());
				}else{
					con.setToCountry(con.getCurrCoun());
				}
				System.out.println("thing of noth");
			}
		} else if (con.getMode() > 2) {
			if (con.getFromCountry() != null && con.getCurrCoun()!=null
					&& con.getCurrCoun().equals(con.getFromCountry())) {
				con.setFromCountry(null);
				System.out.println("remove from");
			} else if (con.getToCountry() != null
					&& con.getCurrCoun().equals(con.getToCountry())) {
				con.setToCountry(null);
				System.out.println("remove to");
			} else if (con.getFromCountry() == null) {
				if (con.getPlayerList().get(con.getPlayerInd())
						.isOwned(con.getCurrCoun())) {
					con.setFromCountry(con.getCurrCoun());
					System.out.println("set from");
				} else
					System.out.println("can't set from");
			} else if (con.getToCountry() == null) {
				if (con.getPlayerList().get(con.getPlayerInd())
						.isOwned(con.getCurrCoun())) {
					con.setToCountry(con.getCurrCoun());
					System.out.println("set to");
				} else
					System.out.println("can't set to");
			} else {
				// nothing
				System.out.println("thing of noth");
			}
		}*/

		con.relabel(info);

		repaint();

	}



	public void mouseMoved(int x, int y) {
		mouseX = x;
		mouseY = y;

		repaint();

	}
	
	//public void detect(boolean hi){
	//	detect=hi;
	//}
}

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import BreezySwing.GBPanel;


public class DonePanel extends GBPanel{
	
	private Control con;
	private ActionPanel actionActPanel;
	
	public DonePanel(Control control){
		con = control;
		setBackground(Color.black);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		int posX=10;
	    int posY=50;
	    

		try {
			Font font =Font.createFont(Font.TRUETYPE_FONT, new File("DS-DIGI.ttf"));
			font=font.deriveFont(Font.PLAIN,50);
			g.setFont(font);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	//    g.setFont(new Font("DS-Digital",Font.PLAIN,50));
	    g.setColor(new Color(54,18,11));
	    g.drawString("88888", posX, posY);
	    g.setColor(Color.darkGray);
	    
	    
	    int length = 5; //how many letters max
	    int x=posX-10;
	    int y=posY-g.getFont().getSize()+5;
	    int width=g.getFont().getSize()*length/2+20;
	    int height=g.getFont().getSize()+5;
	    g.drawRect(x,y,width,height);
	    g.drawRect(x+1,y+1,width-2,height-2);
	    g.drawRect(x+2,y+2,width-4,height-4);
		g.setColor(Color.yellow);
		
		
		if (con.getMode() == 1) {
			g.drawString("", posX, posY);
		} else if (con.getMode() == 2) {
			g.drawString("DONE", posX, posY);
		}else if (con.getMode() == 3){
			g.drawString("DONE", posX, posY);
		}else if(con.getMode() == 4){
			g.drawString("", posX,posY);
		}
	}
	


	
	
	
	
	public void mouseClicked(int x, int y){
		if(con.getMode()==2){
			con.setToMode(3);
			actionActPanel.repaint();
			System.out.println("I changed it to 3!");
		}else if(con.getMode()==3){
			con.setToMode(1);
			actionActPanel.repaint();
			System.out.println("I changed it to 1!");
		}
		
		repaint();
	}

	public ActionPanel getActionActPanel() {
		return actionActPanel;
	}

	public void setActionActPanel(ActionPanel actionActPanel) {
		this.actionActPanel = actionActPanel;
	}
}

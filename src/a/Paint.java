package a;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;




public class Paint   implements Serializable {//m500+  旗幟   
	
	BufferedImage  a,img,bi,bi2,flag[],flagz ;
	Graphics g;
	ImageIcon d ;
	String ea;
	//private static final long serialVersionUID = 2;
	
	Paint(){
	//	a=new BufferedImage (100, 50,BufferedImage.TYPE_INT_ARGB);
		//d=new  ImageIcon(a);
		//g=new ;
	//	g = a.getGraphics(); 
		flag=new BufferedImage[1010];
		ea=a13.a130.ea;
		
		
		try {

			bi = ImageIO.read(new File(ea+"flagz.png"));		
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		flagz=bi;
		
		for(int z=0;z<a13.a1.groupn;z++)
		{
			createold(z,a13.a1.group[z].c1,a13.a1.group[z].c2,a13.a1.group[z].cg); 
		}
	}
	
	void try0()
	{
		//for(int z=0;z<9;z++) createnew(z);
		
		 
	}
	void createnew2(int k) {
	
BufferedImage a=new BufferedImage (100, 50,BufferedImage.TYPE_INT_ARGB);
		
		g = a.getGraphics(); 
		
		Color cc[]=new Color[] {Color.WHITE,
				Color.BLACK,
				new Color(1, 33, 105),//藍
				new  Color(135, 206, 235),//天藍
				new  Color(13, 101, 3),//深綠
				new  Color(19, 136, 8),//印度綠
				new  Color(255, 204, 0),//德國金
				new Color(246, 161, 34),//橘
				new Color(207, 20, 43),//聯合旗紅
				new Color(249, 73, 73),//奧地利紅
				
				
		};
		
		g.setColor(cc[k]);
		g.fillRect( 0, 0, 100, 50); 
		flag[k]=a;
		
		
	}
	int c1,c2,cg;
	void createnew(int k) {
		
		BufferedImage a=new BufferedImage (100, 50,BufferedImage.TYPE_INT_ARGB);
		
		g = a.getGraphics(); 
		
		Color cc[]=new Color[] {Color.WHITE,
				Color.BLACK,
				new Color(1, 33, 105),//藍
				new  Color(135, 206, 235),//天藍
				new  Color(13, 101, 3),//深綠
				new  Color(19, 136, 8),//印度綠
				new  Color(255, 204, 0),//德國金
				new Color(246, 161, 34),//橘
				new Color(207, 20, 43),//聯合旗紅
				new Color(249, 73, 73),//奧地利紅
				
				
		};
		int cn=10;
		
		g.clearRect(0, 0, 100, 50);
		
		c1=(int)(Math.random()*12121)%cn;
		
		g.setColor(cc[c1]); 
		//畫矩形 
		g.fillRect( 0, 0, 100, 50); 
		
		c2=(int)(Math.random()*12171)%cn;
		
		while(c2==c1||c2-c1==1||c1-c2==1)
			c2=(int)(Math.random()*12171)%cn;
		
		int g0=(int)(Math.random()*179211)%4;
		g.setColor(cc[c2]); 
		
	   
		if(g0==0)
		{
			g.fillRect( 0, 20,100,10); 
			g.fillRect( 45, 0,10 ,50); 
		}
		else if(g0==1)
		{
			g.fillRect( 0, 20,100,10); 
			g.fillRect( 35, 0,10 ,50); 
		}
		else if(g0==2)
		{
			g.fillRect( 0,0,100 ,15); 	
			g.fillRect( 0,35,100 ,15); 	
		}
		else
		{
			g.fillRect( 0,25,100 ,25); 			
		}
	
		cg=g0;

		
		flag[k]=a;
	}
	
	void createold(int k,int c1,int c2,int cg) {
		
		BufferedImage a=new BufferedImage (100, 50,BufferedImage.TYPE_INT_ARGB);
		
		g = a.getGraphics(); 
		
		Color cc[]=new Color[] {Color.WHITE,
				Color.BLACK,
				new Color(1, 33, 105),//藍
				new  Color(135, 206, 235),//天藍
				new  Color(13, 101, 3),//深綠
				new  Color(19, 136, 8),//印度綠
				new  Color(255, 204, 0),//德國金
				new Color(246, 161, 34),//橘
				new Color(207, 20, 43),//聯合旗紅
				new Color(249, 73, 73),//奧地利紅
				
				
		};
		int cn=10;
		
		g.clearRect(0, 0, 100, 50);
		
		g.setColor(cc[c1]); 
		//畫矩形 
		g.fillRect( 0, 0, 100, 50); 
	
		g.setColor(cc[c2]); 
		   
		if(cg==0)
		{
			g.fillRect( 0, 20,100,10); 
			g.fillRect( 45, 0,10 ,50); 
		}
		else if(cg==1)
		{
			g.fillRect( 0, 20,100,10); 
			g.fillRect( 35, 0,10 ,50); 
		}
		else if(cg==2)
		{
			g.fillRect( 0,0,100 ,15); 	
			g.fillRect( 0,35,100 ,15); 	
		}
		else
		{
			g.fillRect( 0,25,100 ,25); 			
		}
	
	
		flag[k]=a;
	}

}

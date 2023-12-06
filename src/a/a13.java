package a;


import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Toolkit;  
import java.awt.datatransfer.Clipboard;  
import java.awt.datatransfer.ClipboardOwner;  
import java.awt.datatransfer.StringSelection;  
import java.awt.datatransfer.Transferable;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.KeyAdapter;  
import java.awt.event.KeyEvent;  
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;


public class a13 extends JFrame   implements Serializable{
	
	
	//private static final long serialVersionUID = 178;
	public static int a[][],an;
	public static int af[][],afn;
	static String as[]= new String [40];
    String ea;
	public static int g0;
	public static String y0[]= new String [20];
	protected JPanel p;
	
	static JButton bu[]=new JButton[20];
	static int bb[][]=new int [22][5];
	static String bbs[]= new String [22];
	
	 static JTextArea ba[]=new JTextArea[24];
		static int bba[][]=new int [24][5];
		static String bbas[]= new String [50];
		 static JScrollPane bag[] = new JScrollPane[25];
	
	static JLabel bl[]=new JLabel[51];
	static int bbl[][]=new int [51][6];
	static String bbls[]= new String [51];
	
	static  JTextField bt[]= new JTextField [20];
	static int bbt[][]=new int [30][6];
	static String bbts[]= new String [30];
	
	
	static public int dx=0,dy=0;
	 
	JLabel dd;
	Image img,bi,bi2;
	 JLabel lb ;
	Graphics g;
	 ImageIcon d ;
 
	static key kk;
 a13()
 {
	 
	 Scanner scanner = new Scanner(System.in);
	 System.out.print((int)(Math.random()*100000002)%1111149);
     System.out.print("Please input your name: ");
	    
	 
	 g0=0;//C:/Users/User/eclipse-workspace/a9/
	 ea="fild/";
	 //aa=this;
	 p = new JPanel();
	 setContentPane(p);
	 	
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setBounds(0,0,1220,620);
	  setTitle("tt");
	  setVisible(true);
	  
	 // setLayout(new GridLayout(1));
	  setLayout(null);
	  
	
	  
	  a=new int [40][5];
	  an=0;
	  af=new int [20][6];
	  afn=0;
	 
	     img = createImage(1220, 620);
		 g = img.getGraphics(); //
		 d = new ImageIcon(img);
	
		 kk=new key();
		  addKeyListener(kk);
		  
		 
		 for(int z=0;z<50;z++)
		 {
			 bl[z]= new JLabel();
		 }

		 for(int z=0;z<=22;z++)
		 {
			 ba[z]= new JTextArea(300,400);
			 bag[z]=new JScrollPane( );  
			 ba[z].setLineWrap(true); //�E���۰ʴ���\��

		
			  ba[z].setOpaque(false);  	

		
			  
		 }
		 
		 for(int z=0;z<20;z++)
		 {
			 bu[z]= new JButton();
		 }
		 for(int z=0;z<20;z++)
		 {
			 bt[z]= new  JTextField (10);
		 }
			
		 
		  bu[0].addActionListener(new ActionListener() {// 
				public void actionPerformed(ActionEvent e) {
					g0=0;
				}
			});	  
		  bu[1].addActionListener(new ActionListener() {// 
				public void actionPerformed(ActionEvent e) {
					g0=1;
				}
			});	 
		  bu[2].addActionListener(new ActionListener() {// 
				public void actionPerformed(ActionEvent e) {
					g0=2;
				}
			});	 
		  bu[3].addActionListener(new ActionListener() {// 
				public void actionPerformed(ActionEvent e) {
					g0=3;
				}
			});
		  bu[4].addActionListener(new ActionListener() {// 
				public void actionPerformed(ActionEvent e) {
					g0=4;
				}
			});	  
		  bu[5].addActionListener(new ActionListener() {// bt1�ƥ󪺰ʧ@
				public void actionPerformed(ActionEvent e) {
					g0=5;
				}
			});	 

		  
		  bt[1].addActionListener( new ActionListener(){
		    	 public  void  actionPerformed (ActionEvent ev) {
		    	  y0[1]=bt[1].getText();	
		    	}
		    });
		  bt[2].addActionListener( new ActionListener(){
		    	 public  void  actionPerformed (ActionEvent ev) {
		    	  y0[2]=bt[2].getText();	 	}
		    });
		  bt[3].addActionListener( new ActionListener(){
		    	 public  void  actionPerformed (ActionEvent ev) {
		    	  y0[3]=bt[3].getText();	
		    	}
		    });
		  bt[4].addActionListener( new ActionListener(){
		    	 public  void  actionPerformed (ActionEvent ev) {
		    	  y0[4]=bt[4].getText();	
		    	}
		    });
		  bt[5].addActionListener( new ActionListener(){
		    	 public  void  actionPerformed (ActionEvent ev) {
		    	  y0[5]=bt[5].getText();	
		    	}
		    });
		  
		  	  
		
		  
		  for(int x=1;x<20;x++)
		  {
			  p.add(bu[x]);
			  bu[x].setFont(new java.awt.Font(null, 1, 15)); 
		  }
 
		
		
		  for(int x=11;x<=20;x++)
		  {
			  p.add(bl[x]);
			  p.add(bl[x]);  bl[x].setForeground(Color.white); 
			   bl[x].setFont(new java.awt.Font(null, 1, 14)); 
		  }
		  for(int x=0;x<=10;x++)
		  {
			  p.add(bl[x]);  bl[x].setForeground(Color.white); 
			  bl[x].setFont(new java.awt.Font(null, 1, 15));    	
		  }
		  for(int x=21;x<=30;x++)
		  {
			  p.add(bl[x]);
			  bl[x].setFont(new java.awt.Font(null, 1, 15)); 
			 bl[x].setForeground(Color.white); 
		  }
		  
		  for(int x=31;x<=42;x++)
		  {
			  p.add(bl[x]);
			  bl[x].setForeground(Color.white); 
			  bl[x].setFont(new java.awt.Font(null, 1, 13));    	
		  }
		  
		  for(int x=43;x<50;x++)
		  {
			  p.add(bl[x]);  bl[x].setForeground(Color.white); 
			  bl[x].setFont(new java.awt.Font(null, 1, 23)); 	
		  }
		  for(int x=49;x<50;x++)
		  {
			  p.add(bl[x]);  bl[x].setForeground(Color.black); 
			  bl[x].setFont(new java.awt.Font(null, 1, 27)); 	
		  }
  
  
		  for(int x=1;x<20;x++)
		  {
			  p.add(bt[x]);	
			  bt[x].setEditable(true);
			  bt[x].setSize(100, 40);
			  bt[x].setFont(new java.awt.Font(null, 1, 18)); 
		  }
		
		  for(int x=1;x<=8;x++)
		  {
			  p.add(ba[x]);
			 p.add(bag[x]);//, BorderLayout.CENTER  
			  ba[x].setFont(new java.awt.Font(null, 1, 15)); 
		  }
		
		  for(int x=9;x<=10;x++)
		  {
			  p.add(ba[x]);
			 p.add(bag[x]);//, BorderLayout.CENTER  
			  ba[x].setFont(new java.awt.Font(null, 1, 24)); 
		  }
		  for(int x=11;x<=20;x++)
		  {
			  p.add(ba[x]);
			 p.add(bag[x]);//, BorderLayout.CENTER  
			  ba[x].setFont(new java.awt.Font(null, 1, 15)); 
			  ba[x].setForeground(Color.white);   
		  }
	
		
		 
		  dd=new JLabel(d);
		
		
		
	//ns1= new ns();
	
		 
		  
Thread t= new Thread(//**************�h������	 
		 new Runnable(){
			 public void run(){	 
				 try {
					 int j=1;
					 System.out.print("tt");
					
				     for (int i = 0; i < 700;i++) {
				    	
				    	 paint(g);
				    	 j++;
				    	 
				    	 //dd.setText(d);
				    	
				    	 //img = createImage(1150, 620);
				 		 //g = img.getGraphics(); //
				 		// d = new ImageIcon(img);
				 		 
				    	// dd.setIcon(d);
				    	 
				    	 
				    	// dd=new JLabel(d);
				    	 p.add(dd);
				    	 dd.setBounds(0,0,1220,620);
				    	 dd.setVisible(true);
				    	 p.updateUI();
				    	// dd.setBounds(0,0,1150,600);
				    	// dd.revalidate();
				    	
			    		
				    	 if(i>13)
				    		 i-=2; 
				    	
				    	 for(int z=0;z<20;z++)
				    	 {				    		 
				    		 if(bb[z][0]==1)
				    		 {
				    			 bu[z].setText(bbs[z]);
				    			 bu[z].setBounds(bb[z][1],bb[z][2],bb[z][3],bb[z][4]); 
				    		}
				    	 }
				    	 for(int z=1;z<50;z++)
				    	 {
				    		 if(bbl[z][0]==1)
				    		 {
				    			 bl[z].setText(bbls[z]); 
				    			 bl[z].setBounds((bbl[z][1]),(bbl[z][2]),(bbl[z][3]),(bbl[z][4]));
				    		 }	
				    	 }	
				    	 for(int z=1;z<20;z++)
				    	 {
				    		 if(bbt[z][0]==1)
				    		 {
				    			 bt[z].setBounds(bbt[z][1],bbt[z][2],bbt[z][3],bbt[z][4]);
				    		 }	
				    	 }
				    	 for(int z=1;z<=20;z++)
				    	 {
				    		 if(bba[z][0]==1)
				    		 {
				    			ba[z].setText(bbas[z]);
				    			 //ba[z].setSize(bba[z][4], bba[z][3]);
				    			bag[z].setBounds(bba[z][1],bba[z][2],bba[z][3],bba[z][4]);
				    			bag[z].setOpaque(false);  	
				  				bag[z].getViewport().setOpaque(false);  
				    			ba[z].setBounds(bba[z][1],bba[z][2],bba[z][3],bba[z][4]);
				    		 }			    			 
				    	 }	
				    	 
				    
				    	 Thread.sleep(250);
				     }	 
			 
			 } catch (Exception e) {
			     e.printStackTrace();
			 } 	 } } );    

		  Thread t2= new Thread(//**************�h������	 
					 new Runnable(){
						 public void run(){	 
							 try {
								
							     for (int i = 0;;) {
							    	 pasoon (g);
							    	 p.add(dd);
							    	 dd.setBounds(0,0,1150,620);
							    	 dd.setVisible(true);
							    	 p.updateUI();

							    	 Thread.sleep(100);
							     }	 
						 
						 } catch (Exception e) {
						     e.printStackTrace();
						 } 	 } } );    

for(int x=0;x<=100;x++)
{
	for(int z=0;z<=100;z++)
	{
		pp[x][z]=-1;p2[x][z]=-1;
	}
}

f=new file();
t.start();
//t2.start();
System.out.print("start");



 }
 
 

static int keystate=0,keydelay=0,nstart=0;

public void paint(Graphics g1){
	
	
	if(a13.nstart==0)
		pa2(g);
	else
	pa(g);
	//g1.clearRect(0, 0,1600, 850);
	//g1.clearRect(800, 0,1500, 800);
	//g1.clearRect(0, 0,1600, 800);	
	//g1.drawImage(d, 0, 0, null);
}

int pp[][]=new int[111][111];

int pp2[][]=new int[1111][1111];
public static int screensize=0;

public void pa2(Graphics g)
{
	g.clearRect(0, 0,1220, 600);

	for(int z=0;z<30;z++)
	{
		if(a[z][0]==0)
			continue;
		try {
		
			bi = ImageIO.read(new File(ea+as[z]+".png"));
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
	}
	g.drawImage(bi, a[z][1],a[z][2],a[z][3],a[z][4],null);	

}

	
}
int p2[][]=new int[104][104];

public void pasoon(Graphics g)
{
	try {
		if(keystate==0)
		bi2 = ImageIO.read(new File(ea+"light.png"));
		
		if(keystate>0)
		{
			
			keydelay++;
			bi2 = ImageIO.read(new File(ea+"m"+keystate+".png"));
			if(keydelay==2) {
				keydelay=0;
				keystate=0;
			}
		}

	} catch (IOException e2) {	
	
		e2.printStackTrace();
	}

	//System.out.print("print pp"+dx+" "+dy+"\n");  
	pp[dx][dy]=-100;
	//repa(dx+1, dy);
	//repa(dx, dy+1);
	//repa(dx-1, dy);
	//repa(dx, dy-1);

	
	
}
int k,k2;
void repa(int x,int z)
{



}

int close=0;
void cleansceen()
{
	g.clearRect(0, 0,1220, 600);
	for(int x=0;x<12;x++)
	{
		for(int z=0;z<10;z++)
		{
			pp[x][z]=-5;
		}
	}
	
}
void start()
{
	
		try {
			//	System.out.print("pa"+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]);
		
			bi = ImageIO.read(new File(ea+"talk.png"));		
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		g.drawImage(bi,0,0,1200,580,null);	// dd.setBounds(0,0,1050+i/2,600);
		
	
}

void showpa2()
{
	for(int x=0;x<60;x++)
	{
		for(int z=0;z<50;z++)
		{
			if((int)(Math.random()*17777)%127==17)
				pp2[x][z]=-5;
			
			k=a13.a1.mapall[a13.a1.mapx+x][a13.a1.mapy+z];
			
			if(pp2[x][z]!=k&&(p2[x][z]!=k||a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]!=pp2[x][z]||a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]==-1))	
			{
				//if(pp[x][z]==-100)	System.out.print("replace"+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
				
				pp2[x][z]=k;
				
				try {
					//	System.out.print("pa"+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]);
				
				bi = ImageIO.read(new File(ea+"m"+k+".png"));		
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,20+x*10,20+z*10,10,10,null);	// dd.setBounds(0,0,1050+i/2,600);
		
			}
			p2[x][z]=k;
			//System.out.print("one "+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
			 if(a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]>-1) {
				
				//System.out.print("one "+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
				pp2[x][z]=a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z];
				k=a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z];
				k2=0;
				int gg;
				if(k>=1000) {//  *****************************************   繪製地面上物 包含人  *******************
					k2=k;
					k=a13.a1.b[k-1000].mapa;
				}
				if(k>=500&&k<900)
				{
						
					//	System.out.println("500 k="+k);
						g.drawImage(a13.paint.flag[k-500],20+x*10,20+z*10,10,6,null);	
						g.drawImage(a13.paint.flagz,20+x*10,20+z*10+6,2,5,null);	
						
				}
				else 
				{
				
					try {
						//System.out.println("!! k="+k);
						bi = ImageIO.read(new File(ea+"m"+k+".png"));		
					} catch (IOException e2) {
					e2.printStackTrace();
					}
					g.drawImage(bi,20+x*10,20+z*10,10,10,null);	// 
				}
				
				if(k2>=1000)//****************************************** 繪製人與身上標示 ***************
				{
					k=k2-1000;
					if(a13.a1.b[k].s<0)
						continue;
					
				}
			 }
		}
	}
	pacursor();
	g.drawImage(bi2,20+dx*10,20+dy*10,10,10,null);	// dd.setBounds(0,0,1050+i/2,600);
}
		

void showpa1()
{
	for(int x=0;x<24;x++)
	{
		for(int z=0;z<20;z++)
		{
			if((int)(Math.random()*17777)%127==17)
				pp2[x][z]=-5;
			
			k=a13.a1.mapall[a13.a1.mapx+x][a13.a1.mapy+z];
			
			if(pp2[x][z]!=k&&(p2[x][z]!=k||a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]!=pp2[x][z]||a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]==-1))	
			{
				//if(pp[x][z]==-100)	System.out.print("replace"+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
				
				pp2[x][z]=k;
				
				try {
					//	System.out.print("pa"+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]);
				
				bi = ImageIO.read(new File(ea+"m"+k+".png"));		
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,20+x*27,20+z*27,27,27,null);	// dd.setBounds(0,0,1050+i/2,600);
		
			}
			p2[x][z]=k;
			//System.out.print("one "+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
			 if(a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]>-1) {
				
				//System.out.print("one "+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
				pp2[x][z]=a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z];
				k=a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z];
				k2=0;
				int gg;
				if(k>=1000) {//  *****************************************   繪製地面上物 包含人  *******************
					k2=k;
					k=a13.a1.b[k-1000].mapa;
				}
				if(k>=500&&k<900)
				{
						
					//	System.out.println("500 k="+k);
						g.drawImage(a13.paint.flag[k-500],20+x*27,20+z*27,27,15,null);	
						g.drawImage(a13.paint.flagz,20+x*27,20+z*27+12,4,12,null);	
						
				}
				else 
				{
				
					try {
						//System.out.println("!! k="+k);
						bi = ImageIO.read(new File(ea+"m"+k+".png"));		
					} catch (IOException e2) {
					e2.printStackTrace();
					}
					g.drawImage(bi,20+x*27,20+z*27,27,27,null);	// 
				}
				
				if(k2>=1000)//****************************************** 繪製人與身上標示 ***************
				{
					k=k2-1000;
					if(a13.a1.b[k].s<0)
						continue;
					
				}
			 }
		}
	}
	
	for(int z=1;z<a13.a1.bn;z++)//*********************   繪雙方格圖框
	{
		if(a13.a1.b[z].s<0)
			continue;
		if(a13.a1.b[z].x>a13.a1.mapx+22||a13.a1.b[z].x<a13.a1.mapx||a13.a1.b[z].y>=a13.a1.mapy+19||a13.a1.b[z].y<a13.a1.mapy)
			continue;
		if(a13.a1.b[z].love>0)
		{
			try {
				bi = ImageIO.read(new File(ea+"love"+".png"));		
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			g.drawImage(bi,20+(a13.a1.b[z].x-a13.a1.mapx)*27,20+(a13.a1.b[z].y-a13.a1.mapy)*27,54,27,null);	// dd.setBounds(0,0,1050+i/2,600);
			pp2[a13.a1.b[z].x-a13.a1.mapx+1][a13.a1.b[z].y-a13.a1.mapy]=-100;
			pp2[a13.a1.b[z].x-a13.a1.mapx][a13.a1.b[z].y-a13.a1.mapy]=-100;				
		}		
	}


}
void clearpp()
{
	for(int z=0;z<100;z++)
	{
		for(int x=0;x<100;x++)
		{
			pp2[x][z]=-5;
			pp[x][z]=-5;
		}
	}
}
		
void pacursor()
{
	pp2[dx][dy]=-100;//*****************************************   繪製游標  ************************************
	try {
	if(keystate==0)
	bi2 = ImageIO.read(new File(ea+"light.png"));
	
	if(keystate>0)
	{
		
		keydelay++;
		bi2 = ImageIO.read(new File(ea+"m"+keystate+".png"));
		if(keydelay==2) {
			keydelay=0;
			keystate=0;
		}
	}
	pp2[dx][dy]=-100;

} catch (IOException e2) {	

	e2.printStackTrace();
}

//System.out.print("print pp"+dx+" "+dy+"\n");  
pp[dx][dy]=-100;


a13.a1.showbl();//顯示游標框住方框之簡介

}


void pamap()
{
	int x0,y0;int gh,gg=0,h,hn;
	gh=0;
	h=0;hn=0;
	int g1,g2,g1n,g2n,hg;
	g1=-1;g2=-1;g1n=0;g2n=0;
	for(int i=0;i<24;i++)
	{
		x0=a13.a1.mapx+(i-12)*6;
		for(int j=0;j<20;j++)
		{
			y0=a13.a1.mapx+(j-10)*5;
			gg=0;
			gh=0;
			g1=-1;g2=0;g1n=0;g2n=0;
			h=0;hn=0;
			for(int zx=x0;zx<x0+6;zx++)
			{
				for(int zy=y0;zy<y0+5;zy++)
				{
					gg+=a13.a1.mapall[zx][zy]%10;
					gh+=a13.a1.mapall[zx][zy]/10;
					if(a13.a1.map[zx][zy]>=1000)
					{
						h=a13.a1.map[zx][zy]-1000;
						hn++;
						hg=a13.a1.b[h].group;
						if(hg==g1)g1n++;
						else if(hg==g2)g2n++;
						else {
							if(g1n<=1) {
								g1=hg;
								g1n=1;								
							}
							else if(g2n<=1) {
								g2=hg;
								g2n=1;								
							}
						}		
					}
				}
			}
			if(g1n>=g2n) {
				hg=g1;
				g2n=g1n;
			}
			else hg=g2;
			
			
			
			gg=gg/30;
			gh=gh/30;
			gg=gh*10+gg;
			try {
				bi =ImageIO.read(new File(ea+"m"+gg+".png"));	
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			g.drawImage(bi,20+i*27,20+j*27,27,27,null);	// dd.setBounds(0,0,1050+i/2,600);
			
			if(hg>-1) {
			
			
			
			g.drawImage(a13.paint.flag[hg],20+i*27,20+j*27,14,10,null);	
			g.drawImage(a13.paint.flagz,20+i*27,20+j*27,3,16,null);	
			}
			else {
				if(g2n>=3) {
				try {
					bi =ImageIO.read(new File(ea+"humans"+".png"));	
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,23+i*27,23+j*27,20,20,null);	// dd.setBounds(0,0,1050+i/2,600);
				}
				else if(g2n>=1){
					try {
						bi =ImageIO.read(new File(ea+"g6"+".png"));	
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					g.drawImage(bi,20+8+i*27,20+8+j*27,10,10,null);	// dd.setBounds(0,0,1050+i/2,600);
					
				}
				
			}
			
			
		}
		
	}
}

void paG()
{
	int k3;

	ggg=dx-4;
	if(ggg<0)ggg=0;
	//   System.out.print("G"+kk.G);
	for(int z=0;z<10;z++)
	{
		if(a[z][0]==0)
			continue;
		//System.out.print("a "+z+"pa\n");
		try {
			
			bi = ImageIO.read(new File(ea+as[z]+".png"));
			} catch (IOException e2) {
				// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		g.drawImage(bi, a[z][1],a[z][2],a[z][3],a[z][4],null);	
	
	}
	
	if(kk.G==0) {
		int k4;
		//  System.out.print("pl"+kk.G);
	for(int z=ggg;z<ggg+12;z++) //*****************************************   繪製右上方地形示意圖  *******************
	{
		k=a13.a1.mapall[a13.a1.mapx+z][a13.a1.mapy+dy];
		k2=k%10;
		k=k-k%10+1;
		try {
			bi =ImageIO.read(new File(ea+"m"+k+".png"));	
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		g.drawImage(bi,720+z*20,20+200-k2*20,20,k2*20,null);
		if(a13.a1.map[a13.a1.mapx+z][a13.a1.mapy+dy]>=1000)
		{
			k4=a13.a1.map[a13.a1.mapx+z][a13.a1.mapy+dy];
			k3=a13.a1.b[k4-1000].mapa;
			
			if(a13.a1.b[k4-1000].tie>0)
		    {
		    	try {
					//System.out.println("!! k="+k);
					bi = ImageIO.read(new File(ea+"m306"+".png"));		
				} catch (IOException e2) {
				e2.printStackTrace();
				}
		    	g.drawImage(bi,720+z*20,20+200-k2*20-20,20,20,null);
				try {
					//System.out.println("!! k="+k);
					bi = ImageIO.read(new File(ea+"m"+k3+".png"));		
				} catch (IOException e2) {
				e2.printStackTrace();
				}
				g.drawImage(bi,722+z*20,22+200-k2*20-20,15,15,null);
			    
				try {
					//System.out.println("!! k="+k);
					bi = ImageIO.read(new File(ea+"m305"+".png"));		
				} catch (IOException e2) {
				e2.printStackTrace();
				}
				g.drawImage(bi,720+z*20,20+200-k2*20-20,20,20,null);
			    
		    	
		    }
		    else {
		    	try {
					bi =ImageIO.read(new File(ea+"m"+k3+".png"));	
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,720+z*20,20+200-k2*20-20,20,20,null);	
		    }
			
		}
		else if(a13.a1.map[a13.a1.mapx+z][a13.a1.mapy+dy]>=500)
		{
				//System.out.println("500 k="+k);
				k3=a13.a1.map[a13.a1.mapx+z][a13.a1.mapy+dy];
					g.drawImage(a13.paint.flag[k3-500],720+z*20,20+200-k2*20-20,20,10,null);	
					g.drawImage(a13.paint.flagz,720+z*20,20+200-k2*20-20+10,2,10,null);	
			
		}
		else if(a13.a1.map[a13.a1.mapx+z][a13.a1.mapy+dy]>=0)
		{
			//System.out.println(" k3="+k);
			k3=a13.a1.map[a13.a1.mapx+z][a13.a1.mapy+dy];
			try {
				bi =ImageIO.read(new File(ea+"m"+k3+".png"));	
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			g.drawImage(bi,720+z*20,20+200-k2*20-20,20,20,null);
			
		}
			
	}
	}
	
	if(kk.G>=1&&a13.kk.screen==0)
	{
		if(kk.G==1)
		kk.countG();
		else if(kk.G==2&&(Math.random()*12121)%2==1)
			kk.countG();
		
		
		int gg=kk.G;
		for(int x=0;x<5;x++)
		{
			for(int z=0;z<5;z++)
			{
				try {
					bi =ImageIO.read(new File(ea+"ma"+kk.Gmap[x][z]+".png"));	
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,720+x*(23+gg*6),60+z*(23+gg*6),(23+gg*6),(23+gg*6),null);
			}
		}	
	}
	
	for(int z=11;z<20;z++)
	{
		if(a[z][0]==0)
			continue;
		try {
			//System.out.print("a "+z+"pa\n");
			bi = ImageIO.read(new File(ea+as[z]+".png"));
			} catch (IOException e2) {
				// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		g.drawImage(bi, a[z][1],a[z][2],a[z][3],a[z][4],null);	
	
	}
	
	for(int z=0;z<20;z++)
	{
		if(af[z][0]==0)
			continue;
		g.drawImage(a13.paint.flag[af[z][5]], af[z][1],af[z][2],af[z][3],af[z][4],null);	
	
	}
	
	if(kk.q==4)//*****************************************  繪製聖光人物游標
	{
		
		try {
			bi =ImageIO.read(new File(ea+"light2"+".png"));	
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		g.drawImage(bi,700,270+kk.ly*30,20,20,null);
		
	}
	if(kk.q==21)//*****************************************  繪製聖光人物游標
	{	
		try {
			bi =ImageIO.read(new File(ea+"light2"+".png"));	
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		g.drawImage(bi,700,150+kk.ly*30,20,20,null);		
	}
	if(kk.q==5||kk.q==15)//*****************************************  繪製聖光人物游標
	{	
		try {
			bi =ImageIO.read(new File(ea+"light2"+".png"));	
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		g.drawImage(bi,700,210+kk.ly*30,20,20,null);		
	}
	if(kk.q==6)//*****************************************  繪製聖光人物游標
	{	
		try {
			bi =ImageIO.read(new File(ea+"light2"+".png"));	
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		g.drawImage(bi,700,200+kk.ly*30,20,20,null);		
	}
	if(kk.q==9||kk.q==10||kk.q==11||kk.q==12||kk.q==13||kk.q==14||kk.q==17)//*****************************************  繪製聖光人物游標
	{	
		try {
			bi =ImageIO.read(new File(ea+"light2"+".png"));	
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		g.drawImage(bi,700,80+kk.ly*40,20,20,null);		
	}
	

	
	
	
}

public void pa(Graphics g)
{

	if(close==1)
	{
		try {
			//	System.out.print("pa"+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]);
		
		bi = ImageIO.read(new File(ea+"200.png"));		
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		g.drawImage(bi,0,0,1200,580,null);	// dd.setBounds(0,0,1050+i/2,600);
		
		return;
	}
		

//g.drawImage(bi, 50,200,150,200,null);

//	System.out.print("pa\n");

	
	int k=0,k2;
	
	if(screensize==1)
	{
		showpa1();
		pacursor();
		g.drawImage(bi2,20+dx*27,20+dy*27,27,27,null);	// dd.setBounds(0,0,1050+i/2,600);
		
		paG();
		return;
	}
	if(screensize==2)
	{
		showpa2();
		pacursor();
		g.drawImage(bi2,20+dx*27,20+dy*27,27,27,null);	// dd.setBounds(0,0,1050+i/2,600);
		
		paG();
		return;
	}
	if(screensize==3)
	{
		pamap();
		pacursor();
		g.drawImage(bi2,20+dx*27,20+dy*27,27,27,null);	// dd.setBounds(0,0,1050+i/2,600);
		
		paG();
		return;
	}
	for(int x=0;x<12;x++)
	{
		for(int z=0;z<10;z++)
		{
			if((int)(Math.random()*17777)%17==7)
				pp[x][z]=-5;
			
			k=a13.a1.mapall[a13.a1.mapx+x][a13.a1.mapy+z];
			
			if(pp[x][z]!=k&&(p2[x][z]!=k||a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]!=pp[x][z]||a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]==-1))	
			{
				//if(pp[x][z]==-100)	System.out.print("replace"+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
				
				pp[x][z]=k;
				
				try {
					//	System.out.print("pa"+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]);
				
				bi = ImageIO.read(new File(ea+"m"+k+".png"));		
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,20+x*55,20+z*55,55,55,null);	// dd.setBounds(0,0,1050+i/2,600);
		
			}
			p2[x][z]=k;
			//System.out.print("one "+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
			 if(a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]>-1) {
				
				//System.out.print("one "+x+" "+z+"   "+a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z]+"\n");
				pp[x][z]=a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z];
				k=a13.a1.map[a13.a1.mapx+x][a13.a1.mapy+z];
				k2=0;
				int gg;
				if(k>=1000) {//  *****************************************   繪製地面上物 包含人  *******************
					k2=k;
					k=a13.a1.b[k-1000].mapa;
				}
				if(k>=500&&k<900)
				{
						
					//	System.out.println("500 k="+k);
						g.drawImage(a13.paint.flag[k-500],20+x*55,20+z*55,55,30,null);	
						g.drawImage(a13.paint.flagz,20+x*55,20+z*55+30,5,25,null);	
						
				}
				else 
				{
					
				    if(k2>=1000&&a13.a1.b[k2-1000].tie>0)
				    {
				    	if(a13.a1.b[k2-1000].godie1>=1) {
				    		
				    		try {
								//System.out.println("!! k="+k);
								bi = ImageIO.read(new File(ea+"m"+k+".png"));		
							} catch (IOException e2) {
							e2.printStackTrace();
							}
							g.drawImage(bi,25+x*55,35+z*55,35,30,null);	// 
						    
							try {
								//System.out.println("!! k="+k);
								bi = ImageIO.read(new File(ea+"m309"+".png"));		
							} catch (IOException e2) {
							e2.printStackTrace();
							}
							g.drawImage(bi,20+x*55,20+z*55,55,55,null);	
							
						 if(a13.a1.b[k].person%17<12)
						  {
									
									try {
										bi = ImageIO.read(new File(ea+"cry"+".png"));		
									} catch (IOException e2) {
										e2.printStackTrace();
									}
									g.drawImage(bi,25+x*55,35+z*55,40,40,null);	// dd.setBounds(0,0,1050+i/2,600);
										
							}
							else {
								
									try {
										bi = ImageIO.read(new File(ea+"mad"+".png"));		
									} catch (IOException e2) {
										e2.printStackTrace();
									}
									g.drawImage(bi,25+x*55,35+z*55,40,40,null);	// dd.setBounds(0,0,1050+i/2,600);
							
							}
				    	
				    	}
				    	else {
				    	try {
							//System.out.println("!! k="+k);
							bi = ImageIO.read(new File(ea+"m306"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+x*55,20+z*55,55,55,null);	// 
						try {
							//System.out.println("!! k="+k);
							bi = ImageIO.read(new File(ea+"m"+k+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,25+x*55,25+z*55,40,45,null);	// 
					    
						try {
							//System.out.println("!! k="+k);
							bi = ImageIO.read(new File(ea+"m305"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+x*55,20+z*55,55,55,null);	
						
				    	} 
					    
				    	
				    }
				    else {
					try {
						//System.out.println("!! k="+k);
						bi = ImageIO.read(new File(ea+"m"+k+".png"));		
					} catch (IOException e2) {
					e2.printStackTrace();
					}
					g.drawImage(bi,20+x*55,25+z*55,55,50,null);	// 
				    }
				}
				
				if(k2>=1000)//****************************************** 繪製人與身上標示 ***************
				{
					k=k2-1000;
					if(a13.a1.b[k].s<0)
						continue;
					if(a13.a1.b[k].godie1>0) {}
					else if(a13.a1.b[k].sad>0)
				   {
						
						try {
							bi = ImageIO.read(new File(ea+"cry"+".png"));		
						} catch (IOException e2) {
							e2.printStackTrace();
						}
						g.drawImage(bi,20+5+x*55,20+z*55,45,45,null);	// dd.setBounds(0,0,1050+i/2,600);
							
					}
					 else if(a13.a1.b[k].swim<0||a13.a1.b[k].state==2) {
					
						try {
							bi = ImageIO.read(new File(ea+"mad"+".png"));		
						} catch (IOException e2) {
							e2.printStackTrace();
						}
						g.drawImage(bi,20+5+x*55,25+z*55,45,45,null);	// dd.setBounds(0,0,1050+i/2,600);
				
					}
					
					if(a13.a1.b[k].godie1>0) {}
					else if(a13.a1.b[k].swim<0)
					{
						try {
							bi = ImageIO.read(new File(ea+"drowning"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);	
					}
					if(a13.a1.b[k].state==1) {
					
						try {
							bi = ImageIO.read(new File(ea+"meat"+".png"));		
						} catch (IOException e2) {
							e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);
					}
					
					else if(a13.a1.b[k].swim>0)
					{
						try {
							bi = ImageIO.read(new File(ea+"swim"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);	
					}
					else if(a13.a1.b[k].serioussick>0)
					{
						try {
							bi = ImageIO.read(new File(ea+"ssick"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);	
					}
					else if(a13.a1.b[k].pain>0)
					{
						try {
							bi = ImageIO.read(new File(ea+"pain"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);
						
						if(a13.a1.b[k].swim<0||a13.a1.b[k].state==2||a13.a1.b[k].pain<1+(2-a13.a1.b[k].sex)*2+(a13.a1.b[k].person%17)/4) {}
						else {
							try {
								bi = ImageIO.read(new File(ea+"cry"+".png"));		
							} catch (IOException e2) {
								e2.printStackTrace();
							}
							g.drawImage(bi,20+5+x*55,20+z*55,45,45,null);	// dd.setBounds(0,0,1050+i/2,600);
						}
						
					}
					else if(a13.a1.b[k].rob>0)
					{
						try {
							bi = ImageIO.read(new File(ea+"rob"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);
					
					}
					else if(a13.a1.b[k].sick>0)
					{
						try {
							bi = ImageIO.read(new File(ea+"sick"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);
					
					}
					else if(a13.a1.b[k].work>0)
					{
						try {
							bi = ImageIO.read(new File(ea+"work"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);
					
					}
					
					else {
						if(a13.a1.b[k].hungry>=40)
						{
							try {
									bi = ImageIO.read(new File(ea+"hungry"+".png"));		
							} catch (IOException e2) {
								e2.printStackTrace();
							}
							g.drawImage(bi,20+15+x*55,20+30+z*55,40,25,null);	// dd.setBounds(0,0,1050+i/2,600);	
						}
					}
					
					
					
					if(a13.a1.b[k].stop>0) {
					if(a13.a1.b[k].killright>0&x<11)//
					{
						try {
							bi = ImageIO.read(new File(ea+"spearwar.png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+40+x*55,20+20+z*55,40,30,null);	// dd.setBounds(0,0,1050+i/2,600);
					
					}
					else if(a13.a1.b[k].killleft>0&&x>0)//
					{
						try {
							bi = ImageIO.read(new File(ea+"spearwar2.png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20-25+x*55,20+20+z*55,40,30,null);	// dd.setBounds(0,0,1050+i/2,600);
					
					}
					if(a13.a1.b[k].bekill>0)//被殺
					{
						try {
							bi = ImageIO.read(new File(ea+"blood.png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+15+x*55,20+20+z*55,25,30,null);	// dd.setBounds(0,0,1050+i/2,600);
					
					}
					}
					else if(a13.a1.b[k].transfer>=1||a13.a1.b[k].transferthing>0)//人運輸之物
					{
						if(a13.a1.b[k].transferthing>1000)
						{
							try {
								bi = ImageIO.read(new File(ea+"m"+a13.a1.b[a13.a1.b[k].transferthing-1000].mapa+".png"));		
							} catch (IOException e2) {
							e2.printStackTrace();
							}
							g.drawImage(bi,20+30+x*55,20+30+z*55,30,30,null);	// dd.setBounds(0,0,1050+i/2,600);
						}
						else {
						try {
							bi = ImageIO.read(new File(ea+"m"+a13.a1.b[k].transferthing+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+30+x*55,20+30+z*55,25,25,null);	// dd.setBounds(0,0,1050+i/2,600);
						}
					}
					else if(a13.a1.b[k].weapon==1||a13.a1.b[k].rob>0)//人運輸之物
					{
						try {
							bi = ImageIO.read(new File(ea+"spear.png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+30+x*55,20+20+z*55,25,35,null);	// dd.setBounds(0,0,1050+i/2,600);
					
					}
					
					if(a13.a1.b[k].light>0)
					{
						try {
							bi = ImageIO.read(new File(ea+"lightkid"+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+x*55,20+z*55,55,55,null);	// dd.setBounds(0,0,1050+i/2,600);
					
					}
					int gh;
					if(a13.a1.b[k].sin>0&&a13.kk.sinlightstart==1)
					{
						
						if(a13.a1.b[k].sin<15)
							gh=0;
						else if(a13.a1.b[k].sin<60)
							gh=1;
						else if(a13.a1.b[k].sin<100)
							gh=2;
						else if(a13.a1.b[k].sin<300)
							gh=3;
						else
							gh=4;
											
						try {
							bi = ImageIO.read(new File(ea+"sinlight"+gh+".png"));		
						} catch (IOException e2) {
						e2.printStackTrace();
						}
						g.drawImage(bi,20+x*55,30+z*55,55,45,null);	// dd.setBounds(0,0,1050+i/2,600)
						
					}
					
					if(a13.a1.b[k].group>-1)
					{
						gh=a13.a1.b[k].group;
						
						g.drawImage(a13.paint.flag[gh],20+x*55,20+40+z*55,20,15,null);	
					}
					
				}
			}
		}
	}	
	for(int z=1;z<a13.a1.bn;z++)//*********************   繪雙方格圖框
	{
		if(a13.a1.b[z].s<0)
			continue;
		if(a13.a1.b[z].x>a13.a1.mapx+11||a13.a1.b[z].x<a13.a1.mapx-1||a13.a1.b[z].y>=a13.a1.mapy+10||a13.a1.b[z].y<a13.a1.mapy)
			continue;
		if(a13.a1.b[z].love>0)
		{
			//System.out.print(""+k+" in love \n");
			if(a13.a1.b[z].x==a13.a1.mapx-1)
			{
				try {
					
					bi = ImageIO.read(new File(ea+"love_h2"+".png"));
				
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,20+(a13.a1.b[z].x+1-a13.a1.mapx)*55,20+(a13.a1.b[z].y-a13.a1.mapy)*55,55,55,null);	// dd.setBounds(0,0,1050+i/2,600);
				pp[a13.a1.b[z].x-a13.a1.mapx+1][a13.a1.b[z].y-a13.a1.mapy]=-100;
			}
			else if(a13.a1.b[z].x==a13.a1.mapx+11)
			{
				try {
					bi = ImageIO.read(new File(ea+"love_h"+".png"));
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,20+(a13.a1.b[z].x-a13.a1.mapx)*55,20+(a13.a1.b[z].y-a13.a1.mapy)*55,55,55,null);	// dd.setBounds(0,0,1050+i/2,600);
				pp[a13.a1.b[z].x-a13.a1.mapx][a13.a1.b[z].y-a13.a1.mapy]=-100;
			}
			else {
				try {
					bi = ImageIO.read(new File(ea+"love"+".png"));		
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				g.drawImage(bi,20+(a13.a1.b[z].x-a13.a1.mapx)*55,20+(a13.a1.b[z].y-a13.a1.mapy)*55,110,55,null);	// dd.setBounds(0,0,1050+i/2,600);
				pp[a13.a1.b[z].x-a13.a1.mapx+1][a13.a1.b[z].y-a13.a1.mapy]=-100;
				pp[a13.a1.b[z].x-a13.a1.mapx][a13.a1.b[z].y-a13.a1.mapy]=-100;
			}
			
			
		}
		
	}


	pp[dx][dy]=-100;//*****************************************   繪製游標  ************************************
   	try {
		if(keystate==0)
		bi2 = ImageIO.read(new File(ea+"light.png"));
		
		if(keystate>0)
		{
			
			keydelay++;
			bi2 = ImageIO.read(new File(ea+"m"+keystate+".png"));
			if(keydelay==2) {
				keydelay=0;
				keystate=0;
			}
		}

	} catch (IOException e2) {	
	
		e2.printStackTrace();
	}

	//System.out.print("print pp"+dx+" "+dy+"\n");  
	pp[dx][dy]=-100;
	g.drawImage(bi2,20+dx*55,20+dy*55,55,55,null);	// dd.setBounds(0,0,1050+i/2,600);

	a13.a1.showbl();//顯示游標框住方框之簡介
	
	
	int k3=0;
	//g.clearRect(700, 0,400, 600);

	
	
	paG();
	
}

int ggg;
public static  void setb(int k,int x,int y,int x2,int y2,String g)
{
	
	bb[k][0]=1;
	bb[k][1]=x;
	bb[k][2]=y;
	bb[k][3]=x2;
	bb[k][4]=y2;
	
	bbs[k]=g;
	 bu[k].setVisible(true);
}

public static  void setbt(int k,int x,int y,int x2,int y2,String g)
{
	
	bbt[k][0]=1;
	bbt[k][1]=x;
	bbt[k][2]=y;
	bbt[k][3]=x2;
	bbt[k][4]=y2;
	
	bbts[k]=g;
	bt[k].setText(bbts[k]); 
	 bt[k].setVisible(true);
	  bt[k].setEditable(true);
}

public static  void cleanbt(int k)
{
	bt[k].setVisible(false);
	
}
public static  void cleanbl(int k)
{
	bl[k].setVisible(false);

}
public static void cleanb(int k)
{	
	 bu[k].setVisible(false);	
}
public  static void cleanallb()
{
	
	for(int z=0;z<50;z++)
	{
		bl[z].setVisible(false);
	}
	for(int z=0;z<20;z++)
	{
		bb[z][0]=0;
		bu[z].setVisible(false);
	}
	for(int z=0;z<20;z++)
	{
		bbl[z][0]=0;
		bt[z].setVisible(false);
	}
	for(int z=0;z<=20;z++)
	{
		bba[z][0]=0;
		ba[z].setVisible(false);
		bag[z].setVisible(false);
	}
}

public static void setbl(int k,int x,int y,int x2,int y2,int size,String g)
{
	
	bbl[k][0]=1;
	bbl[k][1]=x;
	bbl[k][2]=y;
	bbl[k][3]=x2;
	bbl[k][4]=y2;
	bbl[k][5]=size;
	
	bbls[k]=g;
	bl[k].setText(g); 
	bl[k].setVisible(true);
	
}

public static  void cleana(int k)
{	
	a[k][0]=0;
}

public static  void cleanall()
{
	for(int z=0;z<40;z++)
		a[z][0]=0;
	for(int z=0;z<20;z++)
		af[z][0]=0;
	
	an=0;	
	afn=0;
}


public static  void clean()
{
	
	g0=0;
	cleanallb();
	cleanall();
		
}

public static  int setaf(int x,int y,int x2,int y2,int k)
{	
	af[afn][0]=1;
	af[afn][1]=x;
	af[afn][2]=y;
	af[afn][3]=x2;
	af[afn][4]=y2;
	af[afn][5]=k;
    afn++;
	return afn-1;
}
public static  int seta(int x,int y,int x2,int y2,String k)
{	
	a[an][0]=1;
	a[an][1]=x;
	a[an][2]=y;
	a[an][3]=x2;
	a[an][4]=y2;
	as[an]=k;
    an++;
	return an-1;
}


public static  void seta(int k,int x,int y,int x2,int y2,String g)
{
	a[k][0]=1;
	a[k][1]=x;
	a[k][2]=y;
	a[k][3]=x2;
	a[k][4]=y2;
	as[k]=g;
	
}

public  static  void setba(int k,int x,int y,int x2,int y2,String yy)
{
	
	bba[k][0]=1;
	bba[k][1]=x;
	bba[k][2]=y;
	bba[k][3]=x2;
	bba[k][4]=y2;
	bbas[k]=yy;

	ba[k].setVisible(true);
	bag[k].setVisible(true);
}

void chk() {
	
	this.requestFocus();
}

static a13 a130;
static n n1;
static A11 a1;
static  file f;
static  Paint paint;


public static void main(String[] args)   {
	
	
  	 String str="1123aajkd";
	   String[] tokens = str.split("aa");
	   for (String t:tokens) {
		   System.out.println(t);
		 }
	   System.out.println(str.substring(1,3));
	  
	  
	   a130=new a13();
	   n1=new n();
	  
	  
		//a13.setbl(11,720,400, 300,50,1,"草地");
  	 
  }
	

	
	
}	




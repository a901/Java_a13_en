
package a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JFrame;

public class n   {
	
	int ay[],ax[],ap[],an,nstart,m[][];
	int p[],pn;
	String p2[];
	
	//int goalx,goaly;
	
	 
	n() 
	{
		nstart=0;
		//waiting();
		an=0;
		ax=new int [16000];
		ay=new int [16000];
		ap=new int [16000];
		p=new int [5000];
		p2=new String [5000];
		m=new int [6000][6000];
		for(int z=0;z<6000;z++)
		{
			for(int i=0;i<6000;i++)
				m[z][i]=0;
		}
		//start() ;
		
	}
	String y2;
	
	String createplacename(int k0) {
		int g,g2;
		String yy;
		String st[]={"new","west","south",""};
		String mid[]={"Green","Rock","Blue","Black","Sex","Rus","Kent","Lean","Pro","Stock",
				"Mettis","Fin","Gaule","Cel","Han","Cloud","Wind","Sun","Red","Cold",
				"Gote","Head","beau","",""};
		
		String mid2[]={"格林","洛克","布魯","布萊克","薩克","羅斯","肯特","利恩","波","斯塔克",
				"梅蒂斯","芬","高爐","賽爾","漢","克勞德","溫德","桑","瑞德","柯爾德",
				"哥德","黑得","比歐","",""};
		
		String last[]={"land","berg","lake","stan","na","ia","nia","land",""};
		
		String last2[]={"蘭","堡","雷克","斯坦","那","亞","尼亞","蘭",""};
		
		
		if(k0>-1&&(int)(Math.random()*12121)%5==1) {
			yy="";
			if(a13.a1.allb[k0].fa0>=0)k0=a13.a1.allb[k0].fa0;
			if(a13.a1.allb[k0].fa0>=0&&(int)(Math.random()*777771)%3==0)
				k0=a13.a1.allb[k0].fa0;
			y2="";
			if(a13.a1.allb[k0].s<0&&(int)(Math.random()*714717)%3==2) {
				yy="St.";y2="聖";
			}
			g=(int)(Math.random()*172127)%3;
			if((int)(Math.random()*15751)%2==1) {
			yy+=a13.a1.allb[k0].name+last[g+4];
			y2+=a13.a1.allb[k0].name2+last2[g+4];
			}
			else {
				yy+=a13.a1.allb[k0].name+"s"+last[g];
				y2+=a13.a1.allb[k0].name2+last2[g];
			}
		}
		else if((int)(Math.random()*12121)%5==1) {
			
			g=(int)(Math.random()*172127)%3;
			if((int)(Math.random()*15751)%2==1) {
			yy=a13.a1.allb[k0].name+last[g+4];
			y2=a13.a1.allb[k0].name2+last2[g+4];
			}
			else {
				yy=a13.a1.allb[k0].name+"s"+last[g];
				y2=a13.a1.allb[k0].name2+last2[g];
			}
		}
		else {
			g=(int)(Math.random()*12121)%23;g2=(int)(Math.random()*172127)%8;
			yy=mid[g]+last[g2];
			y2=mid2[g]+last2[g2];
		}
		return yy;
		
	}
	String creategroupname(int k0) {
		int g,g2;
		String yy;
		String st[]={"new","west","south",""};
		String mid[]={"Green","Rock","Blue","Black","Sex","Rus","Kent","Lean","Pro","Stock",
				"Mettis","Fin","Gaule","Cel","Han","Cloud","Wind","Sun","Red","Cold",
				"Gote","Head","beau","",""};
		
		String mid2[]={"格林","洛克","布魯","布萊克","薩克","羅斯","肯特","利恩","波","斯塔克",
				"梅蒂斯","芬","高爐","賽爾","漢","克勞德","溫德","桑","瑞德","柯爾德",
				"哥德","黑得","比歐","",""};
		
		String last[]={"land","berg","lake","stan","na","ia","nia","land",""};
		
		String last2[]={"蘭","堡","雷克","斯坦","那","亞","尼亞","蘭",""};
		
		
		if((int)(Math.random()*12121)%6==1) {
			yy="";
			if(a13.a1.allb[k0].fa0>=0)k0=a13.a1.allb[k0].fa0;
			if(a13.a1.allb[k0].fa0>=0&&(int)(Math.random()*777771)%3==0)
				k0=a13.a1.allb[k0].fa0;
			y2="";
			if(a13.a1.allb[k0].s<0&&(int)(Math.random()*714717)%3==2) {
				yy="St.";y2="聖";
			}
			g=(int)(Math.random()*172127)%3;
			if((int)(Math.random()*15751)%2==1) {
			yy+=a13.a1.allb[k0].name+last[g+4];
			y2+=a13.a1.allb[k0].name2+last2[g+4];
			}
			else {
				yy+=a13.a1.allb[k0].name+"s"+last[g];
				y2+=a13.a1.allb[k0].name2+last2[g];
			}
		}
		else if((int)(Math.random()*12121)%5==1) {
			
			g=(int)(Math.random()*172127)%3;
			if((int)(Math.random()*15751)%2==1) {
			yy=a13.a1.allb[k0].name+last[g+4];
			y2=a13.a1.allb[k0].name2+last2[g+4];
			}
			else {
				yy=a13.a1.allb[k0].name+"s"+last[g];
				y2=a13.a1.allb[k0].name2+last2[g];
			}
		}
		else {
			g=(int)(Math.random()*12121)%23;g2=(int)(Math.random()*172127)%8;
			yy=mid[g]+last[g2];
			y2=mid2[g]+last2[g2];
		}
		return yy;
		
	}
	
	
	String creategroupname2(int k0) {
		int g,g2;
		String yy;
		String st[]={"new","west","south",""};
		String mid[]={"Green","Rock","Blue","Black","Sex","Rus","Kent","Lean","Pro","Stock",
				"Mettis","Fin","Gaule","Cel","Han","Cloud","Wind","Sun","Red","Cold",
				"Gote","Head","beau","",""};
		
		String mid2[]={"格林","洛克","布魯","布萊克","薩克","羅斯","肯特","利恩","波","斯塔克",
				"梅蒂斯","芬","高爐","賽爾","漢","克勞德","溫德","桑","瑞德","柯爾德",
				"哥德","黑得","比歐","",""};
		
		String last[]={"land","berg","lake","stan","na","ia","nia","land",""};
		
		String last2[]={"蘭","堡","雷克","斯坦","那","亞","尼亞","蘭",""};
		
		
		if((int)(Math.random()*12121)%6==1) {
			yy="";
			if(a13.a1.allb[k0].ma0>=0)k0=a13.a1.allb[k0].ma0;
			if(a13.a1.allb[k0].ma0>=0&&(int)(Math.random()*777771)%3==0)
				k0=a13.a1.allb[k0].ma0;
			y2="";
			if(a13.a1.allb[k0].s<0&&(int)(Math.random()*714717)%3==2) {
				yy="St.";y2="聖";
			}
			g=(int)(Math.random()*172127)%3;
			if((int)(Math.random()*15751)%3==1) {
				yy="St.";y2="聖";
			yy+=a13.a1.allb[k0].name;
			y2+=a13.a1.allb[k0].name2;
			}
			else {
				yy+=a13.a1.allb[k0].name+"s"+last[g];
				y2+=a13.a1.allb[k0].name2+last2[g];
			}
		}
		else if((int)(Math.random()*12121)%5==1) {
			
			g=(int)(Math.random()*172127)%3;
			if((int)(Math.random()*15751)%2==1) {
				yy="St.";y2="聖";
				yy+=a13.a1.allb[k0].name;
				y2+=a13.a1.allb[k0].name2;
			}
			else {
				yy=a13.a1.allb[k0].name+"s"+last[g];
				y2=a13.a1.allb[k0].name2+last2[g];
			}
		}
		else {
			g=(int)(Math.random()*12121)%23;g2=(int)(Math.random()*172127)%8;
			yy=mid[g]+last[g2];
			y2=mid2[g]+last2[g2];
		}
		return yy;
		
	}
	void waiting()
	{
		a13.clean();

		a13.seta(1,0, 0, 700, 600,"talk");
		a13.seta(2,700,0, 450,580,"talk4");
		//a13.seta(3,1000,20, 135,200,"talk2");
		a13.setbl(11,700,400, 305,30,1,"wating");
	}
	void start() {
	
	}
	
	void bulid(int x,int y) {
		
		for(int i=x;i<x+9;i++)
		{
			for(int j=y;j<y+8;j++)
			{
				a13.a1.mapall[i][j]=31;
			}
		}
		for(int i=x;i<x+9;i++)
		{	
			a13.a1.mapall[i][y+7]=33;
		}
		for(int i=y;i<y+7;i++)
		{	
			a13.a1.mapall[x][i]=33;
			a13.a1.mapall[x+10][i]=33;
		}
		
		for(int i=x;i<x+6;i++)
		{	
			a13.a1.mapall[i][y+4]=33;
			
		}
		for(int i=y;i<y+4;i++)
		{	
			a13.a1.mapall[x+6][i]=33;
			
		}
		for(int i=x+2;i<x+6;i++)
		{	
			a13.a1.mapall[i][y]=33;
			
		}
		
	}
	

}

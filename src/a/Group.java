package a;

import java.io.Serializable;

public class Group implements Serializable{ //部落
	
	
	String name,name2;
	int leader;
	int leader0[],leadstarttime[],leadnumber[],leadern;
	int createtime;
	
	
	int group,gnumber=0,placex=10,placey=10;
	
	int gh=0,gk;
	int x,y;
	int flagx[],flagy[],flagn;
//	String leadery[];
	
	int class0=0, sex=0;//leve2 :0=男 1=偏男 2=較平衡
	int c1,c2,cg;//旗幟
	
	int swear,level=1,killnumber=0,place[],placen=0;
	
	int loyal=0;
	int fnumber=0;
	
	int rand;// %31 道德
	
	int ancientg=-1;
	
	int dietime=-1;

	int son[],sonn=0;
	
	int relation[];// with other groups
	
	Group(int l,int gr,int se){
		
		leader0=new int[1010];
		leadstarttime=new int[1010];
		leadnumber=new int[1010];
		flagx=new int [301];
		flagy=new int [301];
		place=new int [1121];
		relation=new int[2011];
		
		group=gr;
		
		for(int z=0;z<a13.a1.groupn;z++)
		{
			relation[z]=0;
			a13.a1.group[z].relation[group]=0;
		}
		
		son=new int [100];
		sonn=0;
		
	//	leadery=new String[1010];
		
		loyal=(int)(Math.random()*17371)%19;
		rand=(int)(Math.random()*117371)%17171;
		
		leader=l;
		sex=se;
		leader0[0]=a13.a1.b[l].k0;
		leadstarttime[0]=a13.a1.b[l].age();
		leadern=1;
		if(sex==1)
		name=a13.n1.creategroupname(a13.a1.b[l].k0);
		else
			name=a13.n1.creategroupname2(a13.a1.b[l].k0);
		name2=a13.n1.y2;
		class0=(int)(Math.random()*12121)%8;
		
		createtime=a13.a1.year;
		
		placex=a13.a1.b[leader].x;
		placey=a13.a1.b[leader].y;
		x=a13.a1.b[leader].x;
		y=a13.a1.b[leader].y;
		
		a13.a1.newevent(a13.a1.year,a13.a1.b[leader].thename()+" 建立了"+name+"部落");
		
		System.out.print("create group "+gr+"  leader is "+l);
	    flagn=0;
		
		a13.paint.createnew(group);
		c1=a13.paint.c1;
		c2=a13.paint.c2;
		cg=a13.paint.cg;
		changeplace(x,y);
	}
	
	
	
	
	void r2() {
		if(leader==-1||placen==0||a13.a1.b[leader].age()<12) {
			a13.a1.newevent(a13.a1.b[leader].thename()+"農業部落滅亡");
			leader=-1;die();return;
		}
		if((int)(Math.random()*12121)%37==15)
		{
			if(a13.a1.b[leader].job<=0) {
				a13.a1.allb[a13.a1.b[leader].k0].diereason+="死因不明";
				a13.a1.b[leader].die();
			}
		}
		
		
		if(dtime2>=61)//重算族群人數
		{
			
		}
		
		int gk=0;
		for(int x=0;x<placen;x++) {
			
		
					//	if(a13.a1.b[gk].findfield(x)==1)
		
		
		}
	
		
	}
	int dtime2=0;
	void r() {
		
		
		
		dietime=a13.a1.year;
		//***** 暫停升級農業社會  a13.a1.b[leader].wi !!
		//if(gnumber>100&&a13.a1.b[leader].wi>=204&&rand%3!=0&&((int)(Math.random()*12121)%747==1||(int)(Math.random()*12121)%1717==1))
		//	upgrade_agriculture();
		
		if(level==2)
		{
			level=1;// 暫停升級農業社會 
			r2() ;
			return;
		}
		
		
		
	
		if(a13.a1.b[leader].age()<13||a13.a1.b[leader].group!=group) {
			
		//	changeleader();
			
			return;
		}
	
		
		
		
		
		if((int)(Math.random()*12121)%31==1)
			dtime2--;
		
		if(dtime2>=0)
			dtime2--;
		else
			dtime2=20;
		
		
		
	
		
		
		//System.out.println("r group="+group+" leader="+leader+" dtime2="+dtime2);
		
		if(dtime2==1)//重算族群人數
		{
			recount() ;
			
			if((a13.a1.b[leader].x-x)*(a13.a1.b[leader].x-x)+(a13.a1.b[leader].y-y)*(a13.a1.b[leader].y-y)>10*10) {
			a13.a1.b[leader].x=x;
			a13.a1.b[leader].y=y;
			a13.a1.b[leader].cn=0;
			}
			//System.out.println("dtime2 group="+group+" leader="+leader);
			
			if((int)(Math.random()*12121)%17==1) {
				int g=0;
				
				int g1,g2,g3,g4;
			    g=a13.a1.b[leader].count_pop(x, y, 10);
				g1=a13.a1.b[leader].count_pop(x-20, y, 10);
				g2=a13.a1.b[leader].count_pop(x+20, y, 10);
				g3=a13.a1.b[leader].count_pop(x, y-20, 10);
				g4=a13.a1.b[leader].count_pop(x, y+20, 10);
				
				if(g1<g&&g1<g2&&g1<g3&&g1<g4)
				{
					changeplace(x-10,y);
					return;
				}		
				else if(g2<g&&g2<=g1&&g2<=g3&&g2<=g4)
				{
					changeplace(x+10,y);
					return;
				}
				else if(g3<g&&g3<=g1&&g3<=g2&&g3<=g4)
				{
					changeplace(x,y-10);
					return;
				}				
				else if(g4<g&&g4<=g1&&g4<=g2&&g4<=g3)
				{
					changeplace(x,y+10);
					return;
				}
			}
				
			if(createtime+9>=a13.a1.year)
			{
				if(ancientg>-1) {
					relation[ancientg]=30;
					a13.a1.group[ancientg].relation[group]=30;
				}
			}
			for(int z=0;z<a13.a1.groupn;z++)
			{
				if(a13.a1.group[z].relation[group]<relation[z]&&a13.a1.group[z].relation[group]<=0)
					relation[z]=a13.a1.group[z].relation[group];
				
				if(rand%31<15&&a13.a1.group[z].gnumber<=gnumber/4&&relation[z]<=0&&a13.a1.group[z].gnumber<80)
				{
					relation[z]=-35;
				}
				if(relation[z]>0)
					relation[z]-=1;
				
				//System.out.println("group="+group+" relation "+z+" "+relation[z]);
			}
			
			
		}
	
		
	}
	
	void recount() {//重算族群人數
		
		//System.out.println("recount");
		cleanflag();
		//for(int i=0;i<a13.a1.an;i++)a13.a1.b[a13.n1.ap[i]].gsub=0;
		fg=8;
		a13.a1.an=0;
		int g;
	//	a13.a1.b[leader].subcreategroup(group,0);
		
		//a13.n1.maincreategroup(h, hh, k);
		for(int i=placex-6;i<=placex+6;i++)
		{
			for(int j=placey-6;j<=placey+6;j++)
			{
				if(a13.a1.map[i][j]>=1000) {
					g=a13.a1.map[i][j]-1000;
				a13.a1.b[g].subcreategroup0(group,-10);
				}
			}
		}
		for(int i=0;i<a13.a1.an;i++)
			a13.a1.b[a13.n1.ap[i]].gsub=0;
		
		gnumber=0;
		
		for(int z=0;z<a13.a1.bn;z++)
		{
			if(a13.a1.b[z].group==group)
				gnumber++;
		}
	}
	
	void changedirection0()
	{
		int x=0,y=0,g=0;int m=0;
		while(x==0&&y==0) {
			m++;
			x=(int)(Math.random()*12121)%5-2;
			y=(int)(Math.random()*12121)%5-2;
		
			if((int)(Math.random()*12121)%4==1)
				x=1;
			else if((int)(Math.random()*12121)%3==1)
				x=-1;
			else if((int)(Math.random()*12121)%2==1)
				y=1;
			else 
				y=-1;
			if(m>12)
				break;
			for(int i=30;i<=120;i+=30)
			{
				g=testch(placex+x*30,placey+y*30);
				if(g>1)
				{
					x=0;y=0;
				}
			}
			
			
		}
		
		
	}
	int  testch(int x,int y)
	{
		int g=0,k;
		for(int i=x-30;i<x+30;i++)
		{
			for(int j=y-30;j<y+30;j++)
			{
				if(a13.a1.map[i][j]>=1000)
				k=a13.a1.map[i][j]-1000;
				else
					continue;
				
				if(a13.a1.b[k].group>=0&&a13.a1.b[k].group!=group)
					g=2;
				else if(a13.a1.b[k].group==-1&&g==0)
					g=1;
				
			}
		}
		return g;
		
	}
	int fg=0;
	void addflag(int x,int y) {
		
		if(flagn>298)
			return;
		flagx[flagn]=x;
		flagy[flagn]=y;
		a13.a1.map[x][y]=500+group;
		flagn++;
		fg=0;
	}
	void cleanflag() {
		
		for(int z=0;z<flagn;z++)
		{
			if(a13.a1.map[flagx[z]][flagy[z]]==500+group)
				a13.a1.map[flagx[z]][flagy[z]]=-1;
		}
		flagn=0;
	}
	
	void changeplace(int xx,int yy) {
		
		for(int i=0;i<4;i++)
		{
			if(a13.a1.map[placex+i][placey]==402)
				a13.a1.map[placex+i][placey]=-1;
		}
		if(a13.a1.map[placex][placey+1]==402)
		a13.a1.map[placex][placey+1]=-1;
		if(a13.a1.map[placex+3][placey+1]==402)
		a13.a1.map[placex+3][placey+1]=-1;
		
		if(a13.a1.map[placex-1][placey-1]==500+group)
			a13.a1.map[placex-1][placey-1]=-1;
		
		
		
		
		int g=0;
		int h=300,hx=0,hy=0;
		int gg;
		for(int i=xx-8;i<xx+5;i++)
		{
			for(int j=yy-6;j<yy+6;j++)
			{
				g=0;
				for(int z=i;z<i+4;z++)
				{
					if(a13.a1.map[z][j]>0)
						g++;		
					
				}
				if(a13.a1.map[i][j+1]>0)
					g++;	
				if(a13.a1.map[i+3][j+1]>0)
					g++;	
				gg=a13.a1.mapall[i+1][j+1]%10-a13.a1.mapall[i+1][j+2]%10;if(gg<0)gg*=-1;
				if(gg>=2)
					g+=50;
				gg=a13.a1.mapall[i+2][j+1]%10-a13.a1.mapall[i+2][j+2]%10;if(gg<0)gg*=-1;
				if(gg>=2)
					g+=50;
         		g+=(a13.a1.mapall[i+1][j+1]%10)*2+(a13.a1.mapall[i+2][j+1]%10)*2;
				if(g<h)
				{
					h=g;
					hx=i;hy=j;
				}
				
			}
		}
		
		for(int i=0;i<4;i++)
		{
			a13.a1.map[hx+i][hy]=402;
		}
		a13.a1.map[hx][hy+1]=402;
		a13.a1.map[hx+3][hy+1]=402;
		placex=hx;placey=hy;
		x=hx;y=hy;
		a13.a1.map[hx-1][hy-1]=500+group;
		
		

		
	}
	
	void changeleader() {
		
		
		int old=leader;
		int k=leader;
		
		/***
		if(level==2)
		{			
			
			if(leader>=0)
			{
				leader0[leadern]=a13.a1.b[leader].k0;
				leadstarttime[leadern]=a13.a1.b[leader].age();
				leadern++;
				a13.a1.newevent(a13.a1.year,""+name+"農業部落首領"+a13.a1.b[old].thename()+"亡故，"+a13.a1.b[leader].thename()+"成為新任首領");
				
			}
			else {
				a13.a1.newevent("農業部落滅亡");
				leader=-1;die();
			}
				
			return;	
		}
		**/
		
		System.out.println(" changeleader  "+name);
		
		gh=0;gk=-1;
		a13.a1.an=0;
		gnumber=0;
		for(int z=0;z<a13.a1.bn;z++)
		{
			if(a13.a1.b[z].group==group) {
				
				if(a13.a1.b[z].s>=0&&z!=leader) {
					
					gnumber++;
					if(sex==1&&a13.a1.b[z].sex==1&&a13.a1.b[z].age()>=15&&(a13.a1.b[z].wise*4+a13.a1.b[z].strong*4+a13.a1.b[z].age()/5)>gh)
					{
						gh=(a13.a1.b[z].wise*4+a13.a1.b[z].strong*4+a13.a1.b[z].age()/5);
						gk=z;
					}
					if(sex==2&&a13.a1.b[z].sex==2&&a13.a1.b[z].age()>=15&&(a13.a1.b[z].wise*4+a13.a1.b[z].strong*2+a13.a1.b[z].age()/5)>gh)
					{
						gh=(a13.a1.b[z].wise*4+a13.a1.b[z].strong*2+a13.a1.b[z].age()/5);
						gk=z;
					}
				}
			}
		}
		
	
		
		
		if(gk>-1) {
			leader0[leadern]=a13.a1.b[gk].k0;
			leadstarttime[leadern]=a13.a1.b[gk].age();
			leadnumber[leadern-1]=gnumber;
			leadern++;
		}
		leader=gk;	
	
		if(gk>-1&&old>-1&&gnumber>=25)
		{
			
			System.out.println(" changeleader  success "+name);
			a13.a1.newevent(a13.a1.year,""+name+"部落首領"+a13.a1.b[old].thename()+"亡故，"+a13.a1.b[gk].thename()+"成為新任首領");
		}
		else if(gk>-1&&gnumber>=25)
		{
			System.out.println(" changeleader  success "+name);
			

			a13.a1.newevent(a13.a1.year,""+name+"部落的 "+a13.a1.b[gk].thename()+"成為新任首領");
		}
		else {
			System.out.println(" changeleader  fall "+name+" n="+gnumber+" k="+gk);
			cleanflag() ;
			if(old>-1)
			a13.a1.newevent(a13.a1.year,""+name+"部落首領"+a13.a1.b[old].thename()+"亡故，部落陷入無領導者狀態");
			else
				a13.a1.newevent(a13.a1.year,""+name+"部落滅亡");
			for(int i=0;i<4;i++)
			{
				if(a13.a1.map[placex+i][placey]==402)
					a13.a1.map[placex+i][placey]=-1;
			}
			if(a13.a1.map[placex][placey+1]==402)
			a13.a1.map[placex][placey+1]=-1;
			if(a13.a1.map[placex+3][placey+1]==402)
			a13.a1.map[placex+3][placey+1]=-1;
			if(a13.a1.map[placex-1][placey-1]==500+group)
				a13.a1.map[placex-1][placey-1]=-1;
			
		}
		//System.out.println(" new leader is  "+leader+" "+a13.a1.b[leader].name());
		
		
	}
	void die() {
		
		leader=-1;
		
		cleanflag() ;
	
	}
	
	void showbl() {//q==16
		
		a13.kk.k=group;
		a13.kk.screen=2;
		
		a13.cleanallb();
		
		
		if(leader<0) {a13.kk.page=0;

		a13.setbl(2, 720,200, 450, 30, 1, "部族名: "+name+" ("+name2+")");
		String yy[]=new String[] {"","採集部落","農業部落","","",""};
		a13.setbl(3, 720,230, 450, 30, 1, "部族型態: "+yy[level]);

		a13.setbl(4, 720,260, 450, 30, 1, "部族已滅亡");

		a13.setbl(6, 720,320, 450, 30, 1, "部族建立時間: "+this.createtime+"年"+ "  戰果總數: "+this.killnumber+"");
		if(ancientg>-1)
		a13.setbl(7, 720,350, 450, 30, 1, "祖源: "+a13.a1.group[ancientg].name+"族");
	
		
		a13.setbl(9, 720,530, 400, 30, 1, "E回一般模式 ");
		
		a13.cleanall();
		a13.seta(11,700,0, 500,580,"talk4");
			return;
		}
		
		
		
		a13.setbl(2, 720,200, 450, 30, 1, "部族名: "+name+" ("+name2+")");
		String yy[]=new String[] {"","採集部落","農業部落","","",""};
		a13.setbl(3, 720,230, 450, 30, 1, "部族型態: "+yy[level]);

		a13.setbl(4, 720,260, 450, 30, 1, "部族首領: "+a13.a1.b[leader].name()+"  "+a13.a1.b[leader].age()+"歲   第"+leadern+"任");
		a13.setbl(5, 720,290, 450, 30, 1, "部族內部人數: "+this.gnumber+"人");
		a13.setbl(6, 720,320, 450, 30, 1, "部族建立時間: "+this.createtime+"年"+ "  戰果總數: "+this.killnumber+"");
		if(ancientg>-1)
		a13.setbl(7, 720,350, 450, 30, 1, "祖源: "+a13.a1.group[ancientg].name+"族");
	
		if(level==1) {

		}
		else {
			a13.setbl(8, 720,380, 450, 30, 1, "農業戶籍: "+fnumber);
		}
		int g;

		
	
		a13.setbl(9, 720,530, 400, 30, 1, "E回一般模式 ");
		
		a13.cleanall();
		a13.seta(11,700,0, 500,580,"talk4");
	}
	
	void showgleader(int h) {//********************** *************** 
		
		a13.kk.k=group;
		a13.cleanallb(); 	
		String yy="";
		int g=group,g2;
		a13.setbl(1,720,40,400,30,1,name+"( "+name2+" )"+" 族歷代首領:");
		
		int gn=1,g2n=1;
		for(int x=h;x<h+10;x++) {
			if(x>=leadern)
				break;
			g=leader0[x];
			g2=a13.a1.allb[g].bk;
			
			if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
	 		a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,a13.a1.allb[g].name()+" ("+(a13.a1.allb[g].borntime+leadstarttime[x])+"- )  "+(a13.a1.year-a13.a1.b[g2].borntime)+"歲   "+(leadstarttime[x])+"歲繼任首領");	
			else 
				a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,a13.a1.allb[g].name() +" ("+(a13.a1.allb[g].borntime+leadstarttime[x])+"-"+(a13.a1.allb[g].borntime+a13.a1.allb[g].age)+") "+" 部落人口:"+(leadnumber[x])+"  "+leadstarttime[x]+"歲繼任首領");	
	
			
		}
		a13.setbl(9,720,520,300,30,1,"按E退回,左右鍵換頁");
		a13.seta(11,700,0, 500,580,"talk4");	
	}
	
	
	
	
	//  ***********     農業社會    ************************
	void  upgrade_agriculture()
	{
		a13.a1.pl[a13.a1.pln]=new Place(group);
		
		place[placen]=a13.a1.pln;
		placen++;
		a13.a1.pln++;
		level=2;
		int g=0;
		
		for(int z=0;z<a13.a1.bn;z++)
		{
			if(a13.a1.b[z].group==group&&a13.a1.b[z].s>0)
			{
				
				if(a13.a1.b[z].findfield(a13.a1.pln-1)==1)
					g++;
			}
			if(g>=40)
				break;
		}
	//	a13.a1.pl[a13.a1.pln-1].start_check();
		x=a13.a1.pl[a13.a1.pln-1].x1;
		y=a13.a1.pl[a13.a1.pln-1].y1;
		
		a13.a1.newevent(name+"部落進入農業社會，其時部落首領為"+a13.a1.b[leader].thename());
		
	}
	
	
	void divideg(int k)
	{
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

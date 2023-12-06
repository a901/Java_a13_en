package a;

import java.io.Serializable;

public class Group implements Serializable{
	
	
	String name,name2;
	int leader;
	int leader0[],leadstarttime[],leadnumber[],leadern;
	int createtime;
	int group,gnumber=0,placex=10,placey=10,dx,dy,dtime=0;
	
	int gh=0,gk;
	int x,y;
	int flagx[],flagy[],flagn;
//	String leadery[];
	
	int class0=0, sex=0;//leve2 :0=男 1=偏男 2=較平衡
	int c1,c2,cg;//旗幟
	
	int swear,level=1,killnumber=0,place[],placen=0;
	
	int loyal=0;
	int fnumber=0;
	int rand;
	int ancientg=-1;

	
	Group(int l,int gr,int se){
		
		leader0=new int[1010];
		leadstarttime=new int[1010];
		leadnumber=new int[1010];
		flagx=new int [301];
		flagy=new int [301];
		place=new int [1121];
		
	//	leadery=new String[1010];
		
		loyal=(int)(Math.random()*17371)%19;
		rand=(int)(Math.random()*117371)%17171;
		group=gr;
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
		dx=0;dy=0;dtime=0;flagn=0;
		
		a13.paint.createnew(group);
		c1=a13.paint.c1;
		c2=a13.paint.c2;
		cg=a13.paint.cg;
		changeplace();
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
		dtime++;
		
		if(dtime>=61)//重算族群人數
		{
			dtime=0;
			fnumber=0;
			if((int)(Math.random()*17771)%7==4)
				dtime+=(int)(Math.random()*12121)%17;
			int g=0;
			for(int z=0;z<placen;z++)
			{
				fnumber+=a13.a1.pl[place[z]].fn;
				g+=a13.a1.pl[place[z]].count();
			}
			gnumber=g;
		}
		
		int gk=0;
		for(int x=0;x<placen;x++) {
			
		if(a13.a1.pl[place[x]].fn<30&&(int)(Math.random()*17771)%7==1) {
			
			for(int i=a13.a1.pl[place[x]].x1-50;i<a13.a1.pl[place[x]].x1+50;i++)
			{
				for(int j=a13.a1.pl[place[x]].y1-50;j<a13.a1.pl[place[x]].x1+50;j++)
				{
					if(a13.a1.map[i][j]>=1000)
						gk=a13.a1.map[i][j]-1000;
					else continue;
					
					if(a13.a1.b[gk].group==group&&a13.a1.b[gk].s>0)
					{
						a13.a1.b[gk].move=0;
						if(a13.a1.b[gk].findfield(x)==1)
							break;
					}
				}
			
			}
		}
		
		}
	
		
	}
	int dtime2=0;
	void r() {
		
		
		
		
		if(level==2)
		{
			r2() ;
			return;
		}
		if(gnumber>100&&a13.a1.b[leader].wi>=104&&rand%3!=0&&((int)(Math.random()*12121)%747==1||(int)(Math.random()*12121)%1717==1))
			upgrade_agriculture();
			
		if(a13.a1.b[leader].age()<13||a13.a1.b[leader].group!=group) {
			a13.a1.newevent(""+name+"部落首領"+a13.a1.b[leader].thename()+"解散部落");
			leader=-1;die();return;
		}
		if(dtime>0)
		dtime--;
		if(dtime2>0)
			dtime2--;
		else
			dtime2=20;
		
		if(dtime==1)
		{
			dx=0;dy=0; changeplace();		recount() ;
			
			
		}
		if(dx==0&&dy==0&&(int)(Math.random()*12121)%317==1)
		{
			dtime=60;
			if((int)(Math.random()*12121)%5==1)
			changedirection();
		}
		
		if(dtime2==1)//重算族群人數
		{
			recount() ;
		}
	
		
	}
	
	void recount() {//重算族群人數
		
		System.out.println("recount");
		cleanflag();
		//for(int i=0;i<a13.a1.an;i++)a13.a1.b[a13.n1.ap[i]].gsub=0;
		fg=8;
		a13.a1.an=0;
		int g;
	//	a13.a1.b[leader].subcreategroup(group,0);
		for(int i=placex-6;i<=placex+6;i++)
		{
			for(int j=placey-6;j<=placey+6;j++)
			{
				if(a13.a1.map[i][j]>=1000) {
					g=a13.a1.map[i][j]-1000;
				a13.a1.b[g].subcreategroup(group,0,-1);
				}
			}
		}
		for(int i=0;i<a13.a1.an;i++)
			a13.a1.b[a13.n1.ap[i]].gsub=0;
	}
	
	void changedirection()
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
		
		dx=x;dy=y;
		
		
		
		dtime=60; 		
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
	
	void changeplace() {
		
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
		
		
		
		int xx=a13.a1.b[leader].x;
		int yy=a13.a1.b[leader].y;
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
		if(level==2)
		{			
			leadnumber[leadern-1]=gnumber;
			leader=a13.a1.pl[place[0]].changeleader();
			if(leader>=0)
			{
				leader0[leadern]=a13.a1.b[leader].k0;
				leadstarttime[leadern]=a13.a1.b[leader].age();
				leadern++;
				a13.a1.newevent(a13.a1.year,""+name+"農業部落首領"+a13.a1.b[old].thename()+"亡故，"+a13.a1.b[leader].thename()+"成為新任首領");
				
			}
			else {
				a13.a1.newevent(a13.a1.b[leader].thename()+"農業部落滅亡");
				leader=-1;die();
			}
				
			return;	
		}
			
		
		
		
		
		
		
		
		System.out.println(" changeleader  "+name);
		System.out.println(" changeleader  "+name);
		gh=0;gk=-1;
		a13.a1.an=0;
		a13.a1.b[k].subchleader(group);
		if(gk==-1) {
			
			for(int i=0;i<a13.a1.an;i++) {
				a13.a1.b[a13.n1.ap[i]].gsub=0;
				//a13.a1.b[a13.n1.ap[i]].group=-1;		
			}
		}else {
			for(int i=0;i<a13.a1.an;i++) 
				a13.a1.b[a13.n1.ap[i]].gsub=0;			
		}
		
		
		leadnumber[leadern-1]=gnumber;
		if(gk>-1) {
			leader0[leadern]=a13.a1.b[gk].k0;
			leadstarttime[leadern]=a13.a1.b[gk].age();
			leadern++;
		}
		leader=gk;	
	
		if(gk>-1)
		{
			recount() ;
			a13.a1.newevent(a13.a1.year,""+name+"部落首領"+a13.a1.b[old].thename()+"亡故，"+a13.a1.b[gk].thename()+"成為新任首領");
		}
		else {
			dtime=0;
			cleanflag() ;
			a13.a1.newevent(a13.a1.year,""+name+"部落首領"+a13.a1.b[old].thename()+"亡故，部落陷入無領導者狀態");
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
		dtime=0;
		leader=-1;
		cleanflag() ;
	}
	
	void showbl() {//q==16
		
		a13.kk.k=group;
		a13.kk.screen=2;
		
		a13.cleanallb();
		
		
		if(leader<0) {a13.kk.page=0;
			showgleader(0);
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
		if(dtime>0)
			a13.setbl(8, 720,380, 450, 30, 1, "部族狀態: 遷徙");
		else
			a13.setbl(8, 720,380, 450, 30, 1, "部族狀態: 定駐");
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
				a13.a1.b[z].move=0;
				if(a13.a1.b[z].findfield(a13.a1.pln-1)==1)
					g++;
			}
			if(g>=40)
				break;
		}
		a13.a1.pl[a13.a1.pln-1].start_check();
		x=a13.a1.pl[a13.a1.pln-1].x1;
		y=a13.a1.pl[a13.a1.pln-1].y1;
		
		a13.a1.newevent(name+"部落進入農業社會，其時部落首領為"+a13.a1.b[leader].thename());
		
	}
	
	
	void divideg(int k)
	{
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

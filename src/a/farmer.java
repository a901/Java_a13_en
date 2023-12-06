package a;

import java.io.Serializable;

public class farmer implements Serializable {
	
	int x,y,x2,y2,host,host0,heir,member[],member0,group,k,field[][],foodnumber=0,firsthost0,firstime,oldhost0,kk,s;
	int hostall[],hosttime[],hostn=0;
	int place,breakday=0;
	String name;
	farmer(int k,int x2,int y2,int host,int group,int pl)
	{
		place=pl;
		System.out.print("s1");
		member=new int [20];
		hostall=new int [34];
		hosttime=new int [34];
		hostn=0;
		kk=k;
		this.k=k;
		this.x=a13.a1.b[host].x;
		this.y=a13.a1.b[host].y;
		this.x2=x2;
		this.y2=y2;
		this.host=host;
		this.group=group;
		s=1;
		System.out.print("s2");
		host0=a13.a1.b[host].k0;
		oldhost0=host0;
		
		a13.a1.pl[pl].add(k);
		
		firsthost0=host0;
		field= new int [11][11];
		for(int z=0;z<11;z++)
		{
			for(int i=0;i<11;i++) 
				field[z][i]=-1;
		}
		
		System.out.print("s3");
		for(int i=x;i<x+x2;i++)
		{
			for(int j=y;j>y-y2;j--)
			{
				a13.a1.maphost[i][j]=k;
			}
		}
		
		a13.a1.b[host].home=k;
		a13.a1.b[host].cn=0;
		a13.a1.b[host].busy=1;
		build0=1;
		
		System.out.print("s4");
		newhost();
		a13.a1.b[host].job=1;
		System.out.print("s5");
		a13.a1.b[host].cn=0;
		a13.a1.b[host].work=0;

	}
	
	
	farmer(int k){
		this.k=k;s=-1;
	}
	
	void build()
	{
		if(build0<=3)
		{
			if(a13.a1.map[a13.a1.b[host].x][a13.a1.b[host].y-1]<1000)
			{
				
				a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=23;
				a13.a1.b[host].y--;
				build0++;
				
			}
		}
		else if(build0<=(3+x2-1))
		{
			if(a13.a1.map[a13.a1.b[host].x+1][a13.a1.b[host].y]<1000)
			{
				//a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=23;
				a13.a1.b[host].x++;
				build0++;
				
			}
		}
		else if(build0<=(3+x2-1+3))
		{
			if(a13.a1.map[a13.a1.b[host].x][a13.a1.b[host].y+1]<1000)
			{
				if(build0>(3+x2))
				a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=23;
				a13.a1.b[host].y++;
				build0++;
				
			}
		}
		else if(build0<=(3+x2-1+3+x2-1))
		{
			if(a13.a1.map[a13.a1.b[host].x-1][a13.a1.b[host].y]<1000)
			{
				a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=23;
				//a13.a1.map[a13.a1.b[host].x][a13.a1.b[host].y]=-1;
				a13.a1.b[host].x--;
				build0++;
				
			}
		}
		else  if(build0<=(3+x2-1+3+x2-1+1)) {
			
			a13.a1.b[host].x++;
			a13.a1.b[host].y--;
			build0++;
		}
		else  if(build0<=(3+x2-1+3+x2-1+1+x2-3)) {	
			if(a13.a1.map[a13.a1.b[host].x+1][a13.a1.b[host].y]<1000)
			{
				a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=11;
				//a13.a1.map[a13.a1.b[host].x][a13.a1.b[host].y]=-1;
				a13.a1.b[host].x++;
				build0++;			
			}
		}
		else  if(build0<=(3+x2-1+3+x2-1+1+x2-3+1)) {

			if(a13.a1.map[a13.a1.b[host].x][a13.a1.b[host].y-1]<1000)
			{
				a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=11;
				a13.a1.b[host].y--;
				build0++;	
			}
		}
		else  if(build0<=(3+x2-1+3+x2-1+1+x2-3+1+x2-3)) {
			
			if(a13.a1.map[a13.a1.b[host].x-1][a13.a1.b[host].y]<1000)
			{
				a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=11;
				//a13.a1.map[a13.a1.b[host].x][a13.a1.b[host].y]=-1;
				a13.a1.b[host].x--;
				build0++;
				
			}
		}
		else  if(build0<=(3+x2-1+3+x2-1+1+x2-3+1+x2-3+1)) {
			
			if(a13.a1.map[a13.a1.b[host].x][a13.a1.b[host].y-1]<1000)
			{
				a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=11;
				a13.a1.b[host].y--;
				build0++;
				
			}
		}
		else  if(build0<=(3+x2-1+3+x2-1+1+x2-3+1+x2-3+1+x2-3+1)) {
			
			if(a13.a1.map[a13.a1.b[host].x+1][a13.a1.b[host].y]<1000)
			{
				a13.a1.mapall[a13.a1.b[host].x][a13.a1.b[host].y]=11;
				a13.a1.b[host].x++;
				build0++;
				
			}
		}
		else {
			build0=0;a13.a1.b[host].busy=0;
		}
		
		
	}
	void work(int x)
	{
		
	}
	void beclean(int z,int k)
	{
		member[z]=member[member0-1];member0--;
		if(a13.a1.b[k].home==kk)a13.a1.b[g].home=-1;
		if(a13.a1.b[k].home2==kk)a13.a1.b[g].home2=-1;
		if(a13.a1.b[k].job==1&&a13.a1.b[k].home==-1)a13.a1.b[k].job=0;
		if(a13.a1.b[k].sex==1)
		{
			for(int i=0;i<member0;i++)
			{
				g=member[i];
				if(a13.a1.b[g].s<0||a13.a1.b[g].fa==k||a13.a1.b[g].wi==k)
				{
					member[i]=member[member0-1];member0--;
					if(a13.a1.b[g].home==kk)a13.a1.b[g].home=-1;
					if(a13.a1.b[g].home2==kk)a13.a1.b[g].home2=-1;
					if(a13.a1.b[g].job==1&&a13.a1.b[g].home==-1)a13.a1.b[g].job=0;
				}
			}
			
		}
		
		
	}
	void cleanmember()
	{
		l=0;
		
		int h=heir1_2(host0,1);
		if(h>0)
		h=a13.a1.allb[h].bk;
		l=1;
		int h2=h;
	
		l=4;
	    int h3=heir1_2(host0,4);
	    if(h3>0)
			h=a13.a1.allb[h].bk;
		
		for(int z=0;z<member0;z++)
			a13.a1.b[member[z]].gsub=0;
		
		for(int z=0;z<member0;z++)
		{
			g=member[z];
			if(a13.a1.b[g].gsub==1||a13.a1.b[g].s<0)
			{
				member[z]=member[member0-1];member0--;
			}
			
			a13.a1.b[g].gsub=1;
			if(g==host||g==h||g==h2||g==h3||g==a13.a1.b[host].wi||g==a13.a1.b[host].ma||g==a13.a1.b[host].fa) 			
				continue;
			
			if(h>0) {
				if(g==a13.a1.b[h].wi||g==a13.a1.b[h].ma) 				
					continue;
				
			}
			if(h3>0) {
				if(g==a13.a1.b[h3].wi) 				
					continue;
				
			}
			
			if(a13.a1.b[g].age()>12)
			{
				a13.a1.b[g].job=1;
				
			}
			
			if(a13.a1.b[g].home!=kk)
			{
				member[z]=member[member0-1];member0--;
				
				if(a13.a1.b[g].job==1&&a13.a1.b[g].home==-1)a13.a1.b[g].job=0;
			}
			else if(a13.a1.b[g].age()>15&&member0>7)
			{
				member[z]=member[member0-1];member0--;
				if(a13.a1.b[g].home==kk)a13.a1.b[g].home=-1;
				if(a13.a1.b[g].home2==kk)a13.a1.b[g].home2=-1;
				if(a13.a1.b[g].job==1&&a13.a1.b[g].home==-1)a13.a1.b[g].job=0;
				
			}
			else if(a13.a1.b[g].age()>10&&member0>10)
			{
				member[z]=member[member0-1];member0--;
				if(a13.a1.b[g].home==kk)a13.a1.b[g].home=-1;
				if(a13.a1.b[g].home2==kk)a13.a1.b[g].home2=-1;
				if(a13.a1.b[g].job==1&&a13.a1.b[g].home==-1)a13.a1.b[g].job=0;
				
			}
			else if(a13.a1.b[g].fa!=host&&a13.a1.b[g].ma!=host&&a13.a1.b[g].fa!=h&&member0>5)
			{
				member[z]=member[member0-1];member0--;
				if(a13.a1.b[g].home==kk)a13.a1.b[g].home=-1;
				if(a13.a1.b[g].home2==kk)a13.a1.b[g].home2=-1;
				if(a13.a1.b[g].job==1&&a13.a1.b[g].home==-1)a13.a1.b[g].job=0;
			}
		
			
			if(a13.a1.b[g].age()>=16+a13.a1.b[host].person%7&&a13.a1.b[g].sex==1&&(a13.a1.b[g].wi<=0||a13.a1.b[g].wi0!=a13.a1.b[a13.a1.b[g].wi].k0))
			{
				findwife(g);
			}
			
			
				
		}
		
		for(int z=0;z<member0;z++)
			a13.a1.b[member[z]].gsub=0;
		
		if(h>0) {

			if(a13.a1.b[h].home!=kk)
			{
				a13.a1.b[h].home=kk;member[member0]=h;member0++;
			}
		}
		if(a13.a1.b[host].age()<13&&h3>0&&a13.a1.b[h3].home!=kk) {
	
			a13.a1.b[h3].home=kk;member[member0]=h;member0++;
			a13.a1.b[h3].job=1;
			
		}
		
		if(h>0&&a13.a1.b[h].age()>=14+(a13.a1.b[host].person%10)&&(a13.a1.b[h].wi<=0||a13.a1.b[h].wi0!=a13.a1.b[a13.a1.b[h].wi].k0))
		{
			findwife(h);
		}
		if(a13.a1.b[host].age()>=14+a13.a1.b[host].person%5&&(a13.a1.b[host].wi<=0||a13.a1.b[host].wi0!=a13.a1.b[a13.a1.b[host].wi].k0))
		{
			findwife(host);
		}
	}
	void host_k()
	{
		if((int)(Math.random()*12121)%17==1) {
			checkbuilding();
			cleanmember();
			
			if(a13.a1.b[host].x<x-20||a13.a1.b[host].x>x+27||a13.a1.b[host].y<y-20||a13.a1.b[host].y<y+27)
			{
				s=-1;
				host=-1;
			}
			
		}
		
		if((int)(Math.random()*12121)%13==1&&a13.a1.b[host].person%19>7)
		{
			a13.a1.map[x][y]=500+group;
		}
		
			
	}
	int build0=0,workx,worky;
	

	void r_kid(int k)
	{
		
		if((int)(Math.random()*12121)%5==1)
		{
			a13.a1.b[k].farmer_kid_boring();
		}
		else if((int)(Math.random()*12121)%4==1||a13.a1.b[k].x<x||a13.a1.b[k].x>x+x2||a13.a1.b[k].y>y||a13.a1.b[k].y<y-y2-1)
			a13.a1.b[k].setgoplace(x+(int)(Math.random()*12121)%4, y-2, 200);		
		else {
			
			if((int)(Math.random()*52121)%9==1)
			{
				if(a13.a1.map[x+1][y]==-1)
					a13.a1.b[k].x++;
			}
			else if((int)(Math.random()*52121)%8==1) {
				if(a13.a1.map[x-1][y]==-1)
					a13.a1.b[k].x--;
			}
			else if((int)(Math.random()*72121)%7==1)
			{
				if(a13.a1.map[x][y+1]==-1)
					a13.a1.b[k].y++;
			}
			else if((int)(Math.random()*72121)%6==1) {
				
				if(a13.a1.map[x][y-1]==-1)
					a13.a1.b[k].y--;
			}
		}
		
		
		
		
		
	}
	void r(int k)
	{
		l=0;
		System.out.println("i am"+a13.a1.b[k].name+"k="+k+"  farmer2");		
		if(a13.a1.b[k].cn>0)
			return;
		
		if(build0>0&&host==k)
		{
			
			build();
			return;
		}
		if(k==host)
		{
			host_k();
			
		}
		
		
		if(a13.a1.b[k].cn==0&&a13.a1.b[k].finaltime>0)
		{
			a13.a1.b[k].goplace();
			return;
			
		}
		if(foodnumber>=3)
			a13.a1.map[x+3][y-1]=211;
		else if(foodnumber>=1)
			a13.a1.map[x+3][y-1]=201;
		else
			a13.a1.map[x+3][y-1]=-1;
			
		
		if(a13.a1.b[k].work==3)
		{
			a13.a1.b[k].y--;
			if(a13.a1.b[k].y==y-3)
				 a13.a1.b[k].work=2;
			if(a13.a1.b[k].transferthing!=201)
			a13.a1.b[k].transfernumber=0;
		}
		else if(a13.a1.b[k].work==2)
		{
			a13.a1.b[k].y--;
			if(a13.a1.b[k].y==y-y2)
				 a13.a1.b[k].work=1;
			
			
			
			a13.a1.mapall[a13.a1.b[k].x][a13.a1.b[k].y]=11;
			
		}
		if(a13.a1.b[k].work==1&&(a13.a1.b[k].x<x||a13.a1.b[k].y>y||a13.a1.b[k].x>x+x2||a13.a1.b[k].y<y-y2))
			a13.a1.b[k].work=0;
		if(a13.a1.b[k].work==1&&a13.a1.b[k].x>=x&&a13.a1.b[k].y<=y)
		{
			
			//else if(field[a13.a1.b[k].x-x][y-a13.a1.b[k].y]==241)
				//field[a13.a1.b[k].x-x][y-a13.a1.b[k].y]=242;
			if(field[a13.a1.b[k].x-x][y-a13.a1.b[k].y]==-1)
				field[a13.a1.b[k].x-x][y-a13.a1.b[k].y]=242;
			else if(field[a13.a1.b[k].x-x][y-a13.a1.b[k].y]==242)
				field[a13.a1.b[k].x-x][y-a13.a1.b[k].y]=201;
			else if(field[a13.a1.b[k].x-x][y-a13.a1.b[k].y]==201){
				field[a13.a1.b[k].x-x][y-a13.a1.b[k].y]=-1;
				a13.a1.b[k].transferthing=201;
				a13.a1.b[k].transfernumber++;
			}
			
			a13.a1.b[k].y++;
			if(a13.a1.b[k].y==y-3) {
				 a13.a1.b[k].work=0;a13.a1.b[k].busy=0;
				 a13.a1.b[k].setgoplace(x+3, y-1, 60);
			}
			for(int i=0;i<x2;i++)
			{
				for(int j=0;j<y2;j++)
				{
					if(field[i][j]>0&&a13.a1.map[x+i][y-j]<1000)
						a13.a1.map[x+i][y-j]=field[i][j];
					
						
					
				}
			}
			
		}
		
		if(a13.a1.b[k].work>0)
			return;
		if(a13.a1.b[k].transfernumber>0&&a13.a1.b[k].transferthing==201&&((a13.a1.b[k].x+1==x+3&&a13.a1.b[k].y==y-1)||(a13.a1.b[k].x-1==x+3&&a13.a1.b[k].y==y-1)||(a13.a1.b[k].x==x+3&&a13.a1.b[k].y+1==y-1)))
		{
			foodnumber+=a13.a1.b[k].transfernumber;
			a13.a1.b[k].transferthing=0;
			a13.a1.b[k].transfernumber=0;
			
		}
		System.out.println("i am"+a13.a1.b[k].name+"k="+k+"  farmer2");		
		if((int)(Math.random()*12121)%5==1)
		{
			 boring(k);
		}
		else if((int)(Math.random()*12121)%4==1||a13.a1.b[k].x<x||a13.a1.b[k].x>x+x2||a13.a1.b[k].y>y||a13.a1.b[k].y<y-y2-1)
			a13.a1.b[k].setgoplace(x+(int)(Math.random()*12121)%4, y-2, 200);
		else if((int)(Math.random()*12121)%2==1&&a13.a1.b[k].y>=y-2)
		{
			if(a13.a1.b[k].y>=y-2&&a13.a1.b[k].y<=y&&a13.a1.b[k].x<x+5&&a13.a1.b[k].x>x)
			a13.a1.b[k].work=3;a13.a1.b[k].busy=1;
		}
		else {
			if((int)(Math.random()*52121)%7==1&&k==host&&a13.a1.b[k].hungry<-30&&a13.a1.b[k].y>=y-1&&a13.a1.b[k].y<=y&&a13.a1.b[k].x<x+2&&a13.a1.b[k].x>x) {
				
				
				a13.a1.b[k].x=x;a13.a1.b[k].y=y;
				build0=1;
				return;
			}
			if((int)(Math.random()*52121)%9==1)
			{
				if(a13.a1.map[x+1][y]==-1)
					a13.a1.b[k].x++;
			}
			else if((int)(Math.random()*52121)%8==1) {
				if(a13.a1.map[x-1][y]==-1)
					a13.a1.b[k].x--;
			}
			else if((int)(Math.random()*72121)%7==1)
			{
				if(a13.a1.map[x][y+1]==-1)
					a13.a1.b[k].y++;
			}
			else if((int)(Math.random()*72121)%6==1) {
				
				if(a13.a1.map[x][y-1]==-1)
					a13.a1.b[k].y--;
			}
		}
		
		
		
		
		
		
		
		
		
	}
	void boring(int k)
	{
		//System.out.print("boring\n");
		
		int nn=a13.a1.b[k].countf()/2+1;
		

		int g;
		if((int)(Math.random()*127121)%2==1)
		{
			
			if(a13.a1.b[k].wi>=0)
			{
				
				a13.a1.b[k].findone(a13.a1.b[k].wi+1000,200);
				return;
			}
		}
		if(a13.a1.b[k].wi<1&&(int)(Math.random()*127121)%7==1)
		{
			a13.a1.b[k].findone(1,300);
			
		}
		for(int z=0;z<a13.a1.b[k].fn;z++)
		{
			if(a13.a1.b[a13.a1.b[k].f[z]].k0!=a13.a1.b[k].ff[z][0])
				continue;
			if((int)(Math.random()*72727)%nn==0)
			{
				a13.a1.b[k].findone(a13.a1.b[k].f[z]+1000,300);
				return;		
			}					
		}
			
	}
	int g,l;
	void hostdie()
	{
		l=0;
		int host0=a13.a1.b[host].k0;
		
		int gg=a13.a1.b[host].group;
		gg=a13.a1.group[gg].sex;
		if(gg>=0)            //父系繼承制(已故屋主與前屋主均無父系後嗣允許母系繼承)
		{
			g=heir1_2(host0,3);
			if(g<0&&a13.a1.b[host].wi0>0&&a13.a1.allb[a13.a1.b[host].wi0].s>0)g=a13.a1.b[host].wi;
			else if(g<0) {
				g=heir1_2(host0,1);
				if(g<0)
				{
					g=heir1_2(oldhost0,3);
					if(g<0) {
						g=heir1_2(oldhost0,1);
						
						if(g<0) {
							g=heir1_1(host0,1);
							if(g<0) {
								g=heir1_1(oldhost0,1);			
							} 					
						} 
						else
							oldhost0=host0;
					} 
					
				}
			}
			else
				oldhost0=host0;
		}
		else            //父系優先繼承制(已故屋主無父系後嗣允許母系繼承) 已刪除
		{
			
			g=heir1_1(host0,3);
			if(g<0&&a13.a1.b[host].wi0>0&&a13.a1.allb[a13.a1.b[host].wi0].s>0)g=a13.a1.b[host].wi;
			else if(g<0){
				g=heir1_1(host0,1);
				if(g<0) {
					g=heir1_1(oldhost0,3);
					if(g<0)
						g=heir1_1(oldhost0,1);
				}
				else
					oldhost0=host0;
				
			}
			else
				oldhost0=host0;
		}
		if(g>0) {
		
			host=a13.a1.allb[g].bk;
			newhost();
			
				
		}
		else{
			g=0;
			for(int z=0;z<member0;z++)
			{
				if(a13.a1.b[member[z]].s>0&&a13.a1.b[member[z]].home==kk)
				{
					host=member[z];
					newhost();
					g=1;
				}
			}
			if(g==0) {
				s=-1;
				
			}
		}
		
		
	}
	
	int  heir1_1(int h,int l)//父系優先繼承制
	{
		if(a13.a1.b[a13.a1.allb[h].bk].x<x-25||a13.a1.b[a13.a1.allb[h].bk].y<y-25||a13.a1.b[a13.a1.allb[h].bk].x>x+30||a13.a1.b[a13.a1.allb[h].bk].y>y+30)
		return -1;
		if(a13.a1.b[a13.a1.allb[h].bk].home!=kk)
			return -1;
		if(h!=host0&&a13.a1.allb[h].s>0)
		{
			if(l>=3)
			{
				if(a13.a1.allb[h].age()>=13)
					return h;
				else
					return -1;
			}
			else if(l>=0)
				return h;
			
		}
			
		 for(int z=0;z<a13.a1.allb[h].kidn;z++)
		 {
			 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==2)
				 continue;
			 g=heir1_1(a13.a1.allb[h].kid[z],l);
			 if(g>-1)
				return g;	 
		 }
		 for(int z=0;z<a13.a1.allb[h].kidn;z++)
		 {
			 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==1)
				 continue;
			 g=heir1_1(a13.a1.allb[h].kid[z],l);
			 if(g>-1)
				return g;
			 
		 }
		
		 return -1;
		 
		 
	}
	int  heir1_2(int h,int l)//父系絕對繼承制
	{
		if(a13.a1.b[a13.a1.allb[h].bk].x<x-25||a13.a1.b[a13.a1.allb[h].bk].y<y-25||a13.a1.b[a13.a1.allb[h].bk].x>x+30||a13.a1.b[a13.a1.allb[h].bk].y>y+30)
			return -1;
		if(a13.a1.b[a13.a1.allb[h].bk].home!=kk)
			return -1;
		if(h!=host0&&a13.a1.allb[h].s>0)
		{
			if(l>=3)
			{
				if(a13.a1.allb[h].age()>=13)
					return h;
				else
					return -1;
			}
			else 
				return h;
		}
			
		 for(int z=0;z<a13.a1.allb[h].kidn;z++)
		 {
			 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==2)
				 continue;
			 g=heir1_2(a13.a1.allb[h].kid[z],l);
			 if(g>-1)
				return g;
			 
		 }
				
		 return -1;
	}
	
	void findwife(int k0)
	{
		System.out.println("wi 0");
		int g=a13.a1.b[k0].findlove() ;
		int g2;
		if(g>=0)
		{			
			//System.out.println("wi 1 g="+g+" "+a13.a1.b[host].f[g]+" "+a13.a1.b[a13.a1.b[host].f[g]].findlove()+" ");
			g=a13.a1.b[host].f[g];
			if(a13.a1.b[g].wi<=0)
			{
				System.out.println("wi 2");
				a13.a1.b[k0].wi=g;
				a13.a1.b[g].wi=k0;
				a13.a1.b[g].home2=a13.a1.b[g].home;
				a13.a1.b[g].home=k;
				a13.a1.b[g].job=1;
				a13.a1.allb[a13.a1.b[g].k0].place=place;
				member[member0]=g;
				member0++;	
				a13.a1.b[k0].bewi(g);
			}

		}
	}
	
		
	
	
	void newhost() {
		
		if(a13.a1.b[host].k0!=firsthost0)
		a13.a1.b[host].setgoplace(x+(int)(Math.random()*12121)%4, y-2, 200);
		breakday=0;
		if(a13.a1.b[host].job<1&&a13.a1.b[host].age()>12)
			a13.a1.b[host].job=1;
		
		a13.a1.b[host].home=k;
		host0=a13.a1.b[host].k0;
		a13.a1.allb[host0].place=place;
		member[member0]=host;
		member0++;
		
		hostall[hostn]=host0;
		hosttime[hostn]=a13.a1.year;
		hostn++;
		
		if(hostn>30) {
			
			for(int i=15;i<hostn;i++) {
				
				hostall[i-5]=hostall[i];
				hosttime[i-5]=hosttime[i];
			}
			hostn-=5;
		}
		
		if(a13.a1.b[host].wi<=0)
		{
			System.out.println("wi 0");
			int g=a13.a1.b[host].findlove() ;
			int g2;
			if(g>=0)
			{			
				System.out.println("wi 1 g="+g+" "+a13.a1.b[host].f[g]+" "+a13.a1.b[a13.a1.b[host].f[g]].findlove()+" ");
				g=a13.a1.b[host].f[g];
				
				
				if(a13.a1.b[g].wi<=0)
				{
					System.out.println("wi 2");
					a13.a1.b[host].wi=g;
					a13.a1.b[g].wi=host;
					a13.a1.b[g].home2=a13.a1.b[g].home;
					a13.a1.b[g].home=k;
					a13.a1.b[g].job=1;
					a13.a1.allb[a13.a1.b[g].k0].place=place;
					member[member0]=g;
					member0++;	
					a13.a1.b[host].bewi(g);
					
				}

			}
		
		}
		else {
			if(a13.a1.b[a13.a1.b[host].wi].home!=k) {
				g=a13.a1.b[host].wi;
				a13.a1.b[g].home2=a13.a1.b[g].home;
				a13.a1.b[g].home=k;
				a13.a1.b[g].job=1;
				a13.a1.allb[a13.a1.b[g].k0].place=place;
				member[member0]=g;
				member0++;	
				
			}
				
		}
		cleanmember();
		for(int z=0;z<a13.a1.allb[host0].kidn;z++)
		{
			if(a13.a1.allb[a13.a1.allb[host0].kid[z]].s>0&&a13.a1.allb[a13.a1.allb[host0].kid[z]].age()<13&&member0<17)
			{
				g=a13.a1.allb[a13.a1.allb[host0].kid[z]].bk;
				
				a13.a1.b[g].home=k;
				a13.a1.allb[a13.a1.b[g].k0].place=place;
				member[member0]=g;
				member0++;	
			}
		}
		
	}
	
	
	
	
	void history(int h) {
		
		
		
		a13.cleanallb();
	
		a13.setbl(1, 720,70, 350, 30, 1,"所屬部落:"+a13.a1.group[group].name+" 所屬村落:"+a13.a1.pl[place].name);
		//a13.setbl(12, 720,70, 350, 30, 1,"歷任此房屋田產持有者:");
	//	a13.setbl(2, 720,100, 350, 30, 1, "歷史累積人數:"+a13.a1.allbn+"人");
	//	a13.setbl(3, 720,130, 350, 30, 1, "歷史累積部落數:"+a13.a1.groupn);
		//a13.setbl(4, 720,160, 350, 30, 1, "人物資料一覽:");
		
		
		g=h;
		for(int i=h;i<h+10;i++)
		{
			if(i>=hostn)
				break;
			a13.setbl((i-g)+31, 720,150+(i-g)*30, 480, 30, 1,(hosttime[i])+"年  持有者: "+a13.a1.allb[hostall[i]].name());
		}
		
		a13.setbl(8, 720,500, 350, 30, 1, "第"+(h+1)+"頁");
		a13.setbl(9, 720,530, 400, 30, 1, "上下鍵移動游標  E返回  ");
		
		a13.cleanall();
		a13.seta(11,700,0, 500,580,"talk4");
		
	}
	
	void findnewhost()
	{
		int gg=0;
		for(int i=x-4;i<x+x2+4;i++)
		{
			for(int j=y-4;j<y+y2+4;j++)
			{
		
				if(a13.a1.map[i][j]>1000)
					g=a13.a1.map[i][j]-1000;
				else
					continue;
				
				if(a13.a1.b[g].s>0&&a13.a1.b[g].home<0&&a13.a1.b[g].work<=0&&a13.a1.b[g].sick==0&&a13.a1.b[g].age()>15&&a13.a1.b[g].age()<30&&a13.a1.b[g].group==group&&a13.a1.b[g].sex==1)
				{
					host=g;
					s=1;
					newhost();
					gg=1;
					break;
				}
			}
			if(gg==1)
				break;
		}
	}
	
	
	
	
	void checkbuilding() {
		
		for(int i=x;i<x2;i++)
		{
			a13.a1.mapall[i][y]=23;
		}

		for(int i=y;i>=y-3;i--)
		{
			a13.a1.mapall[x][i]=23;
			a13.a1.mapall[x2][i]=23;
		}
	}
	

	
	
	

}

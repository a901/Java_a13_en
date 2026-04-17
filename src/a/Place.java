package a;

import java.io.Serializable;


public class Place implements Serializable{//還未開發完成
	
	int y1,y2,x1,x2,group,kingdom,s;
	int realfn=0;
	int person;
	String name="";
	int birth;
	
	int farmer[],farmerwi[],farmerx[],farmery[],farmern=0;
	farmer f[];
	
	
	int soldier[],soldierx[],soldiery[],soldierwi[], soldiern;
	
	int police[],policewi[],policen;
	
	int housex[],housey[],housen;
	
	int leader,leaderwi,leadermem[],leadermem0;
	
	Place()
	{
		
	}
	Place(int g0)
	{
		farmer=new int[101];
		farmerwi=new int[101];
		farmerx=new int[101];
		farmery=new int[101];
		soldier=new int[201];
		soldierwi=new int[201];
		housex=new int[101];
		housey=new int[101];
		
		person=(int)(Math.random()*1212111)%(a13.a1.day+71011+g0);
		group=g0;
		
		s=1;birth=a13.a1.year;
		if(a13.a1.group[g0].leader>=0)
		name=a13.n1.createplacename(a13.a1.b[a13.a1.group[g0].leader].k0);
		else name=a13.n1.createplacename(-1);
	}
	int age()
	{
		return (a13.a1.year-birth+1);
	}

	
	
	int member[]=new int[10101],membern=0;
	int mem[]=new int[10101],memn=0;
	int g,k,h,gg,gh;
	int create(int g0,int x,int y)
	{
		
		farmern=0;
		soldiern=0;
		for(int i=4;i<70;i+=7) {
			
			soldierx[soldiern]=x+i;
			soldiery[soldiern]=y-1;
			soldiern++;
			soldierx[soldiern]=x+i;
			soldiery[soldiern]=y+71;
			soldiern++;
			soldierx[soldiern]=x-1;
			soldiery[soldiern]=y+i;
			soldiern++;
			soldierx[soldiern]=x+71;
			soldiery[soldiern]=y+i;
			
		}
		housen=0;
		for(int i=0;i<7;i++)
		{
			for(int j=2;j<10;j+=3) {
				for(int q=2;q<10;q+=3) {
				housex[housen]=x+i*10+j;
				housex[housen]=y+q;
				housen++;
				}
				
			}
		}
		
		for(int i=0;i<7;i++)
		{
			for(int j=1;j<7;j++)
			{
				if(j==1&&i==3)continue;
				if(j==4&&i==2)continue;
				if(j==4&&i==4)continue;
				x1=x+i*10+2;
				y1=y+j*10+2;
				farmerx[farmern]=x1;
				farmery[farmern]=y1;
				farmern++;
			}
		}
		membern=0;
		for(int z=0;z<a13.a1.bn;z++) {
			if(a13.a1.b[z].group==group) {
			member[membern]=z;
			membern++;
			mem[memn]=z;
			memn++;
			}
		}
		
		
		//leader	
		
		int fh;
		for(int i=0;i<memn;i++)
		{
			k=mem[i];
			if(k<0)continue;
			g=a13.a1.b[k].person%231+a13.a1.b[k].wise*50;
			if(a13.a1.b[k].age()<60)g+=100;
			if(a13.a1.b[k].age()<30)g+=100;
			if(a13.a1.b[k].age()>20)g+=200;
			
			if(a13.a1.b[k].sex==1&&a13.a1.b[k].age()>=16&&g>=gh)
			{
				gh=g;
				h=k;
			}
		}
		if(h<0)
			return -1;
		leader=a13.a1.b[h].k0;
		mem[h]=-1;
		
		fh=h;
		g=0;gh=0;h=-1;
		for(int i=0;i<memn;i++)
		{
			k=mem[i];
			if(k<0)
				continue;
			g=a13.a1.b[k].person%111+a13.a1.b[k].wise*20;
			if(a13.a1.b[k].age()<45)g+=200;
			if(a13.a1.b[k].age()<35)g+=150;
			if(a13.a1.b[k].age()<27)g+=150;
			if(a13.a1.b[k].age()>=15)g+=70;
			if(a13.a1.b[fh].thelove==k)g+=300;
			
			if(a13.a1.b[k].sex==2&&a13.a1.b[k].age()>=14&&g>=gh)
			{
				gh=g;h=k;
			}
		}
		if(h<0)
			return -1;
		leaderwi=a13.a1.b[h].k0;;
		mem[h]=-1;
		
		
		//farmer
		
		
		for(int z=0;z<farmern;z++)
		{
			for(int i=0;i<memn;i++)
			{
				k=mem[i];
				if(k<0)
					continue;
				g=a13.a1.b[k].person%171+a13.a1.b[k].wise*20;
				if(a13.a1.b[k].age()<60)g+=150;
				if(a13.a1.b[k].age()<50)g+=150;
				if(a13.a1.b[k].age()>17)g+=100;
				
				if(a13.a1.b[k].sex==1&&a13.a1.b[k].age()>=14&&g>=gh)
				{
					gh=g;h=k;
				}
			}
			if(h<0)
				return -1;
			farmer[z]=a13.a1.b[h].k0;
			mem[h]=-1;
			fh=h;
			g=0;gh=0;h=-1;
			for(int i=0;i<memn;i++)
			{
				k=mem[i];
				if(k<0)
					continue;
				g=a13.a1.b[k].person%141+a13.a1.b[k].wise*10;
				if(a13.a1.b[k].age()<45)g+=200;
				if(a13.a1.b[k].age()<35)g+=150;
				if(a13.a1.b[k].age()<27)g+=150;
				if(a13.a1.b[k].age()>=15)g+=70;
				if(a13.a1.b[fh].thelove==k)g+=300;
				
				if(a13.a1.b[k].sex==2&&a13.a1.b[k].age()>=13&&g>=gh)
				{
					gh=g;h=k;
				}
			}
			if(h<0)
				return -1;
			farmerwi[z]=a13.a1.b[h].k0;;
			mem[h]=-1;
			
			f[z]=new farmer();
			f[z].stert_addmember(fh);
		}
		
		
		
		
		
		
		for(int z=0;z<soldiern;z++)
		{
			k=0;g=0;gh=0;h=-1;
			for(int i=0;i<memn;i++)
			{
				k=mem[i];
				if(k<0)
					continue;
				g=a13.a1.b[k].person%71+a13.a1.b[k].strong*30;
				if(a13.a1.b[k].age()<60)g+=70;
				if(a13.a1.b[k].age()<45)g+=70;
				if(a13.a1.b[k].age()>15)g+=40;
					
				if(a13.a1.b[k].sex==1&&a13.a1.b[k].age()>=13&&g>=gh)
				{
						gh=g;h=k;
				}		
			}
			if(h<0)return -1;
			soldier[z]=a13.a1.b[h].k0;
			fh=h;
			mem[h]=-1;
			
			for(int i=0;i<memn;i++)
			{
				k=mem[i];
				if(k<0)
					continue;
				g=a13.a1.b[k].person%121+a13.a1.b[k].wise*4;
				if(a13.a1.b[k].age()<45)g+=200;
				if(a13.a1.b[k].age()<35)g+=150;
				if(a13.a1.b[k].age()<25)g+=150;
				if(a13.a1.b[k].age()>=15)g+=70;
				if(a13.a1.b[fh].thelove==k)g+=300;
				
				if(a13.a1.b[k].sex==2&&a13.a1.b[k].age()>=13&&g>=gh)
				{
					gh=g;h=k;
				}
			}
			
			if(h<0)
				return -1;
			soldierwi[z]=a13.a1.b[h].k0;;
			mem[h]=-1;
		}
		
	
		return 1;
		
	}
	
	void create0(int x,int y,int group)
	{
		
		int x1,y1;
		for(int i=0;i<70;i++)
		{
			for(int j=0;j<70;j++)
			{
				a13.a1.mapall[x+i][y+j]=1;
				if(a13.a1.map[x+i][y+j]<1000)
				a13.a1.map[x+i][y+j]=-1;			
				
			}
		}
		
		for(int i=0;i<7;i++)
		{
			for(int j=1;j<7;j++)
			{
				if(j==1&&i==3)continue;
				if(j==4&&i==2)continue;
				if(j==4&&i==4)continue;
				x1=x+i*10+2;
				y1=y+j*10+3;
				for(int q=0;q<7;q++)
				{
					for(int qq=0;qq<7;qq++) {
						a13.a1.mapall[x1+q][y1+qq]=11;
					}
				}
				for(int q=0;q<7;q++)
				{
					a13.a1.mapall[x1+q][y1+7]=23;
				}
				for(int q=0;q<=2;q++)
				{
					a13.a1.mapall[x1][y1+6-q]=23;
					a13.a1.mapall[x1+6][y1+6-q]=23;
				}				
			}
		}
		for(int i=0;i<7;i++)
		{
			x1=x+i*10;
			y1=y;
			
			
			for(int j=1;j<=9;j++)
			{
				
				
				for(int q=2;q<=11;q++)
				{
					a13.a1.mapall[x1+j][y1+q]=11;
				}
				
				a13.a1.mapall[x1+j][y1+2]=23;
				a13.a1.mapall[x1+j][y1+5]=23;
				a13.a1.mapall[x1+j][y1+8]=23;
				a13.a1.mapall[x1+j][y1+11]=23;
			}
			for(int j=2;j<=11;j++)
			{
				a13.a1.mapall[x1+1][y1+j]=23;
				a13.a1.mapall[x1+5][y1+j]=23;
				a13.a1.mapall[x1+9][y1+j]=23;
		
			}
			//a13.a1.mapall[x1+4][y1+2]=33;
			//a13.a1.mapall[x1+6][y1+2]=33;
			//a13.a1.mapall[x1+4][y1+7]=33;
			//a13.a1.mapall[x1+6][y1+7]=33;
		}
		
		
		//create temple
		
		x1=x+2*10;
		y1=y+4*10;
		
		for(int q=3;q<=8;q++)
		{
			for(int qq=2;qq<=3;qq++)
			{
				a13.a1.mapall[x1+q][y1+qq]=33;
			}
		}
		for(int qq=4;qq<=5;qq++)
		{
			a13.a1.mapall[x1+2][y1+qq]=32;
			a13.a1.mapall[x1+9][y1+qq]=32;
		}		
		// leader house
		x1=x+4*10;
		y1=y+4*10;
		
		for(int q=1;q<=8;q++)
		{
			for(int qq=2;qq<=9;qq++)
			{
				if(q==1||q==8||qq==2||qq==9)
				a13.a1.mapall[x1+q][y1+qq]=24;
				else
					a13.a1.mapall[x1+q][y1+qq]=12;
					
			}
		}
		for(int qq=4;qq<=5;qq++)
		{
			a13.a1.mapall[x1+2][y1+qq]=32;
			a13.a1.mapall[x1+9][y1+qq]=32;
		}
		
		
	}
	
	void start()
	{
		for(int x=0;x<farmern;x++)
		{
			g=farmer[x];
			k=a13.a1.allb[g].bk;
			
			a13.a1.b[k].x=farmerx[x]+2;
			a13.a1.b[k].y=farmery[x]+2;
			
			g=farmerwi[x];
			k=a13.a1.allb[g].bk;
			
			a13.a1.b[k].x=farmerx[x]+3;
			a13.a1.b[k].y=farmery[x]+3;
		}
	}
	
	
	void soldier_day()
	{
		for(int x=0;x<soldiern;x++)
		{
			g=soldier[x];
			k=a13.a1.allb[g].bk;
			
			a13.a1.b[k].x=soldierx[x];
			a13.a1.b[k].y=soldiery[x];
		}
		
	}
	void soldierwi_day()
	{
		for(int x=0;x<soldiern;x++)
		{
			g=soldierwi[x];
			k=a13.a1.allb[g].bk;
			
			a13.a1.b[k].x=housex[x]+1;
			a13.a1.b[k].y=housey[x]+1;
		}
		
	}

	
	void day()
	{
		
	}
	
	

	
	
	

}

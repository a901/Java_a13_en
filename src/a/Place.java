package a;

import java.io.Serializable;


public class Place implements Serializable{
	
	int y1,y2,x1,x2,group,kingdom,s;
	int f[],fn,realfn=0;
	int person;
	String name="";
	int birth;
	Place(int g0)
	{
		person=(int)(Math.random()*1212111)%(a13.a1.day+71011+g0);
		group=g0;
		f=new int[101];
		fn=0;
		s=1;birth=a13.a1.year;
		if(a13.a1.group[g0].leader>=0)
		name=a13.n1.createplacename(a13.a1.b[a13.a1.group[g0].leader].k0);
		else name=a13.n1.createplacename(-1);
	}
	int age()
	{
		return (a13.a1.year-birth+1);
	}
	void add(int fk)
	{
		f[fn]=fk;
		fn++;
		
		
	}
	int  changeleader()
	{
		int g;
		int k=-1,k0=-1000;
		int h=0;
		for(int z=0;z<fn;z++)
		{
			if(a13.a1.f[f[z]].s<0)
				continue;
			g=a13.a1.f[f[z]].host;
			h=(2-a13.a1.b[g].sex)*200+a13.a1.b[g].wise*5+a13.a1.b[g].strong+(a13.a1.b[g].age())+(a13.a1.b[g].person%17+a13.a1.b[g].person%23)/2+(int)(Math.random()*12117)%10;
			if(a13.a1.b[g].age()>=40)h+=10;
			if(a13.a1.b[g].age()>=30)h+=10;
			if(a13.a1.b[g].age()<15)h-=300;
			if(a13.a1.b[g].person%17<8||a13.a1.b[g].person%23<10)h-=20;
			if(h>k0) {
				k=g;
				k0=h;
			}
			
		}
		return k;
		
	}
	
	void r()
	{
		if(fn==0)
			s=-1;
		if((int)(Math.random()*12121)%37==1)
			return;
		
		start_check();
		int h;
		realfn=0;
		for(int z=0;z<fn;z++)
		{
			if(a13.a1.f[f[z]].s<0)
			{
				
				if(a13.a1.f[f[z]].breakday>7)
				{
					a13.a1.f[f[z]].s=-2;
					for(int i=a13.a1.f[f[z]].x;i<a13.a1.f[f[z]].x+a13.a1.f[f[z]].x2;i++)
					{
						for(int j=a13.a1.f[f[z]].y;j>a13.a1.f[f[z]].y-a13.a1.f[f[z]].y2;j--)
						{
							a13.a1.maphost[i][j]=-1;
						}
					}
					f[z]=f[fn-1];
					fn--;
							
					
					continue;
				}
				a13.a1.f[f[z]].breakday++;
				a13.a1.f[f[z]].findnewhost();
			}
			else {
				realfn++;
				
			
				
			}
			
		
			
		}
		
	}
	void start_check()
	{
		int h=f[0];
		x1=a13.a1.f[h].x;
		y1=a13.a1.f[h].y;
		
		for(int i=x1-50;i<x1+50;i++)
		{
			for(int j=y1-50;j<y1+50;j++)
			{
				if(a13.a1.maphost[i][j]<=0)
					a13.a1.maphost[i][j]=-101;
			}
		}
		
	}
	
	
	
	int count()
	{
		int g=0;
		for(int z=0;z<fn;z++)
		{
			if(a13.a1.f[z].s==-1)
				continue;
			g+=a13.a1.f[z].member0;
			
		}
		return g;
		
	}
	
	
	

}

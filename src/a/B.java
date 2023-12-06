package a;
import java.io.Serializable;
public class B  implements Serializable{
	
	public int s=0;//狀態 死活
	//int b[]=new int [1],bn;//
	String name,name2;
	int borntime,sex,swim;// 1 性別 2 年紀 4
	int mapa,x=10,y=10,k,hungry,love,love2,thelove,thelove0,state,k0;//飢餓值 0尋食 100餓死   狀態0一般 1吃     k0 永久編號
	
	int  group=-1;
	int gr[],gr2[],grn=0;//異族編號   異族熟悉度 異族數量
	int cx[],cy[],cn,cdelay,find,goalan,wise=100,strong=100;// 尋找路徑
	int name0,midname0;
	int fa,ma,fa0,ma0,f[],ff[][],fn, generation;//f關係人代號  ff永久編號  ff1關係類型  ff2熟悉度 ff3好惡感         generation代數
	int lastborn=-1;//上次生育
	int light,pain,sick,serioussick=0;
	int fertility=1;
	int goalx=-1,goaly=-1;
	int sad=0;
	int sin=0;
	int rob=0;
	int godie1=0;
	private static final long serialVersionUID = 199;
	//int kid[],kid0[],kidn=0;
	
	int transfer=0,transferthing=0,transfernumber=0;
	int work=0,workx,worky,weapon=0,move=0;
	int hero=0;
	int person,adult=0;//個性常數   成年與否
	
	int tie=0;
	
	
	//個性常數    %19 族群向心力高低，數字越高則越高
	
	//個性常數    %17 野心勇氣，數字越高則越高
	
	//個性常數    %23 魅力，數字越高則越高
	//個性常數    %31 道德
	
	int killright=0,killleft=0,bekill=0,stop=0;
	int finalgoalx=-1,finalgoaly=-1,finaltime=0,job=0;//job 1=farmer
	int hx=-1,hy=-1,place=-1;
	
	int home=0,home2=0,wi=-1,wi0=-1;
	
	int worktime=0,busy=0;//harmer
	
	B()
	{
	}
	B(int k00,int b1,int g,String bb,int bx,int by,int name00)//b2閒置
	{
		person=(int)(Math.random()*7182827)%117111;
		k=k00;
		name=bb;
		
		name0=name00;
		s=1;
		sex=b1;
		
		if(sex==1)
			name2=a13.a1.boy2[name0];
		else 	name2=a13.a1.girl2[name0];
		
		borntime=a13.a1.year-15;
	
		if(sex==1)
			mapa=101;
		if(sex==2)
			mapa=102;
		x=bx;
		y=by;
		hungry=-70;
		light=0;
		pain=0;
		//kid=new int [40];kid0=new int [40];
		gr=new int [6];
		gr2=new int [6];
		//kidn=0;
		generation=g;
		thelove=-1;
		fa=-1;
		ma=-1;
		fa0=-1;
		ma0=-1;
		love=0;love2=0;sick=0;
		
		job=0;
		
		home=-1;home2=-1;
		cx=new int [100];
		cy=new int [100];
		
		
		f=new int [50];
		ff=new int [50][5];
		fn=0;find=0;
	
		 this.k0=a13.a1.allbn;
		 look();
	}

	void addB(int faa,int maa,int faa0,int maa0,int w,int s)
	{
		fa=faa;
		ma=maa;
		fa0=faa0;
		ma0=maa0;
		midname=setmidname();
	   
	    
	    this.k0=a13.a1.allbn;
	   // System.out.print(" addB  k0="+k0+"  fa0="+fa0+" ma0="+ma0+"fa="+fa+"ma="+ma);
		a13.a1.allb[a13.a1.allbn]=new C(k0,fa0,ma0,generation,name,k,sex);
		a13.a1.allbn++;
		
		
		a13.a1.allb[k0].midname=midname;
		a13.a1.allb[k0].midname0=midname0;
		
		a13.a1.allb[k0].name2=name2;
		a13.a1.allb[k0].name0=name0;
		//a13.a1.allb[k0].name0=name2;
		borntime=a13.a1.year;
		a13.a1.allb[k0].borntime=borntime;
		
		wise=w;
		strong=s;
		a13.a1.allb[k0].wise=wise;
		a13.a1.allb[k0].strong=strong;
	
		
		this.fertility=(int)(Math.random()*12121)%4+1;
		if(sex==1&&(int)(Math.random()*12121)%2==1)
		{
			this.fertility=a13.a1.b[fa].fertility;
		}
		if(sex==2&&(int)(Math.random()*12121)%2==1)
		{
			this.fertility=a13.a1.b[ma].fertility;
		}
		
		
		if((int)(Math.random()*12121)%7==1)
			this.fertility=1000001;
		look();
	}
	
	
	void mainfindfood()
	{
		
		System.out.print("start find food k="+k+" find="+find+"\n");
		if(job>0&&find==201&&goalan>500)
			goalan=500;
		cdelay=0;
		a13.n1.ap[0]=-1;
		a13.n1.ax[0]=x;
		a13.n1.ay[0]=y;
		a13.n1.m[x][y]=1;
		cn=0;
		a13.n1.an=1;
		
		for(int z=0;z<a13.n1.an;z++)
		{
		//	System.out.print("mainfind an="+a13.n1.an+"\n");
			if(a13.n1.an>goalan||cn>0)
				break;
			findfood(a13.n1.ax[z],a13.n1.ay[z],z);
		}
		
		for(int z=0;z<a13.n1.an;z++)
		{
			a13.n1.m[a13.n1.ax[z]][a13.n1.ay[z]]=0;
		}
		find=0;
		
		
		
	}
	int checkfind1(int g)
	{
		if(a13.a1.b[g].sex==sex)
		return -1;
		if(a13.a1.b[g].home==home&&home>0)
			return -1;
		if(group>-1&&(a13.a1.b[g].fa0==fa0||a13.a1.b[g].ma0==ma0||a13.a1.b[g].fa0==k0||a13.a1.b[g].ma0==k0||a13.a1.b[g].k0==fa0||a13.a1.b[g].k0==ma0))
			return -1;
		if(a13.a1.b[g].age()<14)
			return -1;
		
		return 1;
		
	}
	void findfood(int gx,int gy,int kk)
	{
		
		
		if(cn>0)
			return;
		//if(find==1&&+a13.a1.map[gx][gy]>0)System.out.print("gx="+gx+" gy="+gy+" find"+find+ "  "+a13.a1.mapall[gx][gy]+" "+a13.a1.map[gx][gy]+" goalan="+goalan+"\n");

		if(Math.abs(goalx-gx)+Math.abs(goaly-gy)>=2&&find<=0)
		{
			
		}
		else if(find>10&&a13.a1.map[gx][gy]!=find&&(a13.a1.map[gx][gy]!=211||find!=201))//
		{
			
		}
		else if((find==1&&(a13.a1.map[gx][gy]<=1000||a13.a1.map[gx][gy]==k+1000||checkfind1(a13.a1.map[gx][gy]-1000)==-1))||(find==2&&(a13.a1.map[gx][gy]!=-1||a13.a1.mapall[gx][gy]>40)))
		{
			
		}
		else 
		{			
			
			System.out.println("i am"+name+"k="+k+"  gx="+gx+" gy="+gy+" i arrive!!   find="+find+ "  map="+a13.a1.map[gx][gy]+" goalan="+goalan+" goalx="+goalx+" goaly="+goaly);		
			cn=1;
			//c[cn]=k;		
			cx[cn]=a13.n1.ax[kk];
			cy[cn]=a13.n1.ay[kk];;
			cn++;
			
			while(a13.n1.ap[kk]!=-1)
			{
				if(cn>=98) {
					cn=2;
					break;
				}

				kk=a13.n1.ap[kk];
				cx[cn]=a13.n1.ax[kk];
				cy[cn]=a13.n1.ay[kk];;
				cn++;
			}
			cn-=2;

		//	if(find==1)	System.out.print("he find the person ! cn="+cn+" \n");
		//	System.out.print("he find it ! cn="+cn+" \n");
			return;
		}
		
		if(a13.n1.an>=goalan)
		{
			
			a13.n1.ax[a13.n1.an]=0;	a13.n1.ay[a13.n1.an]=0;
			a13.n1.an++;
			//System.out.print("over an="+a13.n1.an+" goalan="+goalan+"  \n");
			
			if(find!=201||hungry<40)
			{
				//a13.n1.an=goalan+2;
				cn=0;
				return;
			}	
			else if((int)(Math.random()*92191)%3>0||a13.a1.year-borntime<13)
			{
				//a13.n1.an=goalan+2;
				cn=0;
			//	System.out.print("he give up  find a place ! cn="+cn+" \n");
				return;
			}
			k=2000;
			
			while(a13.n1.ap[k]!=-1)
			{
				if(cn>98)
					break;
				//System.out.print("road cn="+cn+" k="+k+" x="+a13.n1.ax[k]+" y="+a13.n1.ay[k]+" \n");
				k=a13.n1.ap[k];
				cx[cn]=a13.n1.ax[k];
				cy[cn]=a13.n1.ay[k];
				cn++;
			}
			cn-=2;
			if(group>=0&&a13.a1.group[group].leader==k)
			{
				goalx=1;goaly=1;
			}
			
			//a13.n1.an=200000;
		//	System.out.print("he find a other place ! cn="+cn+" \n");
			return;
		}
		
		
		
		if((int)(Math.random()*12121)%3==1)
		{
			 subfindfood( gx+1, gy,kk);
			 subfindfood( gx, gy+1,kk);
			 subfindfood( gx-1, gy,kk);
			 subfindfood( gx, gy-1,kk);
		}
		else {
			 subfindfood( gx-1, gy,kk);
			 subfindfood( gx, gy-1,kk);
			 subfindfood( gx+1, gy,kk);
			 subfindfood( gx, gy+1,kk);
		}
		
	}
	int g,g2;
	
	int testhight(int x1,int y1,int x2,int y2)
	{
		if(x2<0||y2<0)
			return -1;
		if((a13.a1.mapall[x2][y2]/10==4&&swim==0)&&hungry<60)
			return -1;
		if(a13.a1.map[x2][y2]>0) {
			
			if(a13.a1.map[x2][y2]==find);
			else if(find==1&&a13.a1.map[x2][y2]>=1000);
			else
			return -1;
		}
		if(a13.a1.maphost[x2][y2]>0&&a13.a1.maphost[x2][y2]!=home&&a13.a1.maphost[x2][y2]!=home2)
		{
			if(a13.a1.maphost[x][y]<=0) {
				//System.out.print("問題!!"+k+" x"+x1+" "+y1+" "+x2+" "+y2);
				return -1;
			}
		}
		
		if(a13.a1.mapall[x1][y1]/10==4||(a13.a1.mapall[x2][y2]/10==4))
			return 1;
		 g=a13.a1.mapall[x1][y1]%10;
		 g2=a13.a1.mapall[x2][y2]%10;
		 g=g-g2;
		 if(g<0)g*=-1;
		 if(g>1)
			 return -1;
		 else
			 return 1;
		
		
	}
	int testhight_2(int x1,int y1,int x2,int y2)
	{
		if(a13.a1.mapall[x2][y2]/10==4)
			return -1;
		 g=a13.a1.mapall[x1][y1]%10;
		 g2=a13.a1.mapall[x2][y2]%10;
		 g=g-g2;
		 if(g<0)g*=-1;
		 if(g>1)
			 return -1;
		 else
			 return 1;
		
		
	}
	void subfindfood(int gx,int gy,int p) {
		
		//if(a13.a1.map[gx][gy]>-1)System.out.print("sub find food  m="+a13.a1.map[gx][gy]+"\n");
		
		//System.out.print("sub2 find food x="+x+"y="+y+"\n");
		if(testhight(a13.n1.ax[p],a13.n1.ay[p],gx,gy)==-1)
			return;
		//System.out.print("sub3 find food x="+x+"y="+y+"\n");
		if(a13.a1.map[gx][gy]!=-1) {
			if(a13.a1.map[gx][gy]==find)
			{
				
			}
			else if(find==1&&a13.a1.map[gx][gy]>=1000)
			{
				
			}
			else
			return;
		}
		
			
		if(a13.n1.m[gx][gy]>0)	return;
		g=0;
		for(int i=0;i<0;i++)
		{
		//	System.out.print("sub i="+i+" ax"+ax[i]+"cx="+cx+"cy="+cy+"ay="+ay[i]+"an="+an+"   ");
			if(a13.n1.ax[i]==gx&&a13.n1.ay[i]==gy) {
				return;
			}
		}
		
		a13.n1.m[gx][gy]=1;
		//System.out.print("\nsub cx="+gx+"cy="+gy+"   "+"an="+a13.n1.an+" \n");
		a13.n1.ax[a13.n1.an]=gx;
		a13.n1.ay[a13.n1.an]=gy;
		a13.n1.ap[a13.n1.an]=p;
		
		a13.n1.an++;
	}
	int ex,ey;
	void farmer_kid_boring()
	{
		 if(a13.a1.b[fa].k0==fa0&&(Math.abs(a13.a1.b[fa].x-x)+Math.abs(a13.a1.b[fa].y-y)<Math.abs(a13.a1.b[ma].x-x)+Math.abs(a13.a1.b[ma].y-y)+15)&&(int)(Math.random()*12121)%3==1)
			{
				find=fa+1000;
				if(age()<=9)
				goalan=100;
				else
					goalan=400;
				mainfindfood();
				return;
			}
			else if(a13.a1.b[ma].k0==ma0&&(int)(Math.random()*12781)%2==1) {
				find=ma+1000;
				if(age()<=9)
					goalan=100;
				else
					goalan=400;
				mainfindfood();
				return;
			}
			else {
				for(int z=0;z<fn;z++)
				{
					int nn=countf();
					nn/=2;nn++;
					if(a13.a1.b[f[z]].k0!=ff[z][0])
						continue;
					if((int)(Math.random()*72727)%nn==0)
					{
					//	System.out.print("find my friend  "+f[z]+"  i am "+k+" \n");
						find=f[z]+1000;	
						if(age()<8)
							goalan=100;
						else 
						goalan=300;
						
						mainfindfood();
						return;	
					}
				}
			}
	}
	void boring()
	{
		//System.out.print("boring\n");
		
		int nn=countf();
		nn/=2;nn++;
		
		if(hero>0&&(int)(Math.random()*127121)%5==1&&age()>9)
		{
			if(a13.a1.b[hero].s<0||a13.a1.b[hero].age()<13)
			{	hero=0;return;}
			find=hero+1000;	
			goalan=3500;
			mainfindfood();
			return;
		}
		if(a13.a1.year-this.borntime<13) {
			//System.out.print("kid find fa ma \n");
			 if(a13.a1.b[fa].k0==fa0&&(Math.abs(a13.a1.b[fa].x-x)+Math.abs(a13.a1.b[fa].y-y)<Math.abs(a13.a1.b[ma].x-x)+Math.abs(a13.a1.b[ma].y-y)+15)&&(int)(Math.random()*12121)%3==1)
			{
				find=fa+1000;
				if(age()<=9)
				goalan=400;
				else
					goalan=1000;
				mainfindfood();
				return;
			}
			else if(a13.a1.b[ma].k0==ma0&&(int)(Math.random()*12781)%2==1) {
				find=ma+1000;
				if(age()<=9)
					goalan=400;
				else
					goalan=1000;
				mainfindfood();
				return;
			}
			else {
				for(int z=0;z<fn;z++)
				{
					if(a13.a1.b[f[z]].k0!=ff[z][0])
						continue;
					if((int)(Math.random()*72727)%nn==0)
					{
					//	System.out.print("find my friend  "+f[z]+"  i am "+k+" \n");
						find=f[z]+1000;	
						if(age()<9)
							goalan=100;
						else if(age()<=11)
						goalan=200;
						else
							goalan=400;
						mainfindfood();
						return;	
					}
				}
			}
		}
		else {
			if(group>=0&&a13.a1.group[group].leader>=0) {
			if(hero==k&&(int)(Math.random()*127121)%6==1)
			{
				if(a13.a1.group[group].placex-x>0)g=-1;else g=1;
				goalx=(-(a13.a1.group[group].placex-x)%13)+g*7+x;
				if(a13.a1.group[group].placex-x>0)g=-1;else g=1;
				goaly=(-(a13.a1.group[group].placey-y)%13)+g*7+y;
				find=0;
				goalan=3700;
				mainfindfood();
				return;
			}
			else if(hero>0&&(int)(Math.random()*127121)%5==1)
			{
				if(a13.a1.b[hero].s<0||a13.a1.b[hero].age()<13)
				{	hero=0;return;}
				find=hero+1000;	
				goalan=3500;
				mainfindfood();
				return;
			}
			else if(hero==0&&a13.a1.group[group].dtime>0&&(int)(Math.random()*127721)%13==1)
			{
				find=a13.a1.group[group].leader+1000;	
				goalan=1000;
				mainfindfood();
				return;
			}
			
			}
			if((int)(Math.random()*127121)%2==1)
			{
				g=findlove() ;
				if(g>=0)
				{
					//System.out.print("find love one gh="+g+"i am "+k+" he is"+f[g]+" \n");
					thelove=f[g];
					find=f[g]+1000;
					goalan=2001;
					mainfindfood();
					return;
				
				}
			}
			
			
		//	if((int)(Math.random()*121121)%2==1||hero==k)return;
			if(hero>0&&(int)(Math.random()*12441)%2==1)	return;
			if((int)(Math.random()*92127)%4==1){//
				
			
				find=1;
				goalan=2002;
				mainfindfood();
				//System.out.print("find love one gh="+g+"i am "+k+" he is ? cn="+cn+" \n");
				return;
			}
			else {
				
				for(int z=0;z<fn;z++)
				{
					if(a13.a1.b[f[z]].k0!=ff[z][0])
						continue;
					if((int)(Math.random()*72727)%nn==0)
					{
						//System.out.print("find my friend  "+f[z]+"  i am "+k+" \n");
						find=f[z]+1000;	
						goalan=2009;
						mainfindfood();
						return;
					}
					
				}
				
				
			}
			//************************************************************************************************
			
			
		}
		
			
	}
	
	int findlove() {
	int gg=-1,gh=0;
	if(age()<=14)
		return -1;
	
		for(int z=0;z<fn;z++) {
			gh=f[z];
			if(a13.a1.b[gh].sex==sex)
				continue;
			if(a13.a1.b[gh].s<0)
				continue;	
			if(a13.a1.b[gh].k0!=ff[z][0])
				continue;		
			if(a13.a1.b[gh].fa0==k0||a13.a1.b[gh].ma0==k0)
			{
				continue;
			}
			if(a13.a1.b[gh].k0==fa0||a13.a1.b[gh].k0==ma0)
			{
				continue;
			}
			if(group>-1&&(a13.a1.b[gh].fa0==fa0||a13.a1.b[gh].fa0==ma0||(home>0&&a13.a1.b[gh].home==home)))
			{
				continue;
			}
			if(a13.a1.year-a13.a1.b[gh].borntime<14) {
				continue;
			}
		
			if(gg==-1||ff[z][2]+a13.a1.b[gh].borntime>ff[gg][2]+a13.a1.b[f[gg]].borntime)
				gg=z;
		}
		if(gg==-1)
			return gg;
		int g=a13.a1.b[f[gg]].k0;
		
		if(a13.a1.allb[k0].loven==0||(a13.a1.allb[k0].love[a13.a1.allb[k0].loven-1]!=g&&a13.a1.allb[k0].loven<19))
		{
			
			a13.a1.allb[k0].love[a13.a1.allb[k0].loven]=g;
			a13.a1.allb[k0].loveday[a13.a1.allb[k0].loven]=age();
			a13.a1.allb[k0].loven++;
		}
		
		return gg;
	}
	String age0() {
		
		return (a13.a1.year-this.borntime)+"歲";
	}
    int age() {
		
		return (a13.a1.year-this.borntime);
	}
    void bewi(int h)
    {
    	wi0=a13.a1.b[h].k0;
    	a13.a1.allb[k0].wife[a13.a1.allb[k0].wifen]=a13.a1.b[h].k0;
		a13.a1.allb[k0].wifeday[a13.a1.allb[k0].wifen]=age();
		a13.a1.allb[k0].wifen++;
		a13.a1.b[h].bewi0(k);
    	
    }
    void bewi0(int h)
    {
    	wi0=a13.a1.b[h].k0;
    	a13.a1.allb[k0].wife[a13.a1.allb[k0].wifen]=a13.a1.b[h].k0;
		a13.a1.allb[k0].wifeday[a13.a1.allb[k0].wifen]=age();
		a13.a1.allb[k0].wifen++;
		
    	
    }
	void eat()
	{
		if(cdelay>=2)
		{
			state=0;cdelay=0;
			if(a13.a1.map[ex][ey]==211)
			{
				int gg=a13.a1.maphost[ex][ey];
				if(gg>=0)
				{
					a13.a1.f[gg].foodnumber--;
					if(a13.a1.f[gg].foodnumber<0)a13.a1.f[gg].foodnumber=0;
				}
				
			}
			else if(a13.a1.maphost[ex][ey]>0)
			{
				int gg=a13.a1.maphost[ex][ey];
				if(a13.a1.f[gg].field[ex-a13.a1.f[gg].x][a13.a1.f[gg].y-ey]==201)
					a13.a1.f[gg].field[ex-a13.a1.f[gg].x][a13.a1.f[gg].y-ey]=-1;
			}
			a13.a1.map[ex][ey]=-1;
			
			work();
			return;
		}
		state=1;cdelay++;	
	}
	int px,py;
	void meetone2(int gg,int r)//************** 左右遇人
	{
		//if(busy>0)return;
		int gh=-1;
		for(int z=0;z<fn;z++)//******************* 檢查是否認識
		{
			if(ff[z][0]==a13.a1.b[gg].k0)
			{
				gh=z;break;
			}
		}
		if(gh>=0&&ff[gh][0]!=a13.a1.b[gg].k0)
			gh=-1;
		if(gh==-1) {
			if(fn>=48)
				return;
			gh=fn;
			f[fn]=gg;ff[fn][0]=a13.a1.b[gg].k0;
			ff[fn][1]=0;ff[fn][2]=1;ff[fn][3]=0;
			fn++;
		}
		else {
			ff[gh][2]++;//  熟悉度增加
		}
		if(a13.a1.b[gg].rob>0&&age()>=13&&rob==0&&(strong>=a13.a1.b[gh].strong||((int)(Math.random()*17121)%3==1)))
		{
			
			
			if(group>=0&&a13.a1.b[gg].tie<=0&&((sex==1&&(int)(Math.random()*17121)%11==1)||(sex==2&&(int)(Math.random()*12721)%23==1)))
			{
				//createtransfer(a13.a1.group[group].dx,a13.a1.group[group].dy,gg);
				//a13.a1.b[gg].stop=1000;
				a13.a1.b[gg].rob+=a13.a1.b[gg].sin+20;
				
				if(a13.a1.b[gg].sin>=100) {
					//a13.a1.map[a13.a1.b[gg].x][a13.a1.b[gg].y+1]=309
					a13.a1.b[gg].tie=1000;
					a13.a1.b[gg].godie1=4+(int)(Math.random()*12121)%2;
				}
				else a13.a1.b[gg].tie=a13.a1.b[gg].sin+20;
				
				if(r==1)
					killright=2;
				else killleft=2;
				stop=2;
				
				a13.a1.b[gg].stop=2;
				
				//a13.a1.map[a13.a1.b[gg].x][a13.a1.b[gg].y]=-1;
				return;
			}
			else if((group<0||(int)(Math.random()*17771)%10==1)&&((sex==1&&(int)(Math.random()*17121)%15==1)||(sex==2&&(int)(Math.random()*12721)%29==1))){
			
			if(a13.a1.b[gg].k0==fa0||a13.a1.b[gg].k0==ma0)
			{
				sin+=70;
			}
			if(a13.a1.b[gg].k0==wi||(f[0]==gg))
			{
				sin+=70;
			}
			if(tie>0&&(int)(Math.random()*15121)%2==0) return;
			if(r==1)
				killright=3;
			else killleft=3;
			stop=3;
			a13.a1.b[gg].bekill=3;
			a13.a1.b[gg].stop=3;
			
			return;
			}
			
		}
		if(rob>0&&tie<=0&&((sex==1&&(int)(Math.random()*12121)%13==1)||(sex==2&&(int)(Math.random()*1221)%23==1))&&(strong>=a13.a1.b[gg].strong||(int)(Math.random()*1771)%3==1)&&(ff[gh][2]<=15&&a13.a1.b[gg].fa0!=k0&&a13.a1.b[gg].ma0!=k0))
		{
			
			if(r==1)
			killright=3;
			else killleft=3;
			stop=3;
			a13.a1.b[gg].bekill=3;
			a13.a1.b[gg].stop=3;
			sin+=100;
			if(a13.a1.b[gg].age()<13)
				sin+=50;
			hungry-=(90-a13.a1.b[gg].hungry);
			return;
		}
		else if(rob>0&&tie<=0&&(ff[gh][2]<=15&&a13.a1.b[gh].fa0!=k0&&a13.a1.b[gh].ma0!=k0))
		{
			if(sin<50) {
			sin+=5;
			if( a13.a1.b[gg].hungry>60)
				sin+=10;
			}
			hungry-=10;
		    a13.a1.b[gg].hungry+=10;	
		}
		
		//攻擊外族
		if(a13.a1.b[gg].group!=group&&strong>=a13.a1.b[gh].strong&&a13.a1.b[gg].group>=0&&group>=0&&a13.a1.group[a13.a1.b[gg].group].ancientg!=group&&a13.a1.group[group].ancientg!=a13.a1.b[gg].group&&a13.a1.group[group].level==1&&weapon>0&&person%31<17&&a13.a1.b[gg].bekill==0&&(sex==1||(person%31<7)))
		{
			a13.a1.group[group].killnumber++;
			if(r==1)
			killright=3;
			else killleft=3;
			stop=3;
			a13.a1.b[gg].bekill=3;
			a13.a1.b[gg].stop=3;
			
			if(a13.a1.b[gg].age()<13&&sin<70)
			sin+=50;
			else if(sin<50)
				sin+=10;
			return;
		}
		
		if(a13.a1.b[gg].busy>0)
			return;
		
		if(ff[gh][2]>=3&&a13.a1.b[gg].sex!=sex&&a13.a1.year-borntime>13&&a13.a1.year-a13.a1.b[gg].borntime>13)
		{
			//System.out.print("i am"+k+" find "+gg+" we love \n");
			if(a13.a1.b[gg].fa0==fa0||a13.a1.b[gg].ma0==ma0||a13.a1.b[gg].fa0==k0||a13.a1.b[gg].ma0==k0)
			{
				if(sin<10)
				{
					sin+=1;
				}
				
			}
			
			if((age()>60&&sex==2)||(a13.a1.b[gg].age()>60&&a13.a1.b[gg].sex==2))
			{
				if((a13.a1.dayr+k0+a13.a1.b[gg].k0)%13==1)
				{
					if(a13.a1.b[gg].fa0==fa0||a13.a1.b[gg].ma0==ma0)
						ff[gh][2]-=6;
				
					love2=2;ff[gh][2]+=10;thelove=gg;thelove0=a13.a1.b[gg].k0;
				}
			}
			else if((age()>50&&sex==2)||(a13.a1.b[gg].age()>50&&a13.a1.b[gg].sex==2)||(age()>60&&sex==1)||(a13.a1.b[gg].age()>60&&a13.a1.b[gg].sex==1))
			{
				if((a13.a1.dayr+k0+a13.a1.b[gg].k0)%7==1)
				{
					if(a13.a1.b[gg].fa0==fa0||a13.a1.b[gg].ma0==ma0)
						ff[gh][2]-=6;
					love2=2;ff[gh][2]+=10;thelove=gg;thelove0=a13.a1.b[gg].k0;
				}
			}
			else if((a13.a1.dayr+k0+a13.a1.b[gg].k0)%3==1)
			{
				if(a13.a1.b[gg].fa0==fa0||a13.a1.b[gg].ma0==ma0)
					ff[gh][2]-=6;
				love2=2;ff[gh][2]+=10;thelove=gg;thelove0=a13.a1.b[gg].k0;
			}
			if(r==1&&love2==2)
			{
				love2=0;
				love=2;
			}
			
		}
		//meetone(gg);
	}
	void meetone(int gg)//******************** 遇人  *****************
	{
		int gh=-1;
		if(gg==ma&&age()<6&&hungry>-20)
		{
			hungry-=20;
		}
		if(gg==fa&&age()>=3&&age()<=5&&hungry>-20)
			hungry-=20;
		for(int z=0;z<fn;z++)//******************* 檢查是否認識
		{
			if(ff[z][0]==a13.a1.b[gg].k0)
			{
				gh=z;break;
			}
		}
		if(gh>=0&&ff[gh][0]!=a13.a1.b[gg].k0)
			gh=-1;
		if(gh==-1) {
			if(fn>=48)
				return;
			gh=fn;
			f[fn]=gg;ff[fn][0]=a13.a1.b[gg].k0;
			ff[fn][1]=0;ff[fn][2]=1;ff[fn][3]=0;
			fn++;
		}
		else {
			ff[gh][2]++;//  熟悉度增加
		}
		//System.out.print("i am"+k+" find "+gg+" gh="+gh+" 熟悉度="+ff[gh][2]+"\n");
		
	}
	void testborn()
	{
		if(sex==1)
			return;
		
		//System.out.print("i "+name()+" born a kid "+sex+"\n");
		if(a13.a1.allb[thelove0].kidn>=39)
			return;
		if(a13.a1.allb[k0].kidn>=39)
			return;
		if(a13.a1.year-borntime>41)
			return;
		//this.fertility=1;a13.a1.b[thelove].fertility=1;
		if(lastborn!=a13.a1.year&&(int)(Math.random()*12121)%this.fertility==0&&(int)(Math.random()*12121)%a13.a1.b[thelove].fertility==0)
		{
			
		}
		else
			return;
		
		if(a13.a1.year-borntime>=35) {
			if((int)(Math.random()*12121)%4==1) {
				lastborn=a13.a1.year;
				if(hungry<10)
					hungry=10;
				hungry+=10;
				a13.a1.newkid(thelove0,thelove, k0,k);
			}
		}
		else if(a13.a1.year-borntime>=30) {
			if((int)(Math.random()*12121)%2==1) {
				lastborn=a13.a1.year;
				if(hungry<10)
					hungry=10;
				hungry+=10;
				a13.a1.newkid(thelove0,thelove, k0,k);
			}
		}
		else {			
			lastborn=a13.a1.year;
			if(hungry<10)
				hungry=10;
			a13.a1.newkid(thelove0,thelove, k0,k);
		}
	}
	
	void work()
	{
		if(job>0||group<0||a13.a1.group[group].level>1||a13.a1.group[group].leader<0||move==0)
			return;
		if(cn>0||age()<10||age()>=60||sick>0||work>0||transfer>0||pain>0||hero>0)
			return ;
		
		if(a13.a1.group[group].dtime>0)
		{	
			find=0;
			goalx=a13.a1.group[group].dx*7+x;
			goaly=a13.a1.group[group].dy*7+y;
			goalan=3000;
			mainfindfood();
			return;
		}	
		if((int)(Math.random()*12121)%31==7&&weapon==0)
		{
			g=0;
			workx=x;worky=y;
			while(a13.a1.map[workx][worky]>-1||testhight_2(x,y,workx,worky)==-1) {
				workx=x+(int)(Math.random()*121117)%3-1;
				worky=y+(int)(Math.random()*121117)%3-1;
				if((int)(Math.random()*11447)%2==1)
					workx=x;
				else worky=y;
				g++;
				if(g>=7)break;
			}
			if(g>=7)
				return;
			work=231;	a13.a1.map[workx][worky]=231;
		}
		else if((int)(Math.random()*12171)%2==1)
		{
			
			work=1;
			find=201;
			goalx=0;goaly=0;
			goalan=700;
			mainfindfood();
	
		}
		if(a13.a1.group[group].leader==k&&(int)(Math.random()*12171)%2==1)
		{	
			find=0;
			goalx=a13.a1.group[group].placex;
			goaly=a13.a1.group[group].placey;
			goalan=3000;
			mainfindfood();
			return;
		}
		
		
		
	}
	void keepwork()
	{
		if(group<0||a13.a1.group[group].level>1)
			return;
		if(a13.a1.group[group].dtime>0)
			work=0;
		if(Math.abs(workx-x)+Math.abs(worky-y)!=1)
		{
			//if(work==a13.a1.map[workx][worky])a13.a1.map[workx][worky]=-1;
			//work=0;
		}
		if(work==0)
			return;
		if(work==1)
		{
			if(hungry<10&&group>=0&&a13.a1.group[group].leader>=0)
			{
				g2=1;
				for(int i=x-2;i<=x+2;i++)
				{
					for(int j=y-2;j<=y+2;j++)
					{
						g=a13.a1.map[i][j];
						if(g>=1000)
						{
							if(a13.a1.b[g-1000].hungry>=20)
								g2=-1;
						}
					}
				}
				workx=0;worky=0;
				if(g2!=-1&&a13.a1.map[x+1][y]==201) {workx=x+1;worky=y;}
				if(g2!=-1&&a13.a1.map[x-1][y]==201) {workx=x-1;worky=y;}
				if(g2!=-1&&a13.a1.map[x][y+1]==201) {workx=x;worky=y+1;}
				if(g2!=-1&&a13.a1.map[x][y-1]==201) {workx=x;worky=y-1;}
				if(workx>0&&worky>0)
				{
					work=0;
					if(createtransfer(a13.a1.group[group].placex+1,a13.a1.group[group].placey-1,201)==1)
					a13.a1.map[workx][worky]=-1;
					return;
				}	
			}
			else work=0;
		}
		if(work==1&&cn==0)
			work=0;
		if(work==234) {
			work=0;
			a13.a1.map[workx][worky]=-1;
			weapon=1;
		}
		if(work>=231&&work<=233)
		{
			if(a13.a1.map[workx][worky]!=work)
			{
				work=0;return;
			}
			work++;
			a13.a1.map[workx][worky]=work;
		}
		
		
	}
	void subchleader(int h) {
		
		System.out.println(" the one  "+name()+k+" h="+h+" his group="+group+" "+a13.a1.group[h].gk);
		if(group!=h||gsub>0)
			return;
	
		gsub=1;
		a13.n1.ap[a13.n1.an]=k;
		a13.n1.an++;
		if(s>=0&&k!=a13.a1.group[h].leader) {
		if(a13.a1.group[h].sex==1&&age()>=15&&(3-sex)*(wise*4+strong*4+age()/5)+move*3>a13.a1.group[h].gh)
		{
			a13.a1.group[h].gh=(3-sex)*(wise*4+strong*4+age()/5)+move*3;
			a13.a1.group[h].gk=k;
		}
		if(a13.a1.group[h].sex==2&&age()>=15&&sex*(wise*4+strong*2+age()/5)>a13.a1.group[h].gh)
		{
			a13.a1.group[h].gh=sex*(wise*4+strong*2+age()/5);
			a13.a1.group[h].gk=k;
		}
		}
		for(int i=x-8;i<=x+8;i++)
		{
			for(int j=y-8;j<=y+8;j++)
			{
				if(a13.a1.map[i][j]>=1000) {
					g=a13.a1.map[i][j]-1000;
				a13.a1.b[g]. subchleader(h);
				}
			}
		}
		
	}
	void setgoplace(int gx,int gy,int t)
	{
		finalgoalx=gx;
		finalgoaly=gy;
		finaltime=t;
	}
	void goplace()
	{
		int gx=finalgoalx;
		int gy=finalgoaly;
		if(finaltime>0)
			finaltime--;
		int xx,yy;
		g=Math.abs(gx-x);
		if(g<Math.abs(gy-y))g=Math.abs(gy-y);
		if(g<17)
		{
			goalx=gx;
			goaly=gy;	
			goalan=3500;
			finaltime=0;	
			find=0;
			mainfindfood();
			System.out.print("!!  gx="+goalx+" gy="+goaly+" cn="+cn+"\n");
		}
		else {
			if(x<gx)xx=1;
			else xx=-1;
			if(y<gy)yy=1;
			else yy=-1;
			goalan=2000;
			goalx=x+xx*6+xx*((int)(Math.random()*12121)%6);
			goaly=y+yy*6+yy*((int)(Math.random()*12121)%6);
			find=0;
			mainfindfood();
			System.out.print("gx="+goalx+" gy="+goaly+" cn="+cn+"\n");
		}
	
	}
	
	int createtransfer(int gx,int gy,int thing)
	{
		
		if(sick>0||cn>0||age()<9||hungry>=40||pain>0||transfer>0||work>0||hero>0)
			return -1;
		
		goalx=gx;goaly=gy;
		if(Math.abs((gx-x))+Math.abs((gy-y))>15)
		{
			g=(int)(Math.random()*12121)%12+1;
			if(gx>x)
			goalx=x+g;
			else goalx=x-g;
			if((goalx>x&&goalx>gx)||(goalx<x&&goalx<gx))goalx=gx;
			g=15-g;
			if(gy>y)
				goaly=y+g;
			else goaly=y-g;
			if((goaly>y&&goaly>gy)||(goaly<y&&goaly<gy))goaly=gy;
			
		}
		goalan=1500;
		transfer=15;
		transferthing=thing;
		
		mainfindfood();
		return 1;
		
	}
	
	int chosetransfor(int gx,int gy)
	{
		int xx,yy;
		if(x<gx)xx=1;
		else xx=-1;
		if(y<gy)yy=1;
		else yy=-1;
		
		find=0;int h=2;
		
		for(int i=x;i!=gx;i+=xx)
		{
			for(int j=y;j!=gy;j+=yy)
			{
				g=Math.abs((i-x))+Math.abs((j-y));
				if(a13.a1.map[i][j]>=1000&&g>h&&g<=17)
				{
					find=a13.a1.map[i][j];
					h=g;
				}
			}			
		}
		return find;
		
	}
	
	
	void die()
	{
		
		
		a13.a1.die++;
		if(group>=0&&a13.a1.group[group].leader==k)
			a13.a1.group[group].changeleader();
		if(group>=0) {
			a13.a1.group[group].gnumber--;
			if(home>0)
			{
				for(int i=0;i<a13.a1.f[home].member0;i++) {
				
					if(a13.a1.f[home].member[i]==k) {
						a13.a1.f[home].member[i]=a13.a1.f[home].member[a13.a1.f[home].member0-1];
						a13.a1.f[home].member0--;
					}
					
				}
				if(a13.a1.f[home].host==k) {
					a13.a1.f[home].hostdie();
				}
			}
		}
		
		for(int i=x-8;i<x+8;i++)
		{
			for(int j=y-8;j<y+8;j++)
			{
				if(a13.a1.map[i][j]>=1000)
				{
					g=a13.a1.map[i][j]-1000;
					if(a13.a1.b[g].age()<3)
						continue;
						
					if(a13.a1.b[g].fa0==k0||a13.a1.b[g].ma0==k0)
						a13.a1.b[g].sad+=4;
					if(a13.a1.b[g].k0==fa0||a13.a1.b[g].k0==ma0)
						a13.a1.b[g].sad+=3;
					for(int z=0;z<a13.a1.b[g].fn;z++)
					{
						if(a13.a1.b[g].f[z]==k&&a13.a1.b[g].ff[z][0]==k0)
						{
							if(a13.a1.b[g].ff[z][2]>10)
							{
								a13.a1.b[g].sad+=a13.a1.b[g].ff[z][2]/10;
							}		
						}
					}
					
				}
	
			}
		}
	
	//	System.out.print("b "+k+"  "+k0+" "+s+"\n");
		hero=0;
		if(godie1>0)
			a13.a1.map[x][y]=153;//1000000000+k0;
		else if(tie>0)
			a13.a1.map[x][y]=152;//1000000000+k0;
		else
		a13.a1.map[x][y]=151;//1000000000+k0;
		
		if(tie>0) {
			a13.a1.allb[k0].diereason+=" 處決";
		}
		
		a13.a1.map2[x][y]=k0+1000;
		a13.a1.allb[k0].s=-1;
		a13.a1.allb[k0].sex=sex;
		a13.a1.allb[k0].age=a13.a1.year-borntime;
		a13.a1.allb[k0].sin=sin;
		System.out.print("dy"+" \n");	
		s=-1;
	}
	
	

	
	
	void subcreategroup(int h,int l,int hh) {//族群眾人傳播該族群標籤
		System.out.println("sub recount "+k+" "+l);
	//	System.out.println("sub recount "+k0+" "+name);
		if(gsub==1||l>20)
			return;
		gsub=1;
		a13.n1.ap[a13.a1.an]=k;a13.a1.an++;
		
		if(group>=0&&group==hh&&group!=h&&a13.a1.group[h].gnumber<a13.a1.group[hh].gnumber/2-50) {
			
			
			if(a13.a1.group[group].leader==k){
				a13.a1.group[group].changeleader();
			}
			a13.a1.group[group].gnumber--;
			group=h;
			a13.a1.group[group].gnumber++;
			move=80;	
			//return;
		}
		else if(hh>-1)
			return;
	

		if(group>=0&&group!=h&&move==0&&age()<30&&hh==-1) {
			g=-1;
			for(int i=0;i<grn;i++)
			{
				if(gr[i]==h)
					g=i;
			}
			if(g==-1) {g=grn;gr2[g]=0;grn++;}
			gr2[g]++;
			gr[g]=h;
			
			if(gr2[g]>=3){
				if(a13.a1.group[group].leader==k){
					a13.a1.group[group].changeleader();
				}
				a13.a1.group[group].gnumber--;
				group=gr[g];
				a13.a1.allb[k0].group=gr[g];
				a13.a1.group[group].gnumber++;
				gr[g]=h;
				gr2[g]=3;
				move=60;
			}
			if(grn>=4){
				g=0;
				for(int i=0;i<grn;i++){
					if(gr2[i]<gr2[g])
						g=i;
				}
				gr[g]=gr[grn-1];
				gr2[g]=gr2[grn-1];
				grn--;	
			}					
			return;
		}
			
		for(int i=0;i<grn;i++)
		{
			if(gr2[i]>0)
			gr2[i]=0;			
		}
		
		if(group==-1) {
			if(age()<13&&fa>0&&((a13.a1.allb[fa0].group==h)||(a13.a1.allb[ma0].group==h)||(a13.a1.allb[ma0].s<0&&a13.a1.allb[fa0].s<0)||(a13.a1.allb[fa0].group==-1&&a13.a1.allb[ma0].group==-1)))
			{
				group=h;
				a13.a1.allb[k0].group=h;
				a13.a1.group[h].gnumber++;
			}
			if(age()>=13){
				group=h;
				a13.a1.allb[k0].group=h;
				a13.a1.group[h].gnumber++;
			}
			if(a13.a1.group[h].leader!=k)
			return;
		}
		
		move=60;
		for(int i=x-7;i<=x+7;i++)
		{
			for(int j=y-7;j<=y+7;j++)
			{
				if(a13.a1.map[i][j]>1000) {
					g=a13.a1.map[i][j]-1000;
				a13.a1.b[g].subcreategroup(h,l+1,hh);
				}
			}
		}
		int gx=(int)(Math.random()*12121)%3-1;
		int gy=(int)(Math.random()*12121)%3-1;
		a13.a1.group[group].fg++;
		if(a13.a1.group[group].fg>=7&&a13.a1.map[x+gx][y+gy]==-1&&a13.a1.mapall[x+gx][y+gy]<40&&(int)(Math.random()*77777)%31<7)
		{
			a13.a1.group[group].addflag(x+gx,y+gy);
		}
	}
	
	int gsub=0;
	
	void create() //  特殊事件發生
	{
		//30人*50年*30次/10=1500*3=4500
		look();
		if(age()>13&&adult==0) {
			adult=1;
			a13.a1.wise[a13.a1.year/100][wise]++;
			a13.a1.strong[a13.a1.year/100][strong]++;
		}
		if(cn>0||sick>0||swim!=0||work>0||age()<15)
			return;
		
		
		
		
		if(group>0&&a13.a1.group[group].level>1) {
			
			
			if(a13.a1.group[group].level==2&&home==-1&&age()<35)
			{
				
				
			}
			
			return;
		}
		if(group>=0&&a13.a1.group[group].leader>-1&&a13.a1.group[group].gnumber>500&&(int)(Math.random()*12121)%371<=1&&wise>=104&&person%17>7) {// 分裂族群
			if(sex!=a13.a1.group[group].sex)
				return;
			if(x<a13.a1.group[group].x+20&&x>a13.a1.group[group].x-20&&y<a13.a1.group[group].y+20&&y>a13.a1.group[group].y-20)
			return;
			
			int gg=0;
			for(int i=x-15;i<=x+15;i++)
			{
				for(int j=y-15;j<=y+15;j++)
				{
					if(a13.a1.map[i][j]>=1000) {
						g=a13.a1.map[i][j]-1000;
						if(a13.a1.b[g].group==group||a13.a1.b[g].group==-1)
							gg++;
					}
				}
			}
			if(gg>=20)
			{
				System.out.println(" recreate  "+name);
				int gh=group;
				a13.a1.group[a13.a1.groupn]=new Group(k,a13.a1.groupn,sex);
				a13.a1.group[a13.a1.groupn].gnumber=0;	
				a13.a1.group[a13.a1.groupn].ancientg=gh;	
				a13.a1.newevent(a13.a1.year,""+a13.a1.group[a13.a1.groupn].name+"部落從"+a13.a1.group[gh].name+"分裂獨立，"+name()+" 為其首任領導者");
				
				a13.a1.an=0;
				subcreategroup(a13.a1.groupn,0,gh);
				for(int i=x-15;i<=x+15;i++)
				{
					for(int j=y-15;j<=y+15;j++)
					{
						if(a13.a1.map[i][j]>=1000) {
							g=a13.a1.map[i][j]-1000;
							if(a13.a1.b[g].group==gh||a13.a1.b[g].group==-1)
							subcreategroup(a13.a1.groupn,0,gh);
							
							//a13.a1.b[g].group=a13.a1.groupn;
						}
					}
				}
				a13.a1.groupn++;
				for(int i=0;i<a13.a1.an;i++)
					a13.a1.b[a13.n1.ap[i]].gsub=0;
				
				return;
				
			}
			
		}
		
		
		if(group>=0&&a13.a1.group[group].leader==-1&&wise>=103&&person%17>7) {// 復族
			if(sex!=a13.a1.group[group].sex)
				return;
			int gg=0;
			for(int i=x-10;i<=x+10;i++)
			{
				for(int j=y-10;j<=y+10;j++)
				{
					if(a13.a1.map[i][j]>=1000) {
						g=a13.a1.map[i][j]-1000;
						if(a13.a1.b[g].group==group)
							gg++;
					}
				}
			}
			if(gg>=10)
			{
				System.out.println(" recreate  "+name);
				a13.a1.group[group].leader=k;
				a13.a1.group[group].leader0[a13.a1.group[group].leadern]=k0;
				a13.a1.group[group].leadstarttime[a13.a1.group[group].leadern]=age();
				a13.a1.group[group].leadern++;
				a13.a1.newevent(a13.a1.year,""+a13.a1.group[group].name+"部落推舉"+name()+" 為領導者");
				
			}
		}
		
		if(wise>=103&&group==-1&&person%17>4&&person%23>4&&age()>=30) {// 創建族群
			
			
			if((int)(Math.random()*12121)%13==1) {
				int gg=0;
				for(int i=x-17;i<=x+17;i++)
				{
					for(int j=y-17;j<=y+17;j++)
					{
						if(a13.a1.map[i][j]>=1000) {
							g=a13.a1.map[i][j]-1000;
							if(a13.a1.b[g].group==group)
								gg++;
							else if(a13.a1.b[g].group>=0)
								gg-=2;
						}
					}
				}
				if(gg>=17)
				creategroup();
			}
		}
		if(wise>=103&&person%3==2&&group>=0&&a13.a1.group[group].gnumber>=100&&age()>=25&&hero==0&&a13.a1.group[group].leader!=k) {// 脫離族群
			
			
			if((int)(Math.random()*12121)%67==1) {
				int gg=0;
				for(int i=x-8;i<=x+8;i++)
				{
					for(int j=y-8;j<=y+8;j++)
					{
						if(a13.a1.map[i][j]>=1000) {
						g=a13.a1.map[i][j]-1000;
						if(a13.a1.b[g].s>0&&a13.a1.b[g].age()>12&&a13.a1.b[g].age()<45) {
							
							if(a13.a1.b[g].group==group)
								gg++;
						}
						}
					}
				}
				if(gg>=7&&gg<25)
				{
					for(int i=x-10;i<=x+10;i++)
					{
						for(int j=y-10;j<=y+10;j++)
						{
							if(a13.a1.map[i][j]>=1000) {
								g=a13.a1.map[i][j]-1000;
								if(a13.a1.b[g].s>0&&a13.a1.b[g].group==group&&a13.a1.b[g].age()>12&&a13.a1.b[g].age()<45) {
									a13.a1.b[g].hero=k;
									a13.a1.b[g].move=0;
								}
								
							}
						}
					}
					a13.a1.newevent(name()+"帶"+gg+"人脫離"+a13.a1.group[group].name+"部落");
					hero=k;
					move=-240;
					goalx=(-(a13.a1.group[group].placex-x)%19)+x;
					goaly=(-(a13.a1.group[group].placey-y)%19)+y;
					find=0;
					goalan=3700;
					mainfindfood();
					if(a13.a1.ln<7&&a13.a1.b[k].light<1) {
						a13.a1.lightkid[a13.a1.ln]=k;
						a13.a1.lightkid0[a13.a1.ln]=k0;
						a13.a1.ln++;
						a13.a1.b[k].light=1;
					}
					
				}
		
			}
		}
		
		
		
	}
	void creategroup() {// 創建族群
		
		
		a13.a1.group[a13.a1.groupn]=new Group(k,a13.a1.groupn,sex);
		
		a13.a1.group[a13.a1.groupn].gnumber=0;
		a13.a1.an=0;
		subcreategroup(a13.a1.groupn,0,-1);
		for(int i=0;i<a13.a1.an;i++)
			a13.a1.b[a13.n1.ap[i]].gsub=0;
		
		a13.a1.groupn++;
	}
	
	
	void groupmove()
	{
		if(group>=0&&a13.a1.group[group].dtime>1){
			//System.out.print("find love one gh="+g+"i am "+k+" he is"+f[g]+" \n");
			goalx=a13.a1.group[group].dx*2+x;
			goaly=a13.a1.group[group].dy*2+y;
			find=0;
			goalan=1000;
			mainfindfood();
			return;
		}
		
	}
	void look() {
		if(a13.a1.year-borntime==0)
			mapa=1000;
			else if(sex==1&&a13.a1.year-borntime>=60)
				mapa=107;
			else  if(sex==2&&a13.a1.year-borntime>=60)
				mapa=108;
			else if(sex==1&&a13.a1.year-borntime>=48)
				mapa=105;
			else  if(sex==2&&a13.a1.year-borntime>=48)
				mapa=106;
			else if(sex==1&&a13.a1.year-borntime>=20)
				mapa=101;
			else  if(sex==2&&a13.a1.year-borntime>=20)
				mapa=102;
			else if(sex==1&&a13.a1.year-borntime>11)
				mapa=1010;
			else  if(sex==2&&a13.a1.year-borntime>11)
				mapa=1020;
			else if(sex==1)
				mapa=103;
			else if(sex==2)
				mapa=104;
	}
	
	void r()
	{
		gsub=0;
		if(k==0) {
			a13.a1.allb[k0].diereason+=" 暴斃";
			die();return;
		}
	
		
		//System.out.print("b "+k+" "+name()+" "+work+" "+transfer+"\n");
		
		
		
		if(move>0)move--;
		
		
		hungry++;
		if(serioussick==1&&(int)(Math.random()*19991)%3!=1)
		{
			a13.a1.allb[k0].diereason="病故";
			die();
			return;
		}
			
		if(serioussick>0)
		serioussick--;
		
		int g=a13.a1.map[x][y];
		
		if(pain>0)
			pain--;
		if(sad>0)
			sad--;
		if(rob>0)
			rob--;
		
			
		if(sick>=1) {
			sick--;
			if(a13.a1.year-borntime==0)
			{
				if(((int)(Math.random()*19991)+a13.a1.dayr*k)%7==1)//7*1
					serioussick=3;
			}
			else if(a13.a1.year-borntime<6)
			{
				if(((int)(Math.random()*19991)+a13.a1.dayr*k)%16==1)//7*6
					serioussick=4;			
			}
			else if(a13.a1.year-borntime>=70)
			{
				if(((int)(Math.random()*19991)+a13.a1.dayr*k)%2==1)//7*6
					serioussick=3;
			}
			else if(a13.a1.year-borntime>=65)
			{
				if(((int)(Math.random()*19991)+a13.a1.dayr*k)%4==1)//7*6
					serioussick=4;
			}
			else if(a13.a1.year-borntime>=60)
			{
				if(((int)(Math.random()*19991)+a13.a1.dayr*k)%5==1)//7*6
					serioussick=4;
			}
			else if(a13.a1.year-borntime>=55)
			{
				if(((int)(Math.random()*19991)+a13.a1.dayr*k)%7==1)//7*6
					serioussick=4;
				
			}
			else if(a13.a1.year-borntime>=50)
			{
				if(((int)(Math.random()*19991)+a13.a1.dayr*k)%11==7)//7*6
					serioussick=4;	
			}	
			else 
			{
				if(((int)(Math.random()*19991)+a13.a1.dayr*k)%27==7)//7*8
					serioussick=4;
			}
		}
		
			
		if(((int)(Math.random()*17777)+a13.a1.dayr+k0)%121==7||(age()>65&&(int)(Math.random()*17777)%61==7))//    1/(1/123*1/51*7*2/3)/30
		{
			sick+=(int)(Math.random()*17777)%3+2;			
		}
			px=x;
			py=y;
	//	System.out.print("hungry="+hungry+" \n");
		
		
		
		if(hungry>=90)
		{
			if((int)(Math.random()*17771)%19==1) {
				a13.a1.allb[k0].diereason="餓死";
				a13.a1.starvedie++;
				die()	;
				return;
			}
			if(hungry>=120)
			{
				
				a13.a1.allb[k0].diereason="餓死";
				a13.a1.starvedie++;
				die()	;
				return;
			}
		}
		if(stop>0)
		{
			stop--;
			if(killright>0)
				killright--;
			if(killleft>0)
				killleft--;
			if(bekill==1)
			{
				
				a13.a1.allb[k0].diereason="被殺";
				die();
				return;
			}
			if(bekill>0)
				bekill--;
			
			return;
		}
		if(hungry>=75||godie1>0)
		{
			if(sad==0&&((int)(Math.random()*12121)%34>(person%17+12)+sex*4)&&(int)(Math.random()*1212)%2==1) {
				sad+=3;
			}
			else
			state=2;
		}
		else {
			state=0;
		}
		
		int gg;
		if(love>0) {
			love--;testborn();
			return;
		}
		if(love2>0) {
			love2--;testborn();
			return;
		}
		
		if(tie>0)
		{
			if(godie1>1)
				godie1--;
			if(godie1==1)
			{
				a13.a1.allb[k0].diereason="絞刑";
				die();
				return;
			}
			if(a13.a1.map[x][y-1]==1000+k||(a13.a1.map[x][y-1]>=304&&a13.a1.map[x][y-1]<=308))
				a13.a1.map[x][y-1]=-1;
			
			a13.a1.map[x][y]=1000+k;
			if(tie<100)tie--;
			if(tie<=0)
			{
				//a13.a1.map[x][y]=304;
				tie=0;
				y=y+1;
				x=x+1;
				
			}
			
			if(((int)(Math.random()*12121)%34>(person%17+12)+sex*4)&&(int)(Math.random()*1212)%3==1)
				sad+=2;
			
			return;
		}
		
		if(a13.a1.map[x][y+1]>=304&&a13.a1.map[x][y+1]<=309&&(a13.a1.map[x][y+1]!=305&&a13.a1.map[x][y+1]!=306))
		{
			
			
			cn=0;
			if(a13.a1.map[x][y+1]==309)
			{
				tie=1000;
				godie1=5+(int)(Math.random()*12121)%2;
			}
			else if(a13.a1.map[x][y+1]==304)
			tie=30;
			else if(a13.a1.map[x][y+1]==307)
				tie=60;
			else
				tie=1000;
			a13.a1.map[x][y+1]=-1;
			y=y+1;
			
			return;
		}
		else if(a13.a1.map[x-1][y]>=1000)
		{
			gg=a13.a1.map[x-1][y]-1000;
			
			//if(job==0)
			meetone2(gg,-1);
			if(a13.a1.map[x+1][y]>=1000)
			{
				gg=a13.a1.map[x+1][y]-1000;
				meetone(gg);		
			}
		}else if(a13.a1.map[x+1][y]>=1000)
		{
			gg=a13.a1.map[x+1][y]-1000;
			meetone2(gg,1);		
		}
		if(a13.a1.map[x][y+1]>=1000)
		{
			gg=a13.a1.map[x][y+1]-1000;
			meetone(gg);	
		}
		if(a13.a1.map[x][y-1]>=1000)
		{
			gg=a13.a1.map[x][y-1]-1000;
			meetone(gg);
			
		}
		
		
		if(a13.a1.mapall[x][y]/10==4) {
			//	System.out.print("b "+k+"swim "+swim+" "+x+" "+y+"   "+a13.a1.mapall[x][y]+"\n");
				if(swim<0)
				{
					if(swim==-1)
					{
						a13.a1.allb[k0].diereason="drown";
						die();
						return;
					}
					swim++;
				}
				else {			
					swim=1;
					gg=(int)(Math.random()*12121)%60-20;
					if(strong+gg<72)
						swim=-2;
					else if(strong+gg<82)
						swim=-3;
					else if(strong+gg<90)
						swim=-4;
					else if(strong+gg<100)
						swim=-5;
				//	System.out.print("b "+k+"swim "+swim+"  strong+gg="+strong+gg+"   "+a13.a1.mapall[x][y]+"\n");
				}
			}
			else swim=0;
		
		
		if(job==1000)
		{
			
		}
		else {
		
		
		if(state==1)
		{
			eat();	
			return;
		}
		
		
		if(age()>13&&sick<=0&&((sex==1&&(int)(Math.random()*12121)%7==2)||(sex==2&&(int)(Math.random()*12121)%13==2)))					
		{
			
			
			if(hungry>80)
				rob+=(hungry-80)+10;
			if(hungry>50&&person%31<17)
				rob+=(hungry-60)+15;
			if(hungry>15&&person%31<4)
				rob+=(hungry-30)+20;
			if(person%31==0)
				rob+=15+(int)(Math.random()*12121)%15;
			
			if(sin<20&&rob>0) {
				sin+=5;
			}
			
		}
		
		if(cn==0) {
			goalx=-1;goaly=-1;
		}

		if((int)(Math.random()*12121)%19==1)
			create() ;
		
		
		//******************************************************************
		if(transfer>0) {
			
		if(transfer>1) 
			transfer--;
		if(transfer>0&&transfer<=14)
		{
			if(a13.a1.map[x+1][y]>=1000&&a13.a1.b[a13.a1.map[x+1][y]-1000].group==group&&a13.a1.b[a13.a1.map[x+1][y]-1000].createtransfer(goalx,goaly,transferthing)>0)
			{	transfer=0;cn=0;transferthing=0;}
			else if(a13.a1.map[x-1][y]>=1000&&a13.a1.b[a13.a1.map[x-1][y]-1000].group==group&&a13.a1.b[a13.a1.map[x-1][y]-1000].createtransfer(goalx,goaly,transferthing)>0)
			{	transfer=0;cn=0;transferthing=0;}
			else if(a13.a1.map[x][y+1]>=1000&&a13.a1.b[a13.a1.map[x][y+1]-1000].group==group&&a13.a1.b[a13.a1.map[x][y+1]-1000].createtransfer(goalx,goaly,transferthing)>0)
			{	transfer=0;cn=0;transferthing=0;}
			else if(a13.a1.map[x][y-1]>=1000&&a13.a1.b[a13.a1.map[x][y-1]-1000].group==group&&a13.a1.b[a13.a1.map[x][y-1]-1000].createtransfer(goalx,goaly,transferthing)>0)
			{	transfer=0;cn=0;transferthing=0;}
		}
		if(transfer>0&&Math.abs(goalx-x)+Math.abs(goaly-y)<=1)
		{
			transfer=0;cn=0;transferthing=0;
			
			a13.a1.map[goalx][goaly]=transferthing;
			if(transferthing>1000)
			{
				if(a13.a1.b[transferthing-1000].age()<10) {
				a13.a1.b[transferthing-1000].tie=a13.a1.b[transferthing-1000].sin+20;
				a13.a1.b[transferthing-1000].stop=0;
				}
				else {
					a13.a1.map[x][y-1]=151;
					a13.a1.map2[x][y-1]=transferthing;
				}
			}
			
		}
		if(transfer==1||(transfer>0&&cn==0))
		{
			
			if(a13.a1.map[x+1][y]==-1&&this.testhight_2(x, y, x+1, y)==1)
				a13.a1.map[x+1][y]=transferthing;
			else if(a13.a1.map[x-1][y]==-1&&this.testhight_2(x, y, x-1, y)==1)
				a13.a1.map[x-1][y]=transferthing;
			else if(a13.a1.map[x][y+1]==-1&&this.testhight_2(x, y, x, y+1)==1)
				a13.a1.map[x][y-1]=transferthing;
			else if(a13.a1.map[x][y-1]==-1&&this.testhight_2(x, y, x, y-1)==1)
				a13.a1.map[x][y-1]=transferthing;
			if(transferthing>1000)
			{
				if(a13.a1.b[transferthing-1000].age()<10) {
				a13.a1.b[transferthing-1000].tie=a13.a1.b[transferthing-1000].sin+20;
				a13.a1.b[transferthing-1000].stop=0;
				}
				else {
					a13.a1.map[x][y-1]=151;
					a13.a1.map2[x][y-1]=transferthing;
				}
			}
			
			transfer=0;transferthing=0;cn=0;
		}
		
		}
		
		if(work>0) {
			if(group<0||(a13.a1.group[group].level==2&&job==0))
				work=0;
			else if(a13.a1.group[group].level==1&&job==0&&cn==0)
			{
				keepwork();
				return;
			}
		}
		
		if(hungry>=0) {
			
			if((a13.a1.map[x+1][y]==201||a13.a1.map[x+1][y]==211)&&testhight_2(x,y,x+1,y)>0)
			{
				find=0;ex=x+1;ey=y;eat();cn=0;hungry-=60;cdelay=0;return;
			}
			else if((a13.a1.map[x-1][y]==201||a13.a1.map[x-1][y]==211)&&testhight_2(x,y,x-1,y)>0)
			{
				find=0;ex=x-1;ey=y;eat();cn=0;hungry-=60;cdelay=0;return;
			}
			else if((a13.a1.map[x][y+1]==201||a13.a1.map[x][y+1]==211)&&testhight_2(x,y,x,y+1)>0)
			{
				find=0;ex=x;ey=y+1;eat();cn=0;hungry-=60;cdelay=0;return;
			}
			else if((a13.a1.map[x][y-1]==201||a13.a1.map[x][y-1]==211)&&testhight_2(x,y,x,y-1)>0)
			{
				find=0;ex=x;ey=y-1;eat();cn=0;hungry-=60;cdelay=0;return;
			}
		
		}
		
		if(sick>0&&(int)(Math.random()*17721)%2==1)return;
		
		
		if(cn==0) {
			if(hungry>0&&busy==0)
			{
				if(a13.a1.year-borntime>12&&a13.a1.year-borntime<=50) {
					if((int)(Math.random()*12741)%2==1) {
						find=201;goalx=-1;goaly=-1;
						goalan=400;
						mainfindfood();
					}
				}
				else if(a13.a1.year-borntime>=6&&a13.a1.year-borntime<=65) {
					if((int)(Math.random()*12741)%4==1) {
						find=201;goalx=-1;goaly=-1;
						goalan=250;
						mainfindfood();
					}
				}
				else if(a13.a1.year-borntime>=3&&a13.a1.year-borntime<=75) {
					if((int)(Math.random()*12741)%7==1) {
						find=201;goalx=-1;goaly=-1;
						goalan=100;
						mainfindfood();
					}
				}
				else {
					if((int)(Math.random()*12741)%15==1) {
						find=201;goalx=-1;goaly=-1;
						goalan=100;
						mainfindfood();
					}
				}	
				
				
			}
		
			if(swim!=0)
			{
				find=2;
				goalan=2000;
				mainfindfood();
				//System.out.print("go to land cn="+cn+" x="+cx[cn]+" y="+cy[cn]+" cdelay="+cdelay+" \n");
			}
		
			if(finaltime>0)
			{
				goplace();
			}
		
		}
		if(cn==0) {
			if(home>=0&&job==1)//************************************** farmer
			{
				
					a13.a1.f[home].r(k);
				
			}
			
			else if((int)(Math.random()*12121)%4==1)
			{
				boring();
			}
			else if(move>0&&(int)(Math.random()*12121)%3==1)
			{
				groupmove();
			}
			else if((int)(Math.random()*12121)%6==1)
			{
				work();
				return;
			}
			else {
			
				if((int)(Math.random()*52121)%9==1)
				{
					if(a13.a1.map[x+1][y]==-1)
					x++;
				}
				else if((int)(Math.random()*52121)%8==1) {
					if(a13.a1.map[x-1][y]==-1)
						x--;
					}
				else if((int)(Math.random()*72121)%7==1)
				{
					if(a13.a1.map[x][y+1]==-1)
						y++;
				}
				else if((int)(Math.random()*72121)%6==1) {
					
					if(a13.a1.map[x][y-1]==-1)
						y--;
				}
			}	
		}
		else if(cn>0)
		{
		//	System.out.print("go to food cn="+cn+" x="+cx[cn]+" y="+cy[cn]+" cdelay="+cdelay+" \n");
			
			
			if(testhight(x,y,cx[cn],cy[cn])==-1) {
				cdelay++;
			}
			else if(x+1==cx[cn]&&y==cy[cn])
			{
				if(a13.a1.map[x+1][y]!=-1)
				{
					cdelay++;
				}else {
					x++;cn--;
				}
			}
			else if(x-1==cx[cn]&&y==cy[cn])
			{
				
					x--;cn--;
				
			}
			else if(x==cx[cn]&&y+1==cy[cn])
			{
				
					y++;cn--;
				
			}
			else if(x==cx[cn]&&y-1==cy[cn])
			{
					y--;cn--;				
			}
			else {
				cdelay++;
				//cn=0;
			//	System.out.print("go to food error"+" x"+x+" y="+y+" cdelay="+cdelay+" \n");
			}
	
			if(cdelay>=3)
			{
				cn=0;
			}	
		}
		
		
		
		if(busy==0&&testhight(px,py,x,y)==-1)
		{
			x=px;y=py;
		}
		if(a13.a1.maphost[x][y]>0&&a13.a1.maphost[x][y]!=home&&a13.a1.maphost[x][y]!=home2)
		{
			if(a13.a1.maphost[px][py]<=0) {
			x=px;y=py;}
		}
		
		}
		a13.a1.map[px][py]=-1;
		if(x<10)x=10;
		if(y<10)y=10;
		if(x>4990)x=4990;
		if(y>4990)y=4990;
		
		if(cn==0) {
			goalx=-1;goaly=-1;
		}
		
		
		
		a13.a1.map[x][y]=1000+k;
	//	System.out.print("b newday "+x+" "+y+"   "+a13.a1.map[x][y]+"\n");
		
	}
	void reB(int b0,int b1,int b2,String bb)
	{
		name=bb;
		s=b0;
	//	b[1]=b1;
	//	b[2]=b2;
	}
	String midname=" ";
	String setmidname()
	{
		if(fa0<0)
			midname0=name0;
		else if(sex==1&&name0==a13.a1.allb[fa0].name0)
			midname0=a13.a1.allb[fa0].midname0;
		else if(sex==2&&name0==a13.a1.allb[ma0].name0)
			midname0=a13.a1.allb[ma0].midname0;
		else if(sex==1)
			midname0=a13.a1.allb[fa0].name0;
		else
			midname0=a13.a1.allb[ma0].name0;
		
		if(fa0==-1)
			return " ";
		else if(sex==1&&name0==a13.a1.allb[fa0].name0)
			return ""+a13.a1.allb[fa0].midname;
		else if(sex==2&&name0==a13.a1.allb[ma0].name0)
			return  ""+a13.a1.allb[ma0].midname;
		else if(sex==1)
			return " "+a13.a1.allb[fa0].name;
		else
			return " "+a13.a1.allb[ma0].name;
		
	}
	String midname(){
		
		return midname;
		
	}
	
	
	int  countf()// ************    依認識者熟系度重新替陣列排序  ***********************************
	{
		int gh=0;int nn=0;
		if(fn>=44)
		{
			for(int x=0;x<5;x++) {
				g=4;
				for(int z=4;z<fn-6;z++)
				{
					if(ff[z][2]<ff[g][2])
					{
						g=z;
					}
				}
				f[g]=f[fn-1];
				for(int i=0;i<=4;i++)
				{
					ff[g][i]=ff[fn-1][i];
				}
				fn--;
			}
		}
		
		for(int x=0;x<30;x++) {
			 gh=-1;
			 if(x>=fn-1)
				 break;
			 
			 for(int z=x;z<fn;z++)
			 {			
				if(gh==-1||ff[z][2]>ff[gh][2])
					gh=z; 
			 }
			 if(gh==-1)
				 break;
			
			 
				 
			 f[fn]=f[x];
			 f[x]=f[gh];
			 f[gh]=f[fn];
			 for(int i=0;i<5;i++)
			 {
				 ff[fn][i]=ff[x][i];
				 ff[x][i]=ff[gh][i];
				 ff[gh][i]=ff[fn][i];
			 }
			 nn++;
		
		}
		
		
		return nn;
	}
	
	
	void findone(int h,int d)
	{
		find=h;
		goalan=d;
		mainfindfood();
		return;
		
	}
	
	String name()
	{
		return a13.a1.allb[k0].name();
	}
	String thename()
	{
		return a13.a1.allb[k0].thename();
	}
	void showfbl() {//**********************    顯示朋友親屬資料 (於右方介面全)  依熟系度排序***************
		
		
		a13.cleanallb();
		countf();	
		int love=findlove();
		String yy="";int gh=0,kk;
		
		//a13.setbl(8,720,100,400,30,1,a13.a1.allb[k0].name()+"( "+a13.a1.allb[k0].allname2()+" )"+"   Age:"+(a13.a1.year-this.borntime)+"");
		a13.setbl(8,720,100,400,30,1,a13.a1.allb[k0].name()+"   Age:"+(a13.a1.year-this.borntime)+"");
			
		
		a13.setbl(7,720,150,400,30,1,"IQ:"+wise+" Strength:"+strong+"   k="+k+" k0="+k0);//+" job="+job+" k:"+k+" cn:"+cn+" home:"+home
		if(home>0)
		a13.setbl(6,720,180,400,30,1,"住處:"+a13.a1.b[a13.a1.f[home].host].name()+"' home");
		
		
		for(int x=0;x<9;x++) {
			 gh=x;
			 if(x>=fn)
				 break;
			 
			 kk=ff[x][0];
			 if(a13.a1.b[f[x]].s<0||a13.a1.b[f[x]].k0!=ff[x][0]) {
				 yy="died";
				 	 
				 	 
			 }
			 else { yy="";
			 a13.a1.allb[kk].age=(a13.a1.year-a13.a1.b[f[gh]].borntime);
			 if(love==x)yy="lover";
			 };
			 String y0[]= {"","grandson","granddaughter","grandson","granddaughter"};
			 String y2="";String y[]= {"sibling","uncle","aunt","uncle","aunt","nephew","niece","nephew","niece","grandson","granddaughter","grandson","granddaughter","cousin","cousin","cousin","cousin"};
			 y2=a13.a1.allb[k0].flname(kk);
			
			a13.setbl(31+x,720,230+x*30,400,30,1,a13.a1.allb[kk].name+a13.a1.allb[kk].midname+" "+a13.a1.allb[kk].generation+"th   "+y2+" "+yy+" Age:"+a13.a1.allb[kk].age+"  relation:"+ff[gh][2]);
		}
		a13.setbl(9,720,510,300,30,1,"E:return");
	
		
	}
	int  findfield(int pl)
	{
		if(age()<15||age()>=50||sex==2||sick>0||hungry>=5)
			return -1;
		if(home>0&&a13.a1.f[home].host0==k0) {
			return -1;
		}
		
		int x2=7+(int)(Math.random()*12121)%2;int y2=7+(int)(Math.random()*12121)%2;
		g=0;
		for(int i=x;i<x+x2;i++)
		{
			for(int j=y;j>y-y2;j--)
			{
				if(a13.a1.mapall[i][j]%10>3||a13.a1.mapall[i][j]/10>=2||a13.a1.maphost[i][j]>0) {
					g=1;break;
				}
				
			}
			if(g==1)
				break;
		}
		if(g==0)
		{	
	   		a13.a1.f[a13.a1.fn]=new farmer(a13.a1.fn,x2,y2,k,group,pl);
	   		a13.a1.fn++;
	   		return 1;
		}
		return -1;
		
			
	}
	

     
    
}

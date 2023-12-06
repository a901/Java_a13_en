package a;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class A11 implements Serializable {
	
	
	private static final long serialVersionUID = 1;
	int mary=0;
	B b[]=new B[200100];
	C allb[]=new C[10100000];
	int bn=1,people;
	int allbn=0;
	int map[][];
	int mapbelow[][],map2[][],maphost[][];
	int mapall[][],mapx,mapy,year,day,dayr;//每日隨機變數
	int lightkid[],ln,lightkid0[];
	
	int k,g,g2,gg,k2,gh;
	int ay[],ax[],ap[],ah[],an,nstart;
	int lakex[],lakey[],lake2[],laken;
	
	//地圖代碼 1-40地形  1-9草地 11-19土地 21-29木質 31-39岩地 
	//人物 1000+  (人物代號) 101人物圖編號
	//地上物代號 201 小麥 202樹木
	
	int groupn=0;
	Group group[]=new Group[10100]; 
	farmer f[]=new farmer[1010000];int fn;
	Place pl[]=new Place[10100];
	int pln;
	
	int placen=0;
	long starttime,nowtime,endtime;
	
	String event[];
	int eventn,eventyear[];
	
	int population[],populationtribe[],yn,starvedie=0,die=0;
	
	double populationgrow[],populationdy[],populationstarve[];
	int saveprepare=0;
	
	int wise[][],strong[][];
	
	A11()
	{
		an=0;
		wise=new int [32][200];
		strong=new int [32][200];
		for(int z=0;z<32;z++)
		{
			for(int i=0;i<200;i++)
			{
				wise[z][i]=0;strong[z][i]=0;
			}
		}
		ax=new int [6000];
		ay=new int [6000];
		ap=new int [6000];
		ah=new int [6000];
		
		event=new String[101001];
		eventyear=new int [101001];
		eventn=0;
		
		population=new int[1001]; 
		populationtribe=new int[1001]; 
		populationgrow=new double[1001];
		populationdy=new double[1001];
		populationstarve=new double[1001];
		
		yn=1;
		population[0]=2;populationtribe[0]=0;populationgrow[0]=0;
		populationdy[0]=0;populationstarve[0]=0;
		
		
		for(int z=0;z<10;z++)
		{
			f[z]=new farmer(z);
		}
		fn=10;
		
		
		bn=1;
		ln=0;
		starttime = System.currentTimeMillis();
		year=1;
		map=new int [5000][5000];//地上物
		map2=new int [5000][5000];//地上物
		mapall=new int [5000][5000];//原始地貌地圖
		mapbelow=new int [5000][5000];//地下地形(上面有建築時)
		maphost=new int [5000][5000];//土地擁有者
		
		
		lightkid=new int [12];lightkid0=new int [12];
		allbn=0;
		for(int z=0;z<0;z++)
			b[z]=new B();
		for(int z=0;z<0;z++)
			allb[z]=new C();
	
		System.out.print("all "+day+"\n");
		mapx=2500;
		mapy=2500;
	
		a13.dx=1;a13.dy=1;
		
		
		int g=1;
		for(int x=0;x<5000;x++)
		{
			map[x][0]=0;map[0][x]=0;
			
		}
		for(int x=1;x<5000;x++)
		{
			for(int z=1;z<5000;z++)
			{
				g=(mapall[x-1][z]+mapall[x][z-1])/2;
				
				if((int)(Math.random()*12121)%47==1)
				{
					g+=2;
				}
				if((int)(Math.random()*12121)%23==1)
				{
					g++;
				}
				else if((int)(Math.random()*12121)%22==1)
				{
					g--;
				}
				if(g<1)g=1;
				if(g>9)g=9;
				map[x][z]=-1;
				mapall[x][z]=g;
				mapbelow[x][z]=g;
				
				maphost[x][z]=0;
			
			}
			
			
		}
		
		for(int z=0;z<5000;z++)
		{
			mapall[z][10]=9;
			mapall[10][z]=9;
			mapall[z][4990]=9;
			mapall[4990][z]=9;	
		}
		for(int z=1;z<4999;z++)
		{
			mapall[z][11]=7;
			mapall[11][z]=7;
			mapall[z][4989]=7;
			mapall[4989][z]=7;
			
		}
		
		lakex =new int[60100];
		lakey =new int[60100];
		lake2 =new int[60100];
		laken=0;
		int gg=(4900/60)*(4900/60);
		int cx,cy;
		for(int z=0;z<gg;z++)
		{
			cx=(int)(Math.random()*1721277)%4900+101;
			cy=(int)(Math.random()*1121117)%4899+101;
			lakex[z]=cx;
			lakey[z]=cy;
			lake2[z]=(int)(Math.random()*1121117)%13+2;
			mainset(cx,cy,41,lake2[z]);
		}
		laken=gg;
		
		gg=(4900/200)*(4900/200);
		for(int z=0;z<gg;z++)
		{
			cx=(int)(Math.random()*1721277)%4900+101;
			cy=(int)(Math.random()*1121117)%4899+101;
			
			gh=(int)(Math.random()*1121117)%13+2;
			mainset(cx,cy,31+(int)(Math.random()*11171)%3,(int)(Math.random()*1121117)%33+11);
		}
		
		gg=(4900/200)*(4900/200);
		
		for(int z=0;z<gg;z++)//  沙漠
		{
			cx=(int)(Math.random()*1721277)%4900+101;
			cy=(int)(Math.random()*1121117)%4899+101;
			
			gh=(int)(Math.random()*1121117)%13+2;
			mainset(cx,cy,31+(int)(Math.random()*11171)%3,(int)(Math.random()*1121117)%33+11);
		}
		
		
		gg=(4900/50)*(4900/50);
		
		for(int z=0;z<gg;z++)
		{
			cx=(int)(Math.random()*1721277)%4900+101;
			cy=(int)(Math.random()*1121117)%4899+101;
			
			gh=(int)(Math.random()*1121117)%13+2;

		
			mountainset(cx,cy,2+(int)(Math.random()*1121117)%4,(int)(Math.random()*1121117)%31+7);
		}
		
		
		for(int x=1;x<5000;x++)
		{
			for(int z=1;z<5000;z++)
			{
				if(mapall[x][z]>=7)
					continue;
				if((int)(Math.random()*177121)%15==1)
				{
					map[x][z]=201;
				}
				if((int)(Math.random()*133121)%51==1)
				{
					map[x][z]=202;
				}
			//	System.out.print("map "+x+" "+z+" "+map[x][z]);
			}
			
			
		}
		for(int z=1;z<bn;z++)
		{
			//System.out.print("b "+z+" "+b[z].s+"\n");
			if(b[z].s<=0)
				continue;
			map[b[z].x][b[z].y]=-1;
		}
		
		
		
		a13.clean();
		//st();

	}
	void st() {
		b[0]=new B();
		b[0].s=-1;
		newone( 1, 1, "Ivan", 2503,2505,0);
		newone( 2, 1, "Mary", 2505,2505,0);
		
		for(int z=0;z<4;z++)
		{	
			for(int i=0;i<10;i++)
			{
				newone( 1, 1,boy[(z%2)*10+i+1] , 2513+i*6,2505+z*20,(z%2)*10+i+1);
				newone( 2, 1,girl[(z%2)*10+i+1], 2515+i*6+3,2505+z*20,(z%2)*10+i+1);
			}
		}
	}
	
	int hight=0;
	void mainset(int x,int y,int k,int l)
	{
		an=1;
		ax[0]=x;
		ay[0]=y;
		ap[0]=l;
		for(int z=0;z<an;z++) {
			if(an>5000)
				break;
			setland(ax[z],ay[z],k,ap[z]);
		}
		
	}
	void setland(int x,int y,int k,int l)
	{
		if(x<10||y<10||x>=4990||y>4990)
			return;
		mapall[x][y]=k;
		if(map[x][y]<1000)
			map[x][y]=-1;
		if((l<=0)||(int)(Math.random()*82827)%(l+3)<3)
			return;
		
		subset(x+1,y,l-1);
		subset(x-1,y,l-1);
		subset(x,y+1,l-1);
		subset(x,y-1,l-1);
		
		
	}
	void mountainset(int x,int y,int k,int l)
	{
		an=1;
		ax[0]=x;
		ay[0]=y;
		ap[0]=l;
		ah[0]=8;
		
		for(int z=0;z<an;z++) {
			if(an>5000)
				break;
			setmountain(ax[z],ay[z],k,ap[z],ah[z]);
		}
		
	}
	void setmountain(int x,int y,int k,int l,int h)
	{
		if(x<10||y<10||x>=4990||y>4990)
			return;
		mapall[x][y]= h+1;
		if(map[x][y]<1000)
			map[x][y]=-1;
		if((int)(Math.random()*800)%(k)==0&&h>1)
			 h--;
		if((l<=0)||(int)(Math.random()*82827)%(l+3)<3)
			return;
		
		subsetm(x+1,y,l-1,h);
		subsetm(x-1,y,l-1,h);
		subsetm(x,y+1,l-1,h);
		subsetm(x,y-1,l-1,h);
		
		
	}
	void subsetm(int x,int y,int l,int h)
	{
		if(x<=0||y<=0||x>=4999||y>=4999)
			return;
		
		for(int i=0;i<an;i++)
		{
			if(ax[i]==x&&ay[i]==y)
				return;
		}
		ax[an]=x;ay[an]=y;ap[an]=l;ah[an]=h;an++;
	
	
	}
	void subset(int x,int y,int l)
	{
		if(x<=0||y<=0||x>=4999||y>=4999)
			return;
		
		for(int i=0;i<an;i++)
		{
			if(ax[i]==x&&ay[i]==y)
				return;
		}
		ax[an]=x;ay[an]=y;ap[an]=l;an++;
	
	
	}
	
	
	void newevent(int k,String y)
	{
		eventyear[eventn]=k;
		event[eventn]=y;
		eventn++;
	}
	void newevent(String y)
	{
		eventyear[eventn]=a13.a1.year;
		event[eventn]=y;
		eventn++;
	}
	
	
	void start()
	{
		a13.clean();

		
		a13.a130.start();
		a13.seta(2,700,0, 500,580,"talk4");
		a13.seta(3,1000,20, 180,200,"talk2");
		
		a13.setbl(11, 1008,30, 130,30,1, "方向鍵移動地圖");
		a13.setbl(12, 1008,60, 130,30,1, "Q方向鍵功能切換");
		a13.setbl(13, 1008,90, 130,30,1, "R放置石塊");
		a13.setbl(14, 1008,120, 130,30,1, "Y放置小麥");
		a13.setbl(15, 1008,150, 130,30,1, "T雷擊");
		
		a13.nstart=1;
		//a13.seta(800,100, 100,100,"light");
		int g=1;
	
		
		System.out.print("\nblllll ");
		
		
		//存在 南  第一年出生0歲  名   位址
		 Thread t= new Thread( new Runnable(){
			 public void run(){	  try {
				 Thread.sleep(1000);
				while(true) {
				//	System.out.print("day "+day+"\n");
					
					if(a13.kk.stop==0) {
						
						dayr=(int)(Math.random()*121217)%70101;
						
						day+=1;
						if(day>=30)
						{
							day=1;
							year+=1;
							if(year%10==1)
							{
								newdecade();
							}
							if(year>3000)
								break;
						}
						
						newday();
					
					}
				    Thread.sleep(1000);
				}
			 
			 } catch (Exception e) {  e.printStackTrace();
			 } 	 } } );   t.start();
	}
	
	 
	
	
	void newdecade()
	{
		g=0;
		for(int z=0;z<bn;z++)
		{
			if(b[z].s>=0)
				g++;
			
		}
		g2=0;
		for(int z=0;z<groupn;z++)
		{
			if(group[z].leader>=0)
				g2++;
			
		}
		populationgrow[yn]=(double)(g-population[yn-1])*100/population[yn-1];
		population[yn]=g;
		populationstarve[yn]=(double)starvedie*100/(double)die;
		populationdy[yn]=die;
		populationstarve[yn]=starvedie;
		populationtribe[yn]=g2;
		yn++;
		
		
		
		
		die=0;
		starvedie=0;
		
	}
	
	
	
	String boy[]= {"Ivan","Peter","Edward","William","Henry","Richard","Ludwig","Louis","Philip","James"
			,"Charles","George","Frederick","Alexander","Constantine","David","Paul","Andrew","Arthur","Ferdinand"
			,"Joseph","Brandon","Albert","Francis","otto","Vladimir","Alfonso","Robert","Benjamin","Stephen"
			,"Christian","Franz","Gustav","Franz","Franz"};
	String boy2[]= {"伊凡","彼得","愛德華","威廉","亨利","理查","路德維希","路易","菲力普","詹姆斯"
			,"查理","喬治","腓特烈","亞歷山大","君士坦丁","大衛","保羅","安德魯","亞瑟","斐迪南"
			,"約瑟夫","布蘭登","阿爾伯特","法蘭西斯","顎圖","弗拉基米爾","阿方索","羅伯特","班傑明","史蒂芬"
			,"克里斯蒂安","法蘭茲","古斯塔夫","Franz","Franz","Franz"};
	int boyn=33;
	String girl[]= {"Mary","Maria","Charlotte","Caroline","Alexandra","Elizabeth","Catherine","Anne","Isabelle","Margaret"
			,"Louise","Jenny","Joan","Eleanor","Juana","Alice","Adelaide","Susan","Jane","Christina",
			"Irina","Sofie","Josephine","","","","","","","","","",""};
	String girl2[]= {"瑪麗","瑪麗亞","夏洛特","卡羅琳","亞力山德娜","伊麗莎白","凱薩琳","安妮","伊莎貝拉","瑪格麗特"
			,"路易斯","珍妮","瓊","愛蓮娜","胡安娜","愛麗絲","阿德萊德","蘇珊","珍","克里斯蒂娜",
			"伊琳娜","索菲","約瑟芬","","","","","","","","","",""};
	int girln=23;
	int name0;
	void newkid(int fa,int fak,int ma,int mak)
	{
	
	//	int fa0=fa;
		//fa=allb[fa].bk;
		int x=b[mak].x;
		int y=b[mak].y;
	//	System.out.print("newone \n");
		int k=-1;
		for(int z=1;z<bn;z++)
		{
			if(a13.a1.allbn>150000&&z>10000)
				return;
			if(a13.a1.allbn>1250000&&z>4000)
				return;
			if(a13.a1.allbn>6250000&&z>1000)
				return;
			if(b[z].s<0)
			{
				k=z;
			}
		} 
		if(k==-1) {
			if(a13.a1.bn>155000)return;
			
				
			k=bn;bn++;}
		double gg=(Math.random());
		System.out.print("newone real "+gg+"\n");
		int sex=1;
		if(gg<0.5)
			sex=2;
		else sex=1;
		System.out.print("kids mom is"+b[mak].name()+"\n");
		name0= findname( sex,fa,ma);
		String na="";
		if(name0<0)name0=0;
		if(sex==1)
		    na=boy[name0];
		else
			 na=girl[name0];
	
		
		if(allb[fa].kidn<49) {
		allb[fa].kid[allb[fa].kidn]=allbn;
		allb[fa].kidn++;
		}
		if(allb[ma].kidn<49) {
		allb[ma].kid[allb[ma].kidn]=allbn;
		allb[ma].kidn++;
		}
		g=(int)(Math.random()*12121)%9+1;
		int w,s;
		w=(allb[ma].wise*g+allb[fa].wise*(10-g))/10;
		if((int)(Math.random()*14441)%2==1)
			w++;
		g=(int)(Math.random()*72627)%9+1;
		s=(allb[ma].strong*g+allb[fa].strong*(10-g))/10;
		if((int)(Math.random()*17771)%2==1)
			s++;
		
		g=(int)(Math.random()*12121)%4+2;
		if((int)(Math.random()*12121)%6==1&&w<=120)
		{
			w+=g;
		}
		else if((int)(Math.random()*12121)%5==1&&w>=80) {
			w-=g;
		}
		if(w>=120&&(int)(Math.random()*17771)%4==1&&(((int)(Math.random()*12121)%((w-100)*(w-100)+10)<100)))
		{
			w+=5;
		}
		else if(w<=80&&(int)(Math.random()*127721)%3==1&&(((int)(Math.random()*12121)%((w-100)*(w-100)+10))<100))
		{
			w-=5;
		}
		
		g=(int)(Math.random()*12121)%5+1;
		if((int)(Math.random()*12121)%6==1&&s<=120)
		{
			s+=g;
		}
		else if((int)(Math.random()*12121)%5==1&&s>=80) {
			s-=g;
		}
		if(s>=120&&(int)(Math.random()*12121)%4==1&&((int)(Math.random()*12121)%((s-100)*(s-100)+10))<100)
		{
			s+=5;
		}
		else if(s<=80&&(int)(Math.random()*12121)%3==1&&((int)(Math.random()*12121)%((s-100)*(s-100)+10))<100)
		{
			s-=5;
		}
		
		b[k]=new B(k,sex,allb[fa].generation+1,na,x,y,name0);
			
		System.out.print(" newkid  k="+k+"  fa0="+fa+" ma0="+ma+"fa="+fak+"ma="+mak);
		b[k].addB(fak,mak,fa,ma,w,s);
		
		if(a13.a1.allb[fa].s>0&&a13.a1.b[fak].home>0)
		{
			a13.a1.b[k].home=a13.a1.b[fak].home;
			if(a13.a1.f[a13.a1.b[fak].home].member0<19) {
			a13.a1.f[a13.a1.b[fak].home].member[a13.a1.f[a13.a1.b[fak].home].member0]=k;
			a13.a1.f[a13.a1.b[fak].home].member0++;
			
			}
			
		}
		else if(a13.a1.allb[ma].s>0&&a13.a1.b[mak].home>0)
		{
			
			if(a13.a1.f[a13.a1.b[mak].home].member0<18) {
			a13.a1.f[a13.a1.b[mak].home].member[a13.a1.f[a13.a1.b[mak].home].member0]=k;
			a13.a1.f[a13.a1.b[mak].home].member0++;
			a13.a1.b[k].home=a13.a1.b[mak].home;
			
			}
		}
		if(b[mak].group>=0&&group[b[mak].group].level>1)
		{
			b[k].group=b[mak].group;
		}
		
		//	System.out.print("bn="+bn+" "+k+" b0="+b[k].s+" "+b[k].name);
		
	}
	int findname(int h,int fa,int ma)
	{
		int k=0,g=0;
		if(h==1)
		{
			k=allb[fa].name0;
			if(k>-1&&check( h, k, fa,ma)&&(int)(Math.random()*12121)%2==1)
			{
			//	System.out.print(" find fa:   name="+k+" "+check( h, k, fa,ma)+" \n");
				return k;
			}
			else if(allb[fa].fa0>=0)
			{			
				k=allb[allb[fa].fa0].name0;
				if (k>-1&&check( h, k, fa,ma)&&(int)(Math.random()*12121)%2==1){
					return k;
				}
				
			}
			g=(int)(Math.random()*19191)%boyn;g2=0;
		//	System.out.print(" find name: "+g2+"次  name="+g+" \n");
		
			while(true)
			{
				g2++;
			
				if(g2>=boyn)
					break;
				g=(int)(Math.random()*19191)%boyn;
			//	System.out.print(" find name: "+g2+"次  name="+g+" "+check( h, g, fa,ma)+" \n");
				if(check( h, g, fa,ma)==true)
					break;
			}
			return g;
		}
		else
		{
			k=allb[ma].name0;
			if(k>-1&&check( h, k, fa,ma)&&(int)(Math.random()*12121)%2==1)
			{
			//	System.out.print(" find ma:   name="+k+" "+check( h, k, fa,ma)+" \n");
				return k;
			}
			else if(allb[ma].ma0>=0)
			{
				k=allb[allb[ma].ma0].name0;
				if (k>-1&&check( h, k, fa,ma)&&(int)(Math.random()*12121)%2==1){
					return k;
				}
				
			}
			
			g=(int)(Math.random()*19791)%girln;g2=0;
			//System.out.print(" find name: "+g2+"次  name="+g+" "+check( h, g, fa,ma)+" \n");
			while(true)
			{
				g2++;
				
				if(g2>=girln)
					break;
			
				g=(int)(Math.random()*19791)%girln;
	//System.out.print(" find name: "+g2+"次  name="+g+" "+check( h, g, fa,ma)+" "+g2+" "+girln+" \n");
				if(check( h, g, fa,ma)==true)
					break;
			//	System.out.print(" find name: "+g2+"次  name="+g+" \n");
			}
			return g;
		}
		
		
	}
	Boolean check(int h,int k,int fa,int ma)
	{
	     //System.out.print(" check ");
		for(int z=0;z<allb[fa].kidn;z++)
		{
			
		
			if(allb[allb[fa].kid[z]].s<0)
				continue;
		//	System.out.print(" z "+z+" "+b[b[fa].kid[z]].name+" "+b[b[fa].kid[z]].name0+" "+k+" "+h+"\n");
		
			if(allb[allb[fa].kid[z]].sex==h&&allb[allb[fa].kid[z]].name0==k)
			{
				//System.out.print(" z "+z+" error "+b[b[fa].kid[z]].name+"\n");
				return false;				
			}
		}
		return true;
		
	}
	void newone(int b1,int b2,String bb,int x,int y,int name0)//性別 世代數 名
	{
		
		int k=-1;
		for(int z=1;z<bn;z++)
		{
			if(b[z].s<0)
			{
				k=z;
			}
		}
		if(k==-1) {
			k=bn;bn++;}
		
		System.out.print("newone k="+k+"\n");
			b[k]=new B(k,b1,1,bb,x,y,name0);
			 a13.a1.allb[a13.a1.allbn]=new C(a13.a1.allbn,-1,-1,1,bb,k,b1);
			 a13.a1.allb[a13.a1.allbn].name2=b[k].name2;
			 a13.a1.allbn++;
			
				
		//	System.out.print("bn="+bn+" "+k+" b0="+b[k].s+" "+b[k].name);
		
	}
	int keydelay=0,daydelay=0;
	void newday()
	{
		if(saveprepare==1)
		{
			a13.kk.screen=10;
			a13.cleanallb();
			System.out.print("prepare saving\n");
			a13.setbl(1,720,400, 400,50,1,"saving!!!");
			a13.f.save();
			a13.kk.screen=0;
			a13.a1.saveprepare=0;
		}
		int k=0;
		if(a13.kk.wdelay>0)
			a13.kk.wdelay--;
		if(keydelay>0&&keydelay==a13.keystate) {
			a13.keystate=0;
		}
		else if(a13.keystate>0)
			keydelay=a13.keystate;
		int gx,gy;
		
			for(int z=0;z<laken;z++)
			{
				if((int)(Math.random()*12121)%247==1)
				{
					mainset(lakex[z],lakey[z],41,lake2[z]);
				}
				if((int)(Math.random()*7712121)%11==7&&lake2[z]<17)
					lake2[z]++;
				else if((int)(Math.random()*4412121)%10==7&&lake2[z]>1)
					lake2[z]--;
			}
		
		
		int cx=0,cy=0;
		
		
		
		for(int x=1;x<5000;x++)
		{
			for(int z=1;z<5000;z++)
			{
				if(mapall[x][z]/10==4&&mapall[x][z]>41&&a13.kk.wdelay==0)
				{
					mapall[x][z]=41;
				}
				
			}
			
		}
		if((year<50&&dayr%423==1)||(dayr%1707==1))
		{
			
			a13.f.save2();
		}
		
		if(dayr%39==1)
		{
			for(int x=1;x<5000;x++)
			{
				for(int z=1;z<5000;z++)
				{
					if(map[x][z]==151)
					{
						if(a13.a1.allb[map2[x][z]-1000].age()+a13.a1.allb[map2[x][z]-1000].borntime<year) {
							map[x][z]=-1;
							map2[x][z]=-1;
						}
					}
					
				}
			}
		}
		if(dayr%9==1)
		{
			for(int x=1;x<5000;x++)
			{
				for(int z=1;z<5000;z++)
				{
					if(map[x][z]>=1000)
					if(a13.a1.b[map[x][z]-1000].x!=x||a13.a1.b[map[x][z]-1000].y!=z)
						map[x][z]=-1;
					
				}
			}
		}
		if(dayr%59==1)
		{
			for(int x=1;x<5000;x++)
			{
				for(int z=1;z<5000;z++)
				{
					
					if((int)(Math.random()*18881)%13==3&&map[x][z]==202&&maphost[x][z]<=0)
					{
							map[x][z]=-1;
					}
					else if((int)(Math.random()*18881)%561==13&&(map[x][z]==-1||map[x][z]==201)&&mapall[x][z]<7&&maphost[x][z]<=0)
					{
							map[x][z]=202;
					}
					
					if(dayr%7==1&&(map[x][z]==152||map[x][z]==153))
					{
						if(a13.a1.allb[map2[x][z]-1000].age()+a13.a1.allb[map2[x][z]-1000].borntime<year-5) {
							map[x][z]=-1;
							map2[x][z]=-1;
						}
					}
					
					if((int)(Math.random()*18881)%207<=1&&map[x][z]<1000&&map[x][z]>203)
						map[x][z]=-1;
						
				}
			}
		
		}
		
		daydelay++;
		if(dayr%59==1||daydelay>=120)
		{
			daydelay=0;
			if((int)(Math.random()*18881)%2==1)
				cx=-1;else cx=1;
				if((int)(Math.random()*14441)%2==1)
					cy=-1;else cy=1;
				if((int)(Math.random()*17771)%2==1)
					cx=0;
				else cy=0;
				
			for(int x=1;x<498;x++)
			{
				for(int z=1;z<498;z++)
				{g=0;
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							
							if(mapall[x*10+i+cx][z*10+j+cy]==41&&(int)(Math.random()*59921)%2!=1)
							{
								
								if(mapall[x*10+i][z*10+j]<40) {	
		
									mapall[x*10+i+cx][z*10+j+cy]=mapall[x*10+i][z*10+j]-mapall[x*10+i][z*10+j]%10+1;
								}
							}
							
							if(maphost[x*10+i][z*10+j]>0)
								continue;
							if(map[x*10+i][z*10+j]==201) {
								if((int)(Math.random()*59921)%7==1) {
									map[x*10+i][z*10+j]=-1;
								}else
									g++;
							}
							
							if(mapall[x*10+i][z*10+j]/10==1&&(int)(Math.random()*59921)%3!=1)
							{
								mapall[x*10+i][z*10+j]-=10;
							}
							if(mapall[x*10+i][z*10+j]/10==3&&(int)(Math.random()*1159527)%40007==177)
							{
								mapall[x*10+i][z*10+j]-=20;
							}
							
						}
						
					}

						for(int y=g;y<7;y++) {
							
							gx=(int)(Math.random()*55521)%10;
							gy=(int)(Math.random()*15551)%10;
							if(mapall[x*10+gx][z*10+gy]<10&&map[x*10+gx][z*10+gy]==-1&&maphost[x*10+gx][z*10+gy]<=0)
							{
								
								map[x*10+gx][z*10+gy]=201;
							}
						}
						for(int y=0;y<11;y++) {
					
							gx=(int)(Math.random()*55521)%10;
							gy=(int)(Math.random()*15551)%10;
							if(mapall[x*10+gx][z*10+gy]<40&&mapall[x*10+gx+cx][z*10+gy+cy]==41) {	
								mapall[x*10+gx+cx][z*10+gy+cy]=mapall[x*10+gx][z*10+gy];
							}
						}
				
				}
				
			}
		}
		

		//System.out.print("\nnow we are in "+mapx+" "+mapy);
		for(int x=mapx;x<mapx+12;x++)
		{
		//	for(int z=mapy;z<mapy+10;z++)
		//	{
					
			//}
			
		}
		int g=0;
		for(int z=1;z<bn;z++)
		{	
			b[z].gsub=0;
		}
		for(int z=1;z<bn;z++)
		{
			//System.out.print("b "+z+" "+b[z].s+"\n");
			if(b[z].s<=0)
				continue;
			g++;
			b[z].r();
		}
		people=g;
		for(int z=0;z<groupn;z++)
		{
			//System.out.print("b "+z+" "+b[z].s+"\n");
			if(group[z].leader<0)
				continue;
			
			group[z].r();
		}
		for(int z=0;z<pln;z++)
		{
			pl[z].r();
		}
		
		
	}
	int state=0;
	void showbl()
	{
		if(a13.kk.screen>0)
			return;
		int k0;
		if(state==1)//**************************顯示光環者*********************
		{
			for(int z=0;z<10;z++)
				a13.cleanbl(z);
			a13.kk.q=4;
			for(int z=0;z<ln;z++)
			{
				k=lightkid[z];
				k0=lightkid0[z];
				if(b[k].s>=0&&b[k].k0==k0)
				a13.setbl(1+z,730,270+30*z, 400,30,1,allb[k0].name+" "+allb[k0].midname+"  第"+allb[k0].generation+"代   "+(year-b[k].borntime)+"歲    位置:"+b[k].x+" "+b[k].y);
				else
					a13.setbl(1+z,730,270+30*z, 400,30,1,allb[k0].name+" "+allb[k0].midname+"  第"+allb[k0].generation+"代   死亡 得年"+(allb[k].age)+"歲      ");
				
			}
			a13.setbl(8,730,500, 400,30,1,"current position:"+mapx+" "+mapy);
			a13.setbl(9,730,530, 400,30,1,"X:go there D:delete S:return");
			
			return;
		}
		
		for(int z=1;z<=9;z++)
			a13.cleanbl(z);
		if(map[a13.dx+mapx][a13.dy+mapy]>=1000&&map[a13.dx+mapx][a13.dy+mapy]<1000000000)
		{
			
			k=map[a13.dx+mapx][a13.dy+mapy]-1000;
			a13.setbl(1,720,400, 300,30,1,b[k].name+""+b[k].midname()+" "+b[k].generation+"th");
			a13.setbl(2,720,430, 300,30,1,"hungry:"+b[k].hungry);
			a13.setbl(3,720,460, 300,30,1,"age: "+(year-b[k].borntime));
			if(b[k].group>=0&&group[b[k].group].leader==k)
				a13.setbl(4,720,490, 300,30,1,group[b[k].group].name+"'s leader");
			else if(b[k].group>=0)
			a13.setbl(4,720,490, 300,30,1,group[b[k].group].name+"'s menber");
			
			return;
		}
		else {
			
			
		}
		if(mapall[a13.dx+mapx][a13.dy+mapy]==23&&maphost[a13.dx+mapx][a13.dy+mapy]>0)
		{
			int g3;
			gg=maphost[a13.dx+mapx][a13.dy+mapy];
			a13.a1.f[gg].l=0;
			g=a13.a1.f[gg].host0;
			//System.out.print("說明文件:"+g+" "+gg);
			if(g>=0) {
				a13.setbl(1,720,370, 450,50,1,a13.a1.allb[g].name()+"'s home   in (村落) "+pl[a13.a1.f[gg].place].name);
			
				a13.setbl(2,720,400, 300,50,1,"居住人數:"+a13.a1.f[gg].member0+"  ");
			
				int g2=a13.a1.f[gg].heir1_2(g,1);
				if(g2>0) {
					a13.setbl(3,720,430, 450,50,1,"hair(田產繼承人): "+a13.a1.allb[g2].name());
					g3=a13.a1.f[gg].heir1_2(g,3);		
					if(g3>0)
						a13.setbl(4,720,460,400,50,1,"備位繼承人: "+a13.a1.allb[g3].name());
					
			
				}
			}
		}
		else if(map[a13.dx+mapx][a13.dy+mapy]>0)
		{
			
			k=map[a13.dx+mapx][a13.dy+mapy];
			if(k==201)
			a13.setbl(1,720,400, 300,50,1,"wheat");
			else if(k==402)
			a13.setbl(1,720,400, 300,50,1,"camp");
			else if(k==202)
				a13.setbl(1,720,400, 300,50,1,"tree");
			else if(k==211)
			{
				g=maphost[a13.dx+mapx][a13.dy+mapy];
				g=a13.a1.f[g].foodnumber;
				a13.setbl(1,720,400, 300,50,1,g+" wheats");
			}
			
			else if(k>=500&&k<1000)
				a13.setbl(1,720,400, 450,50,1,group[k-500].name+" tribe flag(部落旗幟)");
			else if(k==151||k==152||k==153) {
				g=map2[a13.dx+mapx][a13.dy+mapy]-1000;
				
				a13.setbl(1,720,400, 450,50,1,allb[g].name()+"'s corpse(屍體)");
			}
			//return;
		}
		else if(mapall[a13.dx+mapx][a13.dy+mapy]/10==0)
			a13.setbl(1,720,400, 300,50,1,"grass");
		else if(mapall[a13.dx+mapx][a13.dy+mapy]/10==1)
				a13.setbl(1,720,400, 400,50,1,"land");
		else if(mapall[a13.dx+mapx][a13.dy+mapy]/10==2)
			a13.setbl(1,720,400, 400,50,1,"wood");
		else if(mapall[a13.dx+mapx][a13.dy+mapy]/10==3)
			a13.setbl(1,720,400, 400,50,1,"rock");
		else if(mapall[a13.dx+mapx][a13.dy+mapy]/10==4)
			a13.setbl(1,720,400, 400,50,1,"lake");
		else 
			a13.setbl(1,720,400, 400,50,1,"unknow");
		
		
		a13.setbl(8,720,500, 400,30,1,"current position:"+mapx+" "+mapy);
		a13.setbl(9,720,530, 400,30,1,"Year: "+year+" Day:"+(day*6)+"");
	}

}

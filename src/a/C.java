package a;

import java.io.Serializable;

public class C implements Serializable{
	
	
	
	private static final long serialVersionUID = 177;
	int k0,fa0=-1,ma0=-1, generation,age,s,bk,borntime,sex,kid[],love[]=new int [20],loveday[]=new int [20],loven=0,kidn=0,name0=0,wise=100,strong=100;
	String name,name2="", midname=" ",thename2="";
	int findg=0;
	String diereason="";
	int  group=-1,midname0,wi0=-1;
	int wife[],wifeday[],wifen;
	int place=0;
	int sin=0;
	C()
	{
		
	}
	C(int k00,int fa00,int ma00,int g,String name0,int bk0,int sex0)
	{
		k0=k00;
		fa0=fa00;
		ma0=ma00;
		generation=g;
		name=name0;
		s=1;
		bk=bk0;
		sex=sex0;
		borntime=-15;
		kid=new int[41];kidn=0;
		
		loven=0;
		wife=new int [10];wifeday=new int [10];
		wifen=0;
		if(fa0>=0&&a13.a1.allb[fa0].s>0&&a13.a1.b[a13.a1.allb[fa0].bk].home>=0)
			place=a13.a1.f[a13.a1.b[a13.a1.allb[fa0].bk].home].place;
		else if(ma0>=0&&a13.a1.allb[ma0].s>0&&a13.a1.b[a13.a1.allb[ma0].bk].home>=0)
		{
			place=a13.a1.f[a13.a1.b[a13.a1.allb[ma0].bk].home].place;
		}
	
	}
	void age(int g) {
		age=g;
	}
	String name()
	{
		return a13.a1.allb[k0].name+a13.a1.allb[k0].midname+" "+a13.a1.allb[k0].generation+"th";
	}
	String thename()
	{
		return a13.a1.allb[k0].name+a13.a1.allb[k0].midname;
	}
	String ma() {
		
		if(ma0<0)
			return "not exist";
		System.out.println("in  C ma="+"》鍵"+ma0+" "+a13.a1.allb[ma0].name);
		return a13.a1.allb[ma0].name+a13.a1.allb[ma0].midname+" "+a13.a1.allb[ma0].generation+"th";
	}
	String fa() {
		if(fa0<0)
			return "not exist";
		return a13.a1.allb[fa0].name+a13.a1.allb[ma0].midname+" "+a13.a1.allb[fa0].generation+"th";
	}
	
	String allname2() {
		
		if(fa0<0)
			return name2;
		else if(sex==1)
		 return name2+" "+a13.a1.boy2[midname0];
		else 
			 return name2+" "+a13.a1.girl2[midname0];
	}
	
	void showfbl2() {//**********************    顯示朋友親屬資料 (於右方介面全)  依熟系度排序***************
		
		int g;
		a13.cleanallb();a13.seta(11,700,0, 500,580,"talk4");
		
		String yy="";int kk,g2;
		for(int x=0;x<9;x++) {
		
		}
		
			a13.setbl(8,720,100,450,30,1,name()+" ("+allname2()+")"+"'s family  ");
		String gender[]= {" ","male(男)","female(女)"};
		if(s<0)
		a13.setbl(6,720,140,450,30,1,"bron(year): "+borntime+"  died at "+age+"  reason:"+diereason+"  sin:"+sin);
		else
			a13.setbl(6,720,140,390,30,1,"Born in Year "+borntime+"    Age:"+age()+""+"   sin:"+a13.a1.b[bk].sin+" tie"+a13.a1.b[bk].tie);
		
	
		if(fa0>=0) {
			g2=a13.a1.allb[fa0].bk;
			
			System.out.println("in  C ma="+"》鍵"+ma0+" "+a13.a1.allb[ma0].name);
		if(a13.a1.b[g2].k0==fa0&&a13.a1.allb[fa0].s>0)
			a13.setbl(22,720,200,450,30,1,"Father:  "+a13.a1.allb[fa0].name()+"    "+(a13.a1.year-a13.a1.b[g2].borntime)+"歲 ");
		else
			a13.setbl(22,720,200,450,30,1,"Father:  "+a13.a1.allb[fa0].name()+"     died at "+(a13.a1.allb[fa0].age)+" ");
		g2=a13.a1.allb[ma0].bk;
		if(a13.a1.b[g2].k0==ma0&&a13.a1.allb[ma0].s>0)
			a13.setbl(23,720,230,450,30,1,"Mother:  "+a13.a1.allb[ma0].name()+"    "+(a13.a1.year-a13.a1.allb[ma0].borntime)+"歲 ");
		else
			a13.setbl(23,720,230,450,30,1,"Mother:  "+a13.a1.allb[ma0].name()+"     died at "+(a13.a1.allb[ma0].age)+" ");
		}
		if(ma0>=0) {
		if(a13.a1.allb[fa0].fa0>=0) {
			g=a13.a1.allb[fa0].fa0;
			g2=a13.a1.allb[g].bk;
			if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
				a13.setbl(24,720,260,450,30,1,"Grandpa:  "+a13.a1.allb[g].name()+"    Age(年紀): "+(a13.a1.year-a13.a1.b[g2].borntime)+" ");
			else
				a13.setbl(24,720,260,450,30,1,"Grandpa:  "+a13.a1.allb[g].name()+"     died at(享年) "+(a13.a1.allb[g].age)+" y/o");	
		}
		}
		if(fa0>=0) {
		if(a13.a1.allb[fa0].ma0>=0) {
			g=a13.a1.allb[fa0].ma0;g2=a13.a1.allb[g].bk;
			if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
				a13.setbl(25,720,290,450,30,1,"Grandma:  "+a13.a1.allb[g].name()+"   Age(年紀): "+(a13.a1.year-a13.a1.b[g2].borntime)+" ");
			else	a13.setbl(25,720,290,450,30,1,"Grandma:  "+a13.a1.allb[g].name()+"     died at(享年) "+(a13.a1.allb[g].age)+" y/o");	
		}
		if(a13.a1.allb[ma0].fa0>=0) {
			g=a13.a1.allb[ma0].fa0;g2=a13.a1.allb[g].bk;
			if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
				a13.setbl(26,720,320,450,30,1,"Grandpa:  "+a13.a1.allb[g].name()+"    Age(年紀): "+(a13.a1.year-a13.a1.b[g2].borntime)+" ");
			else	a13.setbl(26,720,320,450,30,1,"Grandpa:  "+a13.a1.allb[g].name()+"     died at(享年) "+(a13.a1.allb[g].age)+" y/o");	
		}
		if(a13.a1.allb[ma0].ma0>=0) {
			g=a13.a1.allb[ma0].ma0;g2=a13.a1.allb[g].bk;
			if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
				a13.setbl(27,720,350,450,30,1,"Grandma:  "+a13.a1.allb[g].name()+"    Age(年紀): "+(a13.a1.year-a13.a1.b[g2].borntime)+" ");
			else	a13.setbl(27,720,350,450,30,1,"Grandma:  "+a13.a1.allb[g].name()+"     died at(享年) "+(a13.a1.allb[g].age)+" y/o");	
		}
		}
		
		g=0;
		int gh=0;
		for(int i=0;i<kidn;i++)
		{	
			gh=kid[i];
			g2=a13.a1.allb[gh].bk;
			if(a13.a1.b[g2].s>0&&a13.a1.b[g2].k0==gh) {
				g++;
			}
		}
		
		a13.setbl(21,720,410,450,30,1,"number of kids: "+kidn+"  alive kids: "+g+"");
		a13.n1.pn=0;
		
		host=-1;
		g=findoldkid(k0,name,0);
		if(g>=0)
		{
			if(kidl<=1)
			a13.setbl(7,720,440,400,30,1,"heir:"+kidyy);
			else {
				a13.setbl(7,720,440,400,30,1,"heir: "+kidl+"th grandson  "+kidyy);
			}
			a13.setbl(29,720,470,400,30,1,""+kidy);
		}
		else
			a13.setbl(29,720,470,400,30,1,"no descendants");
			
		a13.setbl(9,720,520,300,30,1,"E: retrun, Left,Right keys: change page");
	
		
	}
	void showfbl21(int h) {//********************** *************** 情人
		
		a13.kk.chw=0;
		a13.cleanallb(); 	
		String yy="";int g=k0,g2;
		a13.setbl(1,720,40,450,30,1,name()+"( "+name2()+" )"+" 's lover: ");
		
		int gn=1,g2n=1;
		for(int x=h;x<h+10;x++) {
			if(x>=loven)
				break;
			g=love[x];
			g2=a13.a1.allb[g].bk;
			
			if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
	 		a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,a13.a1.allb[g].name()+"  Age:" +(a13.a1.year-a13.a1.b[g2].borntime)+"  "+flname(g)+" start at "+name+" "+loveday[x]+" y/o");	
			else 
				a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,a13.a1.allb[g].name() +" died  at(享年) "+(a13.a1.allb[g].age)+"  "+flname(g)+" start at "+name+" "+loveday[x]+" y/o");	
	
			
		}
		a13.setbl(9,720,520,300,30,1,"E: retrun Left,Right keys: change page Z:switch");
		a13.seta(11,700,0, 500,580,"talk4");	
	}
    void showfbl21_w(int h) {//********************** *************** 配偶
    
    a13.kk.chw=1;
	a13.cleanallb(); 	
	String yy="";int g=k0,g2;
	if(sex==1)
	a13.setbl(1,720,40,450,30,1,name()+"( "+name2()+" )"+" 's wifes:");
	else
		a13.setbl(1,720,40,450,30,1,name()+"( "+name2()+" )"+" 's husbend:");
	int gn=1,g2n=1;
	for(int x=h;x<h+10;x++) {
		if(x>=wifen)
			break;
		g=wife[x];
		g2=a13.a1.allb[g].bk;
		
		if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
 		a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,a13.a1.allb[g].name()+" " +(a13.a1.year-a13.a1.b[g2].borntime)+"   "+flname(g)+" "+wifeday[x]+"");	
		else 
			a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,a13.a1.allb[g].name() +"died  at "+(a13.a1.allb[g].age)+"   "+flname(g)+" married at "+wifeday[x]+"");	

		
	}
	a13.setbl(9,720,520,300,30,1,"E: retrun Left,Right keys: change page Z:switch");
	a13.seta(11,700,0, 500,580,"talk4");	
}

String name2() {
	if(fa0<0)
		return name2;
	else if(sex==1)
	 return name2+" "+a13.a1.boy2[midname0];
	else 
		 return name2+" "+a13.a1.girl2[midname0];
}
void showfbl22(int k) {//********************** ***************
		
		a13.cleanallb(); 
		String yy="";
		a13.setbl(1,720,40,450,30,1,name()+"'s patrilineal ancestors:");
		
		int g=k0;
		for(int z=0;z<k;z++)
		{
			g=a13.a1.allb[g].fa0;
			if(g<0)
				return;;	
		}
		for(int x=0;x<10;x++) {
			
			if(g<0)
				break;	
			if(a13.a1.allb[g].s<0)
	 		a13.setbl(31+x,720,480-x*40,450,30,1,a13.a1.allb[g].name()+"   出生於"+a13.a1.allb[g].borntime+"年  享年"+a13.a1.allb[g].age()+"歲");	
			else 
		 		a13.setbl(31+x,720,480-x*40,450,30,1,a13.a1.allb[g].name()+"   出生於"+a13.a1.allb[g].borntime+"年  時年"+a13.a1.allb[g].age()+"歲");	
			
			g=a13.a1.allb[g].fa0;
			
		}
		a13.setbl(9,720,520,300,30,1,"按E退回,上下左右鍵換頁   ");
		a13.seta(11,700,0, 500,580,"talk4");
	}
 void showfbl23(int k) {//********************** ***************
		
		a13.cleanallb(); 	
		String yy="";
		a13.setbl(1,720,40,450,30,1,name()+"'s matrilineal ancestor:");
		 int g=k0;
		for(int z=0;z<k;z++)
		{
			g=a13.a1.allb[g].ma0;
			if(g<0)
				return;;	
		}
		for(int x=0;x<10;x++) {
			
			if(a13.a1.allb[g].s<0)
		 		a13.setbl(31+x,720,480-x*40,450,30,1,a13.a1.allb[g].name()+"   born at(出生於) "+a13.a1.allb[g].borntime+"年   died at(享年): "+a13.a1.allb[g].age()+"歲");	
				else 
			 		a13.setbl(31+x,720,480-x*40,450,30,1,a13.a1.allb[g].name()+"   born at(出生於) "+a13.a1.allb[g].borntime+"年  時年 "+a13.a1.allb[g].age()+" y/o");	
				g=a13.a1.allb[g].ma0;
			if(g<0)
				break;	
		}
		a13.setbl(9,720,520,300,30,1,"按E退回,上下左右鍵換頁");
		a13.seta(11,700,0, 500,580,"talk4");
	}

 String sonma(int g) {
	 int m;
	 if(sex==1)
	  m=a13.a1.allb[g].ma0;
	 else
		  m=a13.a1.allb[g].fa0;
	 if(m<0)
		 return "";
	 
	 
	 if(sex==1)
	 return " mom: "+a13.a1.allb[m].name();
	 else
		 return " dad: "+a13.a1.allb[m].name();
 }
void showfbl24(int h) {//********************** *************** 子輩
		
		a13.cleanallb(); 	
		String yy="";int g=k0,g2;
		a13.setbl(1,720,40,450,30,1,name()+" 's childern :");
		
		int gn=1,g2n=1;
	
		
		for(int x=h;x<h+10;x++) {
			if(x>=kidn)
				break;
			g=kid[x];
			g2=a13.a1.allb[g].bk;
			
			if(a13.a1.allb[g].s>0)
	 		a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,""+a13.a1.allb[g].thename()+" Age: "+(a13.a1.year-a13.a1.b[g2].borntime)+"   "+(-this.borntime+a13.a1.allb[g].borntime)+"歲生之"+sonma(g));	
			else if(a13.a1.allb[g].age<13) 
				a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,""+a13.a1.allb[g].thename()+"  died at "+(a13.a1.allb[g].age)+"  "+(-this.borntime+a13.a1.allb[g].borntime)+"歲生之"+sonma(g));	
			else
				a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,""+a13.a1.allb[g].thename()+"  died at "+(a13.a1.allb[g].age)+"  "+(-this.borntime+a13.a1.allb[g].borntime)+"歲生之"+sonma(g));	
		}
		a13.setbl(9,720,520,300,30,1,"E: retrun Left,Right keys: change page");
		a13.seta(11,700,0, 500,580,"talk4");	
	}

void showfbl25(int h) {//********************** *************** 當前繼承人譜系
	
	//h++;
	a13.cleanallb(); 	
	
	a13.n1.pn=0;host=-1;
	int g=findoldkid(k0,"其",0);
	findoldkidcl(k0);
	
	a13.setbl(1,720,40,450,30,1,thename()+"'s current heirs");	
	if(g==-1) {
		a13.setbl(2,720,100,450,30,1,"no alive descendants");
		a13.setbl(9,720,520,400,30,1,"E: retrun Left,Right keys: change page");
		a13.seta(11,700,0, 500,580,"talk4");	
		return;
	}
	
	int gn=1,g2n=1,g2;
	for(int x=h;x<h+11;x++) {
		if(x>=a13.n1.pn)
			break;
		g=a13.n1.p[x];
		g2=a13.a1.allb[g].bk;
		if(x==0)
		{
			if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
		 		a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,"  "+a13.a1.allb[g].name()+"  Age: "+(a13.a1.year-a13.a1.allb[g].borntime)+"");	
				else 
					a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,"  "+a13.a1.allb[g].name()+"  died at "+(a13.a1.allb[g].age)+"");	
			continue;
		}
		if(x==1)
		{
			if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
		 		a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,"  "+a13.a1.allb[g].name()+" son/daughter  Age: "+(a13.a1.year-a13.a1.allb[g].borntime)+"");	
				else 
					a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,"  "+a13.a1.allb[g].name()+" son/daughter  died at "+(a13.a1.allb[g].age)+"");	
			continue;
		}
		if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
 		a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,"  "+a13.a1.allb[g].name()+" "+(x)+"th grandson/granddaughter   "+(a13.a1.year-a13.a1.allb[g].borntime)+"");	
		else 
			a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,"  "+a13.a1.allb[g].name()+" "+(x)+"th grandson/granddaughter   died at "+(a13.a1.allb[g].age)+"");	
	}
	a13.setbl(9,720,520,400,30,1,"E: retrun Left,Right keys: change page");
	a13.seta(11,700,0, 500,580,"talk4");	
}
void showfbl26(int h,int cl) {//********************** *************** 歷任繼承人列表
	
	//h++;
	a13.cleanallb(); 	
	
	a13.n1.pn=0;
	kyear=borntime+age-1;
	kp=0;kd=0;
	kclass=cl;
	findoldkid2(k0);
	findoldkidcl(k0);
	if(cl==0)
	a13.setbl(1,720,40,450,30,1,thename()+"'s  list of heirs:");	
	else if(cl==1) a13.setbl(1,720,40,450,30,1,name+midname+"'s list of Patrilineal hairs:");	
	else if(cl==2) a13.setbl(1,720,40,450,30,1,name+midname+"'s list of Matrilineal hairs:");	
	int g;
	
	int gn=1,g2n=1,g2;
	for(int x=h;x<h+10;x++) {
		if(x==0)
			continue;
		if(x>=a13.n1.pn)
			break;
		g=a13.n1.p[x];
		g2=a13.a1.allb[g].bk;
		
		if(a13.a1.allb[g].k0==a13.a1.b[g2].k0&&a13.a1.allb[g].s>0)
 		a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,""+a13.a1.allb[g].name()+"  "+a13.a1.allb[a13.n1.p[x-1]].name+"之"+a13.n1.p2[x]+" "+(a13.a1.allb[a13.n1.p[x-1]].borntime+a13.a1.allb[a13.n1.p[x-1]].age-a13.a1.b[g2].borntime)+"歲繼任    時年"+(a13.a1.year-a13.a1.b[g2].borntime)+"歲");	
		else 
			a13.setbl(31+x-h,720,(x-h)*40+80,450,30,1,""+a13.a1.allb[g].name()+"  "+a13.a1.allb[a13.n1.p[x-1]].name+"之"+a13.n1.p2[x]+" "+(a13.a1.allb[a13.n1.p[x-1]].borntime+a13.a1.allb[a13.n1.p[x-1]].age-a13.a1.allb[g].borntime)+"歲繼任  享年"+(a13.a1.allb[g].age)+"歲");	
	}
	kp=0;kd=0;
	findoldkid3(k0);
	kp--;kd--;
	if(cl==0)
	a13.setbl(8,720,490,400,30,1,"total descendants:"+kd+"  descendants(living):"+kp+"");
	else if(cl==1)
		a13.setbl(8,720,490,450,30,1,"Patrilineal descendants: "+kd+"  Patrilineal descendants(living):"+kp+"");
	else if(cl==2)
		a13.setbl(8,720,490,450,30,1,"Matrilineal descendants:"+kd+"  Matrilineal descendants(living):"+kp+"");
	a13.setbl(9,720,520,300,30,1,"E: retrun  Left,Right keys: change page");
	a13.seta(11,700,0, 500,580,"talk4");	
}


 String kidy="",kidyy="";
 int kidl=0,host;
 int findoldkid(int h,String y,int l) {//******************當前繼承人譜系
	 
	 int	 g=a13.a1.allb[h].bk;
	 a13.n1.p[a13.n1.pn]=h;a13.n1.pn++;
	 
	 int n=0;
	 if(a13.a1.b[g].k0==h&&a13.a1.b[g].s>0&&h!=k0&&host==-1) {
		 kidy=y;
		 kidyy=a13.a1.b[g].name+a13.a1.b[g].midname();
		 kidl=l;
		 host=h;
	 }
	 for(int z=0;z<a13.a1.allb[h].kidn;z++)
	 {
		 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==2)
			 continue;
		 n++;
		 g=findoldkid(a13.a1.allb[h].kid[z],y+" 's "+n+"th son "+a13.a1.allb[a13.a1.allb[h].kid[z]].name,l+1);
		 if(g>-1)
			 return g;
	 }
	 for(int z=0;z<a13.a1.allb[h].kidn;z++)
	 {
		 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==1)
			 continue;
		 n++;
		 g=findoldkid(a13.a1.allb[h].kid[z],y+" 's "+n+"th daughter "+a13.a1.allb[a13.a1.allb[h].kid[z]].name,l+1);
		 if(g>-1)
			 return g;
	 }
	 
	 
	 g=a13.a1.allb[h].bk;
	 if(a13.a1.b[g].k0==h&&a13.a1.b[g].s>0&&h!=k0) {
		 
		 return h;
	 }
	 a13.n1.pn--;
	 return -1;
 }
 
	
 int kyear,kp=0,kd=0,ksex=0,kclass=0;
 int findoldkid2(int h) {// 歷任繼承人列表
	
	 
	 kd++;
	 int g=a13.a1.allb[h].bk,g2;
	 if(a13.a1.b[g].k0==h&&a13.a1.b[g].s>0)
		 g2=a13.a1.year;
	 else
		 g2=a13.a1.allb[h].borntime+a13.a1.allb[h].age;
	 
	// System.out.println("kid  "+a13.a1.allb[h].name()+"  "+g2+" "+kyear+"\n");
	 if(g2>kyear)
	 {
		// System.out.println("He is!!  "+a13.a1.allb[h].name()+"  "+g2+"\n");
		 if(a13.a1.b[g].k0==h&&a13.a1.b[g].s>0)
			 kyear=a13.a1.year+1;
		 else
		 kyear=a13.a1.allb[h].borntime+a13.a1.allb[h].age;
		 a13.n1.p[a13.n1.pn]=h;
		 if(kp==0&&kd==1&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="daughter";
		 else if(kp==0&&kd==1&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="son";
		 else if(kp==0&&kd==2&&ksex<2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="grandson";
		 else if(kp==0&&kd==2&&ksex<2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="孫女";
		 else if(kp==0&&kd==2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="外孫";
		 else if(kp==0&&kd==2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="外孫女";
		 else if(kp==0&&kd==3&&ksex<2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="曾孫";
		 else if(kp==0&&kd==3&&ksex<2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="曾孫女";
		 else if(kp==0&&kd==3&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="曾外孫";
		 else if(kp==0&&kd==3&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="曾外孫女";
		 else if(kp==0&&kd>3) {
			 
			 if(ksex<2&&a13.a1.allb[h].sex==1) 
					a13.n1.p2[a13.n1.pn]=kd+"世孫";
			 else if(ksex<2&&a13.a1.allb[h].sex==2) 
					a13.n1.p2[a13.n1.pn]=kd+"世孫女";
			 else if(a13.a1.allb[h].sex==1) 
					a13.n1.p2[a13.n1.pn]=kd+"世外孫";
			 else if(a13.a1.allb[h].sex==2) 
					a13.n1.p2[a13.n1.pn]=kd+"世外孫女";
		 }	 
		 else if(kp==1&&kd==0&&a13.a1.allb[h].sex==1) 
			a13.n1.p2[a13.n1.pn]="弟";
		 else if(kp==1&&kd==0&&a13.a1.allb[h].sex==2&&a13.a1.allb[h].borntime<a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
				a13.n1.p2[a13.n1.pn]="姊";
		 else if(kp==1&&kd==0&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="妹";
		 else if(kp==1&&kd==1&&ksex==2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="外甥";
		 else if(kp==1&&kd==1&&ksex==2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="外甥女";
		 else if(kp==1&&kd==2&&ksex==2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="甥孫";
		 else if(kp==1&&kd==2&&ksex==2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="甥孫女";
		 else if(kp==1&&kd==1&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="侄";
		 else if(kp==1&&kd==1&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="侄女";
		 else if(kp==1&&kd==2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="侄孫";
		 else if(kp==1&&kd==2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="侄孫女";
		 
		 else if(kp==1&&kd>2&&ksex==2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]=kp+"世甥孫";
		 else if(kp==1&&kd>2&&ksex==2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]=kp+"世甥孫女";
		 else if(kp==1&&kd>2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]=kp+"世侄孫";
		 else if(kp==1&&kd>2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]=kp+"世侄孫女";
		 	 
		 else if(kp==2&&kd==-1&&ksex<2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="叔";
		 else if(kp==2&&kd==-1&&ksex<2&&a13.a1.allb[h].sex==2) 
			 	a13.n1.p2[a13.n1.pn]="姑";
		 else if(kp==2&&kd==-1&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="舅";
		 else if(kp==2&&kd==-1&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="姨";
		 
		
		 else if(kp>2&&kd<=-1) 
		 {
			 if(kp>(kd*-1)+1)
			 a13.n1.p2[a13.n1.pn]="第"+(kp-(kd*-1))+"代";
			 if(kd>=3)a13.n1.p2[a13.n1.pn]+=((kd)*-1)+"世";
			 if(a13.a1.allb[h].sex==2&&ksex==2) a13.n1.p2[a13.n1.pn]+="表姨";
			 else if(a13.a1.allb[h].sex==2&&ksex==1) a13.n1.p2[a13.n1.pn]+="堂姑";
			 else if(ksex==2)a13.n1.p2[a13.n1.pn]+="表舅"; else a13.n1.p2[a13.n1.pn]+="堂叔";
			 if(kd<=-2) a13.n1.p2[a13.n1.pn]+="祖";
		 }
		 
	   	 else if(kp==2&&kd==0&&ksex<2&&a13.a1.allb[h].sex==1&&a13.a1.allb[h].borntime>a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
					a13.n1.p2[a13.n1.pn]="堂兄";
	   	 else if(kp==2&&kd==0&&ksex<2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="堂弟";
		 else if(kp==2&&kd==0&&ksex<2&&a13.a1.allb[h].sex==2&&a13.a1.allb[h].borntime>a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
					a13.n1.p2[a13.n1.pn]="堂姊";
		 else if(kp==2&&kd==0&&ksex<2&&a13.a1.allb[h].sex==2) 
					a13.n1.p2[a13.n1.pn]="堂妹";
		 else if(kp==2&&kd==0&&a13.a1.allb[h].sex==1&&a13.a1.allb[h].borntime>a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
				a13.n1.p2[a13.n1.pn]="表兄";
		 else if(kp==2&&kd==0&&a13.a1.allb[h].sex==1) 
			a13.n1.p2[a13.n1.pn]="表弟";
		 else if(kp==2&&kd==0&&a13.a1.allb[h].sex==2&&a13.a1.allb[h].borntime>a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
				a13.n1.p2[a13.n1.pn]="表姊";
		 else if(kp==2&&kd==0&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="表妹";
		 else if(kp>=3&&kd==0){
			 a13.n1.p2[a13.n1.pn]="第"+(kp-2)+"代";
			 if(ksex<2&&a13.a1.allb[h].sex==1&&a13.a1.allb[h].borntime<a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
				a13.n1.p2[a13.n1.pn]="堂兄";
			 else if(ksex<2&&a13.a1.allb[h].sex==1) 
				 a13.n1.p2[a13.n1.pn]="堂弟";
			 else if(ksex<2&&a13.a1.allb[h].sex==2&&a13.a1.allb[h].borntime<a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
				a13.n1.p2[a13.n1.pn]="堂姊";
			 else if(ksex<2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="堂妹";
		 
			 else if(a13.a1.allb[h].sex==1&&a13.a1.allb[h].borntime<a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
				a13.n1.p2[a13.n1.pn]="表兄";
			 else if(a13.a1.allb[h].sex==1) 
				 a13.n1.p2[a13.n1.pn]="表弟";
			 else if(a13.a1.allb[h].sex==2&&a13.a1.allb[h].borntime<a13.a1.allb[a13.n1.p[a13.n1.pn-1]].borntime) 
				 a13.n1.p2[a13.n1.pn]="表姊";
			 else if(a13.a1.allb[h].sex==2) 
				 a13.n1.p2[a13.n1.pn]="表妹";
		 }
		
		 else if(kp==2&&kd==1&&ksex==2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="表侄";
		 else if(kp==2&&kd==1&&ksex==2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="表侄女";
		 else if(kp==2&&kd==2&&ksex==2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="表侄孫";
		 else if(kp==2&&kd==2&&ksex==2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="表侄孫女";
		 else if(kp==2&&kd==1&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="堂侄";
		 else if(kp==2&&kd==1&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="堂侄女";
		 else if(kp==2&&kd==2&&a13.a1.allb[h].sex==1) 
				a13.n1.p2[a13.n1.pn]="堂侄孫";
		 else if(kp==2&&kd==2&&a13.a1.allb[h].sex==2) 
				a13.n1.p2[a13.n1.pn]="堂侄孫女";
		
		 else if(kp>2&&kd>=1) 
		 {	
			 a13.n1.p2[a13.n1.pn]="第"+kp+"代";
			 if(kd>=3)a13.n1.p2[a13.n1.pn]+=kp+"世";
			 if(ksex==2)a13.n1.p2[a13.n1.pn]+="表侄"; else a13.n1.p2[a13.n1.pn]+="堂侄";
			 if(kd>=2) a13.n1.p2[a13.n1.pn]+="孫";
			 if(a13.a1.allb[h].sex==2) a13.n1.p2[a13.n1.pn]+="女";
		 }
		 else {
			 a13.n1.p2[a13.n1.pn]="遠親";
		 }
		 
		 
		  g=a13.a1.allb[h].bk;
		 if(a13.a1.b[g].k0==h&&a13.a1.b[g].s>0) {
				
			 a13.n1.p[a13.n1.pn]=h;a13.n1.pn++;
			 kp=0;kd=0;ksex=0;
			 return 1;
		 }
		 		 a13.n1.pn++;
		 		 kp=0;kd=0;ksex=0;
	 }
	 else {
		 if(a13.a1.allb[h].sex==2)
			 ksex=2;
	 }
	 
	 int n=0;
	
	 
	 if(a13.a1.allb[h].kidn>48)
		 a13.a1.allb[h].kidn=48;
	 if(kclass!=2)
	 {
		 for(int z=0;z<a13.a1.allb[h].kidn;z++)
		 {
			
			 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==2)
				 continue;
			 n++;
			 
			 if(findoldkid2(a13.a1.allb[h].kid[z])>0)
				 return 1;
		 
		 }
	 }
	 if(kclass!=1)
	 {	 
	 for(int z=0;z<a13.a1.allb[h].kidn;z++)
	 {
		 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==1)
			 continue;
		 n++;
		 if(findoldkid2(a13.a1.allb[h].kid[z])>0)
			 return 1;
		
	 }
	 }

	 if(kp>=0&&kd==kp*-1)
		 kp++;
	 kd--;
	
	 return -1;
 }
 

 void findoldkid3(int h) {// 所有後裔
	 
	 if(a13.a1.allb[h].findg==1)
		 return;
	 a13.a1.allb[h].findg=1;
	 int g=a13.a1.allb[h].bk;
	 
	 kd++;
	 if(a13.a1.b[g].k0==h&&a13.a1.b[g].s>0) {
			
		kp++;
	 }
	 if(a13.a1.allb[h].kidn>48)
		 a13.a1.allb[h].kidn=48;
	 if(kclass!=2)
	 {
		 for(int z=0;z<a13.a1.allb[h].kidn;z++)
		 {
			 
			 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==2)
				 continue;	
			 findoldkid3(a13.a1.allb[h].kid[z]);
		
		 }
	 }
	 if(kclass!=1)
	 {
		 for(int z=0;z<a13.a1.allb[h].kidn;z++)
		 {
			 if(a13.a1.allb[a13.a1.allb[h].kid[z]].sex==1)
				 continue;	
			 findoldkid3(a13.a1.allb[h].kid[z]);
		 }
	 }
		
 }
 void findoldkidcl(int h) {// 查詢完清理所有後裔
	 
	 if(a13.a1.allb[h].findg==0)
		 return;
	 a13.a1.allb[h].findg=0;
	 //int g=a13.a1.allb[h].bk;
	 if(a13.a1.allb[h].kidn>48)
		 a13.a1.allb[h].kidn=48;
	for(int z=0;z<a13.a1.allb[h].kidn;z++)
	{
		findoldkidcl(a13.a1.allb[h].kid[z]);		
	}
	 
	
 }

 
 int age() {
	if(s<0)
		return age;
	else
		return a13.a1.b[bk].age();
 }
 String flname(int kk) {
	 
	// String yy="";
	 
	 
	 String y0[]= {"sibling","grandson","granddaughter","grandson","granddaughter","son","daughter","older brother","older sister","younger brother","younger sister"};
	 String y2="";String y[]= {"sibling","uncle","aunt","uncle","aunt","nephew","niece","nephew","niece","grandson","granddaughter","grandson","granddaughter","cousin","cousin","cousin","cousin"};
	 
	 y2="";
	 if(fa0==a13.a1.allb[kk].fa0||ma0==a13.a1.allb[kk].ma0)
	 {
		 if(fa0==a13.a1.allb[kk].fa0&&ma0==a13.a1.allb[kk].ma0)
			 y2="";
		 else if(fa0==a13.a1.allb[kk].fa0)
			 y2="(half)";
		 else if(ma0==a13.a1.allb[kk].ma0)
			 y2="half";
		 if(borntime>a13.a1.allb[kk].borntime&&a13.a1.allb[kk].sex==2)
		 y2+="sister";
		 else if(borntime<a13.a1.allb[kk].borntime&&a13.a1.allb[kk].sex==2)
			 y2+="sister";
		 else if(borntime==a13.a1.allb[kk].borntime)
			 y2+="sibling";
		 else if(borntime<a13.a1.allb[kk].borntime&&a13.a1.allb[kk].sex==1)
			 y2+="brother";
		 else if(borntime>a13.a1.allb[kk].borntime&&a13.a1.allb[kk].sex==1)
			 y2+="brother";		
		 
		 //y2+=" ";
	 }
	 else if(fa0>=0&&a13.a1.allb[kk].fa0>=0){
		    int m1[]=new int [5];	int m2[]=new int [5];			
	    	m1[0]=a13.a1.allb[fa0].fa0;
	    	m1[1]=a13.a1.allb[fa0].ma0;
	    	m1[2]=a13.a1.allb[ma0].fa0;
	    	m1[3]=a13.a1.allb[ma0].ma0;
	    	if(m1[0]==m1[2])
	    		m1[2]=-1;
	    	if(m1[1]==m1[3])
	    		m1[3]=-2;
	    	
	    	m2[0]=a13.a1.allb[a13.a1.allb[kk].fa0].fa0;
	    	m2[1]=a13.a1.allb[a13.a1.allb[kk].fa0].ma0;
	    	m2[2]=a13.a1.allb[a13.a1.allb[kk].fa0].ma0;
	    	m2[3]=a13.a1.allb[a13.a1.allb[kk].fa0].ma0;
	    	if(m2[0]==m2[2])
	    		m2[2]=-3;
	    	if(m2[1]==m2[3])
	    		m2[3]=-4;
	    	int gh=0;
	    	for(int i=0;i<4;i++) {
	    		for(int j=0;j<4;j++) {
	    			if(m1[i]==m2[j])gh++;
	    		}
	    	}
	    	y2="";
	    	if(gh==2)
	    		y2="*";
	    	if(gh==3)
	    		y2="**";
	    	if(gh==4)
	    		y2="***";
	    	
	    	if(gh>=1&&m1[0]==m2[0]) {
	    		y2+="堂";
	    		if(borntime>=a13.a1.allb[kk].borntime)
	    			y2+=y0[6+a13.a1.allb[kk].sex];
	    		if(borntime<=a13.a1.allb[kk].borntime)
	    			y2+=y0[8+a13.a1.allb[kk].sex];
	    		
	    	}
	    	else if(gh>=1) {
	    		y2+="表";
	    		if(borntime>=a13.a1.allb[kk].borntime)
	    			y2+=y0[6+a13.a1.allb[kk].sex];
	    		if(borntime<=a13.a1.allb[kk].borntime)
	    			y2+=y0[8+a13.a1.allb[kk].sex];
	    		
	    	}
			
		 
	 }
	 
	 
	 y2+=" ";
	 if(a13.a1.allb[k0].fa0==kk)//子
			y2="Father";//子
	 else if(a13.a1.allb[k0].ma0==kk)//子
			y2="Mather";//子
	 else if((a13.a1.allb[kk].fa0==k0||a13.a1.allb[kk].ma0==k0))//子
			y2=y0[a13.a1.allb[kk].sex+4];//子
	 else if(a13.a1.allb[kk].fa0>0&&(a13.a1.allb[a13.a1.allb[kk].fa0].fa0==k0||a13.a1.allb[a13.a1.allb[kk].fa0].ma0==k0))//孫
			y2=y0[a13.a1.allb[kk].sex];//孫
	 else if(a13.a1.allb[kk].ma0>0&&(a13.a1.allb[a13.a1.allb[kk].ma0].fa0==k0||a13.a1.allb[a13.a1.allb[kk].ma0].ma0==k0))//外孫
			y2=y0[a13.a1.allb[kk].sex+2];//外孫
	 else if(fa0>=0&&a13.a1.allb[fa0].fa0==a13.a1.allb[kk].fa0)
		 	y2+=y[a13.a1.allb[kk].sex];
	 else if(fa0>=0&&a13.a1.allb[ma0].fa0==a13.a1.allb[kk].fa0)
			y2+=y[a13.a1.allb[kk].sex+2];
	 else if(fa0>=0&&a13.a1.allb[ma0].ma0==a13.a1.allb[kk].ma0)
			y2+=y[a13.a1.allb[kk].sex+2];
	 else if(fa0>=0&&a13.a1.allb[fa0].ma0==a13.a1.allb[kk].ma0)
			y2+=y[a13.a1.allb[kk].sex+2];
	 else if(a13.a1.allb[kk].fa0>0&&a13.a1.allb[a13.a1.allb[kk].fa0].fa0==fa0)
			y2+=y[a13.a1.allb[kk].sex+4];
	 else if(a13.a1.allb[kk].fa0>0&&a13.a1.allb[a13.a1.allb[kk].fa0].ma0==ma0)
			y2+=y[a13.a1.allb[kk].sex+6];
	 else if(a13.a1.allb[kk].ma0>0&&a13.a1.allb[a13.a1.allb[kk].ma0].fa0==fa0)
			y2+=y[a13.a1.allb[kk].sex+6];
	 else if(a13.a1.allb[kk].ma0>0&&a13.a1.allb[a13.a1.allb[kk].ma0].ma0==ma0)
			y2+=y[a13.a1.allb[kk].sex+6];
	 
	 
	 if(fa0>=0) {
		 
		 if(a13.a1.allb[fa0].fa0==kk)
			 	y2+="Paternal grandfa";
		 else if(a13.a1.allb[fa0].ma0==kk)
			 	y2+="Paternal grandma";
		 else if(a13.a1.allb[ma0].fa0==kk)
			 	y2+="Maternal grandfa";
		 else if(a13.a1.allb[ma0].ma0==kk)
			 	y2+="Maternal grandma";
		 }
	 
	 return y2;
	 
	 
 	}
 


}

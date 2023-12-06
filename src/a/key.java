package a;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;


import java.io.Serializable;
import java.text.DecimalFormat;
class key extends KeyAdapter{
	
	int q=0,g,k,gg,k2,gh,g2,Z,ly=0,stop=0,screen=0,G=0,Gmap[][],page,wdelay=0,v0=0;//q=15+
	int flag=0,event=0,eventn=0,chw=0;
	
	int sinlightstart=0;
	int Rlevel=0;
	int p_dir;//0左1右2上3下
	key()
	{
		Gmap=new int [101][101];
		
	}
	public void keyPressed(KeyEvent e){
		
		
		a13.keystate=0;
		char charA=e.getKeyChar();
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_UP:
			//	System.out.println("你按了《up》鍵");
				if(q==0)
					a13.dy--;
				else if(q==1) {
					
					a13.a1.mapy--;
				}
				else if(q==2)
					a13.a1.mapy-=10;
				else if((q==4||q==5||q==6||q==15)&&ly>0)
					ly--;
				else if((q==7||q==8)) {
					page+=10;
					if(q==7)a13.a1.allb[k].showfbl22(page);
					if(q==8)a13.a1.allb[k].showfbl23(page);
				}
				else if(q==9&&(page>0||ly>0)) {
					ly--;
					if(ly==-1)
					{
						ly=9;
						page-=10;
						if(page<0)page=0;			
						a13.a1.allb[k].showfbl24(page);
					}	
				}
				else if(q==14&&(page>0||ly>0)) {
					ly--;
					if(ly==-1)
					{
						ly=9;
						page-=10;
						if(page<0)page=0;	
						if(a13.a1.allb[k].wifen>0)
							a13.a1.allb[k].showfbl21_w(page);
						else
						a13.a1.allb[k].showfbl21(page);
					}	
				}
				else if((q==10||q==11||q==12||q==13)&&(page>0||ly>0)) {
					ly--;
					if(ly==-1)
					{
						ly=9;
						page-=10;
						if(page<0)page=0;	
						if(q==10)
						a13.a1.allb[k].showfbl25(page);
						if(q==11||q==12||q==13) {
							
							a13.a1.allb[k].showfbl26(page,q-11);
						}
					}	
				}
				else if(q==17&&ly>0) {
					ly--;
					if(ly==-1)
					{
						ly=9;
						page-=10;
						if(page<0)page=0;	
						a13.a1.group[k].showgleader(page);
					}		
				}
				else if(q==18&&v0==1&&event==1&&eventn>0) {
					eventn-=1;
					showevent(eventn);
				}
				else if(q==21&&page+ly>0) {
					ly--;
					if(ly<0) {
						ly=9;
						page-=10;
						a13.a1.f[k].history(page+ly);
					}
					
				}
				
				break;
			case KeyEvent.VK_DOWN:
				//System.out.println("你按了《down》鍵");
				
					
					if(q==0)
						a13.dy++;
					else if(q==1)
						a13.a1.mapy++;
					else if(q==2)
						a13.a1.mapy+=10;
					else if(q==4&&ly<a13.a1.ln-1)
						ly++;
					else if(q==5&&(page+ly)<a13.a1.allbn-1&&ly<9)
						ly++;
					else if(q==15&&(page+ly)<a13.a1.groupn&&ly<9)
						ly++;
					else if(q==6&&(ly)<6-1)
						ly++;
					else if((q==7||q==8)&&page>=10) {
						page-=10;
						if(q==7)a13.a1.allb[k].showfbl22(page);
						if(q==8)a13.a1.allb[k].showfbl23(page);
					}
					else if(q==9&&page+ly<a13.a1.allb[k].kidn-1) {
						ly++;
						if(ly>9)
						{
							ly=0;page+=10;
							a13.a1.allb[k].showfbl24(page);
						}		
					}
					else if(q==14&&page+ly<a13.a1.allb[k].loven-1) {
						ly++;
						if(ly>9)
						{
							ly=0;page+=10;
							if(a13.a1.allb[k].wifen>0)
								a13.a1.allb[k].showfbl21_w(page);
							else
							a13.a1.allb[k].showfbl21(page);
						}		
					}	
					else if((q==10||q==11||q==12||q==13)&&page+ly<a13.n1.pn-1) {
						ly++;
						if(ly>9)
						{
							ly=0;page+=10;
							if(q==10)
								a13.a1.allb[k].showfbl25(page);
							if(q==11||q==12||q==13)
								a13.a1.allb[k].showfbl26(page,q-11);	
						}		
					}
					else if(q==17&&page+ly<a13.a1.group[k].leadern-1) {
						ly++;
						if(ly>9)
						{
							ly=0;page+=10;
							a13.a1.group[k].showgleader(page);
						}		
					}
					else if(q==18&&v0==1&&event==1) {
						eventn+=1;
						showevent(eventn);
					}
					else if(q==21&&page+ly<a13.a1.f[k].hostn-1) {
						ly++;
						if(ly>=10) {
							ly=0;
							page+=10;
							a13.a1.f[k].history(page+ly);
						}
						
					}
				break;
			case KeyEvent.VK_LEFT:
				//System.out.println("你按了《left》鍵");
				
					if(q==0)
						a13.dx--;
					else if(q==1)
						a13.a1.mapx--;
					else if(q==2)
						a13.a1.mapx-=12;
					else if((q==5)&&page>=10) {
						page-=10;
						showpeople();
					}
					else if((q==15)&&page>=10) {
						page-=10;
						showgroup();
					}
					else if(q==14)
					{
						q=6;a13.a1.allb[k].showfbl2();	
					}
					else if(q==7)
					{
						page=0;ly=0;
						q=14;if(a13.a1.allb[k].wifen>0)
							a13.a1.allb[k].showfbl21_w(page);
						else
						a13.a1.allb[k].showfbl21(page);
					}
					
					else if(q==8)
					{
						page=0;ly=0;
						q--;a13.a1.allb[k].showfbl22(0);	
					}
					else if(q==9)
					{
						page=0;ly=0;
						q--;a13.a1.allb[k].showfbl23(0);	
					}
					else if(q==10)
					{
						page=0;ly=0;
						q--;a13.a1.allb[k].showfbl24(0);	
					}
					else if(q==11)
					{
						page=0;ly=0;
						q--;a13.a1.allb[k].showfbl25(0);	
					}
					else if(q==12||q==13)
					{
						page=0;ly=0;
						q--;a13.a1.allb[k].showfbl26(0,q-11);	
					}
					else if(q==17&&page>0) {					
						page-=10;ly=0;
						a13.a1.group[k].showgleader(page) ;	
					}
					else if(q==18) {	
						if(event==0&&page>0)
						{
							page-=10;eventn=0;
							event=1;showevent(0) ;	
							break;
						}
						event=0;
						//page-=10;ly=0;
						showdecade() ;	
					}
					
				break;
			case KeyEvent.VK_RIGHT:
				//
				
				System.out.println("你按了《right》鍵");
				if(q==0)
					a13.dx++;
				else if(q==1)
					a13.a1.mapx++;
				else if(q==2)
					a13.a1.mapx+=12;
				else if(q==16) {
					q=17;
					page=0;ly=0;
					a13.a1.group[k].showgleader(0) ;	
				} 
				else if(q==17&&page+10<a13.a1.group[k].leadern) {
					q=17;
					page+=10;ly=0;
					a13.a1.group[k].showgleader(page) ;	
				}
				else if((q==5&&page<a13.a1.allbn-1)) {
					page+=10;ly=0;
					showpeople();
				
				}
				else if((q==15&&page<a13.a1.groupn)) {
					page+=10;ly=0;
					showgroup();
				
				}
				else if(q==6)
				{
					page=0;ly=0;
					q=14;if(a13.a1.allb[k].wifen>0)
						a13.a1.allb[k].showfbl21_w(page);
					else
					a13.a1.allb[k].showfbl21(page);			
				}
				else if(q==14)
				{
					page=0;ly=0;
					q=7;a13.a1.allb[k].showfbl22(page);		
				}
				else if(q==7)
				{
					page=0;ly=0;
					q++;a13.a1.allb[k].showfbl23(page);			
				}
				else if(q==8)
				{
					page=0;ly=0;
					q++;a13.a1.allb[k].showfbl24(page);			
				}
				else if(q==9)
				{
					page=0;ly=0;
					q++;a13.a1.allb[k].showfbl25(page);			
				}
				else if(q==10)
				{
					page=0;ly=0;
					q++;a13.a1.allb[k].showfbl26(page,0);			
				}
				else if(q==11||q==12)
				{
					page=0;ly=0;
					q++;a13.a1.allb[k].showfbl26(page,q-11);			
				}
				else if(q==18) {	
					if(event==0)
					{
						eventn=0;
						event=1;showevent(0) ;	
						break;
					}
					event=0;page+=10;
					showdecade() ;	
				}

				break;
		}
		switch(charA)
		{
		
		case 'p':
		case 'P':
			
			if(stop==0)
				stop=1;
			else
				stop=0;
			break;
			
			case 'o':
			case 'O':
				if(a13.a130.close==1) {
					a13.a130.start();
					a13.a130.close=0;
				}
					else {
						a13.a130.close=1;
						a13.a130.cleansceen();
					}
		
				
				
		    case 'C':
		    case 'c':
		  
		    	
		    	g=a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy];
		    	if(g>1000) {
		    		g-=1000;
		    		a13.a1.b[g].creategroup();
		    		a13.a1.group[0].level=2;
		    		a13.a1.f[a13.a1.fn]=new farmer(a13.a1.fn,6,8,g,0,0);
		    		a13.a1.fn++;
		    	
		    	}
		    	//a13.a1.b[1].setgoplace(2550, 2550, 11);
			
			break;
		    case 'w':
		    	a13.a1.mainset(a13.dx+a13.a1.mapx,a13.dy+a13.a1.mapy,44,9);
		    	wdelay=3;
		    	break;
		    case 'W':
		    	a13.a1.mainset(a13.dx+a13.a1.mapx,a13.dy+a13.a1.mapy,47,17);
		    	wdelay=5;
		    	
		    	break;
			
		    case 'G':
		    	
		    	if(a13.screensize==0)
		    		a13.screensize=1;
		    	else if(a13.screensize==1)
		    		a13.screensize=3;
		    	else if(a13.screensize==3)
		    		a13.screensize=0;
		    	else
		    		a13.screensize=0;
		    	a13.a130.clearpp();
		    	break;
		    case 'g':
			
				int gx,gy,gn;
				
				G++;
				if(G>3)
					G=0;
				if(G==0) {
					screen=0;
					a13.cleanbl(31);
					break;
				}
			countG();
					
			break;
		
			case '\n':
				System.out.println("你按了《enter》鍵");
				if(q==4)
				{
					g=a13.a1.lightkid[ly];
					if(a13.a1.b[g].s<0||a13.a1.b[g].k0!=a13.a1.lightkid0[ly])
						break;
					g+=1000;
				}else
				g=a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy];
				
				if(g>=1000)
				{
					for(int i=1;i<10;i++)
						a13.cleanbl(i);
					k=g-1000;
					a13.seta(11,700,0, 500,580,"talk4");
					screen=1;
					a13.a1.b[k].showfbl();	
				}
				
				break;
			
			case 'f':
			case 'F':
				
				
			
				if(q==17&&page+ly<a13.a1.group[k].leadern)
				{
					g=page+ly;
					g=a13.a1.group[k].leader0[g];
					q=6;
					screen=1;
					k=g;
					a13.a1.allb[k].showfbl2();	
					break;
				}
				if(q==15)
				{
					g=page+ly;
					q=16;
					screen=1;
					k=g;
					a13.a1.group[k].showbl();	
					break;
				}
				if(q==10||q==11||q==12||q==13)
				{
					if(a13.n1.pn<=page+ly)
						break;
					k=a13.n1.p[page+ly];
					q=6;
					screen=1;
					a13.a1.allb[k].showfbl2();	
					break;
				}
				if(q==14)
				{
					
					k=a13.a1.allb[k].love[page+ly];
					q=6;
					screen=1;
					a13.a1.allb[k].showfbl2();	
					break;
				}
				if(q==9)
				{
					k=a13.a1.allb[k].kid[page+ly];
					q=6;
					screen=1;
					a13.a1.allb[k].showfbl2();	
					break;
				}
				if(q==6)
				{
					if(ly==0&&a13.a1.allb[k].fa0>=0)k=a13.a1.allb[k].fa0;
					else if(ly==1&&a13.a1.allb[k].ma0>=0)k=a13.a1.allb[k].ma0;
					else if(ly==2&&a13.a1.allb[k].fa0>=0&&a13.a1.allb[a13.a1.allb[k].fa0].fa0>=0)k=a13.a1.allb[a13.a1.allb[k].fa0].fa0;
					else if(ly==3&&a13.a1.allb[k].fa0>=0&&a13.a1.allb[a13.a1.allb[k].fa0].ma0>=0)k=a13.a1.allb[a13.a1.allb[k].fa0].ma0;
					else if(ly==4&&a13.a1.allb[k].ma0>=0&&a13.a1.allb[a13.a1.allb[k].ma0].fa0>=0)k=a13.a1.allb[a13.a1.allb[k].ma0].fa0;
					else if(ly==5&&a13.a1.allb[k].ma0>=0&&a13.a1.allb[a13.a1.allb[k].ma0].ma0>=0)k=a13.a1.allb[a13.a1.allb[k].ma0].ma0;
					else
						break;
					q=6;
					screen=1;
					a13.a1.allb[k].showfbl2();	
					break;
				}
				else if(q==5)
				{
					g=page+ly;
					q=6;
					screen=1;
					k=g;
					a13.a1.allb[k].showfbl2();	
					break;
				}
				else if(q==4)
				{
					g=a13.a1.lightkid0[ly];
					q=6;
					screen=1;
					k=g;
					a13.a1.allb[k].showfbl2();	
					break;
				}
				else if(q==21)
				{
					g=page+ly;
					q=6;
					screen=1;
				
					k=a13.a1.f[k].hostall[g];
					page=0;ly=0;
					a13.a1.allb[k].showfbl2();	
					break;
				}
				else if(a13.screensize>=3)
					break;
				else
				g=a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy];
				
				if(g>=1000)
				{
					q=6;
					k=a13.a1.b[g-1000].k0;
					screen=1;
					a13.a1.allb[k].showfbl2();		
				}
				else if(g>=500)
				{
					q=6;
					k=a13.a1.map2[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-500;
					screen=2;
					a13.a1.group[k].showbl();		
				}
				else if(g==151||g==152||g==153)
				{
					q=6;
					k=a13.a1.map2[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-1000;
					screen=1;
					a13.a1.allb[k].showfbl2();		
				}
				if(a13.a1.maphost[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>0&&a13.a1.mapall[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]==23)
				{
					
					q=21;
					screen=1;
					ly=0;
					page=0;
					k=a13.a1.maphost[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy];
					a13.a1.f[k].history(0);	
					break;
				}
				
					
				break;
			case 'e':
			case 'E':
				a13.clean();
				//a13.seta(1,0, 0, 700, 580,"talk");
				a13.seta(2,700,0, 500,580,"talk4");
				a13.seta(3,1000,20, 180,200,"talk2");
				
				q=0;event=0;
				v0=0;
				screen=0;
				G=1;
				a13.a1.state=0;
				
				
				break;
			case 'v':
			case 'V':
				
				q=5;ly=0;
				page=0;screen=2;
				event=0;
				v0++;if(v0>3)v0=1;
				if(v0==1)
					showdecade();
				else if(v0==2)
					showpeople();
				else if(v0==3)
					 showinformation();
				
				break;
			
			
		
				
			
				
			case 'd':
			case 'D':
				
				if(q==4&&ly<a13.a1.ln) {
					
					if(a13.a1.b[a13.a1.lightkid[ly]].k0==a13.a1.lightkid0[ly]) 
					a13.a1.b[a13.a1.lightkid[ly]].light=0;
					for(int i=ly;i<a13.a1.ln-1;i++)
					{
						a13.a1.lightkid[i]=a13.a1.lightkid[i+1];
						a13.a1.lightkid0[i]=a13.a1.lightkid0[i+1];
					}
					a13.a1.ln--;
					
					if(a13.a1.ln<0)
						a13.a1.ln=0;
				}
				
				break;
			case 'R':
				if(Rlevel==0)
				a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=304;
				if(Rlevel==1)
					a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=307;
				if(Rlevel==2)
					a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=308;
				if(Rlevel==3)
					a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=309;
				
				break;
			case 'r':
				
				g=a13.a1.mapall[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy];
				gg=g%10+1;
				if(gg>9)gg=9;
				g=30+gg;
				a13.a1.mapall[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=g;
				
				break;
			case 'k':
			case 'K':
				g=a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy];
				if(g>=1000)
				{
					g=g-1000;
					if(a13.a1.b[g].group>=0) {
						q=16;
						a13.a1.group[a13.a1.b[g].group].showbl();
					}
					
				}
				else {
					q=15;
					page=0;
					showgroup() ;
				}
				break;
		
			case 'L':
				if(sinlightstart==0)
					sinlightstart=1;
				else
					sinlightstart=0;
				break;
				
			case 'l':
				int k0;
				if(a13.a1.ln>=7)
					break;
				if(a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>=1000) {
					k=a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-1000;
					k0=a13.a1.b[k].k0;
					if(a13.a1.b[k].light==0)
					{
						a13.a1.lightkid[a13.a1.ln]=k;
						a13.a1.lightkid0[a13.a1.ln]=k0;
						a13.a1.ln++;
						a13.a1.b[k].light=1;
					}
					else {
						g=a13.a1.ln;
						for(int z=0;z<a13.a1.ln;z++)
						{
							if(a13.a1.lightkid[z]==k)
							{
								g=z;
								break;
							}
						}
						a13.a1.b[k].light=0;
						for(int i=g;i<a13.a1.ln-1;i++)
						{
							a13.a1.lightkid[i]=a13.a1.lightkid[i+1];
							a13.a1.lightkid0[i]=a13.a1.lightkid0[i+1];
						}
						a13.a1.ln--;	
					}
				}
				
				break;
			
			case 'M':
			case 'm':
			//	if(a13.a1.mary==0&&a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]==-1) {
			//		a13.a1.newone(1, 2, 0, "Mary", a13.dx+a13.a1.mapx, a13.dy+a13.a1.mapy,0);
				//	a13.a1.mary++;
			//	}
				break;
			
			case 'h':
			case 'H':
				if(a13.keystate!=0)
					break;
				if(a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>=1000) {
					g=a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-1000;
					a13.a1.b[g].sick=0;
					a13.a1.b[g].serioussick=0;
					a13.a1.b[g].pain=0;
					a13.a1.b[g].hungry=-50;
					a13.keystate=302;
				}
				break;
				
			case 'i':
				p_dir++;
				if(p_dir==6)
					p_dir=0;
				
				break;
				
			case 'I':
				Rlevel++;
				if(Rlevel>3)
					Rlevel=0;
				
				break;
			case 'q':
			case 'Q':
				q++;
				if(q>2)
					q=0;
				break;
			
			case 'a':
				if(screen==0&&q<4) {
					
					a13.a1.saveprepare=1;
					
				}
					
				break;
				
			
				
			case 'S':
			case 's':
				
				if(q!=4) {
				q=4;
				a13.a1.state=1;
				}
				else {
					q=0;
					a13.a1.state=0;
				}
				
				break;
				
			case 'T':
				if(a13.keystate!=0)
					break;
				a13.keystate=303;
				if(a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>=1000)
				{
					g=a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-1000;
					
					a13.a1.allb[a13.a1.b[g].k0].diereason="受電擊死";
					a13.a1.b[a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-1000].die();
				}
				else if(a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>-1)
				{
					a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=-1;
					if(a13.a1.maphost[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>0)
					{
						g=a13.a1.maphost[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy];
						a13.a1.f[g].field[a13.dx+a13.a1.mapx-a13.a1.f[g].x][a13.a1.f[g].y-(a13.dy+a13.a1.mapy)]=-1;
					}
					
				}
				a13.a1.mapall[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=11;
				
				break;
				
			case 't':
				if(a13.keystate!=0)
					break;
				a13.keystate=301;
				if(a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>=1000)
				{
					g=a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-1000;
					if(a13.a1.b[g].hungry>=85)
					{
						a13.a1.allb[a13.a1.b[g].k0].diereason="受電擊死";
						a13.a1.b[a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-1000].die();	
						break;
					}
						
					a13.a1.b[a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-1000].pain+=3;
					a13.a1.b[g].hungry+=20;
					gg=(int)(Math.random()*12121)%2;
					if(p_dir==1) 
					a13.a1.b[g].setgoplace(a13.a1.b[g].x-2-gg, a13.a1.b[g].y, 20);
					if(p_dir==2)
						a13.a1.b[g].setgoplace(a13.a1.b[g].x+2+gg, a13.a1.b[g].y, 20);
					if(p_dir==3) {
						a13.a1.b[g].setgoplace(a13.a1.b[g].x, a13.a1.b[g].y-2-gg, 20);
						
					}
					if(p_dir==4) {
						a13.a1.b[g].setgoplace(a13.a1.b[g].x, a13.a1.b[g].y+2+gg, 20);
						for(int i=a13.a1.b[g].y;i<=a13.a1.b[g].y+6;i++)
						{
							if(a13.a1.map[a13.a1.b[g].x][i]>=304&&a13.a1.map[a13.a1.b[g].x][i]<=309) {
								if((int)(Math.random()*1211)%2==0)
								a13.a1.b[g].sad+=2;
								else
									a13.a1.b[g].sad+=3;
							}
						}
					
					}
					if(p_dir==5) {
						if(a13.a1.b[g].tie>0)
						a13.a1.b[g].tie=0;
						else
							a13.a1.b[g].tie=100;
					}
					if(p_dir==0)a13.a1.b[g].stop=3;
					if(p_dir>0)
					a13.a1.b[g].cn=0;
					
					
					
					break;
				}
				else if(a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>-1)
				{
					a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=-1;
					break;
				}
				g=a13.a1.mapall[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy];
				gg=g%10;
				if(gg>1)
					a13.a1.mapall[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]-=1;
				
				if(a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]>=1000)
				{
				
				}
				
				
				break;
			
			
			case 'x':
			case 'X':
				

				if(q==10||q==11||q==12||q==13)
				{
					if(a13.n1.pn<=page+ly)
						break;
					g=a13.n1.p[page+ly];
					gh=a13.a1.allb[g].bk;
					if(a13.a1.b[gh].k0==g&&a13.a1.b[gh].s>0)
					{
						a13.a1.mapx=a13.a1.b[gh].x-5;
						a13.a1.mapy=a13.a1.b[gh].y-5;
						a13.dx=5;a13.dy=5;
					}
					break;
				}
				if(q==14) {
					g=a13.a1.allb[k].love[page+ly];
					gh=a13.a1.allb[g].bk;
					if(a13.a1.b[gh].k0==g&&a13.a1.b[gh].s>0)
					{
						a13.a1.mapx=a13.a1.b[gh].x-5;
						a13.a1.mapy=a13.a1.b[gh].y-5;
						a13.dx=5;a13.dy=5;
					}
					break;
				}
				if(q==5)
				{
 					g=page+ly;
					gh=a13.a1.allb[g].bk;
					if(a13.a1.b[gh].k0==g&&a13.a1.b[gh].s>0)
					{
						a13.a1.mapx=a13.a1.b[gh].x-5;
						a13.a1.mapy=a13.a1.b[gh].y-5;
						a13.dx=5;a13.dy=5;
					}			
					break;
				}
				if(q==15)
				{
 					g=page+ly;
 					if(g<a13.a1.groupn) {
 						gh=a13.a1.group[g].leader;
						a13.a1.mapx=a13.a1.group[g].x;
						a13.a1.mapy=a13.a1.group[g].y;
						a13.dx=5;a13.dy=5;
						
 					}
					break;
				}
				if(q==9)
				{
					a13.n1.pn=0;
					
					g=a13.a1.allb[k].kid[page+ly];
					gh=a13.a1.allb[g].bk;
					if(a13.a1.b[gh].k0==g&&a13.a1.b[gh].s>0)
					{
						a13.a1.mapx=a13.a1.b[gh].x-5;
						a13.a1.mapy=a13.a1.b[gh].y-5;
						a13.dx=5;a13.dy=5;
					}		
					break;
				}
				if(q==4) {
					k=ly;
					k=a13.a1.lightkid[ly];
				 a13.a1.mapx=a13.a1.b[k].x-5;
				 a13.a1.mapy=a13.a1.b[k].y-5;
				 a13.dx=5;a13.dy=5;
				 break;
				}
				if(a13.screensize==3)
				{
					a13.screensize=0;
					a13.a1.mapx=a13.a1.mapx+(a13.dx-12)*6;
					a13.a1.mapy=a13.a1.mapy+(a13.dy-10)*5;
					a13.dx=5;
					a13.dy=5;
					break;
				}
				
				
				break;
			case 'Y':
			case 'y':
				if(a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]==-1)
				a13.a1.map[a13.dx+a13.a1.mapx][a13.dy+a13.a1.mapy]=201;
				
				break;
			case 'z':
			case 'Z':
				
					if(q==14)
					{
						if(chw==1)
							a13.a1.allb[k].showfbl21(0);
						else
							a13.a1.allb[k].showfbl21_w(0);
					}
				
				Z++;
				if(Z>4)Z=0;
				
				break;
			
			
		
		}
		if(a13.dx<0)
		{			
			if(a13.screensize==0)
			{
				a13.a1.mapx-=12;
				a13.dx=11;
			}
			else if(a13.screensize==1)
			{
				a13.a1.mapx-=24;
				a13.dx=23;
			}
			else if(a13.screensize==2)
			{
				a13.a1.mapx-=60;
				a13.dx=59;	
			}
			else if(a13.screensize==3)
			{
				a13.a1.mapx-=6*24;
				a13.dx=23;	
			}
		}
		else if(a13.dx>11&&a13.screensize==0)
		{
			a13.a1.mapx+=12;
			a13.dx=0;	
		}
		else if(a13.dx>23&&a13.screensize==1)
		{
			a13.a1.mapx+=24;
			a13.dx=0;	
		}
		else if(a13.dx>59&&a13.screensize==2)
		{
			a13.a1.mapx+=60;
			a13.dx=0;	
		}
		else if(a13.dx>23&&a13.screensize==3)
		{
			a13.a1.mapx+=24*6;
			a13.dx=0;	
		}
		
		
		
		if(a13.dy<0)
		{
			
			if(a13.screensize==0)
			{
				a13.a1.mapy-=10;
				a13.dy=9;	
			}
			else if(a13.screensize==1)
			{
				a13.a1.mapy-=20;
				a13.dy=19;	
			}
			else if(a13.screensize==2)
			{
				a13.a1.mapy-=50;
				a13.dy=49;	
			}
			else if(a13.screensize==3)
			{
				a13.a1.mapy-=20*5;
				a13.dy=19;	
			}
		}
		else if(a13.dy>9&&a13.screensize==0)
		{
			a13.a1.mapy+=10;
			a13.dy=0;	
		}
		else if(a13.dy>19&&a13.screensize==1)
		{
			a13.a1.mapy+=20;
			a13.dy=0;	
		}
		else if(a13.dy>49&&a13.screensize==2)
		{
			a13.a1.mapy+=50;
			a13.dy=0;	
		}
		else if(a13.dy>19&&a13.screensize==1)
		{
			a13.a1.mapy+=20*5;
			a13.dy=0;	
		}
		if(a13.a1.mapx<=200)
			a13.a1.mapx=200;
		if(a13.a1.mapy<=200)
			a13.a1.mapy=200;
		if(a13.a1.mapx>=4800)
			a13.a1.mapx=4800;
		if(a13.a1.mapy>=4800)
			a13.a1.mapy=4800;
			
		
		
		for(int z=11;z<=17;z++)
		{
			a13.cleanbl(z);
		}
		
		if(screen==0) {
		if(q==0)
		{
			a13.setbl(11, 1008,30, 130,30,1, "方向鍵選擇方格");
			
		}
		else if(q==1) {
			a13.setbl(11, 1008,30, 130,30,1, "方向鍵移動地圖");
		}
		else if(q==2) {
			a13.setbl(11, 1008,30, 130,30,1, "方向鍵快速移動地圖");
		}
	
		if(Z==0) {
			a13.setbl(12, 1008,60, 130,30,1, "Q方向鍵功能切換");
			a13.setbl(13, 1008,90, 130,30,1, "r放置石塊 R陷阱");
			a13.setbl(14, 1008,120, 130,30,1, "Y放置小麥");
			a13.setbl(15, 1008,150, 130,30,1, "H治癒人物");
		
		}
		if(Z==1) {
			a13.setbl(12, 1008,60, 130,30,1, "t雷擊 T強烈雷擊");
			a13.setbl(13, 1008,90, 130,30,1, "w洪水 W大洪水");
			
			String ii[]= {"無","左","右","後","前","捆縛"," "};
			a13.setbl(14, 1008,120, 130,30,1, "i電擊方向:"+ii[p_dir]);
			String II[]= {"一級","二級","最高級","刑架",""};
			a13.setbl(15, 1008,150, 130,30,1, "I 陷阱等級"+II[Rlevel]);	
	
		}
		else if(Z==2)
		{	
			a13.setbl(12, 1008,60, 130,30,1, "l給予/消除聖光");
			a13.setbl(13, 1008,90, 130,30,1, "S追蹤聖光者");
			String ll[]= {"關","開",""};
			a13.setbl(14, 1008,120, 150,30,1, "L開關人物光環: "+ll[sinlightstart]);//
			a13.setbl(15, 1008,150, 130,30,1, "a存檔");
			
					
		}
		else if(Z==3)
		{
			a13.setbl(12, 1008,60, 130,30,1, "g切換右上輔助地圖");
			a13.setbl(13, 1008,90, 130,30,1, "V大事記/人物資料");
			a13.setbl(14, 1008,120, 130,30,1, "K族群資料");
			a13.setbl(15, 1008,150, 130,30,1, "G切換地圖");
			
		}
		else if(Z==4)
		{
			a13.setbl(12, 1008,60, 130,30,1, "Enter查詢指定人物");
			a13.setbl(13, 1008,90, 130,30,1, "F查詢指定人物家族");
			a13.setbl(14, 1008,120, 130,30,1, "E返回一般模式");
			a13.setbl(15, 1008,150, 130,30,1, "P暫停/解除暫停");
			
		
			
		}
		}
	
		
		System.out.println("你按了《"+charA+"》鍵");
	}
	void showinformation() //q==19
	{
		screen=2;
		q=19;
		a13.cleanallb();
	
		a13.setbl(1, 720,70, 350, 30, 1, "在世成年人口智能分布");
		
		
		int wise[]=new int[200],strong[]=new int[200];
		double n=0;
		for (int z=0;z<a13.a1.bn;z++)
		{
			if(a13.a1.b[z].s>0)
			{
				n+=1;
				wise[a13.a1.b[z].wise]++;
				strong[a13.a1.b[z].strong]++;
			}
		}
		
		DecimalFormat df = new DecimalFormat("##.00");
		double gg,g2;
		a13.setbl(2, 720,110, 350, 30, 1, "總人口:"+(int)n+"人");
		g=1;
		for (int i=80;i<120;i+=4)
		{
			System.out.print(" wise  i="+i+"  g="+g+" wise[i]="+wise[i]);
			gg=(double)(wise[i]+wise[i+1])*100/n;
			gg = Double.parseDouble(df.format(gg));
			g2=(double)(wise[i+2]+wise[i+3])*100/n;
			g2 = Double.parseDouble(df.format(g2));
			
			a13.setbl(30+g, 720,150+g*30, 350, 30, 1, i+"-"+(i+1)+": "+(wise[i]+wise[i+1])+"人   比例:"+(gg)+"    "+(i+2)+"-"+(i+3)+": "+(wise[i+2]+wise[i+3])+"人   比例:"+(g2));
			g++;
		}
		
		//a13.setbl(4, 720,160, 350, 30, 1, "人物資料一覽:");
		
		
		
	//	a13.setbl(8, 720,500, 350, 30, 1, "第"+(page/10+1)+"頁");
		a13.setbl(9, 720,530, 400, 30, 1, "左右鍵換頁  V功能切換  E回一般模式 ");
		
		a13.cleanall();
		a13.seta(11,700,0, 500,580,"talk4");
	}
	void showpeople() {
		
		screen=2;
		q=5;
		a13.cleanallb();
	
		a13.setbl(1, 720,70, 350, 30, 1, "在世人數:"+a13.a1.people+"人");
		a13.setbl(2, 720,100, 350, 30, 1, "歷史累積人數:"+a13.a1.allbn+"人");
		
		a13.setbl(4, 720,160, 350, 30, 1, "人物資料一覽:");
		
		int g;
		
		for(int i=page;i<page+10;i++)
		{
			if(i>=a13.a1.allbn)
				break;
			System.out.print(" people  i="+i+"  page="+page+" name="+a13.a1.allb[i].name);
			
			g=a13.a1.allb[i].bk;
			if(a13.a1.allb[i].s<0)
			a13.setbl((i-page)+31, 720,200+(i-page)*30, 420, 30, 1, a13.a1.allb[i].name()+
			"  已故終年"+a13.a1.allb[i].age+"歲"+" 生於"+a13.a1.allb[i].borntime+"年");
			else
			a13.setbl((i-page)+31, 720,200+(i-page)*30, 420, 30, 1, a13.a1.allb[i].name()+(a13.a1.year-a13.a1.b[g].borntime)+"歲   "+" 生於"+a13.a1.allb[i].borntime+"年");
			
		}
		a13.setbl(8, 720,500, 350, 30, 1, "第"+(page/10+1)+"頁");
		a13.setbl(9, 720,530, 400, 30, 1, "左右鍵換頁  V功能切換  E回一般模式 ");
		
		a13.cleanall();
		a13.seta(11,700,0, 500,580,"talk4");
	}
	
	void showdecade() {
		
		screen=2;
		q=18;
		a13.cleanallb();
	
		a13.setbl(1, 720,70, 350, 30, 1,((page/10)+1)+" 世紀");
	//	a13.setbl(2, 720,100, 350, 30, 1, "歷史累積人數:"+a13.a1.allbn+"人");
	//	a13.setbl(3, 720,130, 350, 30, 1, "歷史累積部落數:"+a13.a1.groupn);
		//a13.setbl(4, 720,160, 350, 30, 1, "人物資料一覽:");
		DecimalFormat df = new DecimalFormat("##.0");
		int g=0;
		double g3=0,g4=0;double g5;
		if(a13.a1.yn>page+10) {
			for(int i=page+1;i<page+11;i++)
			{
				g+=a13.a1.population[i];
				g3+=a13.a1.populationstarve[i];
				g4+=a13.a1.populationdy[i];
			
			}
			g/=10;
			double g2=(a13.a1.population[page+10]-a13.a1.population[page+1])*100/a13.a1.population[page+1];
			if(g4>0)
			g5=g3*100/g4;
			else
				g5=0;
			g2 = Double.parseDouble(df.format(g2));
			g5 = Double.parseDouble(df.format(g5));
			a13.setbl(2, 720,110, 450, 30, 1, "平均人口: "+g+" 世紀人口總增長率: "+g2+" 平均飢荒指數: "+g5);
		}
		
		
		for(int i=page+1;i<page+11;i++)
		{
			if(i>=a13.a1.yn)
				break;
			if(a13.a1.populationdy[i]>0)
			g5=(double)a13.a1.populationstarve[i]*100/(double)a13.a1.populationdy[i];
			else g5=0;
			System.out.print(" decade  "+i+"  page="+page+" "+g5);
			
			a13.a1.populationgrow[i] = Double.parseDouble(df.format(a13.a1.populationgrow[i]));
			g5 = Double.parseDouble(df.format(g5));
	
			a13.setbl((i-page)+30, 720,160+(i-page)*30, 450, 30, 1,(i*10-9)+"-"+(i*10)+"年  人口:"+a13.a1.population[i]+"  人口成長率:"+a13.a1.populationgrow[i]+"  飢荒指數:"+g5+" 部落數:"+a13.a1.populationtribe[i]);
		}
		a13.setbl(8, 720,500, 450, 30, 1, "成長率單位:十年   型態:百分比    飢荒指數:餓死者佔總死亡人口比");
		a13.setbl(9, 720,530, 400, 30, 1, "左右鍵換頁 上下鍵移動游標  F查詢  E返回  V功能切換");
		
		a13.cleanall();
		a13.seta(11,700,0, 500,580,"talk4");
	}
	void showevent(int h) {
		
		screen=2;
		q=18;
		a13.cleanallb();
	
		a13.setbl(1, 720,70, 350, 30, 1,((page/10)+1)+" 世紀大事記");
	//	a13.setbl(2, 720,100, 350, 30, 1, "歷史累積人數:"+a13.a1.allbn+"人");
	//	a13.setbl(3, 720,130, 350, 30, 1, "歷史累積部落數:"+a13.a1.groupn);
		//a13.setbl(4, 720,160, 350, 30, 1, "人物資料一覽:");
		
		int g=a13.a1.eventn;
		for(int i=0;i<a13.a1.eventn;i++) {
			if(a13.a1.eventyear[i]>page*10) {
				g=i;break;
			}
		}
		g+=eventn*10;
		if(a13.a1.yn>page+10) {
		
			
			//a13.setbl(2, 720,100, 350, 30, 1, "平均人");
		}
		
		for(int i=g;i<g+10;i++)
		{
			if(i>=a13.a1.eventn||a13.a1.eventyear[i]>page*10+100)
				break;
			System.out.print(" event  "+i+"  page="+page);
	
			a13.setbl((i-g)+31, 720,150+(i-g)*30, 480, 30, 1,(a13.a1.eventyear[i])+"年  "+a13.a1.event[i]);
		}
		
		a13.setbl(8, 720,500, 350, 30, 1, "第"+(h+1)+"頁");
		a13.setbl(9, 720,530, 400, 30, 1, "上下左右鍵換頁  E返回  V功能切換");
		
		a13.cleanall();
		a13.seta(11,700,0, 500,580,"talk4");
	}
	
     void showgroup() {
		
		screen=2;
		a13.cleanallb();
		a13.cleanall();
		
		q=15;
	//	a13.setbl(1, 720,70, 350, 30, 1, "在世人數:"+a13.a1.people+"人");
	//	a13.setbl(2, 720,100, 350, 30, 1, "歷史累積人數:"+a13.a1.allbn+"人");
		a13.setbl(3, 720,130, 350, 30, 1, "歷史累積部落數:"+a13.a1.groupn);
		a13.setbl(4, 720,160, 350, 30, 1, "部落一覽:");
		
		int g;
		
		for(int i=page;i<page+10;i++)
		{
			if(i>=a13.a1.groupn)
				break;
			System.out.println(" group  i="+i+"  page="+page+" name="+a13.a1.group[i].name);
		//	System.out.println("ma:"+"》"+a13.a1.allb[i].ma());
			g=a13.a1.allb[i].bk;
			if(a13.a1.group[i].leader>=0)
			a13.setbl((i-page)+31, 720,200+(i-page)*30, 420, 30, 1, a13.a1.group[i].name+"部落  "+" 人數:"+a13.a1.group[i].gnumber+"  x:"+a13.a1.group[i].placex+" y:"+a13.a1.group[i].placey);
			else
				a13.setbl((i-page)+31, 720,200+(i-page)*30, 420, 30, 1, a13.a1.group[i].name+"部落    已亡");
			
			a13.setaf(1000,200+(i-page)*30,50,25,i);
			
		}
		a13.setbl(8, 720,500, 350, 30, 1, "第"+(page/10+1)+"頁");
		a13.setbl(9, 720,530, 400, 30, 1, "右移鍵下頁 左鍵上頁 上下鍵移動游標  F查詢  E回一般模式 ");
		
	
		a13.seta(11,700,0, 500,580,"talk4");
	}
	
	void countG() {
		
		int gn,gy,gx;
		if(G==3)
		{
			a13.setbl(31,720,20 ,400, 20, 1, "大地圖( 一格代表200*200小方格)");
			
			for(int x=0;x<5;x++)
			{
				for(int z=0;z<5;z++)
				{
					gn=0;
					for(int i=0;i<1000;i++)
					{
						for(int j=0;j<1000;j++) {
							g=a13.a1.map[x*1000+i][z*1000+j];
							if(g>=1000)
								gn++;
						}
					}
					if(gn>=5000)
						Gmap[x][z]=9;
					else if(gn>=1000)
						Gmap[x][z]=4;
					else if(gn>=200)
						Gmap[x][z]=2;
					else if(gn>=1)
						Gmap[x][z]=1;
					else
						Gmap[x][z]=0;
				}
			}
			return;
		}
		if(G==2)
		{
			
			a13.setbl(31,720,20 ,400, 20, 1, "中地圖( 一格代表30*30小方格)");
			gx=a13.a1.mapx-150/2;
		    gy=a13.a1.mapy-150/2;

			if(gx<0)gx=0;
			if(gy<0)gy=0;
			for(int x=0;x<5;x++)
			{
				for(int z=0;z<5;z++)
				{
					gn=0;
					for(int i=0;i<30;i++)
					{
						for(int j=0;j<30;j++) {
							g=a13.a1.map[gx+x*30+i][gy+z*30+j];
							if(g>=1000)
								gn++;
						}
					}
					if(gn>=60)
						Gmap[x][z]=9;
					else if(gn>=30)
						Gmap[x][z]=4;
					else if(gn>=10)
						Gmap[x][z]=2;
					else if(gn>=1)
						Gmap[x][z]=1;
					else
						Gmap[x][z]=0;
				}
			}
			return;
			
		}//if G==1
		a13.setbl(31,720,20 ,400, 20, 1, "小地圖(一點代表約1人 一格代表12*10小方格)");
		gx=a13.a1.mapx-12*2;
		gy=a13.a1.mapy-10*2;
		gn=0;
		for(int x=0;x<5;x++)
		{
			for(int z=0;z<5;z++)
			{
				gn=0;
				for(int i=0;i<12;i++)
				{
					for(int j=0;j<10;j++) {
						g=a13.a1.map[gx+x*12+i][gy+z*10+j];
						if(g>=1000)
							gn++;
					}
				}
			//	System.out.print("key x="+(gx+x*12)+"y="+(gy+z*10)+"  gn="+gn+"\n");
				if(gn>=9)
					Gmap[x][z]=9;
				else if(gn>=4)
					Gmap[x][z]=4;
				else if(gn>=2)
					Gmap[x][z]=2;
				else if(gn>=1)
					Gmap[x][z]=1;
				else
					Gmap[x][z]=0;
			}
		}
			
	}
	
}



/*
 * 
 * case '1':
				if(a13.nstart==0)
				{
					a13.f.rewait();
				//a13.a130.chk();
				a13.f.start();	
				a13.a1.st();
					
				}
				break;
			case '2':
				if(a13.nstart==0)
				{
					a13.f.rewait();
					a13.n1=new n();
					try {
						a13.f.read();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					
					a13.a130.chk();
					a13.a1.start();
				}
				break;
 * 
 * */

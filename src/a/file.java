
package a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JFrame;

public class file {
	
	
	
	file() 
	{
		//start();	
		waiting();
		//start();
		
	}
	void waiting()
	{
		a13.clean();

		a13.seta(1,0, 0, 1200, 580,"start");
		//a13.seta(2,700,0, 450,580,"talk4");
		//a13.seta(3,1000,20, 135,200,"talk2");
		a13.setbl(49,150,150, 505,100,1,"文明的起源");
		a13.setb(1,400,350,180,55,"開始遊戲");
		a13.setb(2,400,430,180,55,"讀取舊檔(存檔)");
		a13.setb(3,400,510,180,55,"讀取舊檔(自動備分)");
		
		 Thread t2= new Thread( new Runnable(){
			 public void run(){	  try {
				 
				 for (int i = 1; i < 700;) {
						
					if(a13.g0==1)
					{
						rewait();
						a13.a130.chk();
						start();	
						a13.a1.st();
						break;
			
					}
					if(a13.g0==2)
					{
						rewait();
						a13.n1=new n();
					//	a13.paint=new Paint();
						read();	// 2自動備分
					//	a13.a1.group[0].level=1;
						a13.paint=new Paint();
						a13.a130.chk();
						a13.a1.start();
						break;
			
					}
					if(a13.g0==3)
					{
						rewait();
						a13.n1=new n();
					//	a13.paint=new Paint();
						read(2);	// 2自動備分
					//	a13.a1.group[0].level=1;
						a13.paint=new Paint();
						a13.a130.chk();
						a13.a1.start();
						break;
			
					}
					
					
					 Thread.sleep(300);
				}
			 
			 } catch (Exception e) {  e.printStackTrace();
			 } 	 } } );   t2.start();
	}
	void rewait()
	{
		a13.clean();

		a13.seta(1,0, 0, 1200, 580,"start");
		//a13.seta(2,700,0, 450,580,"talk4");
		//a13.seta(3,1000,20, 135,200,"talk2");
		a13.setbl(49,300,400, 505,100,1,"waiting(讀檔時間約一分鐘)");
		//a13.setb(1,400,400,180,60,"開始遊戲");
		//a13.setb(2,400,500,180,60,"讀取舊檔");
		
		
			
	}
	void start() {
		//a13.clean();

		//a13.seta(1,0, 0, 700, 580,"talk");
		//a13.setbl(11,300,400, 305,30,1,"wating");
		
		a13.n1=new n();
		
		//a13.clean();
		a13.a1=new A11();
		a13.paint=new Paint();
		a13.a1.start();
		  // save();
		
	}
	void save()
	{
		System.out.print("start save\n");
		 try {
			    //A11 obj1 = new A11();
	            System.out.println("obj1:" + a13.a1);
	            FileOutputStream fos = new FileOutputStream("date/a1");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(a13.a1);
	            oos.flush();
	            oos.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		/* try {
			    //A11 obj1 = new A11();
	            System.out.println("obj1:" + a13.a130);
	            FileOutputStream fos = new FileOutputStream("date/a130");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(a13.a130);
	            oos.flush();
	            oos.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        */
		 
		 for(int z=0;z<a13.a1.bn;z++)
		 {
			 try {
				   
		            System.out.println("  obj1: b"+z + a13.a1.b[z]+"\n");
		            FileOutputStream fos = new FileOutputStream("date/b"+z);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(a13.a1.b[z]);
		            oos.flush();
		            oos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		 
		 for(int z=0;z<a13.a1.allbn;z++)
		 {
			 try {
				   
				// System.out.println("  obj1: allb"+z + a13.a1.allb[z]+"\n");
		            FileOutputStream fos = new FileOutputStream("date/allb"+z);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(a13.a1.allb[z]);
		            oos.flush();
		            oos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		 for(int z=0;z<a13.a1.fn;z++)
		 {
			 try {
				   
				// System.out.println("  obj1: allb"+z + a13.a1.allb[z]+"\n");
		            FileOutputStream fos = new FileOutputStream("date/f"+z);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(a13.a1.f[z]);
		            oos.flush();
		            oos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		 for(int z=0;z<a13.a1.pln;z++)
		 {
			 try {
				   
					// System.out.println("  obj1: allb"+z + a13.a1.allb[z]+"\n");
			            FileOutputStream fos = new FileOutputStream("date/pl"+z);
			            ObjectOutputStream oos = new ObjectOutputStream(fos);
			            oos.writeObject(a13.a1.pl[z]);
			            oos.flush();
			            oos.close();
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			 
		 }
		 for(int z=0;z<a13.a1.groupn;z++)
		 {
			 try {
				   
				// System.out.println("  obj1: allb"+z + a13.a1.allb[z]+"\n");
		            FileOutputStream fos = new FileOutputStream("date/group"+z);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(a13.a1.group[z]);
		            oos.flush();
		            oos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		 System.out.print("end save save\n");
	}
	
	void save2()
	{
		System.out.print("start save\n");
		try {
			    //A11 obj1 = new A11();
	            System.out.println("obj1:" + a13.a1);
	            FileOutputStream fos = new FileOutputStream("alldate/date2/a1");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(a13.a1);
	            oos.flush();
	            oos.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		 /*
		 try {
			    //A11 obj1 = new A11();
	            System.out.println("obj1:" + a13.a130);
	            FileOutputStream fos = new FileOutputStream("alldate/date2/a130");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(a13.a130);
	            oos.flush();
	            oos.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 */
		 for(int z=0;z<a13.a1.bn;z++)
		 {
			 try {
				   
		          //  System.out.println("  obj1: b"+z + a13.a1.b[z]+"\n");
		            FileOutputStream fos = new FileOutputStream("alldate/date2/b"+z);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(a13.a1.b[z]);
		            oos.flush();
		            oos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		 for(int z=0;z<a13.a1.allbn;z++)
		 {
			 try {
				   
				// System.out.println("  obj1: allb"+z + a13.a1.allb[z]+"\n");
		            FileOutputStream fos = new FileOutputStream("alldate/date2/allb"+z);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(a13.a1.allb[z]);
		            oos.flush();
		            oos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		 for(int z=0;z<a13.a1.fn;z++)
		 {
			 try {
				   
				// System.out.println("  obj1: allb"+z + a13.a1.allb[z]+"\n");
		            FileOutputStream fos = new FileOutputStream("alldate/date2/f"+z);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(a13.a1.f[z]);
		            oos.flush();
		            oos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		 for(int z=0;z<a13.a1.pln;z++)
		 {
			 try {
				   
					// System.out.println("  obj1: allb"+z + a13.a1.allb[z]+"\n");
			            FileOutputStream fos = new FileOutputStream("alldate/date2/pl"+z);
			            ObjectOutputStream oos = new ObjectOutputStream(fos);
			            oos.writeObject(a13.a1.pl[z]);
			            oos.flush();
			            oos.close();
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			 
		 }
		 for(int z=0;z<a13.a1.groupn;z++)
		 {
			 try {
				   
				// System.out.println("  obj1: allb"+z + a13.a1.allb[z]+"\n");
		            FileOutputStream fos = new FileOutputStream("alldate/date2/group"+z);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(a13.a1.group[z]);
		            oos.flush();
		            oos.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		 System.out.print("end save save\n");
	}
	void read() throws ClassNotFoundException
	{
		//a13.a1=new A11();
		System.out.print("start read\n");
		try {
            
            FileInputStream fis = new FileInputStream("date/a1");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a13.a1= (A11) ois.readObject();
            ois.close();
            System.out.println("obj2 " + a13.a1);
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.out.print("start read\n");
		
		
	/*	try {
            
           FileInputStream fis = new FileInputStream("date/a130");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a13.a130= (a13) ois.readObject();
            ois.close();
            System.out.println("obj2 " + a13.a1);
       } catch (IOException e) {
            e.printStackTrace();
        }
		*/
		
		
		 for(int z=0;z<a13.a1.bn;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("date/b"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.b[z]= (B) ois.readObject();
		            ois.close();
		            System.out.println("obj2 b"+z+" " + a13.a1.b[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		
		 for(int z=0;z<a13.a1.allbn;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("date/allb"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.allb[z]= (C) ois.readObject();
		            ois.close();
		        //    System.out.println("obj2 allb"+z+" " + a13.a1.allb[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		       }
			 
		 }
		
		 for(int z=0;z<a13.a1.fn;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("date"+"/f"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.f[z]= (farmer) ois.readObject();
		            ois.close();
		           // System.out.println("obj2 allb"+z+" " + a13.a1.f[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		       }
			 
		 }
		 for(int z=0;z<a13.a1.pln;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("date"+"/pl"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.pl[z]= (Place) ois.readObject();
		            ois.close();
		        //    System.out.println("obj2 allb"+z+" " + a13.a1.allb[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		       }
			 
		 }
		 for(int z=0;z<a13.a1.groupn;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("date/group"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.group[z]= (Group) ois.readObject();
		            ois.close();
		        //    System.out.println("obj2 allb"+z+" " + a13.a1.allb[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		       }
			 
		 }
		 System.out.print("end read\n");
		 
		 for(int z=0;z<5000;z++) {
			 for(int i=0;i<5000;i++)
			 {
				 if(a13.a1.map[z][i]>=1000)
				 {
					 a13.a1.map[z][i]=-1;
				 }
			 }
		 }

	}
	
	
	void read(int k) throws ClassNotFoundException
	{
		//a13.a1=new A11();
		System.out.print("start read\n");
		try {
            
            FileInputStream fis = new FileInputStream("alldate/date"+k+"/a1");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a13.a1= (A11) ois.readObject();
            ois.close();
            System.out.println("obj2 " + a13.a1);
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.out.print("start read\n");
		
		
	
		
		/*
		try {
            
            FileInputStream fis = new FileInputStream("alldate/date"+k+"/a130");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a13.a130= (a13) ois.readObject();
            ois.close();
            System.out.println("obj2 " + a13.a1);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		*/
		
		 for(int z=0;z<a13.a1.bn;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("alldate/date"+k+"/b"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.b[z]= (B) ois.readObject();
		            ois.close();
		            System.out.println("obj2 b"+z+" " + a13.a1.b[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		
		 for(int z=0;z<a13.a1.allbn;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("alldate/date"+k+"/allb"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.allb[z]= (C) ois.readObject();
		            ois.close();
		            System.out.println("obj2 allb"+z+" " + a13.a1.allb[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		       }
			 
		 }
		 for(int z=0;z<a13.a1.fn;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("alldate/date"+k+"/f"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.f[z]= (farmer) ois.readObject();
		            ois.close();
		            System.out.println("obj2 allb"+z+" " + a13.a1.f[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		       }
			 
		 }
		 for(int z=0;z<a13.a1.groupn;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("alldate/date"+k+"/group"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.group[z]= (Group) ois.readObject();
		            ois.close();
		        //    System.out.println("obj2 allb"+z+" " + a13.a1.allb[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		       }
			 
		 }
		 for(int z=0;z<a13.a1.pln;z++)
		 {
			 try {
				 FileInputStream fis = new FileInputStream("alldate/date"+k+"/pl"+z);
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            a13.a1.pl[z]= (Place) ois.readObject();
		            ois.close();
		        //    System.out.println("obj2 allb"+z+" " + a13.a1.allb[z]+"\n");
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		       }
			 
		 }
		 System.out.print("end read2\n");
		 
		 for(int z=0;z<5000;z++) {
			 for(int i=0;i<5000;i++)
			 {
				 if(a13.a1.map[z][i]>=1000)
				 {
					 a13.a1.map[z][i]=-1;
				 }
			 }
		 }

	}


}

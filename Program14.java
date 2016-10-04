/**
 * @(#)MultiThreading.java
 *
 *
 * @author
 * @version 1.00 2005/1/1
 */


public class MultiThreading {

  	public static void main(String[] args){
  		Star s = new Star();
  		Thread t1 = new Thread(s);
  		Slash sl = new Slash();
  		Thread t2 = new Thread(sl);
  		t1.start();
  		t2.start();
  	}

}
class Slash extends Thread{
	public void run(){
		for(int i = 1; i <= 7; i++){
			System.out.print("/");
			try{
				Thread.sleep(100);
			}catch(Exception e){}
		}
	}
}
class Star extends Thread{
	public void run(){
		for(int i = 1; i <= 7; i++){
			System.out.print("*");
			try{
				Thread.sleep(100);
			}catch(Exception e){}
		}
	}
}

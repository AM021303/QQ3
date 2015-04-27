public class Question1{
	public statis void main(String[] args){
	classB(
		package Thread;

public class ThreadB {

	public static void main(String[] args) {
		Thread a = Thread.currentThread();
		new Thread1A();
		int i;
		for(i=0;i<1000;i++){
			System.out.println("main()");
			try{
				a.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class Thread1B implements Runnable{
	Thread c;
	Thread1A(){
		c = new Thread(this);
		c.start();
	}
	public void run(){
		int i;
		for(i=0;i<1000;i++){
			System.out.println("ThreadB");
			try{
				c.sleep(1000);
			}catch(Exception e){}
		}
	}
}
	)
		
	}
}
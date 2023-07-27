package MultiThreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student std=new Student();
        Thread b=new B(std, "Aman");
        Thread c=new C(std, "Sukku");
        
        b.start();
        c.start();
	}

}


class A implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		for(int i=0;i<100;i++) {
			System.out.println("Thread nae is "+name);
			try {
				Thread.sleep(100+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
class C extends Thread{
	Student std;
	String name;
	
	public C(Student std, String name) {
		super();
		this.std = std;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		std.func1(name);
	}
}
class B extends Thread{
	Student std;
	String name;
	
	
	public B(Student std, String name) {
		super();
		this.std = std;
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		std.func1(name);
	}
}

 class  Student{
	public  void func1(String name) {
		System.out.println("Welcome ");
		
		try {
			 Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
	}
	
}
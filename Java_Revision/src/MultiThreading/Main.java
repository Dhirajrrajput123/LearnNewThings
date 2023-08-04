package MultiThreading;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		
		
		}
    			
     }


class A{	//
	  void show()throws IOException{
	    System.out.println("Hello A");
	  }
	}
	class B extends A{
	  @Override
	  void show()  throws FileNotFoundException {
	    System.out.println("Hello B");
	  }
	}
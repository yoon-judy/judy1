package java_hello;

public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = true && true;
	      System.out.println(bool);
	      
	      bool =  false && true;
	      System.out.println(bool);
	      
	      bool =  true && false;
	      System.out.println(bool);
	      
	      bool =  true && true &&  false;
	      System.out.println(bool);
	      
	      bool = false && (10 > 0);
	      System.out.println(bool);
	      
	      
	      bool = false || false;
	      System.out.println(bool);
	      
	      bool = false || true;
	      System.out.println(bool);
	      
	      bool = (10 < 0) || (10 > 0);
	      System.out.println(bool);
	      
	      bool = !true;
	      System.out.println(bool);
	      
	      bool = !false;
	      System.out.println(bool);
	}

}

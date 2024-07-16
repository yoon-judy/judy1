package java_hello;

public class finaljava {

	public static void main(String[] args) {
		
           final double PI=314.0;
           double radius =10;
           double area=radius *radius * PI;
           boolean bool=area < 100;
		   
           System.out.println("넓이가 100보다 큽니까?");
           System.out.println(bool);	   
	}
}

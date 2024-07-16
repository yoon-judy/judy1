package java_hello;

public class whil {
	public static void main(String[] args) {
	int count=1;
     while (count<=20) {
    	 System.out.println(count+"번: "+"윈터");
    	 		count++;
     }
     ////////////////////////////////////////
 	  count=1;
 	  do {
 	     System.out.println(count+"번: "+"LEE");
 	     count++;
 	  } while(count<=10);
 	  ////////////////////////////////////
      int sum=0;
 	  for (int i = 1; i <= 100; i++) {
			// 변수 sum에 i값을 저장한다
			sum += i;
		}
		System.out.println("1부터 100까지의 합 = " + sum);
	}	
}
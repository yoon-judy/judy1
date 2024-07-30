package java_hello;

//C언어
//똑같은 함수이름을 쓸수 있는조건-파라미터 타입또는 갯수를 다르게함 = 함수 오버로딩
//함수 오버로딩 = 같은함수이름으로 파라미터 타입또는 갯수를 달리하는것.
//대표적인 함수 = System.out.println 
class over {

 public void function() {
    System.out.println("함수");
 }

 public void function(double num) {
    System.out.println(num);
 }

 public void function(int num, int num2) {
    System.out.println(num);
 }
}

class Person {
 private int regiNum;
 private int passNum;

 public Person(int rnum, int pnum) {
    regiNum = rnum;
    passNum = pnum;
 }

 public Person(int rnum) {
    // regiNum = rnum;
    // passNum = 0;
    this(rnum, 0);
 }

 void showPersonalInfo() {
    System.out.println("주민등록 번호: " + regiNum);

    if (passNum != 0)
       System.out.println("여권 번호: " + passNum + '\n');
    else
       System.out.println("여권을 가지고 있지 않습니다. \n");
 }

}

class ExampleMain {

 public static void main(String[] args) {
    
      String st1 = "abcdefg";

      String st2 = st1.substring(2);
      System.out.println(st2);

      String st3 = st1.substring(2, 4);
      System.out.println(st3);
    
    
    //1.7버전
    int num = 1;
    String str = "Spring";
    
    switch (str) {
       case "Spring": 
          System.out.println("봄입니다.");
    }
    
    switch (num) {
       case 1:
       case 2:
       case 3: 
          System.out.println("봄입니다.");
    }
    
    switch (num) {
       case 1,2,3: 
          System.out.println("봄입니다.");
    }
    
    
    
      String str1 = "Simple String";
      String str2 = "Simple String";
      
      String str3 = new String("Simple String");
      String str4 = new String("Simple String");
      
      if(str1 == str2)
          System.out.println("동일");
      else
          System.out.println("다른");

      if(str3 == str4) //자바스크립트 나 파이썬 등 다른 언어에서는
          System.out.println("동일");
      else
          System.out.println("다른");
      
      //안에있는 문자열 비교
      if(str1.equals(str3)) 
         System.out.println("안에 있는 글자가 같습니다.");
      else
            System.out.println("글자가 다릅니다.");
      
    
    
       // 여권 있는 사람의 정보를 담은 인스턴스 생성
//      Person jung = new Person(335577, 112233);
//      
//      // 여권 없는 사람의 정보를 담은 인스턴스 생성
//      Person hong = new Person(775544);
//
//      jung.showPersonalInfo();
//      hong.showPersonalInfo();
//    
//    OverloadingEx ex = new OverloadingEx();
//    ex.function();
//    ex.function(10);
    
     
  }
}

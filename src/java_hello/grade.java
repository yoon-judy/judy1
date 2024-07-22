package java_hello;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

class A{
   int num ; //인스턴스 변수;
   int kor, eng, math;
   
   
   double getAvg() {
      return  (kor + eng + math) / 3.0;
   }
   
   void setMath(int m1) {
      math = m1;
   }
   
   int getMath() {
      return math;
   }
   
   void setEng(int e1) {
      eng = e1;
   }
   
   int getEng() {
      return eng;
   }
   
   void setKor(int k1) {
      //this.kor = kor;
      kor = k1;
   }
   
   int getKor() {
      return kor;
   }
   
   
   void setNum(int n1) {
      //this.num = num;
      num = n1;
   }
   
   int getNum() {
      return num;
   }   
}


class Circle{
   int radius = 20;
   final double PI = 3.14;
   
   void setRadius(int r) {
      radius = r;
   }
   
   int getRadius() {
      return radius;
   }
   
   double getArea() {
      return radius * radius * Math.PI;
   }
}

class Rectangle{
   double height,width;
   
   void setHeight(double h) {
      height = h;
   }
   void setWidth(double w) {
      width = w;
   }
   
   double getArea() {
      return width * height;
   }
public void printArea(Rectangle rec) {
	// TODO Auto-generated method stub
	
}
}

class Grade{
   int kor, eng, math;
   
   void setKor(int kor) {
      this.kor = kor;
   }   
   void setEng(int eng) {
      this.eng = eng;
   }
   void setMath(int math) {
      this.math = math;
   }
   
   int getKor() {
      return kor;
   }   
   int getEng() {
      return eng;
   }
   int getMath() {
      return math;
   }
   
   
   char getCharGrade() {
      char grade = '가';
      
      double avg = (kor + eng + math) / 3.0;
      
      if (avg >= 90) {
         grade = '수';
      } else if (avg >= 80) {
         grade = '우';
      } else {
         grade = '가';
      }

      return grade;
   }
   
   void getGrade() {
      double avg =  (kor + eng + math) / 3.0;
      
      if (avg >= 90) {
         System.out.println("성적은 수입니다.");
      } else if (avg >= 80) {
         System.out.println("성적은 우입니다.");
      } else {
         System.out.println("성적은 가입니다.");
      }      
   }
   
   void checkGradeObject(Grade grade) {
      grade.getGrade();
   }
   
}

class ObjectTest {
   public static void main(String[] args) {
      
      Grade grade = new Grade();
      grade.setKor(90);
      grade.setEng(90);
      grade.setMath(90);
      
      System.out.println("국어" + grade.getKor());
      System.out.println("영어" + grade.getEng());
      System.out.println("수학" + grade.getMath());
      
      System.out.println(  grade.getCharGrade() + " 입니다"); //수입니다.
      grade.getGrade(); //성적은 수입니다.
      
      grade.checkGradeObject(grade); //성적은 수입니다.
      
      
      
      ///////////////////////////////////////
      Rectangle rec = new Rectangle();
      rec.setHeight(10.1);
      rec.setWidth(10.1);
      
      System.out.println(rec.getArea()); //10.q09478
      rec.printArea(rec); //넓이: 10.1313
      
      //////////////////////////////////////////////////
      
      Circle circle = new Circle();
      circle.setRadius(10);
      
      System.out.println(circle.getArea()); //314.1516~~~
      
      circle.setRadius(20);
      System.out.println(circle.getArea()); //314.1516~~~
      
      A a; //변수 선언 int num; // 참조형 
      a = new A(); //객체(인스턴스) 생성
      
      a.setNum(10);      
      System.out.println(a.getNum());
      
      a.setKor(90);      
      System.out.println(a.getKor());
      
      a.setEng(90);      
      System.out.println(a.getEng());
      
      a.setMath(90);      
      System.out.println(a.getMath());
                  
      System.out.println(a.getAvg()); //90.0
      
//      System.out.println(a.num);
//       a.num = 3;
//       System.out.println(a.num);
//       
//       a.kor = 80;
//       a.eng = 80;
//       a.math = 90;
//       
//       
//       System.out.println("국어" + a.kor);
//       System.out.println("영어"  + a.eng);
//       System.out.println("수학" + a.math);
//                
//      System.out.println(a);   
      
      

   }
}

	}

}

package java_hello;

import java.util.Scanner;

/*
 * 반지름이 10, 15 ,7 인 원이 있다. 3원의 넓이의 합을 구하는 프로그램을 완성하시오. 
 * 단)배열을 활용하시오.
 * 
 * */

class Rectangle {
   private double width, height;

   public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }

   public double getArea() {
      return width * height;
   }
}

class Circle10 {
   private double rad;

   public Circle10(double r) {
      this.rad = r;
   }

   public double getArea() {
      return rad * rad * Math.PI;
   }
}

/*
 * 가로세로가 (10,10) (17,89) (90,100) 인 사각형이 있다. 각각ㅇ의 넓이의 합을 구하는 프로그램을 완성하시오. 단)배열을
 * 활용하시오.
 * 
 * 3개의 사각형의 가로세로를  유저로 부터 입력받아, 각각의 넓이의 합을 구하는 프로그램을 완성하시오.
 */
public class ArrayExampleMain {
   public static void main(String[] args) {
        
//      {
//         Rectangle[] arrRec = new Rectangle[3];
//
//         
//         for(int i = 0; i < arrRec.length; i++) {
//              Scanner sc = new Scanner(System.in);
//              
//              System.out.println( i + "번째 사각형의 가로 세로를 넣으세요" );
//              
//               System.out.print("가로:");
//               int width = sc.nextInt();
//               
//               System.out.print("세로:");
//               int height = sc.nextInt();
//               arrRec[i] = new Rectangle(width, height);
//         }
//         
//         
//           double area = 0;
//          
//           for(int i = 0; i < arrRec.length; i++) {
//              area = area +  arrRec[i].getArea();
//         }
//               System.out.println("총 사각형 넓이:" + area);   
//         
//
//      }
      
      {
      
         Circle10[] arrCircle = new Circle10[3];
         
         for(int i=0; i<arrCircle.length;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print(i+"번째의"+"반지름을 입력 하세요");
            arrCircle[i] = new Circle10(sc.nextInt());
         }
           
         
           double area = 0;
   
           for(int i = 0; i < arrCircle.length; i++) {
              area = area +  arrCircle[i].getArea();           
           }
           System.out.println("총넓이:" + area);
      }
}
}


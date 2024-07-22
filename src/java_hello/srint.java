package java_hello;

public class srint {


public static void main(String[] args) {
	   BankAccount yoon = new BankAccount();   // 계좌 생성
	   yoon.initAccount("12-34-89", "990990-9090990", 10000);   // 초기화   
}
	}
		class BankAccount {
			   String accNumber;   // 계좌번호
			   String ssNumber;    // 주민번호
			   int balance = 0;    // 예금 잔액
			   
			   public void initAccount(String acc, String ss, int bal) {
			      accNumber = acc;
			      ssNumber = ss;
			      balance = bal; // 계좌 개설 시 예금액으로 초기화
			

			
			}

	}

   
		

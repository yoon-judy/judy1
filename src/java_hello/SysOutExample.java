package java_hello;

public class SysOutExample {
	public static void main(String[] args) {   // true, false
		int x = 1;
		System.out.println(!(x>0));
		System.out.println((x!=0) || (x>0));
		System.out.println(x << 2);
		System.out.println(x & 2);
		System.out.println(x %= 3);
	}
}
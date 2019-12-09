package ExceptionHandling;

public class Pen {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[1]=10;
		a[2]=20;
		a[3]=40;
		a[0]=50;

		System.out.println("welcome");
		System.out.println(a[1]);
		System.out.println(a[4]);
		System.out.println(10/0);
		System.out.println("end");

		System.out.println("Bye Bye");
	}

}

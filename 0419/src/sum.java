import java.util.Scanner;

public class sum {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int a,b=0;
		int sum=0;
		System.out.println("���� ����: ");
		a = sc.nextInt();
		System.out.println("������ ����: ");
		b = sc.nextInt();
		for(int i = a; i<=b;i++) {
			sum += i;
			
		}
		System.out.println(a+"����"+b+"������ ����"+sum);
	}
	
}

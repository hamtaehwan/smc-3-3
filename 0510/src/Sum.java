import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ����: ");
		int n1 = scan.nextInt();
		System.out.println("������ ����: ");
		int n2 = scan.nextInt();
		int result = 0;
		for(int i=n1;i<=n2;i++) {
			result += 1;
		}
		System.out.println(n1 +"����"+n2+"������ ����"+result);
	}
}

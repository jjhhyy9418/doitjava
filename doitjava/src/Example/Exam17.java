package Example;

import java.util.Scanner;

public class Exam17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��? ");
		int line = scan.nextInt();
						
		for(int i=line-1; i>=0; i--) {
			for(int j=0; j<line; j++) {
				if(j<line-i-1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
					
		} scan.close();
	}
}
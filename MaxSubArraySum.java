package venkat;

import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int r = in.nextInt();
		System.out.println("Enter Number of Columns : ");
		int c = in.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Enter The Elements : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = in.nextInt();
			}
		}
		System.out.println("Original Array : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
		System.out.println("Sub Arrays : ");
		int k = a.length;
		int max = 0;
		while (k > 1) {
			int l = 0;
			while (l <= a[0].length - k) { // moving towards right
				int p = 0;
				while (p <= a.length - k) { // moving towards bottom
					int m = 0;
					for (int i = p; i < k + p; i++) {
						for (int j = l; j < k + l; j++) {
							m += a[i][j];
							System.out.print(a[i][j] + " ");
						}
						System.out.println();
					}
					System.out.println("*************");
					if (m > max) {
						max = m;
					}
					p++;
				}
				l++;
			}
			k--;
		}
		System.out.println("Maximum Sum of Sub Array : " + max);
	}
}
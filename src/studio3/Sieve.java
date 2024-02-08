package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt();
		boolean[] composites = new boolean[n-1];
		/*for(int i = 0; i<n-1; i++){
			if(composites[i]==false)
			{
				int j = 2;
				while(j*(i+2) <= n) {
					composites[j*(i+2)-2]=true;
					j++;
				}
			}
		
		}*/
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(composites[i-2]==false)
			{
				for(int j = (int)Math.pow(i, 2); j <= n; j+=i) {
					composites[j-2]=true;
				}
			}
		}
			
		for(int i = 0 ; i < n-1; i++) {
			if(composites[i]==false) {
				System.out.print(i+2 + " ");
			}
		}
	}
}

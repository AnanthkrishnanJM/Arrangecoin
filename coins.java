package ArrangeCoins;

import java.util.Scanner;

public class coins {
	public static int coins (int n) {
		int i=0;
		while(n>=i+1) {
			n=-(i+1);
			i++;
			}
	        return i;
	}


	public static int main(String[] args) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		
		int Arrangecoin=coins(n);
		System.out.println(Arrangecoin);
		return Arrangecoin;
	}
}


package Lecture10;

public class MagicNumber {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(MagicNum(n));
	}

	private static int MagicNum(int n) {
		// TODO Auto-generated method stub
		int ans=0;
		int mul=5;
		
		while(n!=0) {
			if((n&1)!=0) {
				ans=ans+mul;
			}
			mul=mul*5;
			n>>=1;
		}
		return ans;
	}

}

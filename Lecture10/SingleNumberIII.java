package Lecture10;

public class SingleNumberIII {
	public static void main(String[] args) {
		int []arr = {1,2,3,1,2,3,5,7};
		
		int ans=0;
		for(int k:arr) {
			ans=ans^k;
		}
//		System.out.println(ans);
		
		int mask=ans&(~(ans-1));
//		System.out.println(mask);
		
		int a=0;
		for(int k:arr) {
			if((mask&k)!=0) {
				a=a^k;
			}
		}
		System.out.println(a);
		System.out.println(ans^a);
	}

}

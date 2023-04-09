package Lecture1;

public class Prime {
	public static void main(String[] args) {
		int n = 2;
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Not Prime");
			
		}else {
			System.out.println("Prime");
		}
		

	}

}

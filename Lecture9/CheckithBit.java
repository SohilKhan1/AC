package Lecture9;

public class CheckithBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int pos=4;
		int mask=1;
		mask=mask<<(pos-1);
		System.out.println(mask);
		
		if((n&mask)!=0) {
			System.out.println("Set");
		}else {
			System.out.println("Unset");
		}
				
	}

}

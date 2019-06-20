package org.tester;

public class BaseClass {

	public static void main(String[] args) {
		int a=12;
		BaseClass base = new BaseClass();
		base.praneetha();
		if(a%2==1) {
System.out.println("odd number");	
}
	}	
			
		public void praneetha() {
			String name = "practice";
			String res = "";
			for (int i=name.length()-1;i>=0;i--) {
				char ch=name.charAt(i);
				res = res+ch;

			}
			if(res.equals(name)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
		}
	}
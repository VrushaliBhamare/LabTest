package day8;

public class Wrapperclasses {

	public static void main(String[] args) {
		
		String r="33";//string is not a wrapper class
		
    	 // convert string to integer
		int i= Integer.parseInt(r);
		
		System.out.println(r+45); //2045
		System.out.println(i+45);
		String e="23.44";
		
		float p= Float.parseFloat(e);
		System.out.println(p+90);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.min(22, 33));
		System.out.println(Integer.max(22, 33));
		
		
	}

}

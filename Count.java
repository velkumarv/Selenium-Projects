package Seleniumassess;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "WelCome To TestLeaf";
		int count=0;
		System.out.print("Uppercase=");
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i)+",");
			count++;
			}
			
				
			}
		System.out.print("\n"+"Uppercase value="+count);
		
		System.out.print("\n"+"Lowercase=");
		for (int i = 0; i < str.length(); i++) {
		if (Character.isLowerCase(str.charAt(i))) {
			System.out.print(str.charAt(i)+",");
			count++;
		
		}}
				System.out.println("\n"+"Lowercase value="+count);
	
	}

}

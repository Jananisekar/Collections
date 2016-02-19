package string2;

public class Stringbui {
	public static void main(String[]args){
		String s1 = new String("Janu");
		String s2="Janu";
		System.out.println(s1==s2);
	      System.out.println(s1.equals(s2));
	}

}


// here "==" means that it will check only the reference value but in ".equals()" method it will check the content.
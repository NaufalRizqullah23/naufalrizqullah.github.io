package tesString;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = "";
		string3 = "How are you ".concat(string2);
		System.out.println("String3 : "+string3);
		System.out.println("length : "+string3.length());
		System.out.println("Sub : "+string3.substring(0, 5));
		System.out.println("Uppercase : "+string3.toUpperCase());
		
		String string4 = "How are you "+string2;
		System.out.println("string4 : "+string4);
		System.out.println("string : "+(string1 += string2));
		System.out.println(string2.indexOf('a'));
		System.out.println(string2.charAt(2));
	}

}

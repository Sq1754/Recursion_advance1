
public class Recursion_adv1 {
//Q -> Print all permutation of String
	
	public static void printPermutation(String str, String permutation) {
		if (str.length()==0) {
			System.out.println(permutation);
			return;
		}
		
		for(int i=0; i<str.length();i++) {
			char currChar = str.charAt(i);
			// "abc" -> "ab"  or "bc"or "ac" 
			String newStr = str.substring(0,i) + str.substring(i+1);
			printPermutation(newStr,permutation+currChar);
		}
	}
	
	public static void main(String[]args) {
		String str = "abc";
		System.out.println("All permutation of "+str+": ");
		printPermutation(str,"");
	}
}

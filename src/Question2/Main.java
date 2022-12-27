package Question2;

public class Main {
	public static void main(String[]args) {
		String myStr = "A quick brown fox jumps over the lazy dog";
		System.out.println(myStr.indexOf("d"));
		System.out.println(myStr.charAt(2*myStr.indexOf("w")));
		System.out.println(myStr.substring(15,23));
		System.out.println(myStr.toUpperCase());
		System.out.println(myStr.lastIndexOf("u"));
		myStr+=" in the night";
		    System.out.println(myStr);
	  }

}

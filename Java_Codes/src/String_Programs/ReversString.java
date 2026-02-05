package String_Programs;

public class ReversString {
	public static void main(String []arg) {
	String str = "Pavan";
	 String rev = "";
	for(int i = str.length() - 1; i >= 0; i--) {
		rev =rev+str.charAt(i);
	}
	System.out.println(rev);

}}

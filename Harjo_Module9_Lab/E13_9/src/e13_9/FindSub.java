package e13_9;


public class FindSub {
    public static void main(String[] args) {
        System.out.println(find("Hello World!", "orl"));
        System.out.println(find("Hello World!", "owl"));
        
    }

	public static boolean find(String text, String str) {
	    if (text.length() < str.length()) {
	        return false;
	    }
	    if (text.substring(0, str.length()).equals(str)) {
	        return true;
	    }
	    return find(text.substring(1), str);
	}

}
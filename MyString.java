public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {

    if (str == null) {
        return null;
    }

    String ans = ""; 
    final int DIFFERENCE = 32; 

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch >= 'A' && ch <= 'Z') {
            
            char lowerChar = (char)(ch + DIFFERENCE); 
            ans = ans + lowerChar;
            
        } else {
            ans = ans + ch;
        }
    }
    
    return ans;
}


    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
    if (str2.isEmpty()) {
       return true;
    }

    if (str1.length() < str2.length()) {
        return false;
    }

    int n1 = str1.length();
    int n2 = str2.length();
    for (int i = 0; i <= n1 - n2; i++) {
        boolean matchFound = true;
        
        for (int j = 0; j < n2; j++) {
            if (str1.charAt(i + j) != str2.charAt(j)) {
                matchFound = false;
                break; 
            }
        }

        if (matchFound) {
            return true; 
        }
    }
    return false;
}

}

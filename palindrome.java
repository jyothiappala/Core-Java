import java.util.*;
public class palindrome { 
  
    static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1;  
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        }  
        return true; 
    }  
    public static void main(String[] args) 
    { 
	Scanner s=new Scanner(System.in);
        String str = s.nextLine(); 
  	char ch;
	int i=0;
        if (isPalindrome(str)) {
		while(i<str.length()){
		ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.print("Yes");} i++;}}
        else
            System.out.print("No"); 
    } 
} 
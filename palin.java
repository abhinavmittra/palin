import java.util.*;
class palin { 
    public static boolean isPalindromeChecker(String str) 
    { 
        int n = str.length();
        for(int i=0;i<n/2;i++) { 
            if (str.charAt(i) != str.charAt(n-i-1)) 
                return false;
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        String outputString = sc.nextLine(); 
  
        if (isPalindromeChecker(outputString)) 
            System.out.print("YES"); 
        else
            System.out.print("NO"); 
    } 
} 

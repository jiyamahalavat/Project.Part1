import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String word = input.nextLine();
        String word = "racecar"; 
        System.out.println(isPalindrome(word));
    }
    public static boolean isPalindrome(String s){
        if (x.length() < 2){
            return true; 
        }
        if (x.charAt(0)==x.charAt(x.length()-1)){
            return isPalindrome(x.substring(1,x.length()-1);
        }
        return false;
  }
}


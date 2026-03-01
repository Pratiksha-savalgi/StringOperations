import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     StringAlgo sa= new StringAlgo();
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose operation to be performed ");
        System.out.println("1. palindrome check");
        System.out.println("2. First Non-Repeating Character");
        System.out.println("3. Longest Palindromic Substring");
        System.out.println("4. Remove Duplicate Characters");
        System.out.println("5. String Rotation Check");
        int n= sc.nextInt();
        switch (n){
            case 1: System.out.println("Enter the string");
                String s= sc.nextLine();
                System.out.println(sa.palindromeCheck(s));
                break;

            case 2:   System.out.println("Enter the string");
                String s1= sc.nextLine();
                System.out.println(sa.nonRepeatingCharacter(s1));
                break;

            case 3: System.out.println("Enter the string");
                String s2= sc.nextLine();
                System.out.println(sa.palindromeSubstring(s2));
                break;

            case 4: System.out.println("Enter the string");
                String s3= sc.nextLine();
                System.out.println(sa.removeDuplicate(s3));
                break;

            case 5: System.out.println("Enter two string");
                String s4= sc.nextLine();
                String s5= sc.nextLine();
                System.out.println(sa.stringRotation(s4,s5));
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
     return;
    }
}
import java.util.*;
    
class one {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 5 == 0 && n % 7 == 0) {
            System.out.println("Divisible by Both");
        } 
        else if (n % 5 == 0) {
            System.out.println("Invalid: Divisible by 5 Only");
        } 
        else if (n % 7 == 0) {
            System.out.println("Invalid: Divisible by 7 Only");
        } 
        else {
            System.out.println("No");
        }
        
    }
}

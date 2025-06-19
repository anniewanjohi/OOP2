import java.util.Scanner; 

public class HelloTillstop{
    Scanner sc = new Scanner(System.in); 

    void showHello() {
        String choice; // Guard variable

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next(); // Set guard variable

        while ("h".equals(choice)) { // Check guard
            System.out.println("Hello"); // Typo: 'Helo' → 'Hello'
            choice = sc.next(); // Update guard variable
        }
    }

    public static void main(String[] args) {
        HelloTillstop obj = new HelloTillstop();
        obj.showHello();
    }
}

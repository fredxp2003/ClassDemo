import java.util.Scanner;

public class ClassDemo {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        int i = scanner.nextInt();

        switch(i){
            case 0:
                System.out.println("Case 0");
                break;
            case 1:
                System.out.println("Case 1");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("Hello, World!");
        scanner.close();
    }
}

import java.util.Scanner;

public class DSarray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to specify the size of your array: ");
        int n = input.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.print("Enter a number: ");
            vector[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }

        input.close();
    }
}

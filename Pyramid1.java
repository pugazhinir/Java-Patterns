public class Pyramid1{
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pyramid
        
        // Outer loop to iterate through rows
        for (int i = 1; i <= rows; i++) {
           // Inner loop to print spaces before asterisks
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" "); // Print a space
            }
            
            // Inner loop to print asterisks in ascending order
            for (int j = 1; j <= 1 * i ; j++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line for the next row
        }
    }
}

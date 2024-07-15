public class question7{
    public static void main(String[] args) {
        System.out.println("numbers\t\t squares\t cubes");

        for (int row = 0; row < 6; row++) {
            System.out.printf("%7d", row);
            
            int squared = row * row;
            int cubed = row * row * row;
            
            System.out.printf("%10d", squared);
            System.out.printf("%10d", cubed);
            
            System.out.println();
        }
    }
}
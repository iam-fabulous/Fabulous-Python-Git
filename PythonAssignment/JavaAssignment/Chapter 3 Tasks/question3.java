public class question3 {
    public static void main(String[] args) {
        
        for (int row = 0; row < 10; row++) {
                       for (int column = 0; column < 10; column++) {
                
                System.out.print(row % 2 == 1 ? "<" : ">");
            }
        }
       
        System.out.println();
    }
}
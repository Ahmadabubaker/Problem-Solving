public class Exercise {

    public void multiplication() {
        System.out.println("\t\t\tMultiplication Table from 1 to 10");
        System.out.println();

       
        System.out.print("\t\t"); 
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        System.out.println("\n-------------------------------------------------------------------------------");

       
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t|"); 
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t" + (i * j)); 
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Exercise ex = new Exercise();
        ex.multiplication();
    }
}

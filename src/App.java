import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int limite;

        System.out.print("Insert the limit of the number until you want to count: ");
        Scanner teclado = new Scanner(System.in);

        limite = teclado.nextInt();


        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }
        
        
        
    }
}

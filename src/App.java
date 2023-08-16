import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n1,n2;
        
        Scanner scanner = new Scanner(System.in);
    

        System.out.println("ingresa el primer numero");
        n1=scanner.nextInt();
        System.out.println("ingresa el segundo numero");
        n2=scanner.nextInt();
        double division = (double) n1/n2;

        
        System.out.println("La suma es: "+(n1+n2));
        System.out.println("La resta es: "+(n1-n2));
        System.out.println("La multiplicación es: "+n1*n2);
        System.out.println("La división es: "+division); 
    
    }
}

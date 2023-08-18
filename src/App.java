import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n1,n2,i;
        
        Scanner scanner = new Scanner(System.in);
       
        do{
    
        System.out.println("Ingresa el primer numero");
        n1=scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        n2=scanner.nextInt();
        double division = (double) n1/n2;
        
        
        System.out.println("La suma es: "+(n1+n2));
        System.out.println("La resta es: "+(n1-n2));
        System.out.println("La multiplicación es: "+n1*n2);
        System.out.println("La división es: "+division); 

        
        System.out.println("Si quieres hacer otro cálculo ingresa 1, sino 0");
        i=scanner.nextInt();
        
        
        }while(i != 0);
        
        scanner.close();
        System.out.println("Proceso finalizado");
    
    }
}

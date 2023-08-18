package EjerciciosViernes;

import java.util.Scanner;

public class password {
    public static void main(String[] args) throws Exception {
        //*final String USER = "valeria";
        //String myUser;
    
        final String PASSWORD = "12345";
        String userPassword;

        Scanner myscanner = new Scanner(System.in);

        //System.out.println("Ingrese el usuario");
        //myUser=myscanner.nextLine();

        do {
            System.out.println("Ingrese la contraseña");
            userPassword=myscanner.next();
        } while (!userPassword.equals(PASSWORD));
       
        
        myscanner.close();

        }

        
    }


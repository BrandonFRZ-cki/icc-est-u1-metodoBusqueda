package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        System.out.println("Metodos BUsqueda");
    }
    public int getCode(){
        System.out.print("Ingrese el codigo → ");
        int codigo = scanner.nextInt();
        System.out.println("Codigo ingresado: "+codigo);
        return codigo;
    }
    public void showMessage(String mensaje){
        System.out.println(mensaje);
    }
    public String getName(){
        System.out.print("Ingrese el nombre del persona → ");
        String nombre = scanner.next();
        System.out.println("Nombre del persona ingresado: "+nombre);
        return nombre;
    }

}

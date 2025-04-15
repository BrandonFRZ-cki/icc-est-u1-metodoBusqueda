import controllers.MetodoBusqueda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda();

        int arreglo [] = {1,2,3,4,5,6,7,8,9,10} ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero  buscar");
        int valor = scanner.nextInt();
        int posicionLineal = metodoBusqueda.busquedaLineal(arreglo, valor);
        System.out.println(posicionLineal);

    }
}

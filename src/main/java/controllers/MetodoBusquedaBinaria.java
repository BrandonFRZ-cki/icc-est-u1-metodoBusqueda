package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodoBusquedaBinaria {

    private Persona[] personas;
    private ShowConsole showConsole;

    public MetodoBusquedaBinaria( Persona [] personas){
        this.personas = personas;
        showConsole = new ShowConsole();
        showConsole.showMessage("\n------- Metodos de Busqueda Binaria");
    }
    public int findPersonByCode(int code){
        int bajo = 0;
        int alto = personas.length-1;

        while(bajo<=alto){
            int central = bajo+(alto-bajo)/2;
            if (personas[central].getCodigo() == code) {
                return central;
            }
            if (personas[central].getCodigo() < code) {
                bajo = central + 1;
            }else{
                alto = central - 1;
            }
        }
        return -1;
    }
    public void showPersonByCode(){
        int codeToFind = showConsole.getCode();
        int index = findPersonByCode(codeToFind);
        if(index == -1){
            showConsole.showMessage("No se encontro el persona con el codigo "+codeToFind);
        }else{
            showConsole.showMessage("Persona con codigo "+codeToFind+" encontrado");
            showConsole.showMessage(personas[index].toString());
        }
    }
    private int findPersonByName(String nombre){
        Persona [] personasSortByName = sortByName(personas);
        showConsole.showMessage("Personas Ordenadas");

        int bajo = 0;
        int alto = personasSortByName.length-1;
        while(bajo<=alto){
            int central = bajo+(alto-bajo)/2;
            if(personasSortByName[central].getNombre().equals(nombre)){
                return central;
            }
            if(personasSortByName[central].getNombre().compareTo(nombre)>0){
                bajo = central + 1;
            }else{
                alto = central - 1;
            }
        }

        return -1;
    }
    public void showPersonByName(){
        String nombre = showConsole.getName();
        int index = findPersonByName(nombre);
        if(index == -1){
            showConsole.showMessage("No se encontro el persona con el nombre "+nombre);
        }else{
            showConsole.showMessage("Persona con nombre: "+nombre+" encontrado");
            showConsole.showMessage(personas[index].toString());
        }
    }
    public Persona [] sortByName(Persona[] personas){
        for(int i =0; i < personas.length-1;i++){
            for (int j = 0; j<personas.length-1-i;j++){
                if (personas[j].getNombre().compareTo(personas[j+1].getNombre())>0) {
                    Persona temp = personas[j];
                    personas[j]=personas[j+1];
                    personas[j+1]=temp;
                }
            }
        }
        return personas;
    }
}

package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodoBusqueda {

    private ShowConsole showConsole;
    private Persona [] personas;

    public MetodoBusqueda(Persona[] personas){
        showConsole = new ShowConsole();
        this.personas = personas;
        showPersonByCode();
    }

    public int busquedaLineal(int arreglo[], int valor){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==valor){
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int codigo){

        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getCodigo()==codigo){
                return i;
            }
        }
        return -1;
    }
    public void showPersonByCode(){
        int codeToFinde = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if(indexPerson>=1){
            showConsole.showMessage("* Persona encontrada!");
            showConsole.showMessage(personas[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona con codigo"+ codeToFinde+" no existe");
        }
    }
}


package Logica;

import Interfaz.IElectrico;


public class Pikachu extends Pokemon implements IElectrico{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu ataque Placaje");
        
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Pikachu ataque Mordisco");
    }

    @Override
    public void impactTrueno() {
       System.out.println("Pikachu ataque Impactrueno");
    }

    @Override
    public void punioTrueno() {
       System.out.println("Pikachu ataque Puniotrueno");
    }
    
}

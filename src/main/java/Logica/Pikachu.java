
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void punioTrueno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

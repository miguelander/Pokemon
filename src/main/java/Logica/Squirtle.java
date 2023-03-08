
package Logica;

import Interfaz.IAgua;


public class Squirtle extends Pokemon implements IAgua{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ataque Placaje"); 
    }

    @Override
    protected void atacarAraniazo() {
      System.out.println("Squirtle ataque Araniazo"); 
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Squirtle ataque Mordisco");
    
    }

    @Override
    public void atacarHidroBomba() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atacarBurbuja() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atacarPistolaAgua() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

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
        System.out.println("Squirtle ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataque borbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataque pistola de agua");
    }
}
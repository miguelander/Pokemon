
package Logica;

import Interfaz.IPlanta;


public class Bulbasur extends Pokemon implements IPlanta{
     @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasur ataque Placaje"); 
    }

    @Override
    protected void atacarAraniazo() {
      System.out.println("Bulbasur ataque Araniazo"); 
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Bulbasur ataque Mordisco");
    
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasor ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasor ataque drenaje");
    }
}


package Logica;

import Interfaz.IFuego;

public class Charmander extends Pokemon implements IFuego{

    @Override
    protected void atacarPlacaje() {
      System.out.println("Charmander ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Charmander ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataque puniofuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander ataque Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
         System.out.println("Charmander ataque de ascuas");
    }
    
}

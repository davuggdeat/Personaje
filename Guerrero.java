package Personaje;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
      
        super(nombre, 100, 28, 16);
    }

    // Habilidad especial del Guerrero: Golpe Fuerte
  
    public void golpeFuerte(Personaje enemigo) {
        System.out.println("\n" + getNombre() + " usa **GOLPE FUERTE**! 💥");
        
        int daño = 38;  // Daño alto y fijo (poderoso)
        enemigo.recibirDaño(daño);
        
        System.out.println("¡Causó " + daño + " de daño con su golpe poderoso!");
    }

    @Override
    public void atacar(Personaje enemigo) {
        int daño = getAtaque() - enemigo.getDefensa();
        if (daño < 0) daño = 0;
        
        enemigo.recibirDaño(daño);
        System.out.println(getNombre() + " ataca con su espada causando " + daño + " de daño.");
    }
}
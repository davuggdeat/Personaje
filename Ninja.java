package Personaje;

public class Ninja extends Personaje {

    public Ninja(String nombre) {
        super(nombre, 60, 20, 40);
    }

    public void dobleAtaque(Personaje enemigo) {
        System.out.println("\n" + getNombre() + " usa **DOBLE ATAQUE**! ⚡");
        
        // Primer golpe
        int daño1 = getAtaque() - enemigo.getDefensa();
        if (daño1 < 0) daño1 = 0;
        enemigo.recibirDaño(daño1);
        System.out.println("Primer ataque → " + daño1 + " daño");

        // Segundo golpe
        int daño2 = getAtaque() - enemigo.getDefensa();
        if (daño2 < 0) daño2 = 0;
        enemigo.recibirDaño(daño2);
        System.out.println("Segundo ataque → " + daño2 + " daño");

        System.out.println("¡Total: " + (daño1 + daño2) + " de daño!");
    }

    @Override
    public void atacar(Personaje enemigo) {
        int daño = getAtaque() - enemigo.getDefensa();
        if (daño < 0) daño = 0;
        enemigo.recibirDaño(daño);
        System.out.println(getNombre() + " ataca sigilosamente causando " + daño + " de daño.");
    }
}
	   
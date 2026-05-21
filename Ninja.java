package Personaje;

public class Ninja extends Personaje {

    public Ninja(String nombre) {
        super(nombre, 60, 20, 40);
    }

    public void DisparoDoble(Personaje enemigo) {
        System.out.println(getNombre() + "usa DisparoDoble");
        enemigo.recibirDaño(25);
    
    }
        
    public void Ataquecritico(Personaje enemigo) {
        System.out.println(getNombre() + "hizo un ataque critico-");
        enemigo.recibirDaño(50);
    }
        

    @Override
    public void atacar(Personaje enemigo) {
        int daño = getAtaque() - enemigo.getDefensa();
        if (daño < 0) daño = 0;
        enemigo.recibirDaño(daño);
        System.out.println(getNombre() + " ataca sigilosamente causando " + daño + " de daño.");
    }
	

}

	   

package Personaje;

public class ArenaJava {

    public static void main(String[] args) {
        
        Ninja ninja = new Ninja("Shirai Ryu");
        Guerrero guerrero = new Guerrero("Thor");

        System.out.println("¡COMIENZA LA BATALLA EN LA ARENA JAVA!\n");
        
        ninja.mostrarEstado();
        guerrero.mostrarEstado();

        int turno = 1;
        while (ninja.estaVivo() && guerrero.estaVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");

            if (turno % 2 == 0) {
                ninja.dobleAtaque(guerrero);   // Habilidad especial cada 2 turnos
            } else {
                ninja.atacar(guerrero);
            }

            if (!guerrero.estaVivo()) break;

            guerrero.atacar(ninja);

            ninja.mostrarEstado();
            guerrero.mostrarEstado();

            turno++;
        }

        System.out.println(" GANADOR: " + 
            (ninja.estaVivo() ? ninja.getNombre() : guerrero.getNombre()));
    }
}

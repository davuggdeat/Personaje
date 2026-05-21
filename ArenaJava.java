package Personaje;

public class ArenaJava {

     Ninja ninja = new Ninja("Shirai Ryu");
	        Guerrero guerrero = new Guerrero("Thor");

	        System.out.println("¡COMIENZA LA BATALLA EN LA ARENA JAVA!\n");
	        
	        ninja.mostrarEstado();
	        guerrero.mostrarEstado();

	        int turno = 1;
	        while (ninja.estaVivo() && guerrero.estaVivo()) {
	            double azar = Math.random();
	            if (azar < 0.5) {
	            	ninja.DisparoDoble(guerrero);
	            }else {
	            	
	            }
	            ninja.atacar(guerrero);
	            
	        while (ninja.estaVivo() && guerrero.estaVivo()) {
		        double azar1 = Math.random();
		        if (azar1 < 0.1) {
		           ninja.Ataquecritico(guerrero);
		        }else {
		            	
		            }
		        ninja.atacar(guerrero);
	        
	            
	           if(guerrero.estaVivo()) {
	        	   guerrero.atacar(ninja);
	           }
	           ninja.mostrarEstado();
	           guerrero.mostrarEstado();

             }
	        if (ninja.estaVivo()) {
	        	System.out.println("gano" + ninja.getNombre());
	        }else { 
	        	System.out.println("gano" + guerrero.getNombre());
	        }
	        }
	        }
}

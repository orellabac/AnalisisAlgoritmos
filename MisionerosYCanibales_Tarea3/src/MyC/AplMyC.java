package MyC;

import java.util.ArrayList;

public class AplMyC {
	public static void main(String[] args) {
	    MyC aplicacion = new MyC();
	    aplicacion.inicialiceIslaDestino();
	    aplicacion.inicialiceviajesPredefinidos();
	    aplicacion.inicialiceIslaOrigen(3, 2, 1);
	
	    ArrayList<ArrayList<Integer>> posiblesViajes = aplicacion.getviajesPredefinidos();
	    
	    
	    
	    ArrayList<Integer>viajeElegido = aplicacion.seleccioneViaje(posiblesViajes);
		
	    for (int i = 0; i < 12; i ++){
	    	while(!aplicacion.realizarViajeOD(viajeElegido)){
		    	viajeElegido = aplicacion.seleccioneViaje(posiblesViajes);
		    	if(aplicacion.recorrido.contains(viajeElegido)){
		    		viajeElegido = aplicacion.seleccioneViaje(posiblesViajes);
		    	}
		    	aplicacion.recorrido.add(viajeElegido);
			    	
			    }
			    viajeElegido = aplicacion.seleccioneViaje(posiblesViajes);
			    while(!aplicacion.realizarViajeDO(viajeElegido)){
			    	viajeElegido = aplicacion.seleccioneViaje(posiblesViajes);
			    	aplicacion.recorrido.add(viajeElegido);
			    }
	    }
 
	   
    }
}

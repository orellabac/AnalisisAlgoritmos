package Moneda;

public class AplCambio {
	public static void main(String[] args){
		Cambio cambio = new Cambio(100, new int[]{5,10,25});
		System.out.println(cambio.matrizToString(cambio.getVectorSeleccion()));
		
		}

}

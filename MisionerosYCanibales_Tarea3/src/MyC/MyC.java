package MyC;

import java.util.ArrayList;


public class MyC {


public ArrayList<Integer> IslaOrigen = new ArrayList<>();
public ArrayList<Integer> IslaDestino = new ArrayList<>();
public ArrayList<ArrayList<Integer>> viajesPredefinidos = new ArrayList<>();
public ArrayList<ArrayList<Integer>> recorrido = new ArrayList<>();
public int valorInicial = 3;


public static void main(String[] args) {
   
    }
    
public void inicialiceIslaOrigen(int misioneros, int canibales, int bote){
    IslaOrigen.add(misioneros);
    IslaOrigen.add(canibales);
    IslaOrigen.add(bote);  
}

public void inicialiceIslaDestino(){
    IslaDestino.add(0);
    IslaDestino.add(0);
    IslaDestino.add(0);
}

public void inicialiceviajesPredefinidos(){
    //Viaja 1 misionero    
    ArrayList<Integer> viaje1 = new ArrayList<>();
    viaje1.add(1);
    viaje1.add(0);
    viaje1.add(1);
    
    //Viajan 2 misioneros
    ArrayList<Integer> viaje2 = new ArrayList<>();
    viaje2.add(2);
    viaje2.add(0);
    viaje2.add(1);
    
    //viaja 1 canibal
     ArrayList<Integer> viaje3 = new ArrayList<>();
    viaje3.add(0);
    viaje3.add(1);
    viaje3.add(1);
    
    //viajan 2 canibales
     ArrayList<Integer> viaje4 = new ArrayList<>();
    viaje4.add(0);
    viaje4.add(2);
    viaje4.add(1);
    
    // Voianjan 1 canibal y 1 misionero
    ArrayList<Integer> viaje5 = new ArrayList<>();
    viaje5.add(1);
    viaje5.add(1);
    viaje5.add(1);
    
    // Agrego los viajes a posibles viajes
    
    viajesPredefinidos.add(viaje1);
    viajesPredefinidos.add(viaje2);
    viajesPredefinidos.add(viaje3);
    viajesPredefinidos.add(viaje4);
    viajesPredefinidos.add(viaje5);
       
}
public boolean acertijoResuelto(){
    return ((IslaOrigen.get(0).equals(0)) && (IslaOrigen.get(1).equals(0))
    		&& (IslaOrigen.get(2).equals(0)));
    
}

public ArrayList<Integer> seleccioneViaje(ArrayList<ArrayList<Integer>>viajesPosibles){
	int viaje = valorInicial % 5;
	ArrayList<Integer> viajeElegido = viajesPosibles.get(viaje);
	//System.out.println(viajeElegido);
	valorInicial ++;
	return viajeElegido;
}

public boolean realizarViajeOD( ArrayList<Integer> viaje){
	
	boolean realizable = false;
	
	int misionerosIslaOrigen = IslaOrigen.get(0);
	int canibalesIslaOrigen = IslaOrigen.get(1);

	int misionerosViajantes = viaje.get(0);
	int canibalesViajantes = viaje.get(1);
	
	int misionerosIslaDestino = IslaDestino.get(0);
	int canibalesIslaDestino = IslaDestino.get(1);

	if(valideViajeOD(misionerosIslaOrigen, canibalesIslaOrigen, misionerosViajantes, canibalesViajantes)){

		int MIO =  misionerosIslaOrigen - misionerosViajantes;
		if (MIO < 0){MIO = 0;}
		int CIO = canibalesIslaOrigen - canibalesViajantes;
		if (CIO < 0){CIO = 0;}
		int MID = misionerosIslaDestino + misionerosViajantes;
		int CID = canibalesIslaDestino + canibalesViajantes;
			
		if (valideViaje(MIO,CIO,MID,CID)){
			IslaOrigen.set(0, MIO);
			IslaOrigen.set(1, CIO);
			IslaOrigen.set(2, 0);
			
			IslaDestino.set(0, MID);
			IslaDestino.set(1, CID);
			IslaDestino.set(2, 1);
			
			System.out.println
			("M IslaOrigen: " + IslaOrigen.get(0) + ", C IslaOrigen: " + IslaOrigen.get(1)
		+ " --------> M IslaDestino: "+ IslaDestino.get(0)+ ", C IslaDestino: " + IslaDestino.get(1) 
		 );
			realizable =  true;
		}
	}
	else{
		//System.out.print("No se pudo realizar el viaje");
		}		
	return realizable;
}

public boolean realizarViajeDO(ArrayList<Integer> viaje){
	
	boolean realizable = false;
	
	int misionerosIslaOrigen = IslaOrigen.get(0);
	int canibalesIslaOrigen = IslaOrigen.get(1);

	int misionerosViajantes = viaje.get(0);
	int canibalesViajantes = viaje.get(1);
	
	int misionerosIslaDestino = IslaDestino.get(0);
	int canibalesIslaDestino = IslaDestino.get(1);
	
	if(valideViajeDO(misionerosIslaDestino, canibalesIslaDestino, misionerosViajantes, canibalesViajantes)){

		int MID = misionerosIslaDestino - misionerosViajantes;
		if (MID < 0){MID = 0;}
		int CID = canibalesIslaDestino - canibalesViajantes;
		if (CID < 0){CID = 0;}
		
		int MIO =  misionerosIslaOrigen + misionerosViajantes;
		int CIO = canibalesIslaOrigen + canibalesViajantes;
		
		if (valideViaje(MIO,CIO,MID,CID)){
			IslaOrigen.set(0, MIO);
			IslaOrigen.set(1, CIO);
			IslaOrigen.set(2, 0);
			
			IslaDestino.set(0, MID);
			IslaDestino.set(1, CID);
			IslaDestino.set(2, 1);
			
			System.out.println
			("M IslaOrigen: " + IslaOrigen.get(0) + ", C IslaOrigen: " + IslaOrigen.get(1)
		+ " <-------- M IslaDestino: "+ IslaDestino.get(0)+ ", C IslaDestino: " + IslaDestino.get(1) 
		 );
			realizable =  true;
		}
	}
	
	else{
		//System.out.print("No se pudo realizar el viaje");
		}	
	return realizable;
}

public boolean valideViajeOD(int MIO, int CIO, int MV, int CV){
	return ((MV <= MIO) &&(CV <= CIO));
}

public boolean valideViajeDO(int MID, int CID, int MV, int CV){
	return ((MV <= MID) &&(CV <= CID));
}

public boolean valideViaje(int mio, int cio, int mid, int cid ){
	if (((mio!= 0)&&(mio < cio)) ||
			((mid != 0) && (mid < cid))){
		return false;
	}
	else {
		return true;
	}
}

public ArrayList<Integer> getIslaOrigen() {
	return IslaOrigen;
}


public ArrayList<Integer> getIslaDestino() {
	return IslaDestino;
}


public ArrayList<ArrayList<Integer>> getviajesPredefinidos() {
	return viajesPredefinidos;
}

public int getValorInicial() {
	return valorInicial;
}

public void setValorInicial(int valorInicial) {
	this.valorInicial = valorInicial;
}

public ArrayList<ArrayList<Integer>> getRecorrido() {
	return recorrido;
}

public void setRecorrido(ArrayList<ArrayList<Integer>> recorrido) {
	this.recorrido = recorrido;
}


}

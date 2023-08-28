package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1; 
	private int precio = 500;
	private boolean estado; 
	private int volumen = 1; 
	private Control control;
	private static int numTV; 
	
	public TV(Marca marca, Boolean estado){
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
	}
	public void setMarca(Marca marca){
		this.marca = marca;
		}
	
	public void setCanal(int canal){
		if (estado == true && canal >= 1 && canal <= 120 ){
			this.canal = canal;
		}
	}
	
	public void setPrecio(int precio){
		this.precio = precio;
	}

	public void setVolumen(int volumen){
		if (estado == true && volumen >= 0 && volumen <= 7 ){
			this.volumen = volumen;
		}
	}
	
	public Marca getMarca(){
		return marca; 
	}
	
	public int getCanal(){
		return canal;
	}

	public int getPrecio(){
		return precio;
	}
	
	public static int getNumTV(){
	    return TV.numTV;
	}

	public static void setNumTV(int numTV) {
	        TV.numTV = numTV;
	}
	
	public void turnOn(){
		estado = true;
		}
	public void turnOff(){
		estado = false; 
		}
	
	public boolean getEstado(){
		return estado;
	}
	
	public int getVolumen(){
		return volumen;
	}
	
	
	public void volumenUp() {
		if (estado == true && volumen >= 0 && volumen <= 7){
	            volumen++;
	        }
	}
	
	public void volumenDown(){
		if (estado == true && volumen >= 0 && volumen <= 7){
            	volumen--;
        }
	}
	
	public void canalUp(){
		if (estado == true &&  canal >= 1 && canal <= 120){
        	canal++;
		}
	}
	
	public void canalDown(){
		if (estado == true && canal >= 1 && canal <= 120){
			canal--;
		}
	}
	
	public void setControl(Control control){
		this.control = control;
	}
	
	public Control getControl(){
		return control; 
	}
	
}



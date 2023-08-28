package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1; 
	private int precio = 500;
	private boolean estado; 
	private int volumen = 1; 
	private Control control;
	private static int numTv; 
	
	public TV(Marca marca, Boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTv++; 
	
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
	
	public int getNumTv(){
	    return numTv;
	}

	public void setNumTv(int numTv) {
	        TV.numTv = numTv;
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
		if (estado == true && 0 <= volumen && volumen <= 7){
	            volumen++;
	        }
	}
	
	public void volumenDow(){
		if (estado == true && 0 <= volumen && volumen <= 7){
            	volumen--;
        }
	}
	
	public void canalUp(){
		if (estado == true && 1 <= canal && canal <= 120){
        	canal++;
		}
	}
	
	public void canalDown(){
		if (estado == true && 1 <= canal && canal <= 120){
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



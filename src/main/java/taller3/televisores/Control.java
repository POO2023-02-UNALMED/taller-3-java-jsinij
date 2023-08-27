package taller3.televisores;

public class Control {
	TV tv; 
	
	public void setTV(TV tv){
		this.tv = tv;
	}
	
	public TV getTV(){
		return tv; 
	}
	
	public void setCanal(int Canal){
		if (tv.estado == true && Canal >= 1 && Canal <= 120 ){
			tv.canal = Canal; 
		}
	}
	
	public void setVolumen(int Volumen){
		if (tv.estado == true && Volumen >= 0 && Volumen <= 7 ){
			tv.volumen = Volumen; 
		}
	}
	
	public void turnOn(){
		tv.estado = true;		
	}
	
	public void turnOff(){
		tv.estado = false; 
	}
	
	public void canalDown(){
		if (tv.estado == true && 1 <= tv.canal && tv.canal <= 120){
	        tv.canal--;
			}
	}
	
	public void canalUp(){
		if (tv.estado == true && 1 <= tv.canal && tv.canal <= 120){
        	tv.canal++;
		}
	}
	public void volumenDow(){
		if (tv.estado == true && 0 <= tv.volumen && tv.volumen <= 7){
            	tv.volumen--;
        }
	}
	public void volumenUp(){
		if (tv.estado == true && 0 <= tv.volumen && tv.volumen <= 7){
            	tv.volumen--;
        }
	}
	
	public void enlazar(TV tv){
		this.tv = tv;
		tv.control = this;
	}
}



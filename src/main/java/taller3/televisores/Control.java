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
		tv.setCanal(Canal);
	}
	
	public void setVolumen(int Volumen){
		tv.setVolumen(Volumen);
	}
	
	public void turnOn(){
		tv.turnOn();		
	}
	
	public void turnOff(){
		tv.turnOff(); 
	}
	
	public void canalDown(){
		tv.canalDown();
	}
	
	public void canalUp(){
		tv.canalUp();
	}
	
	public void volumenDow(){
		tv.volumenDow();
	}
	public void volumenUp(){
		tv.volumenUp();
	}
	
	public void enlazar(TV tv){
		this.tv = tv;
		tv.control = this;
	}
}



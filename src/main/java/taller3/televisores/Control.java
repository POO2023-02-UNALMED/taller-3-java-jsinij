package taller3.televisores;

public class Control {
	TV tv; 
	
	public void setTv(TV tv){
		this.tv = tv;
	}
	
	public TV getTv(){
		return tv; 
	}
	
	public void setCanal(int Canal){
		this.tv.setCanal(Canal);
	}
	
	public void setVolumen(int Volumen){
		this.tv.setVolumen(Volumen);
	}
	
	public void turnOn(){
		this.tv.turnOn();		
	}
	
	public void turnOff(){
		this.tv.turnOff(); 
	}
	
	public void canalDown(){
		this.tv.canalDown();
	}
	
	public void canalUp(){
		this.tv.canalUp();
	}
	
	public void volumenDown(){
		this.tv.volumenDown();
	}
	public void volumenUp(){
		this.tv.volumenUp();
	}
	
	public void enlazar(TV tv){
		this.tv = tv;
		tv.setControl(this);
	}
}



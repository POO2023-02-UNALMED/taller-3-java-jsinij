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
	
	public void volumenDown(){
		tv.volumenDown();
	}
	public void volumenUp(){
		tv.volumenUp();
	}
	
	public void enlazar(TV tv){
		this.tv = tv;
		tv.setControl(this);
	}
}



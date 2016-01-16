
public class Contratto {
	private int stipendioBase;
	private String tipo;
	
	Contratto(){
		}
	Contratto(int stipendioBase, String tipo){
		this.stipendioBase = stipendioBase;
		this.tipo = tipo;
	}
	
	
	
	void setStipendio(int stipendioBase){
		this.stipendioBase = stipendioBase;
	}
	
	int getStipendioBase(){
		return this.stipendioBase;
	}
	void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	String getTipo(){
		return this.tipo;
	}
	
	
}

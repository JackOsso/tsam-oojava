package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class EquilateralTriangle extends Shape {
	
	 double base;
	
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	@Override
	public double area(){
		return ( this.base * this.height ) / 2;
	}
	@Override
	public double perimeter(){
		return this.base * 3;
	}
	
}

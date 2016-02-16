package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Rectangle extends Shape {
	double width;
	
	
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area(){
		return this.width * this.height;
	}
	@Override
	public double perimeter(){
		return (this.width * 2) + (this.height * 2);
	}
	
	
	
}

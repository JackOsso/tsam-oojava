package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */


public class Statistics {
	
	//public Shape[] shape;
	 double perimeter;
	 double area;
	
	public Statistics(){};
	public Statistics(double perimeter, double area) {
		this.perimeter=perimeter;
		this.area=area;
		
	}
	
	//sommo all'oggetto corrente il valore delle aree appean inserite 
	public void add(Statistics statistics) {
		this.area+=statistics.area;
		this.perimeter+=statistics.perimeter;
	}
	
	
	public double getPerimeter() {
		return this.perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public double getArea() {
		return this.area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
}
 



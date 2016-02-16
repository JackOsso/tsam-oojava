package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {

double perimeter;
double area;
	
	public void setShapes(Shape[] shapes) {
		
		for (int i = 0; i < shapes.length; i++) {
		this.perimeter+=shapes[i].perimeter();
		this.area+=shapes[i].area();
		
			}
		
		}

	public double totalPerimeter() {
		
		return perimeter;
	}

	public double totalArea() {
		
		return area;
	}


		
}


/*
int sum = 0;
for (int i = 0; i < shapes.length; i++) {
	double a = shapes[i].perimeter();
	
	sum += a;
}

public void add(Statistics statistics) {
this.area+=statistics.area;
this.perimeter+=statistics.perimeter;
}

*/
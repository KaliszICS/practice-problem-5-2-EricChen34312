class Circle{
	public double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	public double diameter(){
		return this.radius*2;
	}

	public double perimeter(){
		return Math.PI*this.radius*2;
	}

	public double area(){
		return Math.PI*Math.pow(this.radius, 2);
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return this.radius;
	}
}

class Sphere extends Circle{

	public Sphere(double radius){
		super(radius);
	}

	@Override
	public double area(){
		return 4*Math.PI*Math.pow(radius, 2);
	}

	public double volume(){
		return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
	}
}
package interfaces;
interface Drawable{
	void draw();
}
class Circle implements Drawable{
	public void draw(){
		System.out.println("Circle drawing..");
	}
}
class Line implements Drawable{
	public void draw(){
		System.out.println("line drawing..");
	}
}
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("Rectangle drawing..");
	}
}
public class Drawing {
	Drawable shapes;
	void drawAll() {
		shapes=new Circle();
		shapes.draw();
		shapes=new Line();
		shapes.draw();
		shapes=new Rectangle();
		shapes.draw();
		
		
	}
	public static void main(String[] args) {
		Drawing d=new Drawing();
		d.drawAll();
	}

}

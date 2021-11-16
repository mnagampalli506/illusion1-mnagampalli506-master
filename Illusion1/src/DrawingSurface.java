
import mnagampalli506.shapes.Line;
import mnagampalli506.shapes.Rectangle;
import processing.core.PApplet;


public class DrawingSurface extends PApplet {

	private Line l;
	private Line l2;
	private Line l3;
	private Line l4;
	private Line l5;
	private Line l6;
	private Line l7;
	private Line l8;
	private Line l9;
	private Line l10;
	private Line l11;
	private Rectangle r1;
	private Rectangle r2;
	
	

	
	public DrawingSurface() {
	 l = new Line(0,100,350,0);
	 l2 = new Line(0,110,400,30);
	 l3 = new Line(0,120,400,60);
	 l4 = new Line(0,130,400,90);
	 l5 = new Line(0,140,400,120);
	 l6 = new Line(0,150,400,150);
	 l7 = new Line(0,160,400,180);
	 l8 = new Line(0,170,400,210);
	 l9 = new Line(0,180,400,240);
	 l10 = new Line(0,190,400,270);
	 l11 = new Line(0,200,350,300);
	 r1 = new Rectangle(180,125,5,70);
	 r2 = new Rectangle(220,125,5,70);
	
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {

	}
	
	// The statements in draw() are executed until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() { 
		l.draw(this);
		l2.draw(this);
		l3.draw(this);
		l4.draw(this);
		l5.draw(this);
		l6.draw(this);
		l7.draw(this);
		l8.draw(this);
		l9.draw(this);
		l10.draw(this);
		l11.draw(this);
		r1.draw(this);
		r2.draw(this);
		
		
		
	
	}
	
	
	
}











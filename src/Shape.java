// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311

//Shape is a generalized class. Line ,Box , Circle and Composite class inherits from this class.

import java.awt.Graphics;



public abstract class Shape {
	
    protected int x;
    protected int y;
	
//    Point getOrigin();
//    void setOrigin(Point origin);
    
    
//    void paintComponent(Graphics g) {
//    	
//	}
    
	public IteratorInterface createShapeIterator() {
		return null;
	}
    
    public  Shape(int x, int y){
    	this.x = x;
    	this.y = y;
		 
	 }

	public void add(Shape li) {
		// TODO Auto-generated method stub
		
	}


	public void drawAllShapes(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void draw(Graphics g);
    
    
    
}
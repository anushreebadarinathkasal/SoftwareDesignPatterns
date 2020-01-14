// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311


//Composite pattern composed of all shapes
import java.awt.Graphics;
import java.util.List;
import java.util.Stack;


public class CompositeShape extends Shape {

	 //List<Shape> listofshapes;
	
	private static Stack<Shape> listofshapes;

	 public  CompositeShape(){
		 super(0,0);
		 //this.listofshapes= new ArrayList<Shape>();
		 //this.listofshapes= new Stack<Shape>();
	 }
	 
	 
		public Stack<Shape> getStackCollection() {
			if(listofshapes==null) {
				listofshapes = new Stack<Shape>();
				//System.out.println("inside get stack collection");
			}
			return listofshapes;
		}
	 
	 public void add(Shape li) {
			// TODO Auto-generated method stub
		 //listofshapes.add(li);
		 getStackCollection().add(li);
		 //System.out.println("list of shapes added");
		}
	 
	 public List<Shape> getlistof(){
		 return listofshapes;
	 }

	 

//	 public void drawAllShapes(Graphics g) {
//			// TODO Auto-generated method stub
//		 java.util.Iterator<Shape> shapeIterator = listofshapes.iterator();
//		 while(shapeIterator.hasNext()) {
//			 System.out.println("before printing shape");
//			 shapeIterator.next().draw(g);
//			 System.out.println("printing shape");
//		 }
//			
//		}
	 
		public void drawAllShapes(Graphics graphics) {		
			IteratorInterface shpIterator = createShapeIterator();
			while(shpIterator.hasNext())
				shpIterator.next().draw(graphics);;
		}
		
		@Override
		public IteratorInterface createShapeIterator() {
			return new IteratorImplementation(listofshapes);
		}
		


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
}


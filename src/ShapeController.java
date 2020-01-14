// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311

//Controller pattern
//Class to handle the business logic
import java.awt.Graphics;



public class ShapeController {
	
	Shape cs ;
	Command ds;
	Context cli = new Context();
	
	
	public ShapeController() {
		cs = new CompositeShape();
		
	}
	
	public void panelClicked(String buttonClicked, int x, int y) {
		// TODO Auto-generated method stub
	System.out.println("InsidePnael");	
	switch(buttonClicked) {
	
	case "lineState": 
		Shape li = new Line(x,y);
		cs.add(li);
		System.out.println("composite added");
		break;
	
	case "circleState":
		Shape cir = new Circle(x,y);
		Context clis = new Context();
		CircleState cis = new CircleState();
		cis.doAction(clis);
		cs.add(cir);
		break;
		
	case "boxState":
		Shape bx = new Box(x,y);
		Context clib = new Context();
		BoxState cisb = new BoxState();
		cisb.doAction(clib);
		cs.add(bx);
		break;
		
		
	case "Undo":
		//System.out.println("undo clicked");
		//undoClicked();

		break;
		
	case "Redo":
		break;
	
	default:
		System.out.println(buttonClicked);
	
	}
	
	
	
	

}
	
	public void buttonstate(String buttonClicked) {
		
		
		switch(buttonClicked) {
		
		case "Line":
			  LineState lis = new LineState();
			  lis.doAction(cli);
			  break;
		  
		case "Circle":
			  CircleState cis = new CircleState();
			  cis.doAction(cli);
			  break;
		
		case "Box":
			  BoxState bis = new BoxState();
			  bis.doAction(cli);
			  break;
		}
		
	}
	
	public void Initcapture() {
		InitState iis= new InitState();
		iis.doAction(cli);
	}
	
	public String getState( ) {
		return cli.getState().toString();
	}

	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		cs.drawAllShapes(g);
		
		//System.out.println("in sp draw shape");
		
	}
	public void undoClicked() {
		//System.out.println("undoclicked func");
		ds = new Undo();
		ds.execute();
	}
	
	public void redoClicked() {
		ds = new Redo();
		ds.execute();
	}
	
	

	
}

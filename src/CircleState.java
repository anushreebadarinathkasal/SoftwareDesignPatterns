// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311
//State Pattern
public class CircleState implements State {
	   public void doAction(Context context) {
		      System.out.println("Controller is in Circle state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "circleState";
		   }

}

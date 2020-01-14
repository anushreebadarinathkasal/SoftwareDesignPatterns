// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311
//State Pattern
public class BoxState implements State {
	   public void doAction(Context context) {
		      System.out.println("Controller is in Box state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "boxState";
		   }

}

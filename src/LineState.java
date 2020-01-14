// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311
//State Pattern
public class LineState implements State{
	
	   public void doAction(Context context) {
		      System.out.println("Controller is in line state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "lineState";
		   }

}

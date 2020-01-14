
public class InitState implements State {

	public void doAction(Context context) {
	      System.out.println("Controller is in Init state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "initState";
	   }
}

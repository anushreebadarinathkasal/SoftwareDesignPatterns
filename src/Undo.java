// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311

//Command pattern which is subclass of command class
public class Undo extends Command {
	
	@Override
	public void execute() {
		//System.out.println("beginning of execute");
		
		//undo();
		
		Shape s = new CompositeShape().getStackCollection().pop();
		//System.out.println(s);
		deleteStack.push(s);
		//System.out.println("undo execute pop stack");
	}


}

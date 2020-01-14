// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311

//Command pattern which is subclass of command class
public class Redo extends Command{
	@Override
	public void execute() {
		Shape s = deleteStack.pop();
		new CompositeShape().getStackCollection().push(s);
	}

}

// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311

//Command pattern Abstract class, super class for undo and redo class
import java.util.Stack;


public abstract class Command {
	
	public static Stack<Shape> deleteStack = new Stack<Shape>();
	
	public Stack<Shape> getStack() {
		return deleteStack;
	}
	
	public abstract void execute();
	

}

// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311


//Iterator pattern
import java.util.List;



public class IteratorImplementation extends IteratorInterface {

	List<Shape> arrayList;
	int position = 0;
	
	public IteratorImplementation(List<Shape> arrayList) {
		this.arrayList = arrayList;
	}
	
	@Override
	public boolean hasNext() {
		if(position>=arrayList.size())
			return false;
		return true;
	}

	@Override
	public Shape next() {
		Shape shape = (Shape) arrayList.get(position++);
		return shape;
	}
	
}


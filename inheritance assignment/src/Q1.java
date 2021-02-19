
class parentClass{
	
	public void printBaseClass(){
		System.out.println("This is parent class");
	}
}

class childClass extends parentClass{
	
	public void printSubClass() {
		System.out.println("This is child class");
	}
}



public class Q1 {

	public static void main(String[] args) {
		
		parentClass parent = new parentClass();
		childClass child = new childClass();
		
		parent.printBaseClass();
		child.printSubClass();
		child.printBaseClass();

	}

}

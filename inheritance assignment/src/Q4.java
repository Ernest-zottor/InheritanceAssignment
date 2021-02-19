import java.util.Scanner;

class Rectangle2{
	int length;
	int breadth;
	
	public Rectangle2(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public int printArea() {
		 return length * breadth;
	}
	
	public int printPerimeter() {
		return 2 *(length + breadth);
	}
}
class Square2 extends Rectangle{
	int side;
	
	Square2(int s){
		super(s,s);
		side = s;
		
	}
}

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Square2[] sq2 = new Square2[10];
		
		for(int i=0; i<10; i++) {
			System.out.print("Enter the side of square " + (i +1) +":" +" ");
			int side = input.nextInt();
			sq2[i] = new Square2(side);
		
		} 
		System.out.println();
		for(int j=0; j<10; j++) {	
		int area = sq2[j].printArea();
		System.out.println("Area of square " + (j+1) +" = " + area);
	
		}
		
	}

}

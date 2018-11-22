package p1;

public class Test {
	
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1,b = 2;
		Circle circle1 = new Circle(1);
		Circle circle2 = new Circle(2);
		
		swap1(a,b);
		System.out.println("After swap1:a ="+a+"b:=" +b);
		
		swap3(circle1,circle2);
		System.out.println("After swap3:circle1 ="+circle1.radius+"circle2:=" 
				+circle2.radius);
		swap2(circle1,circle2);
		System.out.println("After swap2:circle1 ="+circle1.radius+"circle2:=" 
				+circle2.radius);
	}
	public static void swap1(int x,int y){
		int temp = x;
		x = y;
		y = temp;
	}
	public static void swap2(Circle x,Circle y){
		double temp = x.radius;
		x.radius = y.radius;
		y.radius = temp;
	}
	public static void swap3(Circle x,Circle y){
		Circle temp = x;
		x = y;
		y = temp;
	}
	static class Circle{
		double radius;
		Circle(double newRadius){
			radius = newRadius;
		}
	}
}

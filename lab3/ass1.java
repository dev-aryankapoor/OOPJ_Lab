package lab3;

class methodOverloading {
	public int multiplication(int x, int y) {
		return (x * y);
	}

	public double multiplication(double x, double y) {
		return (x * y);
	}

	public int multiplication(int x, int y, int z) {
		return (x * y * z);
	}
}

public class ass1 {

	public static void main(String arg[]) {
		methodOverloading m = new methodOverloading();
		System.out.println(m.multiplication(10, 20));
		System.out.println(m.multiplication(10, 20, 30));
		System.out.println(m.multiplication(10.7, 20.5));
	}
}
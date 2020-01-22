package FirstHibernate;

public class Point implements figure {
	private int a1,b1,a2,b2,a3,b3;
	
public Point()
	{}
	public Point(int a1, int b1, int a2, int b2, int a3, int b3) 
	{
		super();
		this.a1 = a1;
		this.b1 = b1;
		this.a2 = a2;
		this.b2 = b2;
		this.a3 = a3;
		this.b3 = b3;
}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getB1() {
		return b1;
	}
	public void setB1(int b1) {
		this.b1 = b1;
	}
	public int getA2() {
		return a2;
	}
	public void setA2(int a2) {
		this.a2 = a2;
	}
	public int getB2() {
		return b2;
	}
	public void setB2(int b2) {
		this.b2 = b2;
	}
	public int getA3() {
		return a3;
	}
	public void setA3(int a3) {
		this.a3 = a3;
	}
	public int getB3() {
		return b3;
	}
	public void setB3(int b3) {
		this.b3 = b3;
	}
	
	public double CalcArea()
	{
		double area = (a1*b2)+(a2*b3)+(a3*b1)-(a1*b3)-(a2*b1)-(a3*b2);
		return area;
	}

	}

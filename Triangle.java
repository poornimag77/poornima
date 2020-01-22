

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Triangle")

public class Triangle implements figure{
	//properties
	@Id
	private int id;
	private String tname;
	private float tarea;
	
	private transient Point A;
	private transient Point B;
	private transient Point C;
	
	//no-arg constructor
	public Triangle() {
		super();
		tname="Triangle";
	}

	//arugment constructor
	public Triangle(Point a,Point b,Point c)
	{
	super();
	A=a;
	B=b;
	C=c;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public float getTarea() {
		return tarea;
	}

	public void setTarea(float tarea) {
		this.tarea = tarea;
	}

	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}

	public void showFigure()
	{
	System.out.println("Figure is "+figureName);
	}


	public float calcArea() {
	float area=Math.abs( (A.getX()*(B.getY()-C.getY())+B.getX()*(C.getY()-A.getY())+C.getX()*(A.getY()-B.getY())/2));
	System.out.println(area);
	return area;
	}

	}
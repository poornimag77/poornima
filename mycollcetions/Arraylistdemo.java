package mycollcetions;
import java.util.ArrayList;
public class Arraylistdemo {
public static void main(String [] args)
{
	//hecterogeneous collection
	ArrayList al=new ArrayList();
	int myage=43;
	String myname="Sivaram";
	long mymemory=451252121L;
	al.add(myname);
	al.add(myage);
	al.add(mymemory);
	System.out.println(al);
	//homogeneous collection
	ArrayList<String> elist=new ArrayList<String>();
	elist.add("Praveena");
	elist.add("sudha");
	elist.add("haripriya");
	for(String s:elist)
	{
		System.out.println("Employee:"+s);
	}
	if(elist.contains("sivaram"))
	{
		System.out.println("Sivaran is also inside");
	}
	else
	{
 		elist.add("sivaram");
	}
	
		
	}
	
}
package mycollcetions;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arraysdemo {
	public static void main(String [] args)
	{
		int marks[]= {82,78,55};
		String subjects[]= {"Maths","Physics","Chemistry"};
		List<String> booklist=new ArrayList<String>();
		booklist.add("Let us c by Yashwanth Kanetkar");
		booklist.add("Welcome to java by Herbert sheildt");
		booklist.add("Core java");
		
		//Collections.sort(booklist);
		Collections.sort(booklist, Collections.reverseOrder());
		for(String book:booklist)
		{
			System.out.println(book);
		}
		for(byte b=0;b<subjects.length;b++)
		{
			System.out.println(subjects[b]+"marks:"+marks[b]);
		}
		System.out.println("Before sorting an array,");
		for(int m: marks)
		{
			System.out.println(m);
		}
		Arrays.sort(marks);
		System.out.println("After sorting an array,");
		for(int m: marks)
		{
			System.out.println(m);
			
		}
	}

@Override 
public int compareTo(Object args0)
{
	String s1=(String) args0;
	String s2=(String) args1;
	
	if(
			return s.equal(this);
}
	
}
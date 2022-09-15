import java.util.*;
import java.util.stream.Collectors;

class Student1{
	int roll_no;
    String name;
    int age;
    float math_marks ;
    Student1(int roll_no,String name,int age,float math_marks)
    {
    	this.roll_no=roll_no;
    	this.name=name;
    	this.age=age;
    	this.math_marks=math_marks;
    }
    public String toString() {
    	return roll_no+" "+name+" "+age+" "+math_marks;
    }
}

public class MathMarksComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1> list= new ArrayList<Student1>();
	     list.add(new Student1(3001,"Ajay",21,65f));
	     list.add(new Student1(3003,"Vipul",22,86.2f));
	     list.add(new Student1(3006,"Kartik",20,79f));
	     list.add(new Student1(3001,"Aahana",21,76.3f));
	     list.add(new Student1(3003,"Kajal",22,65f));
	     list.add(new Student1(3006,"Mohit",20,72f));
	     System.out.println("Sorting by math marks");
	     
	    List<Float>s= list.stream().filter(x->x.math_marks>60.0f && x.math_marks<80.0f).map(m->m.math_marks).collect(Collectors.toList());
	     System.out.println(s);
	     
	}
}

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
 class Employee implements Comparable<Employee> {
	int id;
    String name;
    int age;
    int salary;
   
    Employee(int id,String name,int age,int salary)
    {
    	this.id=id;
    	this.name=name;
    	this.age=age;
    	this.salary=salary;
    }
    public int CompareTo(Employee o){
       if(salary==o.salary)
		 return 1;
		 else if(salary>o.salary)
		 return 1;
		 else
	     return -1;
}
}
public class TestComparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list= new ArrayList<Employee>();
	     list.add(new Employee(20001,"Shivani",24,20000));
	     list.add(new Employee(20005,"Preeti",26,25000));
	     list.add(new Employee(30009,"Riya",25,28000));
	     System.out.println("Sorting by salary");
	     Collections.sort(list);
	      for(Employee e:list)
	     {
	    	 System.out.println(e.id+" "+e.name+" "+e.age+" "+e.salary);
	     }
	    	 
	}
}





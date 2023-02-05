package Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class Question2 {
    public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		List<Employee> target=new ArrayList<Employee>();
		
		empList.add(new Employee(101,"Gautam",15000));
		empList.add(new Employee(102,"Anand",150000));
		empList.add(new Employee(103,"Aniket",20000));
		empList.add(new Employee(104,"Amrit",35000));
		empList.add(new Employee(105,"Manan",25000));
		
		target = empList.stream().map(e->new Employee(e.id, e.name, e.salary+0.1*e.salary)).collect(Collectors.toList());
		System.out.println(target);
	}
}

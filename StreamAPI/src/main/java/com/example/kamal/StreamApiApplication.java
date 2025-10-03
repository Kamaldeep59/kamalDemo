package com.example.kamal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamApiApplication.class, args);
		
		Employee e1 = new Employee("john",5000);
		Employee e2 = new Employee("kamal",7000);
		Employee e3 = new Employee("foki",6000);
		Employee e4 = new Employee("toki",9000);

		Employee e5 = new Employee("aoki",8000);
		Employee e6 = new Employee("aoki",8000);

		Employee e7 = new Employee("aoki",8000);

		Employee e8 = new Employee("aoki",8000);

		Employee e9 = new Employee("aoki",8000);



		
		

        List<Employee> el = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9);
       
        
        
        
        List<Employee> filterList = el.stream().filter((e) -> e.getSalary()>6000).toList();
        

        long count = el.stream().filter((e) -> e.getSalary()>6000).count();
        System.out.println(count);
        
        
       
        System.out.println(filterList);
        
        List<Employee> distList = el.stream().distinct().toList();
        
        System.out.println(distList);




	}

}
class Employee {
	  private String name;
	    
	  private int salary;
	  
	  

	  @Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}

	  @Override
	  public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name) && salary == other.salary;
	  }

	  public String getName() {
		  return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }

	  public int getSalary() {
		  return salary;
	  }

	  public void setSalary(int salary) {
		  this.salary = salary;
	  }

	  public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	  }

	  @Override
	  public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	  }
	  
}
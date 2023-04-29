package streamAPI;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		List<Employee> list =new ArrayList<>();
		list.add(new Employee(4565,"Himanshu","Noida"));
		list.add(new Employee(4512,"Himanshu","Delhi"));
		list.add(new Employee(4512,"Himanshu","Delhi"));
		list.add(new Employee(411,"Rahul","Noida"));
		list.add(new Employee(421,"Shubham","Noida"));
		
		List<Employee> a= 
		list.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(e->e.getValue()>1)
				.map(e->e.getKey())
				.collect(Collectors.toList());
		
		System.out.println(a);

		
	}

}

package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsList {

	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		names.add("Abhijith");
		names.add("Bhanu");
		names.add("Arun");
		names.add("Ashish");
		names.add("Chandan");
		
		names.stream().filter(s->
		{
			return s.startsWith("A")&& s.length()>6;
		}).limit(3).forEach(s->System.out.println(s));
		
		List<Integer> intList=Arrays.asList(2,3,4,2,7,5,3,6,7);
		
		List<Integer> a= intList.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(a.get(3));
		
//		System.out.println(x);
		
		
	}

}

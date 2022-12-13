package übung;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class MainTest {

	public static void main(String[] args) {
		
//		String [] array = {"Hallo my name ist Bob"};
//		
//		Map<String, Integer> map = wordCount(array);
		

		// Get the List
	     List<String> g
	         = Arrays.asList("der rote flitzer der sich gestern anmelden der war gegangen");

	     // Collect the list as map
	     // by groupingBy() method
	     Map<String, Long> result
	         = g.stream()
	         .flatMap(s -> Arrays.stream(s.split(" ")))
	         .collect(
	             Collectors.groupingBy(
	                 Function.identity(),
	                 Collectors.counting()));

	     // Print the result
	     System.out.println(result);
		
		
		
		
		
		
		
//		IntStream.rangeClosed(2, 100).filter(s -> s % 2 != 0).forEach(System.out::println);
//		IntStream.iterate(2, s -> s+1).limit(50).forEach(System.out::println);
		
//		IntStream.rangeClosed(1, 50).forEach(s -> System.out.print(s + ","));
		
//		IntSupplier i = würfelFabrik();
//		System.out.println(i.getAsInt());
	}

//	private static Map<String, Integer> wordCount(String[] array) {
//		
//		Stream<String> stream = Stream.of(array); 
//		
//		Map<String, Integer> map = stream.collect(Collectors.groupingBy(Function.identity(), ));
//		
//		return map;
//	}
	
//	public static IntSupplier würfelFabrik() {
//		return () -> (int)(Math.random() * 6+1); 
//	}
	
	
}

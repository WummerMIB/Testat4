package combMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> studenten = new ArrayList<>();
		
		studenten.add(new Student(4411, "Peter"));
		studenten.add(new Student(5711, "Peter"));
		studenten.add(new Student(4711, "Peter"));
		studenten.add(new Student(1, "Peter"));
		
		Collections.sort(studenten);
		
		studenten.stream().forEach(System.out::println);
	}

}

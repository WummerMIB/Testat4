package combMain;

public class Student implements Comparable<Student> {

	
	
	private int matkNummer;
	private String name;
	
	public Student(int matkNummer, String name) {
		super();
		this.matkNummer = matkNummer;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [matkNummer=" + matkNummer + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		if(o.matkNummer == matkNummer)
			return 0;
		else if(o.matkNummer > matkNummer)
			return -1;
		else
			return 1;
	}

}

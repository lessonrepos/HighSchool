import java.text.DecimalFormat;

public class Class {

	private double classGrade;
	private String className;
	private int testsTaken;
	
	public Class(String className) {
		classGrade = 100.0;
		testsTaken = 0;
		this.className = className;
	}
	
	public void addToGrade(double grade) {
		testsTaken ++;
		classGrade += grade;
		
		classGrade/=testsTaken;
	}
	
	public String getName() {
		return className;
	}
	
	public void printGrade() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(classGrade));
	}
	
}

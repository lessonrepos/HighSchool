
public class Student {

	private String name;
	private int grade;
	private Class[] classes; 
	private int numberOfClasses;
	private double GPA; 
	
	public Student(String name, int grade, Class[] classes, double GPA) {
		this.name = name;
		this.grade = grade;
		this.classes = classes;
		this.GPA = GPA;
		numberOfClasses = classes.length;
	}
	
	//RANDOM METHOS
	public void takeTest(Class className) {
		double grade = Math.random() * 100;
		className.addToGrade(grade);
	}
	
	//ACCESSOR
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public Class[] getClasses() {
		return classes;
	}
	
	public void printClasses() {
		System.out.print(name + "'s classes: ");
		for(Class c: classes) {
			if(c != null)
				System.out.print(c.getName() + " " );
		}
		System.out.println();
	}
	
	//MUTATOR
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void addClass(String className) {
		if(numberOfClasses + 1 > classes.length) {
			Class[] temp = classes;
			classes = new Class[classes.length * 2]; 
			int classesIndex = 0;
			for (Class cls: temp) {
				classes[classesIndex] = cls;
				classesIndex++;
			}
			classes[classesIndex] = new Class(className);
		}
		else {
			for(int i= 0;i < classes.length; i++) {
				if(classes[i] == null) {
					classes[i] = new Class(className);
					break;
				}
			}
		}

	}
}

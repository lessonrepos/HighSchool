
public class SchoolRoster {

	private static Student[] students;
	
	public SchoolRoster(Student[] students) {
		this.students = students; 
	}
	
	public static boolean hasStudent(String name) {
		//WRITE CODE TO DETERMINE IF THE ROSTER HAS A STUDENT
		return false;
	}
	
	public static void addStudent(Student s) {
		//ADD A STUDENT TO THE ROSTER
	}
	
	public static Student findValedictorian() {
		//GET THE VALEDICTORIAN (12 GRADER W/HIGHEST GPA)
		//IF THEY TIE, CHOOSE THE STUDENT WITH THE MOST CLASSES
		return new Student("replace this with your code", 12, null, 1.23);
	}
	
	public static void print() {
		for(Student s: students) {
			System.out.print(s.getName() + " ");
		}
	}
	
	public static void main(String args[]) {
		//Create classes
		Class history = new Class("History");
		Class math = new Class("Math");
		Class english = new Class("English");
		Class art = new Class("Art");
		Class programming = new Class("Programming");
		Class biology = new Class("Biology");
		Class physics = new Class("Physics");
		Class chemistry = new Class("Chemistry");
		
		//Create students
		Class[] amyClasses = {history, math, art};
		Student amy = new Student("Amy", 12, amyClasses, 4.0);
		
		Class[] bobClasses = {art, biology, programming, math, english};
		Student bob = new Student("Bob", 9, bobClasses, 3.78);
		
		Class[] samClasses = {history, math, art, english};
		Student sam = new Student("Sam", 12, samClasses, 2.93);
		
		Class[] leoClasses = {art, chemistry, physics, math, english};
		Student leo = new Student("Leo", 12, leoClasses, 4.0);
		
		Class[] jenClasses = {english, math, physics, biology, art};
		Student jen = new Student("Jen", 12, jenClasses, 3.0);
		
		Class[] kenClasses = {biology, programming, history, english};
		Student ken = new Student("Ken", 10, kenClasses, 3.88);
		
		Class[] miaClasses = {chemistry, programming, art, english};
		Student mia = new Student("Mia", 11, miaClasses, 3.98);
//		mia.printClasses();
		mia.addClass("Korean");
//		mia.printClasses();
		
		Class[] kaiClasses = {physics, art, history, english, math, biology, programming};
		Student kai = new Student("Kai", 12, kaiClasses, 4.0);
		
		Student[] students = {amy, bob, sam, leo, jen, ken, mia, kai};
		SchoolRoster sr  = new SchoolRoster(students);
	
		System.out.print("Students: "); print();
		System.out.println();
		
		//System.out.println("Valedictorian:  " + findValedictorian());
		//System.out.println("Mia is a student: " + hasStudent());
		
	}
}

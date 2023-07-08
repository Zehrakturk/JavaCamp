package odev2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor= new Instructor();
		Student student=new Student();
		//User user=new User();
		int degree=student.degree;
		System.out.println(degree);
		System.out.println(instructor.userBranch);
		System.out.println(student.getUserpasword());
		
		InstructorManager ınstructorManager= new InstructorManager();
		StudentManager studentManager=new StudentManager();
		
		ınstructorManager.addInstructor(instructor);
		studentManager.addLesson(student);
		UserManager userManager=new UserManager();
		
		User[] users={instructor,student};
		
		userManager.startCourse(users);
		
	}

}

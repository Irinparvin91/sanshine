package three_student;

public class three_student_non_static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  three_student_non_static_method three = new three_student_non_static_method    ();
  three.student();
three_student_non_static_method irin = new three_student_non_static_method ();
irin.teacher();
	}
public void student() {
	int a = 10;
	int b = 10;
	int c = a+b;
	System.out.println(c);
			
} 
public void teacher() {
	int a = 20;
	int b = 25;
	int c = a+b;
	System.out.println(c);
}


}

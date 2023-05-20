package three_student;

public class parameter_non_static {

	public static void main(String[] args) {
		parameter_non_static red = new	parameter_non_static();
		red.rose(10, 20);
		parameter_non_static white = new parameter_non_static();
		white.jack("mira", "khan");
		parameter_non_static price = new parameter_non_static ();
		price.gold(10.25, 20.25);

	}
public void rose(int a,int b){
	int c = a+b;
System.out.println(c);	
}
	
public void jack(String fristname,String lastname) {
	String myname = fristname + lastname;
	System.out.println(myname);
}
public void gold(double a,double b) {
	double c = a+b;
	System.out.println(c);
}

}
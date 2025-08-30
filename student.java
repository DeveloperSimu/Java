class student {	
	int roll;
	String name;
	student(int r, String s) {	
	roll = r;
	name = s;
	}
	void show() {	
System.out.println("roll= " + roll + " name: " +name);
	}
public static void main(String args []) {
student s1 = new student(1,"xyz");
s1.show();
}
}
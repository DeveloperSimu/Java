class student1 {	
	int roll;
	String name;
	student1(int roll, String name) {	
	this.roll = roll;
	this.name = name;
	}
	void show() {	
System.out.println("roll= " + roll + " name= " +name);
	}
public static void main(String args []) {
student1 s1 = new student1(1,"xyz");
s1.show();
}
}
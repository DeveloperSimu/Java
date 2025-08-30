class employee {	
	int emp_id;
	String name;
	employee(int i, String s) {	
	emp_id = i;
	name = s;
	}
	void show() {	
System.out.println("emp_id= " + emp_id + " name: " +name);
	}
public static void main(String args []) {
employee s1 = new employee(369,"Ram");
s1.show();
}
}
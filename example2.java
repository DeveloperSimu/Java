interface A {
void show1(); 
}

interface B {
void show2();
}

interface C {
void show3();
}

class D implements A, B, C {
public void show1() {
System.out.println("Good");
}

public void show2() {
System.out.println("Morning");
}

public void show3() {
System.out.println("Student");
}
}

class example2 {
public static void main(String args[]) {
D obj = new D();
obj.show1();
obj.show2();
obj.show3();
}
}
class figure { 
void area() {
System.out.println("NULL");
}
}

class rectangle extends figure {
void area() {
int a = 5 * 6;
System.out.println("Area of rect = " + a);
}
}

class square extends figure {
void area() {
int b = 4 * 4;
System.out.println("Area of square = " + b);
}
}

class inherit3 {
public static void main(String Args[]) {
figure ref;
figure obj1 = new figure();
rectangle obj2 = new rectangle();
square obj3 = new square();

ref = obj1;
ref.area();

ref = obj2;
ref.area();

ref = obj3;
ref.area();
}
}
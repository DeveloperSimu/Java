class A {
    int i;

    A(int i) {
        this.i = i;
    }
}

class B extends A {
    int j;

    B(int i, int j) {
        super(i);
        this.j = j;
    }

    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

public class Inherit {
    public static void main(String[] args) {
        B obj = new B(1, 2);
        obj.show();
    }
}

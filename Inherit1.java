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
}

class C extends B {
    int k;

    C(int i, int j, int k) {
        super(i,j);
        this.k = k;
    }
void show() {
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
}
}

public class Inherit1 {
    public static void main(String[] args) {
        C obj = new C(1, 2, 3);
        obj.show();
    }
}

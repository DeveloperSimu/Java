class A {
    void show() {
        System.out.println("Hello");
    }
}

class B extends A {
    void show() {
        System.out.println("World");
    }
}

class inherit2 {
    public static void main(String args[]) {
        B obj = new B();
        obj.show();
    }
}
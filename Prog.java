class Prog {
    void show() {
        System.out.println("Welcome");
    }

    void show(int a) {
        System.out.println("a=" + a);
    }

    void show(int a, int b) {  // Fixed method signature
        System.out.println("a=" + a + " b=" + b);
    }

    public static void main(String args[]) {
        Prog p1 = new Prog();
        p1.show();
        p1.show(2);
        p1.show(3,4);
    }
}

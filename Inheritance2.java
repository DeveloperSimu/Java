class classA {
    void display() {
        System.out.println("This is classA");
    }
}

class classB extends classA {
    void showB() {
        System.out.println("This is classB");
    }
}

class classC extends classA {
    void showC() {
        System.out.println("This is classC");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        classB objB = new classB();
        objB.display();
        objB.showB();

        classC objC = new classC();
        objC.display();
        objC.showC();
    }
}

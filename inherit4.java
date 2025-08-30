abstract class figure {
    abstract void area(); 
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
        System.out.println("Area of Square = " + b);
    }
}

class inherit4 {
    public static void main(String args[]) {
        figure ref;

        rectangle obj1 = new rectangle();
        square obj2 = new square();

        ref = obj1;
        ref.area();

        ref = obj2;
        ref.area(); 
    }
}

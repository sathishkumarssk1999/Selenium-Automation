package interview;

class A {
    public void func() {
        System.out.println("in class A");
    }
}

class B extends A {
    public void function() {
        System.out.println("in class B");
    }
}

public class inheritance {

    public static void main(String[] args) {
        B obj = new B();
        obj.function();
        obj.func();

    }
}

package chapter11;

class Test {
    public static void main(String[] args) {
        B b = new B();
    }
}

public class A {
    int i = 1;

    public A() {
        setI(20);
        System.out.println(i);
    }

    public void setI(int i ){
        this.i = i;
    }
}

class B extends A {
    public B() {
        System.out.println(i);
    }

    @Override
    public void setI(int i) {
        this.i = 2 * i;
    }
}
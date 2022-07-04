package org.itmo.java.lesson7;

public class OuterClass {
    private int a;
    private int b;

    static String name = "Mike";

    void sum(final int x, final int y) {
        this.a = x;
        this.b = y;
    }

    class InnerClass {
        void display() {
            sum(4, 6);
            System.out.println("sum = " + (a + b));
        }
    }

    public static void main(String[] args) {
        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
        nestedStaticClass.methodNestedStaticClass();
        OuterClass outerClass = new OuterClass();
        outerClass.innerMethod();
    }

    public void innerMethod() {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.display();
    }

    static class  NestedStaticClass {
        void methodNestedStaticClass() {
            System.out.println("Static nested");
            System.out.println(name);
        }
    }
}

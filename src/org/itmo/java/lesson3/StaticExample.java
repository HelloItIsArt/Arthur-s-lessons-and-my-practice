package org.itmo.java.lesson3;

public class StaticExample {
    public static final String STATIC_CONSTANT = "some constant";
    public String string;
    public static String staticString;
    private final String nonStaticString;
    protected String protectedString;
    Integer defaultInteger;

    static {
        System.out.println("==============");
        System.out.println("static block start");
        staticString = "staticString";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("==============");
    }

    {
        System.out.println("==============");
        System.out.println("non-Static block start");
        nonStaticString = "non-Static";
        System.out.println(staticString);
        System.out.println("non-Static block end");
        System.out.println("==============");
    }

    public static  void  printStaticVar() {
        System.out.println(staticString + " in a static method");
    }

    public final void printNonStaticMethod() {
        printStaticVar();
        staticString = "123";
    }


    public static void main(String[] args) {
//        StaticExample staticExample = null;
//        staticExample.printNonStaticMethod(); <-NPE

//        Integer integer = null;
//        Integer.parseInt("123");
//        int i =   integer.parseInt("123");//<-no NPE
//        System.out.println(integer);
//        System.out.println(i);

        String staticConstant = StaticExample.STATIC_CONSTANT;
//        someMethod(5, 6);
        System.out.println();
        new StaticExample();
    }

    public static void someMethod(final int x, final int y) {

        int a = x + y;
        int b = x - y;

//        x = a;
//        y = b;

        System.out.println("a: " + a + "b: " + b);
    }
}

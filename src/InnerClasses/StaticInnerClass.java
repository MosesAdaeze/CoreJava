package InnerClasses;

import javax.xml.namespace.QName;

public class StaticInnerClass {
    private String name = "John";
    private static int age = 23;

    static class staticClass {

        public void run() {
            System.out.println("My age is " + age );
            System.out.println("My name is " + age );
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.staticClass run = new StaticInnerClass.staticClass();
        run.run();
    }
}


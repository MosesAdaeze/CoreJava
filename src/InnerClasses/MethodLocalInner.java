package InnerClasses;

public class MethodLocalInner {
    private String x = "My OuterClass";

    void display(){
        final String z = "local Variable";
        System.out.println("X: " + x );

        class inner{
            public void print(){
                System.out.println("Will it print x?");
                System.out.println("will it print z?");
            }
        }

        inner run = new inner();
        run.print();
    }

    public static void main(String[] args) {
        MethodLocalInner inner = new MethodLocalInner();
        inner.display();
    }
}

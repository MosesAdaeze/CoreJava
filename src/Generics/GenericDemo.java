package Generics;

public class GenericDemo { //<T>
    public <M> M display (M var) {
        return var;
    }

    public static void main(String[] args) {
        GenericDemo obj = new GenericDemo();
//            GenericDemo GD = new GenericDemo ();
            System.out.println(" String : " + obj.display("John"));
            System.out.println("Interger: " + obj.display(10));
//            GenericDemo <Integer> GD = new GenericDemo<Integer>();
        }
    }

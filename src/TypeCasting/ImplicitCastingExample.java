package TypeCasting;

public class ImplicitCastingExample {
    public static void main(String[] args) {
        int i = 200;

        //automatic type conversion to long
        long l = i;

        //automatic type conversion to float
        float f = l;

        System.out.println(i + " is of type " +((Object)i).getClass().getSimpleName());
        System.out.println(l + " is of type " +((Object)l).getClass().getSimpleName());
        System.out.println(f + " is of type " +((Object)f).getClass().getSimpleName());
    }
}
//
//        public static void main (String[]args){
//            ImplicitCastingExample run = new ImplicitCastingExample();


package RegularExpressions.PatternMethodExamples;

import java.util.regex.Pattern;

public class PatternMethod {
    public static void main(String[] args) {
        String s1 = " pattern";
        Pattern myPattern = Pattern.compile(s1);
        // the pattern method is used to return the compiled regular expression.
        String s2 = myPattern.pattern();
        System.out.println(s2);
    }
}

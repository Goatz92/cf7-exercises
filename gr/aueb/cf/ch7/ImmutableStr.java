package gr.aueb.cf.ch7;

public class ImmutableStr {

    public static void main(String[] args) {

        String s1 = "Coding";
        String s2 = "Coding";

        System.out.println(s1 + " " + s2);
        s2 = "Factory"; // s1 remains unchangeable.
        s1 = "Athens";

        System.out.println(s1 + " " + s2);
    }
}

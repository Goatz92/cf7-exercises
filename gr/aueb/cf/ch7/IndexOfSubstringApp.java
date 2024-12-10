package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {

        String cf = "Coding Factory";
        int positionOfo = cf.indexOf("o"); // index is 1
        int positionOfSecondo = cf.indexOf("o", 2); // index is 11
        int lastPositionOfo = cf.lastIndexOf("o"); //Searches from the right to left

        String cf2 = cf.substring(1); // "oding Factory"
        String slice = cf.substring(1,3); // "od


        //Substring method can have two parameters
        //First = start index
        //Second = end index - 1
        // E.g. s.substring(0, s.length);
        //      s.substring(i); indexes the whole string
    }
}

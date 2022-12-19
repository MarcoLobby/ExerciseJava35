package it.DevelHope.ExerciseJava35;

public class Start {
    public static void main(String[] args) {
        String string = "are you able to climb, are you able to swim or are you able to fly?";

        String string2 = string.replaceAll("\s+are", "_XYZ" );
        System.out.println(string2);
    }
}
/*
    You have a string with the following value: are you able to climb, are you able to swim or are you able to fly?
    with a regular expression, change into _XYZ every occurrence of are that has a space before
    print the result
*/
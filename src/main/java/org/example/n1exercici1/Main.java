package org.example.n1exercici1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods noGenericMethods = new NoGenericMethods(
                "name",
                "lastName",
                "course"
        );

        NoGenericMethods noGenericMethods2 = new NoGenericMethods(
                "LastName",
                "name",
                "course"
        );
        NoGenericMethods noGenericMethods3 = new NoGenericMethods(
                "Course",
                "name",
                "lasName"
        );

        System.out.println(noGenericMethods);
        System.out.println(noGenericMethods2);
        System.out.println(noGenericMethods3);
    }
}
package org.example.n1exercici2;

public class Main {
    public static void main(String[] args) {

        GenericMethods<Person, Integer, Boolean> genericObj = new GenericMethods<>(
                new Person("Inga", "Deme", 34),
                42,
                false
        );

        System.out.println(genericObj);

        GenericMethods<String, Person, Integer> obj = new GenericMethods<>(
                "hola",
                new Person("inga", "deme", 34),
                60
        );

        System.out.println(obj);
    }

}

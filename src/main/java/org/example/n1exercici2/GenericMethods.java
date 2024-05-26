package org.example.n1exercici2;

public record GenericMethods<T, A, V>(T obj1, A obj2, V obj3) {

    @Override
    public String toString() {
        return "GenericMethods{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", obj3=" + obj3 +
                '}';
    }
}

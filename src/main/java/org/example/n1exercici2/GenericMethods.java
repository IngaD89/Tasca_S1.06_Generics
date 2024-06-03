package org.example.n1exercici2;

public class GenericMethods<T, A, V> {

    T obj1;
    A obj2;
    V obj3;

    public GenericMethods(T obj1, A obj2, V obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    @Override
    public String toString() {
        return "GenericMethods{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", obj3=" + obj3 +
                '}';
    }
}

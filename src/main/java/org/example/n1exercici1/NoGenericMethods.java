package org.example.n1exercici1;

public class NoGenericMethods {
    private String name;
    private String lastName;
    private String course;


    /* TODO no entiendo como se debe crear un cosntructor que permita pasar
     argumentos del mismo tipo en diferentes posiciones
     */
    public NoGenericMethods(String name, String lastName, String course) {
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}

package org.itmo.java.practice2;

public class Person {
    private String name;
    private String surname;
    private String qualification;
    private Integer age;
    private boolean isEmployed;

    public Person() {
    }

    public Person(String name, String surname, String qualification, Integer age, boolean isEmployed) {
        this.name = name;
        this.surname = surname;
        this.qualification = qualification;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", qualification='" + qualification + '\'' +
                ", age=" + age +
                ", employed=" + isEmployed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
}

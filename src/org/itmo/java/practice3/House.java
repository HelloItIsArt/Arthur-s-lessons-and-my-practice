package org.itmo.java.practice3;

import java.util.Scanner;

/* Task 3 */
public class House {
    private Integer floorsNumber;
    private Integer constYear;
    private String name;

    public House() {
    }

    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public Integer getConstYear() {
        return constYear;
    }

    public void setConstYear(Integer constYear) {
        this.constYear = constYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void valueSetter() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of floors ");
        this.floorsNumber = in.nextInt();
        System.out.print("Enter a year of construction ");
        this.constYear = in.nextInt();
        System.out.print("Enter a name for the house ");
        this.name = in.next();
    }
    public String valuesOfHouse() {
        return "House " + this.name +
                " has " + this.floorsNumber +" floors. " +
                "A year of construction is " + this.constYear + ".";
    }
    public String houseAge() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the current year ");

        int currYear = in.nextInt();
        int age = currYear - constYear;
        String year;

        if (age > 1) year = " years.";
        else year = " year.";

        return "The house is " + age + year;
    }

    public static void main(String[] args) {
        House house1 = new House();
        house1.valueSetter();
        System.out.println(house1.valuesOfHouse());
        System.out.println(house1.houseAge());

        System.out.println();

        House house2 = new House();
        house2.valueSetter();
        System.out.println(house2.valuesOfHouse());
        System.out.println(house2.houseAge());
    }
}

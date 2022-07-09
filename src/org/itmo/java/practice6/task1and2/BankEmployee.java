package org.itmo.java.practice6.task1and2;

public class BankEmployee extends Human {
    private final String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override // реализация вывода информации
    public void showInfo() {
        System.out.println("An employee of bank \""
                            + bankName + "\". "
                            + getName() + " "
                            + getSurname() + ".");
    }
}

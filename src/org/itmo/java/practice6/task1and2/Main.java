package org.itmo.java.practice6.task1and2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ivan", "Ivanov", "Rogue Bank");
        BankEmployee empl1 = new BankEmployee("Petr", "Petrov", "Rogue Bank");

        checkInfo(client1);
        checkInfo(empl1);
    }
    public static void checkInfo (Info info) {
        info.showInfo();
    }
}

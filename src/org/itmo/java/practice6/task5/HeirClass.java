package org.itmo.java.practice6.task5;

public class HeirClass extends MainClass {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void setUserInfo() {
        userName = sc.nextLine();
    }
}

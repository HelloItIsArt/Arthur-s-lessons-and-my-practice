package org.itmo.java.practice3;

/* Task 4 */
public class Tree {
    private Integer age;
    private  boolean isAlive;
    private String treeName;

    public Tree() {
        System.out.println("The empty constructor has worked out.\n");
    }

    public Tree(Integer age, String treeName) {
        this.age = age;
        this.treeName = treeName;
    }

    public Tree(Integer age, boolean isAlive, String treeName) {
        this.age = age;
        this.isAlive = isAlive;
        this.treeName = treeName;
    }

    @Override
    public String toString() {
        return treeName + "{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", treeName='" + treeName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(50, "willow");
        Tree tree3 = new Tree(30, true, "Pine");

        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
    }
}

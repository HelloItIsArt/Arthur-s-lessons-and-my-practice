package org.itmo.java.practice3;

/* Task 1 */
class Study {
    private final String course;

    public Study(String line) {
        this.course = line;
    }

    public String printCourse() {
        return this.course;
    }

    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
}

package com.company;

/**
 * The type Student.
 */
public class Student {
    private String f_name;
    private String l_name;
    private String id;
    private int grade;

    /**
     * Instantiates a new Student.
     *
     * @param firstName the first name
     * @param lastname  the lastname
     * @param id        the id
     */
    public Student(String firstName, String lastname, String id) {
        this.f_name = firstName;
        this.l_name = lastname;
        this.id = id;
        this.grade = 0;
    }

    /**
     * Gets f name.
     *
     * @return the f name
     */
    public String getF_name() {
        return f_name;
    }

    /**
     * Sets f name.
     *
     * @param firstname the firstname
     */
    public void setF_name(String firstname) {
        f_name = firstname;
    }

    /**
     * Gets l name.
     *
     * @return the l name
     */
    public String getL_name() {
        return l_name;
    }

    /**
     * Sets l name.
     *
     * @param lastname the lastname
     */
    public void setL_name(String lastname) {
        l_name = lastname;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param num the num
     */
    public void setId(String num) {
        id = num;
    }

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Sets grade.
     *
     * @param score the score
     */
    public void setGrade(int score) {
        grade = score;
    }

    /**
     * Print.
     */
    public void print() {
        System.out.println("Student's name:" + " " + f_name);
        System.out.println("Student's last name:" + " " + l_name);
        System.out.println("Student's ID:" + " " + id);
        System.out.println("Student's grade:" + " " + getGrade());
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Student std = new Student("Moein", "Ahmadieh", "9931001");
        std.setGrade(16);
        std.print();
        Student std1 = new Student("Matin", "Ahmadieh", "9931002");
        std1.setGrade(18);
        std1.print();
    }
}

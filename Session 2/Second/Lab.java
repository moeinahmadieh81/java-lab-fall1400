package com.company;

/**
 * The type Lab.
 */
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * Instantiates a new Lab.
     *
     * @param cap the cap
     * @param d   the d
     */
    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        this.students = new Student[capacity];
    }

    /**
     * Enroll student.
     *
     * @param std the std
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full");
        }
    }

    /**
     * Print.
     */
    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(students[i].getF_name() + " " + students[i].getL_name() + " " + students[i].getId() + " " + students[i].getGrade());
        }
    }

    /**
     * Get students student [ ].
     *
     * @return the student [ ]
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Sets students.
     *
     * @param students the students
     */
    public void setStudents(Student[] students) {
        for (int i = 0; i < currentSize; i++) {
            this.students[i] = students[i];
        }
    }

    /**
     * Gets avg.
     *
     * @return the avg
     */
    public int getAvg() {
        return avg;
    }

    /**
     * Calculate avg.
     */
    public void calculateAvg() {
        int sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum += students[i].getGrade();
        }
        avg = sum / currentSize;
    }

    /**
     * Gets day.
     *
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets day.
     *
     * @param day the day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Gets capacity.
     *
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity.
     *
     * @param capacity the capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}

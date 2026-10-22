package ru.mirea.itu.project2;

public class Student {
    private String name;
    private int grade;
    private String email;
    private char gender;

    public String getName(){
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int grade, String email, char gender) {
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

}

package model.entity;

import model.enums.Major;

public class Student extends Person {
    private Integer studentId;
    private Major major;
    private Double gpa;

    public Student(){

    }


    public Student(String name, Integer age, String address, Integer studentId, Major major, Double gpa) {
        super(name, age, address);
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", major=" + major +
                ", gpa=" + gpa +
                '}';
    }
}

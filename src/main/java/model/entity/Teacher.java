package model.entity;

import model.enums.Subject;

public class Teacher extends Person {
    private String teacherId;
    private Subject subject;
    private Double salary;
    public Teacher(){

    }

   public Teacher(String name, Integer age, String address, String teacherId, Subject subject, Double salary) {
        super(name, age, address);
        this.teacherId = teacherId;
        this.subject = subject;
        this.salary = salary;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", subject=" + subject +
                ", salary=" + salary +
                '}';
    }
}

package com.vinod.student.studentdal.entities;

import javax.persistence.*;

@Entity
@Table(name = "studenttab")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "sname")
    private  String name;
    @Column(name = "scourse")
    private String course;
    @Column(name = "sfee")
    private double fee;

    public Student() {
    }

    public Student(String name, String course, double fee) {
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return name;
    }

    public void setSname(String sname) {
        this.name = sname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getSfee() {
        return fee;
    }

    public void setSfee(double sfee) {
        this.fee = sfee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", fee=" + fee +
                '}';
    }
}

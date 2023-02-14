package com.getarrays.studentmanager.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String track;
    private String points;
    @Column(nullable = false, updatable = false)
    private String studentCode;

    public Student() {}

    public Student(String name, String email, String track, String points, String studentCode) {
        this.name = name;
        this.email = email;
        this.track = track;
        this.points = points;
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", track='" + track + '\'' +
                ", points='" + points + '\'' +
                ", studentCode='" + studentCode + '\'' +
                '}';
    }

    // id getter and setter methods
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    // name getter and setter methods
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    // email getter and setter methods
    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    // track getter and setter methods
    public String getTrack() { return track; }

    public void setTrack(String track) { this.track = track; }

    // points getter and setter methods
    public String getPoints() { return points; }

    public void setPoints(String points) { this.points = points; }

    // student code getter and setter methods
    public String getStudentCode() { return studentCode; }

    public void setStudentCode(String studentCode) { this.studentCode = studentCode; }
}

package com.hibernate.example.Academy2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;

    @OneToOne(mappedBy = "passport")
    private Student student;

    public Passport() {
    }

    public Passport(int id, int number, Student student) {
        this.id = id;
        this.number = number;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}

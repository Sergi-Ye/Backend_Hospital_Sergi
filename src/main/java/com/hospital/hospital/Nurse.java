package com.hospital.hospital;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "nurse")
public class Nurse {

    @Id
    @Column(name = "user", nullable = false, unique = true)
    private String user;

    @Column(name = "pw")
    private String pw;

    @Column(name = "name")
    private String name;

    public Nurse() {
    }

    public Nurse(String name, String user, String pw) {
        this.name = name;
        this.user = user;
        this.pw = pw;
    }

    public String getUser() {
        return user;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }
}

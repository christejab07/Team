package org.Models;

import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int dob;
    private String email;
    private String team;
    private Names names;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Ball ball;
    public Player(Names names, int dob, String email, String team) {
        this.names = names;
        this.dob = dob;
        this.email = email;
        this.team = team;
    }
    public Player() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }
    public Ball getBall() {
        return ball;
    }
    public void setBall(Ball ball) {
        this.ball = ball;
    }
}

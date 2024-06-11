package org.Models;

import jakarta.persistence.*;

@Entity
public class Ball {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ballId;
    private String brand;
    @Transient
    private String type;
    private float diameter;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ball")
    @JoinColumn(name = "id")
    private Player player;
    @ManyToOne
    @JoinColumn(name = "coachId")
    private Coach coach;

    public Coach getCoach() {
        return coach;
    }


    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Ball( String brand, float diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }
    public Ball() {}
    public int getBallId() {
        return ballId;
    }

    public void setBallId(int ballId) {
        this.ballId = ballId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
}

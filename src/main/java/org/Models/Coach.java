package org.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "Coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coachId;
    private Names names;
    private int salary;
    private String team;
    @OneToMany(mappedBy = "coach", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ball> balls;
    public Coach( Names names, int salary, String team) {
        this.names = names;
        this.salary = salary;
        this.team = team;
    }

    public Coach() {

    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

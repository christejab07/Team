package org.Models;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "head coach")
public class HeadCoach extends Coach {
    private int bonus;
    public HeadCoach() {}
    public HeadCoach(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

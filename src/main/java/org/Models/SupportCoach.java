package org.Models;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "support coach")
public class SupportCoach extends Coach{
    private int daysAvailable;

    public SupportCoach(int daysAvailable) {
        this.daysAvailable = daysAvailable;
    }
    public SupportCoach() {}

    public int getDaysAvailable() {
        return daysAvailable;
    }

    public void setDaysAvailable(int daysAvailable) {
        this.daysAvailable = daysAvailable;
    }
}

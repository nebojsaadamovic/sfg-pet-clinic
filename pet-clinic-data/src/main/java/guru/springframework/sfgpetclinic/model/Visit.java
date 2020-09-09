package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{
    private LocalDate date;
    private String dewcription;
    private Pet pet;


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDewcription() {
        return dewcription;
    }

    public void setDewcription(String dewcription) {
        this.dewcription = dewcription;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

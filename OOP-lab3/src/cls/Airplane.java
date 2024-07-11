package cls;

import java.time.LocalDate;

public class Airplane {
    private Long id;
    private Integer numOfSeats = 400;
    private LocalDate dateOfCreation = LocalDate.now();
    private LocalDate lastRepairing;

    public Airplane() {

    }

    public Airplane(Long id, Integer numOfSeats, LocalDate dateOfCreation) {
        this.id = id;
        this.numOfSeats = numOfSeats;
        this.dateOfCreation = dateOfCreation;
    }

    public Airplane(Long id, Integer numOfSeats, LocalDate dateOfCreation, LocalDate lastRepairing) {
        this.id = id;
        this.numOfSeats = numOfSeats;
        this.dateOfCreation = dateOfCreation;
        this.lastRepairing = lastRepairing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(Integer numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalDate getLastRepairing() {
        return lastRepairing;
    }

    public void setLastRepairing(LocalDate lastRepairing) {
        this.lastRepairing = lastRepairing;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", numOfSeats=" + numOfSeats +
                ", dateOfCreation=" + dateOfCreation +
                ", lastRepairing=" + lastRepairing +
                '}';
    }
}




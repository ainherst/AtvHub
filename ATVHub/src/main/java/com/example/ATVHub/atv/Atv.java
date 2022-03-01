package com.example.ATVHub.atv;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Atv {
    @Id
    @SequenceGenerator(
            name = "atv_sequence",
            sequenceName = "atv_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "atv_sequence"
    )

    private Long id;
    private String rideClass;
    private String make;
    private LocalDate year;
    private LocalDate yearMakeBegin;
    private LocalDate yearMakeEnd;
    private String model;

    public Atv(Long id, String rideClass, String make, LocalDate year, LocalDate yearMakeBegin, LocalDate yearMakeEnd, String model) {
        this.id = id;
        this.rideClass = rideClass;
        this.make = make;
        this.year = year;
        this.yearMakeBegin = yearMakeBegin;
        this.yearMakeEnd = yearMakeEnd;
        this.model = model;
    }

    public Atv() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRideClass() {
        return rideClass;
    }

    public void setRideClass(String rideClass) {
        this.rideClass = rideClass;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public LocalDate getYearMakeBegin() {
        return yearMakeBegin;
    }

    public void setYearMakeBegin(LocalDate yearMakeBegin) {
        this.yearMakeBegin = yearMakeBegin;
    }

    public LocalDate getYearMakeEnd() {
        return yearMakeEnd;
    }

    public void setYearMakeEnd(LocalDate yearMakeEnd) {
        this.yearMakeEnd = yearMakeEnd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Atv(String rideClass, String make, LocalDate year, LocalDate yearMakeBegin, LocalDate yearMakeEnd, String model) {
        this.rideClass = rideClass;
        this.make = make;
        this.year = year;
        this.yearMakeBegin = yearMakeBegin;
        this.yearMakeEnd = yearMakeEnd;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Atv{" +
                "id=" + id +
                ", rideClass='" + rideClass + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", yearMakeBegin=" + yearMakeBegin +
                ", yearMakeEnd=" + yearMakeEnd +
                ", model='" + model + '\'' +
                '}';
    }
}

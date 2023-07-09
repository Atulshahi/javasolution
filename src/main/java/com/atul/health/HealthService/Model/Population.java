package com.atul.health.HealthService.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_population")
public class Population {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "townname")
    private String townName;

    @Column(name = "population")
    private int population;

    public Population(Long id, String townName, int population) {
        this.id = id;
        this.townName = townName;
        this.population = population;
    }

    public Population() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Population{" +
                "id=" + id +
                ", townName='" + townName + '\'' +
                ", population=" + population +
                '}';
    }
}

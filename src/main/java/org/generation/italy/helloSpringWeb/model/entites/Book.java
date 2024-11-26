package org.generation.italy.helloSpringWeb.model.entites;

import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @Column(name = "num_pages")
    private int numPages;
    private double cost;

    public Book(){

    }

    public Book(long id, String title, int numPages, double cost) {
        this.id = id;
        this.title = title;
        this.numPages = numPages;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public double getCost() {
        return cost;
    }
}

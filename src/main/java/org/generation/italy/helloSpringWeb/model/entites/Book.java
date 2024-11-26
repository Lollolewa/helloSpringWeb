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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setCost(double cost) {
        this.cost = cost;
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

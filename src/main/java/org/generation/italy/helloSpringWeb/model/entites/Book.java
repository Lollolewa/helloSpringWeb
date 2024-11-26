package org.generation.italy.helloSpringWeb.model.entites;

public class Book {
    private long id;
    private String title;
    private int numPages;
    private double cost;

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

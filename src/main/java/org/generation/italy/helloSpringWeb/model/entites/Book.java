package org.generation.italy.helloSpringWeb.model.entites;

import jakarta.persistence.*;

@Entity //Diamo valore di entity alla classe
@Access(AccessType.FIELD) //Questa da accesso a tutto, di default già è così
@Table(name = "book") //Diamo il nome alla tabella
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @Column(name = "num_pages") //Cambiamo nome sulla tabella
    private int numPages;
    private double cost;

    public Book() {} //costruttore di default per non fare i setter
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

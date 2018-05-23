package com.lz.spring.bean;

public class Book {
    private int id;

    private String title;

    private User owner;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

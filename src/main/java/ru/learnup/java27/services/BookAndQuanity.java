package ru.learnup.java27.services;

import ru.learnup.java27.entity.Book;

public class BookAndQuanity {

    private Book book;

    private int quantity;

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public BookAndQuanity(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

}

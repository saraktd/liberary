package model;

import model.enums.BookType;

public class Book extends BaysikModel {
    private String arthur;
    private BookType bookType;
    private Long member;

    public Book() {
    }

    public Book(String arthur, BookType bookType, Long member) {
        this.arthur = arthur;
        this.bookType = bookType;
        this.member = member;
    }

    public Book(String name, String id, String arthur, BookType bookType, Long member) {
        super(name, id);
        this.arthur = arthur;
        this.bookType = bookType;
        this.member = member;
    }

    public String getArthur() {
        return arthur;
    }

    public void setArthur(String arthur) {
        this.arthur = arthur;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Book{" +
                "arthur='" + arthur + '\'' +
                ", bookType=" + bookType +
                ", member=" + member +
                '}';
    }
}

package pro.sky.java.course1.lesson12;


import static java.util.Objects.hash;

public class Book { // класс Book
    private final String title;
    private final Author author;
    private int publishingYear; //свойства класса Book

    public Book(String title, Author author, int publishingYear) { //конструктор для описания информации по книгам
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle () { //геттер для возвращения значения свойства title
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() { //геттер для возвращения значения свойства publishingYear
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) { //сеттер для изменения значения свойства publishingYear
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book t1 = (Book) other;
        return title.equals(t1.title);
    }

    @Override
    public int hashCode() {
        return hash(title);
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ", автор: " + author.toString() + ", год издания: " + publishingYear;
    }
}

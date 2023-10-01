package pro.sky.java.course1.lesson12;

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

    public void printInformationAboutABook() { //метод для вывода информации о книгах в консоль
        System.out.println("Название книги: " + getTitle() + ", автор: " + author.getName() + " " + author.getSurname() + ", год издания: " + getPublishingYear());
    }

}

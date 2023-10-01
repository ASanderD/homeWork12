package pro.sky.java.course1.lesson12;

public class HomeWork12{
    public static void main(String[] args) {
        Author authorOfFirstBook = new Author("Лев", "Толстой"); //объявление и инициализация переменной authorOfFirstBook созданного типа Author  (автор первой книги)
        Author authorOfSecondBook = new Author("Федор", "Достоевский"); //объявление и инициализация переменной authorOfSecondBook созданного типа Author  (автор второй книги)
        Book firstBook = new Book("Война и мир", authorOfFirstBook, 1868); //объявление и инициализация переменной firstBook созданного типа Book  (информация о первой книге)
        Book secondBook = new Book("Преступление и наказание", authorOfSecondBook, 1866); //объявление и инициализация переменной secondBook созданного типа Book (информация о второй книге)
        firstBook.printInformationAboutABook(); // вызов метода вывода информации о книге класса Book
        secondBook.printInformationAboutABook(); // вызов метода вывода информации о книге класса Book
        firstBook.setPublishingYear(2040); //изменение даты публикации первой книги с использованием сеттера
        firstBook.printInformationAboutABook(); //вызов метода вывода информации о книге класса Book (после изменения даты публикации первой книги)
    }
}

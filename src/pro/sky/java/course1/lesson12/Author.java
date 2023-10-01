package pro.sky.java.course1.lesson12;


public class Author { //класс Author
    private final String name;
    private final String surname; //свойства класса Author

    public Author(String name, String surname) { //конструктор для описания информации об авторах книг
        this.name = name;
        this.surname = surname;
    }

    public String getName() { //геттер для возвращения значения свойства name
        return this.name;
    }

    public String getSurname() { //геттер для возвращения значения свойства surname
        return this.surname;
    }
}

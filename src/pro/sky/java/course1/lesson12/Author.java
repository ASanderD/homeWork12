package pro.sky.java.course1.lesson12;


import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

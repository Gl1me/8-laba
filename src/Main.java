class Main {
    public static void main(String[] args) {
        Person p = new Person("Иван", "Петров", 1985);
        Car c = new Car("Toyota Camry", 2020, 2.5);
        Book b = new Book("Руководство по ремонту", "Николай Краснов", 1869);
        p.OutP();
        c.OutC();
        b.OutB();
        p.Info(c, b);
    }
}

class Person {
    String I;
    String F;
    int birth_year;

    Person(String I, String F, int birth_year) {
        this.I = I;
        this.F = F;
        this.birth_year = birth_year;
    }

    void OutP() {
        System.out.println("Имя: " + this.I + ". Фамилия: " + this.F + ". год рождения: " + this.birth_year + ".");
    }

    void Info(Car N, Book B) {
        System.out.printf("%s читает книгу %s про машину %s", this.I, B.title, N.mark);
    }
}

class Car {
    String mark;
    int release_year;
    double engine_volume;

    Car(String mark, int release_year, double engine_volume) {
        this.mark = mark;
        this.release_year = release_year;
        this.engine_volume = engine_volume;
    }

    void OutC() {
        System.out.println("Марка: " + this.mark + ". Год выпуска: " + this.release_year + ". Объем двигателя: " + this.engine_volume + ".");
    }
}

class Book {
    String title;
    String author;
    int year_of_release;

    Book(String title, String author, int year_of_release) {
        this.title = title;
        this.author = author;
        this.year_of_release = year_of_release;
    }

    void OutB() {
        System.out.println("Название: " + this.title + ". Автор: " + this.author + ". Год выпуска: " + this.year_of_release + ".");
    }
}

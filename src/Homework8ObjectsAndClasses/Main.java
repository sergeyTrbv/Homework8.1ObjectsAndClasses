package Homework8ObjectsAndClasses;

public class Main {

    public static void main(String[] args) {

        Author jackLondon = new Author("Jack", "London");
        Author stephenKing = new Author("Stephen", "King");
        Book martinEden = new Book("Martin Eden", jackLondon, 1909);
        Book misery = new Book("Misery", stephenKing, 1987);

        System.out.println(martinEden.fullInfoBook());
        System.out.println(misery.fullInfoBook());

        martinEden.setYearPublication(2020);
        System.out.println(martinEden.fullInfoBook());
    }
}


package Author;

public class BookDemo {
    public static void main(String []args){
        Author author = new Author("Russel", "Winderand");
        Book book = new Book("Developing Java Software","Russel Winderand", 79.75);
        System.out.println(book);
    }
}

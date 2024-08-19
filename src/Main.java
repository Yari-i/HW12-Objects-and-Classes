public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Чак", "Паланик");
        Author author2 = new Author("Дмитрий", "Глуховский");

        Book book1 = new Book("Бойцовский клуб", author1, 1996);
        Book book2 = new Book("Метро 2033", author2, 2002);

        System.out.println("Книга 1: " + book1.getTitle() + ", автор: " + book1.getAuthor().getFirstName() + " "
                + book1.getAuthor().getLastName() + ", год публикации: " + book1.getPublicationYear());

        System.out.println("Книга 2: " + book2.getTitle() + ", автор: " + book2.getAuthor().getFirstName() + " "
                + book2.getAuthor().getLastName() + ", год публикации: " + book2.getPublicationYear());

        // Изменяем год публикации одной из книг
        book1.setPublicationYear(1997);
        System.out.println("Обновленный год публикации для книги \"" + book1.getTitle() + "\": " + book1.getPublicationYear());
    }
}




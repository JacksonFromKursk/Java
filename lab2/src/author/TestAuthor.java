package author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Vladimir Vasiliev", "VladVas32@yandex.ru", 'm' );
        Author a2 = new Author("Alina Karseva", "karasal1981@mail.ru", 'f');
        Author a3 = new Author("Alexander Pushkin", "none", 'm');
        Author a4 = new Author("Jack Philby", "philbyUKjack@gmail.com", 'm');
        System.out.println(a1.getEmail());
        System.out.println(a2.getGender());
        System.out.println(a3.getName());
        System.out.println(a4);
    }
}

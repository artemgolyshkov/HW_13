import org.xml.sax.ext.Attributes2;

public class Main {


    public static void main(String[] args) {
        Author alexPushkin = new Author("Александр","Пушкин");
        Author levTolstoy = new Author("Лев", "Толстой");
        Author levaTolstoy = new Author("Лев", "Толстой");
        Book evgeniyOnegin = new Book("Евгений Онегин ",alexPushkin,1835);
        Book  warAndPeace = new Book("Война и мир ",levTolstoy,1868);
        System.out.println(evgeniyOnegin);
        System.out.println(warAndPeace);
        evgeniyOnegin.setYearBook(1833);
        System.out.println(evgeniyOnegin);
    }

}

import org.xml.sax.ext.Attributes2;

public class Main {


    public static void main(String[] args) {
        Author alexPushkin = new Author("Александр ","Пушкин");
        Author levTolstoy = new Author("Лев ", "Толстой");
        Book evgeniyOnegin = new Book("Евгений Онегин ", 1835);
        Book  warAndPeace = new Book("Война и мир ",1868);
        System.out.println("Автор - " + alexPushkin.getNameAuthor() + alexPushkin.getSurNameAuthor() + "; Книга - " + evgeniyOnegin.getNameBook() + evgeniyOnegin.getYearBook() + " год");
        System.out.println("Автор - " + levTolstoy.getNameAuthor() + levTolstoy.getSurNameAuthor()  + "; Книга - " + warAndPeace.getNameBook() + warAndPeace.getYearBook() + " год" );
        evgeniyOnegin.setYearBook(1833);
        System.out.println("Автор - " + alexPushkin.getNameAuthor() + alexPushkin.getSurNameAuthor() + "; Книга - " + evgeniyOnegin.getNameBook() + evgeniyOnegin.getYearBook() + " год");


    }

}

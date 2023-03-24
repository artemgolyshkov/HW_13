public class Book {
   private String nameBook;
   private Author author;
   private int yearBook;


    public Book(String nameBook, Author author, int yearBook){
        this.nameBook = nameBook;
        this.author = author;
        this.yearBook = yearBook;

    }
     public String getNameBook(){
        return this.nameBook;
     }
     public Author getAuthor(){
        return this.author;
     }
     public int getYearBook(){
        return this.yearBook;
     }
     public void setYearBook(int yearBook){
        this.yearBook = yearBook;
     }
    public String toString() {
        return "Автор - " + this.author + " Книга - " + this.nameBook + " " + this.yearBook;

    }
    public boolean equals(Book other) {
        if (this.nameBook.equals(other.nameBook) && this.yearBook == other.yearBook) {
            return true;
        }
        return false;
    }
    public int hashCode() {
        return java.util.Objects.hash(nameBook,yearBook);
    }


}

public class Author {
    private String nameAuthor;
    private String surNameAuthor;

    public Author(String nameAuthor, String surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;

    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurNameAuthor() {
        return this.surNameAuthor;
    }

    public String toString() {
        return this.nameAuthor + " " + this.surNameAuthor;

    }

    public boolean equals(Author other) {
        if (this.nameAuthor.equals(other.nameAuthor) && this.surNameAuthor.equals(other.surNameAuthor)) {
            return true;
        }
        return false;
    }
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor,surNameAuthor);
    }
}







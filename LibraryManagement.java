package OopsProject;
 class Book {
     private String author;
     private String title;
     private boolean isAvailable;

     public Book(String author, String title) {
         this.author = author;
         this.title = title;
         this.isAvailable=true; // the initial book is available
     }

     //    getter method
     public String getAuthor() {
         return author;
     }

     public String getTitle() {
         return title;
     }

     public boolean isAvailable() {
         return isAvailable;
     }

     public void checkOut() {
         if (isAvailable) {
             isAvailable = false;
             System.out.println("you have check the book " + title);
         } else {
             System.out.println("the book/" + title + "the already checkout ");
         }
     }

     public void returnBook() {
         if (isAvailable) {
             isAvailable=true;
             System.out.println("subbmit the book" + title);
         } else {
             System.out.println("not submit the book ");
         }
     }
     public void displayInfo () {
         System.out.println("author: " +author);
         System.out.println("title :" + title );
         System.out.println("Available "+ (isAvailable ? "yes": "no"));
     }
 }
     public class LibraryManagement {
    public static void main(String[] args) {
        Book obj = new Book("holland","the Harry potter ");
        obj.checkOut();
        obj.isAvailable();
        obj.displayInfo();

    }
    }

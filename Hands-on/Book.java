package Operator;
/* Create a Book class with the following attributes:

title (String)
author (String)
isbn (String)
year (int)
Implement three constructors for the Book class:

Default constructor that sets default values for title, author, isbn, and year.
Constructor that takes title, author, and isbn as parameters and sets the year to the current year (use java.time.Year).
Constructor that takes all four attributes as parameters.*/
import java.time.Year;
public class Book 
{
	//fields or attributes
    private String title;
    private String author;
    private String isbn;
    private static Year year;
    // Default constructor - without parameter
    public Book() 
    {
        title = "ABC murders";
        author = "Agatha Christie";
        isbn = "0-9767736-6-X";
        year = Year.now();
    }
    // Constructor with title parameter
    public Book(String title)
    {
    	this.title = title;
    	author = "Agatha Christie";
        isbn = "123567";
        year = Year.now();
    	
    }
    // Constructor with title and author parameters
    public Book(String title, String author)
    {
    	this.title=title;
    	this.author=author;
    	isbn = "123567";
        year = Year.now();
    	
    }
 // Constructor with title, author and isbn parameters
    public Book(String title, String author, String isbn)
    {
    	this.title=title;
    	this.author=author;
    	this.isbn=isbn;
    	year = Year.now();
    	
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public static Year getYear() {
    	return year;
    }
class BookMain{
	public static void main(String[] args) {
		 // Creating objects using different constructors
        Book Book1 = new Book();
        Book Book2 = new Book("ABC murder2"); // Constructor with name parameter
        Book Book3 = new Book("Life", "Prasanna");// Constructor with name and age parameters
        Book Book4 = new Book("Black hole", "Hawking", "0-9767487-6-X");

     // Getting information using getter methods
        System.out.println("The book " + Book1.getTitle()+ " is wriiten by "  + Book1.getAuthor()  + " " + Book1.getIsbn() + " " +  getYear());
        System.out.println("The book " + Book2.getTitle()+ " is wriiten by "  + Book2.getAuthor() + " " + Book2.getIsbn() + " " +  getYear());
        System.out.println("The book " + Book3.getTitle()+  " is wriiten by "  + Book3.getAuthor() + " " + Book3.getIsbn() + " " + getYear());
        System.out.println("The book " + Book4.getTitle() + " is wriiten by "  + Book4.getAuthor() + " " + Book4.getIsbn() + " " + getYear());
	}
	
}
}

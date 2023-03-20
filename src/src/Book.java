package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {

  //Data fields
  private int id;
  private String title;
  private LocalDate releaseDate;
  private double price;
  private static int idCounter = 1;

  /**
   * Book constructor.
   * it will initialize the title and the price with the given parameters.
   * it will initialize the release date with the given date parameters.
   * it will initialize the id with the currently book number.
   * @param title title of the book
   * @param price price of the book
   * @param year year of release date
   * @param month month of release date
   * @param day day of release date
   */
  Book(String title, double price, int year, int month, int day) {
    this.id = idCounter;
    idCounter++;
    this.title = title;
    this.price = price;
    this.releaseDate = LocalDate.of(year, month, day);
  }

  //Methods
  /**
   * A getter method to get the book's id
   * @return int return the id
   */
  public int getId() {
    return id;
  }

  /**
   * A setter method to set the book's id.
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * A getter method to get the book's title
   * @return String return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * A setter method to set the book's id
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * A getter method to get the book's release date
   * @return LocalDate return the releaseDate
   */
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  /**
   * A setter method to set the book's release date
   * @param year the year to set
   * @param month the month to set
   * @param day the day to set
   */
  public void setReleaseDate(int year, int month, int day) {
    this.releaseDate = LocalDate.of(year, month, day);
  }

  /**
   * A getter method to get the book's price
   * @return double return the price
   */
  public double getPrice() {
    return price;
  }

  /**
   * A setter method to set the book's price
   * @param price the price to set
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * to print all the book's data
   */
  void print() {
    //to format the date as (day, month, year)
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(
      "dd, MM, YYYY"
    );
    //print the data
    System.out.println("Id: " + this.id + ". Title: " + this.title);
    System.out.println(
      "Price: " +
      this.price +
      " . Release Date: " +
      dateTimeFormatter.format(this.releaseDate)
    );
  }
}

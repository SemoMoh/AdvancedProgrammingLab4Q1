package src;

public class AudioBook extends Book {

  //Data fields
  private double lengthInMinutes;

  /**
   * AudioBook constructor.
   * it will initialize the title, the length in minutes and the price with the given parameters.
   * it will initialize the realease date with the given date parameters.
   * it will initialize the id with the currently book number.
   * @param title title of the book
   * @param price price of the book
   * @param lengthInMinutes length in minutes of the book
   * @param year year of the book
   * @param month month of the book
   * @param day day of the book
   */
  AudioBook(
    String title,
    double price,
    int year,
    int month,
    int day,
    double lengthInMinutes
  ) {
    super(title, price, year, month, day);
    this.lengthInMinutes = lengthInMinutes;
  }

  //Methods
  /**
   * A getter method to get the AudioBook's length in minutes
   * @return double return the lengthInMinutes
   */
  public double getLengthInMinutes() {
    return lengthInMinutes;
  }

  /**
   * A setter method to set the AudioBook's length in minutes
   * @param lengthInMinutes the lengthInMinutes to set
   */
  public void setLengthInMinutes(double lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  /**
   * to print all the AudioBook's data
   */
  @Override
  void print() {
    System.out.println("The AudioBook's Data: ");
    super.print();
    System.out.println("Length in minutes: " + this.lengthInMinutes);
  }
}

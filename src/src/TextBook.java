package src;

public class TextBook extends Book {

  //Data fields
  private int noOfPages;

  /**
   * TextBook constructor.
   * it will initialize the title, the no. of pages and the price with the given parameters.
   * it will initialize the release date with the given date parameters.
   * it will initialize the id with the currently book number.
   * @param title title of the book
   * @param price price of the book
   * @param noOfPages number of pages in the book
   * @param year year of the book
   * @param month month of the book
   * @param day day of the book
   */
  TextBook(
    String title,
    double price,
    int year,
    int month,
    int day,
    int noOfPages
  ) {
    super(title, price, year, month, day);
    this.noOfPages = noOfPages;
  }

  //Methods
  /**
   * A getter method to get the TextBook's no. of pages
   * @return int return the noOfPages
   */
  public int getNoOfPages() {
    return noOfPages;
  }

  /**
   * A setter method to set the TextBook's no. of pages
   * @param noOfPages the noOfPages to set
   */
  public void setNoOfPages(int noOfPages) {
    this.noOfPages = noOfPages;
  }

  /**
   * to print all the TextBook's data
   */
  @Override
  void print() {
    System.out.println("The TextBook's Data:");
    super.print();
    System.out.println("Number of pages: " + this.noOfPages);
  }
}

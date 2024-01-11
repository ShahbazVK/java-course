public class EBook extends Book {
  private int runTime;
  private int pageCount;

  EBook(String title, String author, int pageCount, int runTime) {
    super(title, author, pageCount);
    this.runTime = runTime;
  }
}
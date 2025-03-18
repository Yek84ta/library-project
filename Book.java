public class Book {
    private String title;
    private int pageCount;

    public Book(String newTitle, int newPageCount) {
        if (newPageCount <= 0) {
            throw new IllegalArgumentException("Page count must be positive.");
        }
        if (newTitle == null || newTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }

        this.pageCount = newPageCount;
        this.title = newTitle;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " (" + pageCount + " pages)";
    }
}
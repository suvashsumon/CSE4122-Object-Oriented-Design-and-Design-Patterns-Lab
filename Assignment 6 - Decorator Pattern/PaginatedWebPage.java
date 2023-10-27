/**
 * This class decorates a web page with pagination, splitting search results into multiple pages.
 */
public class PaginatedWebPage extends WebPageDecorator {

    /**
     * Constructs a PaginatedWebPage with the given decorated page.
     *
     * @param decoratedPage The web page to decorate with pagination.
     */
    public PaginatedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    /**
     * Overrides the display method to split search results into multiple pages after the base page is displayed.
     */
    @Override
    public void display() {
        super.display(); // Display the base page content
        splitSearchResults();
    }

    /**
     * Private method to split search results into multiple pages.
     */
    private void splitSearchResults() {
        System.out.println("Splitting search results into multiple pages...");
        System.out.println("Displaying search results across multiple pages.");
    }
}

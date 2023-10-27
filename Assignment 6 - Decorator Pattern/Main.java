/**
 * This class demonstrates the Decorator Pattern by creating and displaying various decorated web pages.
 */
public class Main {
    public static void main(String[] args) {
        // Create a simple web page
        WebPage simplePage = new SimpleWebPage();
        System.out.println("Simple Web Page:");
        simplePage.display();

        System.out.println();

        

        // Create a web page with pagination
        WebPage paginatedPage = new PaginatedWebPage(simplePage);
        System.out.println("Paginated Web Page:");
        paginatedPage.display();


        System.out.println();

        // Create a web page with authorization check
        WebPage authorizedPage = new AuthorizedWebPage(simplePage);
        System.out.println("Authorized Web Page:");
        authorizedPage.display();

    }
}

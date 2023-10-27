/**
 * This class decorates a web page to check user authorization before displaying it.
 */
public class AuthorizedWebPage extends WebPageDecorator {

    /**
     * Constructs an AuthorizedWebPage with the given decorated page.
     *
     * @param page The web page to decorate.
     */
    public AuthorizedWebPage(WebPage page) {
        super(page);
    }

    /**
     * Overrides the display method to check user authorization before displaying the page.
     */
    @Override
    public void display() {
        verifyAuthorization();
        super.display();
    }

    /**
     * Private method to check user authorization.
     */
    private void verifyAuthorization() {
        System.out.println("Authorizing user...");
        System.out.println("User is authorized.");
    }
}

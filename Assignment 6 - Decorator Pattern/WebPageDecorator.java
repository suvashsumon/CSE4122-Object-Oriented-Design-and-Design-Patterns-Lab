/**
 * This abstract class serves as a base class for web page decorators that implement the WebPage interface.
 */
public abstract class WebPageDecorator implements WebPage {
    protected WebPage decoratedPage;

    /**
     * Constructs a WebPageDecorator with the given decorated page.
     *
     * @param decoratedPage The web page to decorate.
     */
    public WebPageDecorator(WebPage decoratedPage) {
        this.decoratedPage = decoratedPage;
    }

    /**
     * Delegates the display functionality to the decorated page.
     */
    @Override
    public void display() {
        decoratedPage.display();
    }
}

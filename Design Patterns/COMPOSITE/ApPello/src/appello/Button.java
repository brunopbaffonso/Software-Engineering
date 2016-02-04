package appello;

/**
 *
 * @author Bruno Affonso
 * 
 * Class which is the HTML tag Button.
 */

/*LEAF

Implements the Interface GenerateHTML*/
public class Button  implements GenerateHTML{

    /**
     *
     */
    protected final String buttonHTML = "\n<input name=\"\" type=\"button\" />\n";

    /**
     * 
     * @return the HTML tag
     */
    @Override
    public String print() {
        return buttonHTML;
    }
}

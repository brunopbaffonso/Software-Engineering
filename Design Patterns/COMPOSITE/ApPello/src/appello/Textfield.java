package appello;

/**
 *
 * @author Bruno Affonso
 * 
 * Class which is the HTML tag TextField
 */

/*LEAF

Implements the Interface GenerateHTML*/
public class Textfield  implements GenerateHTML{

    /**
     *
     */
    protected final String textfieldHTML = "\n <input name=\"\" type=\"text\" /> \n";

    /**
     * 
     * @return the HTML tag
     */
    @Override
    public String print() {
        return textfieldHTML;
    }
}

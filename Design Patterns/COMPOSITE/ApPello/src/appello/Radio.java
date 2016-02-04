package appello;

/**
 *
 * @author Bruno Affonso
 * 
 * Class which is the HTML tag Radio
 */

/*LEAF

Implements the Interface GenerateHTML*/public class Radio  implements GenerateHTML{
    
    /**
     * 
     * @return the HTML tag
     */
    @Override
    public String print() {
        String radioHTML = "\n<input name=\"\" type=\"radio\" value=\"\" />\n";
        return radioHTML;

    }
}

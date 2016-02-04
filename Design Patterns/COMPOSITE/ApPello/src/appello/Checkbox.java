package appello;


/**
 *
 * @author Bruno Affonso
 * 
 * Class which is the HTML tag Checkbox
 */

/*LEAF

Implements the Interface GenerateHTML*/
public class Checkbox  implements GenerateHTML{   
    
    /**
     * 
     * @return the HTML tag
     */
    @Override
    public String print() {
        String checkboxHTML = "\n<input name=\"\" type=\"checkbox\" value=\"\" />\n";
        return checkboxHTML;   
    }
}

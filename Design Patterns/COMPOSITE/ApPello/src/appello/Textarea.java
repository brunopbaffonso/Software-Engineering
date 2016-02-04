package appello;

/**
 *
 * @author Bruno Affonso
 * 
 * Class which is the HTML tag TextArea
 */

/*LEAF

Implements the Interface GenerateHTML*/
public class Textarea  implements GenerateHTML{
    protected String col,

    /**
     *
     */
    row;
    
    /**
     * 
     * @param col String - Number of Cols which TextArea contains.
     * @param row String - Number of Rows which TextArea contains.
     */
    public Textarea(String col, String row){
        this.col = col;
        this.row = row;
    }
    /**
     * 
     * @return the HTML tag
     */
    @Override
    public String print() {
        String textareaHTML = "\n<textarea name=\"\" cols=\""+col+"\" rows=\""+row+"\"> </textarea> \n";
        return textareaHTML;
    }
}

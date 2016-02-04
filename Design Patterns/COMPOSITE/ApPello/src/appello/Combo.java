package appello;

/**
 *
 * @author Bruno Affonso
 * 
 * Class which is the HTML tag ComboBox
 */

/*LEAF

Implements the Interface GenerateHTML*/
public class Combo implements GenerateHTML{

    /**
     *
     */
    protected int items=0; 

    /**
     * 
     * @param items int - number of items which ComboBox contains.
     */
    public Combo(int items){
         this.items = items;
     }
    /**
     * 
     * @return the HTML tag
     */
    @Override
    public String print() {
        String comboHTML = "\n<select name=\"jumpMenu\" id=\"jumpMenu\" onchange=\"MM_jumpMenu('parent',this,0)\">\n";
        String option = "\n<option>item</option>\n";
        String fim = "\n</select>\n";
        String retorno;

        retorno = comboHTML;
        for(int cont=0; cont<items; cont++){
            retorno = retorno + option;
        }
        retorno = retorno + fim;
        
        return retorno; 

    }
    
}

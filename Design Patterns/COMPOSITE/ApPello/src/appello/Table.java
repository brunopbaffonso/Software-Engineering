package appello;

/**
 *
 * @author Bruno Affonso
 * 
 * Class which is the HTML tag Table
 */

/*LEAF

Implements the Interface GenerateHTML*/
public class Table implements GenerateHTML{
    protected int table_row=0, 

    /**
     *
     */
    table_cel=0; 
    
    /**
     * 
     * @param cel int - Number of Cells which Table contains.
     * @param row int - Number of Rows which Table contains.
     */
    public Table(int row, int cel) {
        table_row = row;
        table_cel = cel;
    }

    /**
     * 
     * @return the HTML tag
     */
    @Override
    public String print() {
        String tableHTML = "\n<table width=\"200\" border=\"1\">\n";
        String row = "\n<tr>";
        String fim_row = "</tr>\n";
        String cel = "\n<td>&nbsp</td>\n";
        String fim = "\n</select>\n";
        String retorno;

        retorno = tableHTML;
        for(int cont=0; cont<table_row; cont++){
            retorno = retorno + row;
            for(int cont2=0; cont2<table_cel; cont2++){
                retorno = retorno + cel;
            }
            retorno = retorno + fim_row;
        }
        retorno = retorno + fim;

        return retorno;
    }

}

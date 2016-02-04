package appello;

/**
 *
 * @author Bruno Affonso
 * 
 * Class which is the HTML tag Form
 */

/*LEAF

Implements the Interface GenerateHTML*/
public class Form  implements GenerateHTML{
    protected String name="",

    /**
     *
     */
    id="",

    /**
     *
     */
    method="",

    /**
     *
     */
    target="";
    
    /**
     * 
     * @param name String - Name of the form. 
     * @param id String - ID of the form 
     * @param method String - Method (GET or POST) to send the form. 
     * @param target String - For where the form must be send. 
     * 
     */
    public Form(String name, String id, String method, String target){
        this.name = name;
        this.id = id;
        this.method = method;
        this.target = target;
    }
    
    /**
     * 
     * @return the HTML tag
     */
    @Override
    public String print() {
        String formHTML = "\n<form name=\""+name+"\" id=\""+id+"\" method=\""+method+"\" target=\""+target+"\"></form>\n";
        return formHTML;
    }
}

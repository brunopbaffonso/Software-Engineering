package appello;

/**
 *
 * @author Bruno Affonso
 * 
 * This class generate Objects.
 * 
 */


/*COMPOSITE*/

public class HTMLcode {
    /**
    * @param col String - Number of Cols which TextArea contains.
    * @param row String - Number of Rows which TextArea contains. 
    * 
    * @return Textarea object 
    */
    //jRadioButton5
    public static Textarea obj1(String col, String row) {
        Textarea textarea = new Textarea(col, row);
        return textarea;
    }
    //jRadioButton4

    /**
     *
     * @return
     */
        public static Checkbox obj2() {
        Checkbox checkbox = new Checkbox();
        return checkbox;
    }   
    //jRadioButton1

    /**
     *
     * @return
     */
        public static Radio obj3() {
        Radio radio = new Radio();
        return radio;
    }
    //jRadioButton7

    /**
     *
     * @return
     */
        public static Button obj4() {
        Button button = new Button();
        return button;
    }
    //jRadioButton2

    /**
     *
     * @return
     */
        public static Textfield obj5() {
        Textfield textfield = new Textfield();
        return textfield;
    }   
    /**
    * @param name String - Name of the form. 
    * @param id String - ID of the form 
    * @param method String - Method (GET or POST) to send the form. 
    * @param target String - For where the form must be send. 
    * 
    * @return Form object 
    */
    //jRadioButton8
    public static Form obj6(String name, String id, String method, String target) {
        Form form = new Form(name, id, method, target);
        return form;
    }
    /**
    * @param items int - number of items which ComboBox contains.
    * 
    * @return Combo object 
    */
    //jRadioButton3
    public static Combo obj7(int items) {
        Combo combo = new Combo(items);
        return combo;
    }
    /**
    * @param cel int - Number of Cells which Table contains.
    * @param row int - Number of Rows which Table contains.
    * 
    * @return Table object 
    */
    //jRadioButton6
    public static Table obj8(int row, int cel) {
        Table table = new Table(row, cel);
        return table;
    }

}

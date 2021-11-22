//Child Class - To demonstrate the concept of Inheritance, Overriding methods.
package classes_3;

public class TextBox extends UIControl{
public String text="";  

    public TextBox(){
        super(true);
        System.out.println("TextBox subclass");
    }
   
    void getText(String text)
    {
        this.text = text; 
    }
    
    @Override  //Annotation
    public String toString(){
    return text;
    }
    
    
    
    public void clear()
    {
        text = "";
    }
    
}

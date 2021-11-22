//Base Class
package classes_3;

public class UIControl {
    private boolean isEnabled = true;
    
    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
        System.out.println("UIControl superclass");
    }
    
    public void enable(){
        isEnabled = true; 
    }
    
    public void disable(){
        isEnabled = false; 
    }
    
    public boolean getUIFlag(){
        return isEnabled;
    }
    
}

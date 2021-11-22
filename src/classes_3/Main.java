
package classes_3;

public class Main {
    public static void main(String[] args) {
        
        // var obj = new TextBox();  //For 1st and 2nd program
        /* var obj2 = obj;
        var obj3 = new TextBox();
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj.equals(obj2) + " "+ obj.equals(obj3)); */  //1st program
       
        /*
        obj.getText("Hello, Welcome To Java");
        System.out.println(obj.toString()); //Will return the overrided toString method in TextBox class.
        */ //2nd program 
        
        var control = new UIControl(true);
        var textbox = new TextBox();
        show(control); //Will give us object's reference 
        show(textbox); //Passing the child class object in method with Base class type parameter - Upcasting, but it will not print anything because we redefined toString method.
        show2(textbox); 
        show2(control); //It will raise an exception because, base class object cannot be casted to method with Downcast. To avoid it we should use a conditional in method.
    }
    
    public static void show(UIControl control){
        System.out.println(control);
    }
    
    public static void show2(UIControl control){
        if(control instanceof TextBox){
          var obj = (TextBox) control;  //Downcasting - Explicitly typecasting the base class object with child class type.
           obj.getText("Hi, welcome to Java.");        
        }
        System.out.println(control);
    }

}

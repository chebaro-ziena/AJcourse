package Revision;
public class InValidNumberException extends Exception{
    public InValidNumberException(){
        super("Invalid number");
    }
    public InValidNumberException(String message){
    super(message);
    
    }
}

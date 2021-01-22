package lesson13and14and22;

public class UserNameNotValidException extends RuntimeException
{
    public UserNameNotValidException(String string){
        super(string);
    }
}

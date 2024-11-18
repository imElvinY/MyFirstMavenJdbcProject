package exceptions;

import java.sql.SQLException;

public class NullPointException extends SQLException {
    public NullPointException(String message){
        super(message);
    }


}

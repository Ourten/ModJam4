package fr.darktech.exception;

public class NetworkException extends Exception {

    public NetworkException(String msg)
    {
	super(msg);
    }
    
    public NetworkException(String msg, Throwable cause)
    {
	super(msg, cause);
    }
}

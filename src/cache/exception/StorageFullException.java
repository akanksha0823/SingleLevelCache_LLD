package cache.exception;

public class StorageFullException extends RuntimeException{
    public StorageFullException(String msg) {
        super(msg);
    }
}

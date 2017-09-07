package task;

public class DifferentLengthException extends Exception{

    public DifferentLengthException(Throwable e) {
        initCause(e);
    }

}

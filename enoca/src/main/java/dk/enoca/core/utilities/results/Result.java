package dk.enoca.core.utilities.results;

public class Result {

    //işlem başarılı mı kontrol etmek için
    private boolean success;
    private String message;

    public Result(boolean success){this.success=success;}
    public Result(boolean success, String message){this(success); this.message=message;}

    public boolean isSuccess(){return  this.success;}
    public String getMessage(){return  this.message;}
}

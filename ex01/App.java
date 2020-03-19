package t_12_errorHandingWithExceptions.ex01;

public class App {
    public static void main(String[] args)
    {
        try
        {
            throw new Exception("This is exception");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("This is finally clause");
        }
    }
}

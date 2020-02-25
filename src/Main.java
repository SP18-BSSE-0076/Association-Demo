public class Main
{
    public static void main(String[] args)
    {
        FirstClass f = new FirstClass();        //creating object
        SecondClass s = new SecondClass();      //creating object
        
        f.firstClassMethod(s);      //Linking
        s.secondClassMethod(f);     //Linking
        
        f.setFirstName("Muhammad"); //setting value using (settor method in 1st class)
        s.setLastName("Atif");      //setting value using (settor method in 2nd class)
        
        s.startName();              //calling to print details
        f.endName();                //calling to print details
    }
}
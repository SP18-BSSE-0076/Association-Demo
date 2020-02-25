public class FirstClass
{
    String firstName;       
    
    SecondClass s;         // 2nd class object declare in 1st class
    
    public void firstClassMethod(SecondClass s)     // 2nd class object initialize in 1st class method , association main hum constructor k zariyay value pass nae kar raiy hotay isliay method bna k pass karni hoti h.
    {
        this.s = s;
    }
    
                    //Creating gettor settor of the field

    public String getFirstName()
    {
        return this.firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
                    //Creating a method in which we print 2nd class field using 2nd class object
    
    public void endName()
    {
        System.out.println(s.lastName);
    }
}
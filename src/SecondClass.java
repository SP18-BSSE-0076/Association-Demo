public class SecondClass
{
    String lastName;        //field
    
    FirstClass f;       // 1st class object initialize in 2nd class
    
    public void secondClassMethod(FirstClass f)     // 1st class object initialize in 2nd class method
    {
        this.f = f;
    }
    
                    //Creating gettor settor of the field

    public String getLastName()
    {
        return this.lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
                    //Creating a method in which we print 1st class field using 1st class object
    
    public void startName()
    {
        System.out.println(f.firstName);
    }
}
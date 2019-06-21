* ASCII text, with CRLF line terminators
class Employee{
    private String name;
    private int id;
    private String email;

    public Employee(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }


    public String getEmail()
    {
        return email;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }
   

    public void setEmail(String name)
    {
        this.email = email;
    }

    public void setId(int id)
    {
        this.id = id;
    }


    @Override
    public String toString()
    {
        return "(Name:" + name + ", ID:"+ id + ", Email:"+ email;
    }

    @Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
       
        if (!(o instanceof Employee)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Employee c = (Employee) o; 
          
        // Compare the data members and return accordingly  
        return name.compare(o.name) == 0 && email.compare(o.email) == 0 && id == o.id;
    } 

    

}

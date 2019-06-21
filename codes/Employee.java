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
    
    public String toString()
    {
        return "(Name:" + name + ", ID:"+ id + ", Email:"+ email;
    }

    public boolean equals(Object o) { 
  
          
        if (o == this) { 
            return true; 
        } 
  
       
        if (!(o instanceof Employee)) { 
            return false; 
        } 
          
        
        Employee c = (Employee) o; 
          
      
        return name.compare(o.name) == 0 && email.compare(o.email) == 0 && id == o.id;
    } 

    

}

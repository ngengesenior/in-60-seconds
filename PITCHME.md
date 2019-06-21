# Introduction to Kotlin

---

## Agenda
-  What is Kotlin/Why /For Whom

-  Variables

-  Functions and Extension Functions

-  Classes and Properties

-  Lambdas and Collections


---?color=linear-gradient(180deg, white 75%, black 25%)
@title[What is Kotlin]

- Statically typed programming language that runs on the JVM
- Can be compiled to Jvascript and also runs on the LLVM compiler
- Developed by Jetbrains
- Totally interoperable with Java
- Became first class citizen language for Android development at I/O 2017
- Becam Google's preferred language for Android at I/O 2019
- Concise, Safe.

---

```java
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

```
---


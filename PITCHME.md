# Introduction to Kotlin

---

## Agenda
-  What is Kotlin/Why /For Whom

-  Variables

-  Functions and Extension Functions

-  Classes and Properties

-  Lambdas and Collections

---

## What is Kotlin

- Statically typed programming language that runs on the JVM
- Can be compiled to Javascript and also runs on the LLVM compiler
- Developed by Jetbrains
- Totally interoperable with Java
- Became first class citizen language for Android development at I/O 2017
- Became Google's preferred language for Android at I/O 2019
- Concise, Safe.

---?code=codes/Employee.java&title=Concise?
@[0-20]()
@[21-30]()
@[31-50]()
@[51-66]()

---?code=codes/EmployeeKt.kt&lang=kotlin&title=Concise!
---
- Concise
- Safe
- Solves Nulability problem
- Modern with many great features
- Easy to adopt
---
### Who is Kotlin For

- Android developers(JVM)
- Backend developers(JVM)
- iOS developers(LLVM)
- Windows developers(LLVM)
- Javascript developers

---
# The Code
---
## Files and packages
- Packages like Java
- Functions must not be in a class in order to work
---

# Variables
---

## Val(read-only)
---

```kotlin
val email:String = "seniorngenge@gmail.com"
val name = "Ngenge Senior"
email = "somefakeemail@gmail.com" // This is an error. Email is read-only
```
---
## Var(mutable)
---

```koltin
var birthYear:Int = 1992

var event = "Google I/O Extended"

// Let's modify some variables
birthYear = 1980 // This is OK

event = "I/O Limbe 2019" // This is OK

birthYear = "2019" // Please don't do that here. It will fail as variable is an Int
```
---

# Object Instantiation
---
```kotlin
val stringBuilder = StringBuilder("My String") // No need for new 
stringBuilder.append("another text") // No need for semi colons
println(stringBuilder)
```
---

# Functions and Extension Functions
---

```kotlin
fun findMin(first:Int, second:Int):Int {
if(first < second) {
    return first
}
else {
    return second
}
    }
```
---
## Functions (if is an expression)
---

```kotlin
fun findMin(first:Int, second:Int):Int {
return if(first < second) {
   first
}
else {
    second
}
    }
```
---
# Default Values
---

```kotlin
fun findMin(first:Int=0, second:Int=100):Int {
return if(first < second) {
   first
}
else {
    second
}
    }

```

---

## Calling Functions
```kotlin
val min = findMin()
val min = findMin(first=3,second=7)
val min = findMin(3,5)
val min = findMin(second=8)
```
---

## Concise Way!
```kotlin
fun findMin(first:Int,second:Int) = if(first < second) first else second
```
---

## Extension functions
```kotlin
fun Int.isGreaterThan(Int:other) = if(this > other) true else false

val truth = 3.isGreaterThan(4)
//Now this is infix notation
val stillCorrect = 6 isGreaterThan 4
```
---

## Nullability Problem
```java
String s = "A string";

//later
s = null;

//later again
s.equals("Some string");
```
---
## Null Saftey
```koltin
var a:String = "This cannot be null"
var b:String? = null
a = "Another string" // compiler error
b = "Hello Kotlin" //This is OK
```
---
# Null Safety
```koltin
b?.equals("Hello")  // This is safe
b!!.equals("Another") // I want to shoot myself in the leg.
```
---

# Classes
```kotlin
class Person(val firstName:String,var lastName;String)

class Person constructor(val firstName:String,var lastName:String)

class Person(fName:String,lName:String){
val firstName = fName
var lastName = lName
}

```
---
# Properties
```kotlin
class Person(val firstName:String, var lastName:String){
fun getFullName = "$firstName $lastName"

}
```
---
# Properties
```kotlin
class Person (private var firstName:String,private var lastName:String)
{
var fullName
get() = "$firstName lastName"
set(value) {
val namesSplitted = value.split(" ")
firstName = namesSplitted[0]
lastName = namesSplit[1]
}
}
```
---
## Lambdas

```kotlin
val sub(x:Int,y:Int) -> Int = {x,y -> x-y}
val sub2(Int,Int) -> Int = {x,y-> x-y}
val sub3:{x:Int,y:Int -> x -y}
```
---
## Collections
```kotlin
val numbers = arrayOf(1,2,3,4)
val results = numbers.map{ it + 2}
                        .filter{value -> value.rem(2) == 0}
                        
                
  ```
---?image=https://github.com/ngengesenior/in-60-seconds/blob/master/assets/img/senior.jpg
  ## Ngenge Senior N.
  - Android Developer
  - Technical Writer at **The Start** and **ITNEXT.io**
  - Passionate About Kotlin and Android Development
  
  ### Social
  - Twitter: @ngenge_senior
  - Medium: https://medium.com/@ngengesenior
  
 ---
  # Questions?
  
  ---
  
                        
                        

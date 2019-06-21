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
---
---?code=codes/Employee.java&title=Concise?
@[1-20]()
@[21-30]()
@[31-50]()
@[51-66]()

---?code=codes/EmployeeKt.kt&lang=kotlin&title=Concise!
- Concise
- Safe
- Solves Nulability problem
- Modern with many great features
- Easy to adopt
---?color=linear-gradient(180deg, white 75%, black 25%)
@title[Who is Kotlin For]

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

---

Coding Guide- Concepts and Principles for Quick Reference
=======================================================

## Effective Java

Learnings and solutions from the book, Effective Java. Refer the package me.corejava.effectivejava.

#### Creating and Destroying objects

When and how to create objects, when and how to *avoid* creating them, how to destroy objects in a timely manner
with proper clearn up

1. **Static factory methods instead of constructors**

    public static method that returns the instance of a class. Eg ref Boolean class.
    
    Pros of SFM compared to constructors
    - They have names unlike constructors, so better express the instance returned.
    - Can be useful for cases when a class needs more than one constuctor wiht a given signature. 
    - No need to create new Objects each time they are invoked, so allows caching or pre-constructed objects for
      immutable classes. Similar to Flyweight design pattern.
    - Allow classes to control over what instances exists at any time (instance controlled classes).
      For eg: Singleton, non-instantiable(with a private constructor)
    - SFM can return any subtype of the declared return type- An API can return objets without making their classes public. 
      Eg: java.util.Collections- 
    - Forms basis of service provider frameworks. Eg JDBC API
      
    Cons of SFM compared to Constructors
    - Having SFM without public or protected constructors means the class can't be sub-classed.
    - Not distinguishable from regular static methods.
    
2. **Consider *builder* when there are many optional fields**

    - When there are many optional fields, SFM and Constructors are confusing and error prone *to the client*.
    - Another option is Javabean pattern (setters) but cons are, verbose, object will be in inconsistent state
      forces the class to be mutable
    - *Builder* is a good choice in such cases so that it is easy for the client to create the object
    - Minor disadvantage compared to Constructor or SFM - Creation of additional objects(builder).
    
3. **Singletons**

    Singleton = One instance per classloader/JVM
    
    How to make a class singleton?
    a. Static field with eagerly created instance
    b. Static field with lazily created instace (with double checking and synch)
    c. single element Enum
    
    Notes:
    1. If the Singleton class is serializable, add a readResolve method which returns the static instance.
     `private Object readResolve(){
         return INSTANCE;
     }`
     
     The readResolve method is called when ObjectInputStream has read an object from the stream and is preparing to 
     return it to the caller. ObjectInputStream checks whether the class of the object defines the readResolve method. 
     If the method is defined, the readResolve method is called to allow the object in the stream to designate the
     object to be returned. The object returned should be of a type that is compatible with all uses. If it is not 
     compatible, a ClassCastException will be thrown when the type mismatch is discovered.
     
    2. To prevent creating second instance using reflection, modify the constructor to throw exception if asked to
     create a second instance.
     
    
    
    
    


___

## OOPS concepts
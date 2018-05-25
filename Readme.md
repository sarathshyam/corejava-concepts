Coding Guide- Concepts and Principles for Quick Reference
=======================================================

## Effective Java

Learnings and solutions from the book, Effective Java. Refer the package me.corejava.effectivejava.

#### Creating and Destroying objects

When and how to create objects, when and how to *avoid* creating them, how to destroy objects in a timely manner
with proper clearn up

1. **Static factory methods instead of constructors**

    - public static method that returns the instance of a class. Eg ref Boolean class.
    
    Pros of SFM wrto constructors
    
    - They have names unlike constructors, so better express the instance returned.
    - Can be useful for cases when a class needs more than one constuctor wiht a given signature. 
    - No need to create new Objects each time they are invoked, so allows caching or pre-constructed objects for
      immutable classes. Similar to Flyweight design pattern.
    - Allow classes to control over what instances exists at any time (instance controlled classes).
      For eg: Singleton, non-instantiable(with a private constructor)
    - SFM can return any subtype of the declared return type- An API can return objets without making their classes public. 
      Eg: java.util.Collections- 
    - Forms basis of service provider frameworks. Eg JDBC API
      
    
    


___

## OOPS concepts
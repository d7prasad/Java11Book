# Inheritance

1. Class B extends A

1. The subclass B includes all of the members of its superclass, A

1. Although a subclass includes all of the members of its superclass, it cannot access those members of the superclass that have been declared as private.

1. A class member that has been declared as private will remain private to its class. It is not accessible by any code outside its class, including subclasses.

1. A reference variable of a superclass can be assigned a reference to any subclass derived from that superclass.

1. When a reference to a subclass object is assigned to a superclass reference variable, you will have access only to those parts of the object defined by the superclass.

1. This is why plainbox can’t access weight even when it refers to a BoxWeight object. 

> Super

1. When a subclass calls super( ), it is calling the constructor of its immediate superclass.

1. Thus, super( ) always refers to the superclass immediately above the calling class.

1. Also, super( ) must always be the first statement executed inside a subclass constructor.

1. The second form of super acts somewhat like this, except that it always refers to the superclass of the subclass in which it is used.

1. super.member -> When same variable defined in super and subclass, we can explicitly call the superclass variable using super.


> Method Overriding

1. In a class hierarchy, when a method in a subclass has the same name and type signature as a method in its superclass, then the method in the subclass is said to override the method in the superclass. 

1. If you wish to access the superclass version of an overridden method, you can do so by using super.

1. Method overriding occurs only when the names and the type signatures of the two methods are identical. If they are not, then the two methods are simply overloaded.

1. Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time. 

1. Dynamic method dispatch is important because this is how Java implements run-time polymorphism.


> Abstract Classes:

1. To declare a class abstract, you simply use the abstract keyword in front of the class keyword at the beginning of the class declaration.

1. There can be no objects of an abstract class. That is, an abstract class cannot be directly instantiated with the new operator. 

1. Also, you cannot declare abstract constructors, or abstract static methods

1. Any subclass of an abstract class must either implement all of the abstract methods in the superclass, or be declared abstract itself.

1. Allows concrete methods also to present in abstract class.

1. Although abstract classes cannot be used to instantiate objects, they can be used to create object references.


> USING FINAL WITH INHERITANCE

1. Using final to Prevent Overriding

1. Methods declared as final cannot be overridden. 

1. Methods declared as final can sometimes provide a performance enhancement.

1. Normally, Java resolves calls to methods dynamically, at run time. This is called late binding. However, since final methods cannot be overridden, a call to one can be resolved at compile time. This is called early binding.


> Using final to Prevent Inheritance

1. Sometimes you will want to prevent a class from being inherited. To do this, precede the class declaration with final. Declaring a class as final implicitly declares all of its methods as final, too.


1. As you might expect, it is illegal to declare a class as both abstract and final since an abstract class is incomplete by itself and relies upon its subclasses to provide complete implementations.


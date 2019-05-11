#OVERLOADING METHODS

1. It is possible to define two or more methods within the same class that share the same name, as long as their parameter declarations are different.

1. Method overloading is one of the ways that Java supports polymorphism. 

1. overloaded methods must differ in the type and/or number of their parameters. 

1. While overloaded methods may have different return types, the return type alone is insufficient to distinguish two versions of a method.

1. In some cases, Java’s automatic type conversions can play a role in overload resolution. 

#Argument Passing:

1. When you pass a primitive type to a method, it is passed by value.

1. Thus, a copy of the argument is made, and what occurs to the parameter that receives the argument has no effect outside the method.

1. Objects are passed by what is effectively call-by-reference.

> REMEMBER When an object reference is passed to a method, the reference itself is passed by use of call-by-value. However, since the value being passed refers to an object, the copy of that value will still refer to the same object that its corresponding argument does.


#Access Control:

1. Java’s access modifiers are public, private, and protected. Java also defines a default access level. protected applies only when inheritance is involved.

1. When a member of a class is modified by public, then that member can be accessed by any other code.

1. When a member of a class is specified as private, then that member can only be accessed by other members of its class.


#UNDERSTANDING STATIC:

1. When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. 

1. Instance variables declared as static are, essentially, global variables. When objects of its class are declared, no copy of a static variable is made. Instead, all instances of the class share the same static variable.
   

##Methods Declared static:

1. They can only directly call other static methods of their class.

1. They can only directly access static variables of their class.

1. They cannot refer to this or super in any way. 


> When class loaded, all static statements will execute, then static blocks will execute, and then main block gets executed.


#Final:

1. A field can be declared as final. Doing so prevents its contents from being modified, making it, essentially, a constant. This means that you must initialize a final field when it is declared. 

#Innerclass:

1. It is important to realize that an instance of Inner can be created only in the context of class Outer. The Java compiler generates an error message otherwise. 

1. As explained, an inner class has access to all of the members of its enclosing class, but the reverse is not true. Members of the inner class are known only within the scope of the inner class and may not be used by the outer class.



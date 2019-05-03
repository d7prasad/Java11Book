#Class

1. A class creates a new data type that can be used to create objects.
1. That is, a class creates a logical framework that defines the relationship between its members.
1. When you declare an object of a class, you are creating an instance of that class. Thus, a class is a logical construct.
1. An object has physical reality. (That is, an object occupies space in memory.)

``` 
Box b1 = new Box();
Box b2 = b1;
b1 = null;
Here, b1 has been set to null, but b2 still points to the original object.

```
> REMEMBER When you assign one object reference variable to another object reference variable, you are not creating a copy of the object, you are only making a copy of the reference.

#Methods

> Constructors
1. A constructor initializes an object immediately upon creation
1. It has the same name as the class in which it resides and is syntactically similar to a method.
1. Once defined, the constructor is automatically called when the object is created, before the new operator completes
1. They have no return type, not even void. This is because the implicit return type of a class’ constructor is the class type itself.
1. The constructor name should be same as class name - case sensitive

> When you do not explicitly define a constructor for a class, then Java creates a default constructor for the class.

> When using the default constructor, all non-initialized instance variables will have their default values, which are zero, null, and false, for numeric types, reference types, and boolean, respectively.

##Instance Variable Hiding
1. As you know, it is illegal in Java to declare two local variables with the same name inside the same or enclosing scopes.
1. Interestingly, you can have local variables, including formal parameters to methods, which overlap with the names of the class’ instance variables.
1. However, when a local variable has the same name as an instance variable, the local variable hides the instance variable.
1. This is why width, height, and depth were not used as the names of the parameters to the Box( ) constructor inside the Box class. If they had been, then width, for example, would have referred to the formal parameter, hiding the instance variable width. 
> if we use jus width inside constructors, it will consider width variable from method parameter, if we want to use instance, then we need to mention this.width

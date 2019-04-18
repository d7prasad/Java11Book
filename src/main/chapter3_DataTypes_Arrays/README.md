##CHAPTER3: Data Types
---


1. byte, short, int, long, char, float, double, and boolean
2. byte - 8(–128 to 127), short - 16(–32,768 to 32,767), int - 32(–2,147,483,648 to 2,147,483,647), long - 64.
3. float - 32, double - 64
4. You signify a hexadecimal constant with a leading zero-x, (0x or 0X).
5. 0x7ffffffffffffffL - Hexadecimal Long
6. You can also specify integer literals using binary. To do so, prefix the value with 0b or 0B
7. int x = 0b1010;
8. int x = 123_456_789; - Underscores will be ignored.

> Floting Point literals
1. Standard Fractional numbers like - > 2.0, 3.14159, and 0.6667
1. The exponent is indicated by an E or e followed by a decimal number, which can be positive or negative. Examples include 6.022E23, 314159E–05, and 2e+100.
1. The underscore in double works the same way - double num = 9_423_497.1_0_9; -> Here the fractioanl is .109
1. Floating-point literals in Java default to double precision.
1. To specify a float literal, you must append an F or f to the constant.
1. You can also explicitly specify a double literal by appending a D or d. Doing so is, of course, redundant.
1. The default double type consumes 64 bits of storage, while the smaller float type requires only 32 bits.

>  Boolean
1. boolean true or false

> Variables
1. int a, b, c -> declares three variables
2. int d =3, e, f =4 -> declares three, but defining two variables


> Type Conversions
1. Automatic conversion will happen if two type is compatible and destination is larger than source
1. for ex: assigning int to long
1. For assigning int to byte, we have explicitly cast it.
1. If the integer’s value is larger than the range of a byte, it will be reduced modulo (the remainder of an integer division by the) byte’s range.
1. When the value 257 is cast into a byte variable, the result is the remainder of the division of 257 by 256 (the range of a byte), which is 1 in this case.

> Automatic Type promotion in expression.
1. byte b = 50; byte = b* 2; this still fit in byte, but it will through error because, b*2 already promoted to int while evaluating, which cannot be assigned to a byte without the use of a cast.
2. So requires explicit cast -> b = (byte)(b * 2);

> Type Promotion rules:
1. First, all byte, short, and char values are promoted to int, as just described. Then, if one operand is a long, the whole expression is promoted to long. If one operand is a float, the entire expression is promoted to float. If any of the operands are double, the result is double.



> Arrays
1. int month_days[] = new int[12];
2. int twoD[][] = new int[4][5];
1. int nums[] = {1, 2, 3}
1. **Alternate way**: 
    1. int al[] = new int[3];
    1. int[] a2 = new int[3];
    1. char twod1[][] = new char[3][4];
    1. char[][] twod2 = new char[3][4];
    1. int[] nums, nums2, nums3; // create three arrays
    
    
> Type inference with local variable - **JAVA 10** feature
1. the context-sensitive identifier var was added to Java as a reserved type nam
1. var avg = 10.0; // type is inferred as double because the initializer 10.0 is of type double.
1. int var = 1; // In this case, var is simply a user-defined identifier.
1. var myArray = new int[10]; // This is valid.
1. var[] myArray = new int[10]; // Wrong
1. var myArray[] = new int[10]; // Wrong
1. var counter; // Wrong! Initializer required.
1. Also, remember that var can be used only to declare local variables. It cannot be used when declaring instance variables, parameters, or return types.
1. Only one variable can be declared at a time; a variable cannot use null as an initializer;
1. var myArray = { 1, 2, 3 }; // Wrong
1. var cannot be used as the name of a class. It also cannot be used as the name of other reference types, including an interface, enumeration, or annotation, or as the name of a generic type parameter





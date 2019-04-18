## Operators ##

---
 **Groups**: arithmetic, bitwise, relational, and logical

> Arithmetic Operators (++, +=, %=):
1. The operands of the arithmetic operators must be of a numeric type. You cannot use them on boolean types, but you can use them on char types, since the char type in Java is, essentially, a subset of int.
1. a = a + 4; or a += 4;
1. To decode a negative number, first invert all of the bits, then add 1. For example, –42, or 11010110 inverted, yields 00101001, or 41, so when you add 1 you get 42.
1. The XOR operator, ^, combines bits such that if exactly one operand is 1, then the result is 1. Otherwise, the result is zero.

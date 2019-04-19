## Control Statements 
---

> If else switch

1. Switch Case: e.g:

```bash

switch (expression) {
  case value1:
      // statement sequence
      break;
  case value2:
      // statement sequence
      break;
      
```
switch (expression) {
  case value1:
      // statement sequence
      break;
  case value2:
      // statement sequence
      break;
      
 1. For versions of Java prior to JDK 7, expression must resolve to type byte, short, int, char, or an enumeration. (Enumerations are described in Chapter 12.) Beginning with JDK 7, expression can also be of type String
 
 1. Each value specified in the case statements must be a unique constant expression (such as a literal value). Duplicate case values are not allowed. The type of each value must be compatible with the type of expression.
 

1. Duplicate case values are not allowed. The type of each value must be compatible with the type of expression. - Compilation error

1. No two case constants in the same switch can have identical values. Of course, a switch statement and an enclosing outer switch can have case constants in common.

1. If you need to select among a large group of values, a switch statement will run much faster than the equivalent logic coded using a sequence of if-elses

1. For loop variation: for(i=1, j=2; i<j; i++ j--)

1. Type inference can be used in for loop as well:

> JDK 10 introduced a feature called local variable type inference

 ``` bash
    for(var v: nums) {
    sysout(v);
    }
```

6. Java supports three jump statements: break, continue, and return. These statements transfer control to another part of your program

1. When break used inside a set of nested loops, the break statement will only break out of the innermost loop

> Break -> Extended (with label)

```bash

first: {
        second: {
                    if(t) break second;
                }
       }
```

> Continue

1. You might want to continue running the loop but stop processing the remainder of the code in its body for this particular iteration.

1. In while and do-while loops, a continue statement causes control to be transferred directly to the conditional expression that controls the loop. In a for loop, control goes first to the iteration portion of the for statement and then to the conditional expression.

1. For all three loops, any intermediate code is bypassed.

1. As with the break statement, continue may specify a **label** to describe which enclosing loop to continue. 
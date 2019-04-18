## Control Statements ##
---

> If else switch

1. Switch Case: e.g:
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
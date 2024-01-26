A JVM based interpreter for the Lox programming lanugage written in Java.

Lox is a dynamically-typed object oriented programming 
language with C family syntax created by Robert Nystrom. 
It's implementation is provided in his book Crafting 
Interpreters. JLOX is the Java runtime implementation of
the interpreter. Presented here is a version of JLOX I 
developed over the course of several months, and may not 
precisely reflect its original implementation and spec, 
although it is close. The implementation is a tree-walk 
interpreter meaning parsing, static analysis, and the 
resulting abstract syntax tree are directly translated 
and executed by Java code running on the JVM. Below you 
will find a non-exhaustive technical specification of the 
language with code examples to use in the editor. Enjoy!

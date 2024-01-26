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
and executed by Java code running on the JVM. 

I wrote an article about building this interpreter <a href="api.staging.vibeeng.com/index.html">here</a>.

You can use the JLOX Interpreter tool <a href="api.staging.vibeeng.com/compilers">here</a>.

If you would like to use the gradle project and generate a jar file so that you can use this program, run

`gradle build`

in the root of the project. This will generate a JAR file which can be found in the gradle /lib folder.

If you would like to run the generated JAR file, run:

`java -cp jlox.jar lox.Lox source "valid Lox script"`

with a file location

`java -cp jlox.jar lox.Lox scripts/test.lox`


or just run

`java -cp jlox.jar lox.Lox`

to run lox scripts from the interactive shell.
        

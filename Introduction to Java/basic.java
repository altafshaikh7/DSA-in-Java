/*Java Source Code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
Machine Code
        ↓
Output */

public class basic {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

// Compiler Work
// Syntax check karta hai
// Errors detect karta hai
// Bytecode generate karta hai

// 4. Bytecode
// Compilation ke baad:
// Hello.class
// generate hota hai.
// Features
// Platform Independent
// JVM readable
// Intermediate code

// 5. JVM (Java Virtual Machine)
// JVM bytecode ko execute karta hai.

// 6. JVM Components
// A. Class Loader
// .class file load karta hai
// Required classes memory me laata hai

// B. Bytecode Verifier
// Security check
// Illegal code detect karta hai
// Memory safety ensure karta hai

// C. Execution Engine

// Bytecode execute karta hai.

// Uses:
// 1. Interpreter
// Line-by-line execution
// Slow
// 2. JIT Compiler
// Frequently used code ko native machine code me convert karta hai
// Fast execution

/*
 * Source Code (.java)
 * ↓
 * Compiler
 * ↓
 * Bytecode (.class)
 * ↓
 * JVM
 * ├── Class Loader
 * ├── Verifier
 * └── Execution Engine
 * ↓
 * Machine Code
 * ↓
 * Output
 */

// | Component | Full Form | Work |
// | --------- | ------------------------ | ----------------- |
// | JDK | Java Development Kit | Development tools |
// | JRE | Java Runtime Environment | Run Java programs |
// | JVM | Java Virtual Machine | Execute bytecode |

// JDK
// └── JRE
// └── JVM

// Java source code is compiled into bytecode by javac. JVM loads, verifies, and
// executes the bytecode using Interpreter and JIT Compiler to produce machine
// code and output.
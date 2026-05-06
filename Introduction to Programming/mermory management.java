// /*
// ========================================
//         Memory Management in Java
// ========================================

// Java automatically memory manage karta hai.
// Programmer ko manually memory free nahi karni padti.

// Java me mainly 3 important concepts hote hain:

// 1. Stack Memory
// 2. Heap Memory
// 3. Garbage Collector
// */


// // Student class
// class Student {

//     // Instance Variable
//     int age = 20;
// }


// public class Main {
// // 
//     public static void main(String[] args) {

//         /*
//         ========================================
//                 STACK MEMORY
//         ========================================

//         - Local variables stack memory me store hote hain.
//         - Method call bhi stack me jata hai.
//         - Fast memory hoti hai.
//         - Method finish hone par automatically remove ho jati hai.
//         */

//         int x = 10;

//         System.out.println("Value of x : " + x);



//         /*
//         ========================================
//                 HEAP MEMORY
//         ========================================

//         - Objects heap memory me bante hain.
//         - "new" keyword object create karta hai.
//         - Object ke andar ka data heap me store hota hai.
//         */

//         Student s1 = new Student();

//         System.out.println("Student Age : " + s1.age);



//         /*
//         ========================================
//             GARBAGE COLLECTOR (GC)
//         ========================================

//         - Java automatically unused objects ko delete karta hai.
//         - Is process ko Garbage Collection bolte hain.
//         - Programmer ko free() ya delete() use nahi karna padta.
//         */

//         s1 = null;

//         System.out.println("Object is now eligible for Garbage Collection");



//         /*
//         ========================================
//                 MEMORY FLOW
//         ========================================

//         Stack Memory:
//         x
//         s1 (reference variable)

//         Heap Memory:
//         Student Object
//         age = 20

//         Jab:
//         s1 = null;

//         tab object ka koi reference nahi bachta.
//         Isliye Garbage Collector future me us object ko remove kar dega.
//         */
//     }
// }
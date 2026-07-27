// edge case 1
// public class Test1 {

//     static void m1() {
//         System.out.println("A");
//         m2();
//         System.out.println("B");
//     }

//     static void m2() {
//         System.out.println("C");
//     }

//     public static void main(String[] args) {
//         m1();
//         System.out.println("D");
//     }
// }
// output :
// A
// C
// B
// D


// // EDGECASE 2
// public class Test2 {

//     static void m1() {
//         System.out.println("1");
//         Test2 obj = new Test2();
//         obj.m2();
//         System.out.println("2");
//     }

//     void m2() {
//         System.out.println("3");
//     }

//     public static void main(String[] args) {
//         m1();
//     }
// OUTPUT:
// 1
// 3
// 2
// }
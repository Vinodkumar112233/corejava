package com.LabPractice;

public class Testdemo1 {

    public static void main(String[] args) {

        Object arr[] = {
            10,
            new Object[] { 50, 20, 100 },
            20,
            new Object[] { 70, 50, 40 },
            70
        };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            Object temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (Object n : arr) {

            if (n instanceof Object[]) {

                Object a[] = (Object[]) n;

                int s = 0;
                int e = a.length - 1;

                while (s < e) {

                    Object temp = a[s];
                    a[s] = a[e];
                    a[e] = temp;

                    s++;
                    e--;
                }

                for (Object x : a) {
                    System.out.print(x + " ");
                }

                System.out.println();

            } else {
                System.out.println(n);
            }
        }
    }
}
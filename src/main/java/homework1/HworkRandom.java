package homework1;

import java.util.Random;

public class HworkRandom {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001);
        System.out.println("Произвольное число равно: " + i);
        int n = higherBit(i);
        System.out.println("Номер старшего значащего бита: " + n);
        int[] m1 = findMultiples(n, i, Short.MAX_VALUE);
        System.out.println("Числа, кратные " + n + " в диапазоне от " + i + " до " + Short.MAX_VALUE + ":");
        printArray(m1);
        int[] m2 = findNonMultiples(n, Short.MIN_VALUE, i);
        System.out.println("Числа, некратные " + n + " в диапазоне от " + Short.MIN_VALUE + " до " + i + ":");
        printArray(m2);
    }

    static int higherBit(int i) {
        return Integer.highestOneBit(i);
    }

    static int[] findMultiples(int n, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        int[] m = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                m[index++] = i;
            }
        }
        return m;
    }

    static int[] findNonMultiples(int n, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % n != 0) {
                count++;
            }
        }
        int[] m = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % n != 0) {
                m[index++] = i;
            }
        }
        return m;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
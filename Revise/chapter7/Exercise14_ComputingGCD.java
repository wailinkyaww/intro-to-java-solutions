package chapter7;

import java.util.Scanner;

public class Exercise14_ComputingGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }

    public static int gcd(int... numbers) {
        sort(numbers);

        for (int k = numbers[0] / 2; k >= 1; k--) {
            boolean flag = true;
            for (int i : numbers) {
                if (i % k != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) return k;
        }

        return 1;
    }

    public static void sort(int[] list) {
        int lastIndex = list.length - 1;
        for (int i = lastIndex; i >= 0; i--) {
            int currentMax = list[i];
            int currentMaxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
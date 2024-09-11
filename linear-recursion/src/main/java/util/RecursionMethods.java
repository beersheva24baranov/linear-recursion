package util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }

    public static long factorial(int n) {
        if (n < 0) {
            n = -n;
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    public static long pow(int num, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException();
        }
        return degree == 0 ? 1 : multiply(num, pow(num, degree - 1));
    }

    private static long multiply(int num, long degree) {
        long res;

        if (num == 0 || degree == 0) {
            res = 0;
        } else if (num > 0) {
            res = degree + multiply(num - 1, degree);
        } else {
            res = -multiply(-num, degree);
        }

        return res;
    }

    public static int sum(int[] array) {
        return sum(array, array.length);
    }

    private static int sum(int[] array, int length) {
        return length == 0 ? 0 : array[length - 1] + sum(array, length - 1);
    }

    public static int square(int x) {
        return (x == 0) ? 0 : (x < 0) ? square(-x) : square(x - 1) + x + x - 1;
    }

    public static boolean isSubstring(String str, String subStr) {
        return subStr.length() <= str.length() &&
            (BeginFor(str, subStr) || isSubstring(str.substring(1), subStr));
    }

    private static boolean BeginFor(String str, String subStr) {
        boolean res = str.charAt(0) == subStr.charAt(0);
        
        if (subStr.length() > 1 && res) {
            res = BeginFor(str.substring(1), subStr.substring(1));
        }

        return res;
    }
}
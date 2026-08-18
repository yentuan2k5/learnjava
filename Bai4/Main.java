package Bai4;

public class Main {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Hướng 2: bỏ vòng lặp, dùng công thức Gauss — cách "nhà nghề" thật sự
    // tính tổng từ đầu đến cuối
    public static long sumRange(long start, long end) {
        return (end - start + 1) * (start + end) / 2;
    }

    public static void main(String[] args) {
        int x = 10;
        int start = 20;
        int end = 30;
        if (isEven(x)) {
            System.out.println("true");
        }
        long sum = sumRange(start, end);
        System.out.println(sum);
    }
}

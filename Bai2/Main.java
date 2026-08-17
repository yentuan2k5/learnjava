package Bai2;

public class Main {
    public static void main(String[] args) {
        double averageScore = 8.5;
        if (averageScore >= 8.5) {
            System.out.println("Giỏi");
        } else if (averageScore >= 7.0) {
            System.out.println("Khá");
        } else if (averageScore >= 5.0) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }
    }
}

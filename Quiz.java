import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        int b = 85; //수학 점수
        String a = (b >= 90 && b <= 100) ? "A" : (b >= 80 && b < 90) ? "B" : (b >= 70 && b < 80) ? "C" : (b >= 60 && b < 70) ? "D" : "F";
        System.out.println(a);
        
    }
}

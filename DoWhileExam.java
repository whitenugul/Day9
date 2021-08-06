import java.util.Scanner;
public class DoWhileExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int sum = 0;
        do {
            System.out.print("숫자 입력: ");
            value = scan.nextInt();
            sum += value;
        }while(value < 100);
        System.out.println(sum);
    }
}

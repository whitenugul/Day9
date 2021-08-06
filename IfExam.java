public class IfExam{
    public static void main(String[] args) {
        int x = 50;
        int y = 60;

        if(x>y){ // 중괄호가 있다
            System.out.println("x>y");
            System.out.println("test 1");
        }
        if(x>y) // 중괄호가 없다
            System.out.println("x>y");
            System.out.println("test2");
        
    }
}
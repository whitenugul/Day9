import java.util.Calendar;
public class Switch {
    public static void main(String[] args) {
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        switch(month){
            case 12 : case 1 : case 2: 
            season = "겨울";
            break;
            case 3: case 4: case 5:
            season = "봄";
            break;
            case 6: case 7: case 8:
            season = "여름";
            break;
            case 9: case 10: case 11:
            season = "겨울";
            break;
        }
    }
}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SimpleSearch {

    public StringBuilder search(int valueGoal, List<Integer> list) {

        StringBuilder sb = new StringBuilder();
        sb.append(" ----- Simple Search ----- \n");
        sb.append(" Start time: " + formatTime() + "\n");
        int i = 0;

        for (Integer numberSelected : list) {
            if (numberSelected == valueGoal) {
                sb.append(" Final time: " + formatTime() + "\n number of steps: " + i + "\n the address of value is:" + i + "\n");
                return sb;
            }
            i++;
        }
        sb.append(" Final time: " + formatTime() + "\n number of steps: " + i + "\n selected value: " + -1 + "\n");
        return sb;
    }

    private String formatTime(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss:SS");
        return time.format(format);
    }
}

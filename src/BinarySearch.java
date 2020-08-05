import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BinarySearch {

    public StringBuilder search(int valueGoal, List<Integer> list) {

        int start = 0;
        int end = list.size() - 1;
        int steps = 0;

        StringBuilder sb = new StringBuilder();
        sb.append(" ----- Binary Search ----- \n");
        sb.append(" Start time: " + formatTime() + "\n");

        while (start <= end){
            int middle = Math.floorDiv( start + end , 2);
            int valueSelected = list.get(middle);
            if (valueGoal == valueSelected) {
                sb.append(" Final time: " + formatTime() + "\n number of steps: " + steps + "\n the address of value is: " + middle + "\n");
                return sb;
            }
            if (valueGoal < valueSelected) {
                steps++;
                end = middle - 1;
            }
            if (valueGoal > valueSelected) {
                steps++;
                start = middle + 1;
            }
        }
        sb.append(" Final time: " + formatTime() + "\n number of steps: " + steps + "\n selected value: " + -1 + "\n");
        return sb;
    }

    private String formatTime(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss:SS");
        return time.format(format);
    }
}

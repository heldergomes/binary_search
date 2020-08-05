import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringBuilder showSearch = new StringBuilder();

        Screen screen = new Screen();
        int lenghtOfList = screen.showHowManyValues();
        showSearch.append("List Size: " + lenghtOfList + "\n");

        List<Integer> list = new ArrayList<>();
        int[] listInt = new int[lenghtOfList];

        for (int i = 0; i < lenghtOfList; i++) {
            list.add(i + 1);
            listInt[i] = i+1;
        }

        int valueGoal = screen.showHowYourGoal();
        showSearch.append("Searching this value: " + valueGoal + "\n\n");

        SimpleSearch simpleSearch = new SimpleSearch();
        StringBuilder sbSimpleSearch = simpleSearch.search(valueGoal, list);
        showSearch.append(sbSimpleSearch);

        BinarySearch binarySearch = new BinarySearch();
        StringBuilder sbBinarySearch = binarySearch.search(valueGoal, list);
        showSearch.append("\n " + sbBinarySearch + "\n");

        showSearch.append(" ----- Binary Search with java class [Arrays.binarySearch] ----- \n");
        showSearch.append("Start time: " + formatTime() + "\n");
        int values = Arrays.binarySearch(listInt, valueGoal);
        showSearch.append("The address of your value is: " + values + "\n");
        showSearch.append("Final time: " + formatTime() + "\n");

        screen.showResult(showSearch);

    }

    private static String formatTime(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss:SS");
        return time.format(format);
    }
}

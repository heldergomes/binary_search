import javax.swing.*;

public class Screen {

    public Integer showHowManyValues(){
        return Integer.valueOf(JOptionPane.showInputDialog("How many values do you want ? "));
    }

    public Integer showHowYourGoal(){
        return Integer.valueOf(JOptionPane.showInputDialog("How values do you want find ? "));
    }

    public void showResult(StringBuilder result) {
        Object[] options = {"OK"};
        JOptionPane.showOptionDialog(null, result, "Result ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
    }

}

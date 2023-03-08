import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[100];
        Staff[] staffs = new Staff[100];
        int studentCount = 0;
        int staffCount = 0;
        boolean finished = false;

        while (!finished) {
            String[] options = {"Student", "Staff", "Finish"};
            int choice = JOptionPane.showOptionDialog
                    (null,
                            "Select Student or Staff",
                            "Accounting Application",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, options, options[0]);
        }
    }
}

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

            switch (choice) {
                case 0:
                    Student student = new Student();
                    student.setName(JOptionPane.showInputDialog("Enter Student Name"));
                    student.setAddress(JOptionPane.showInputDialog("Enter Student Address"));
                    String yearStr = JOptionPane.showInputDialog("Enter Student Year (1-4)");
                    break;
                case 1:
                    Staff staff = new Staff();
                    staff.setName(JOptionPane.showInputDialog("Enter Staff Name"));
                    staff.setAddress(JOptionPane.showInputDialog("Enter Staff Address"));
                    String yearsOfServiceStr = JOptionPane.showInputDialog("Enter Years of Service");
                    break;
                case 2:
                    finished = true;
                    break;
            }
        }
    }
}

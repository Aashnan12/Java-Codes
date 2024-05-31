import java.io.*;

public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeData = "ID: 111, Name: Ram , Department: CS";
        saveAndDisplayCharacterStream(employeeData);
        saveAndDisplayByteStream(employeeData);
    }
    public static void saveAndDisplayCharacterStream(String data) {
        try {
            FileWriter writer = new FileWriter("employee_info_char.txt");
            writer.write(data);
            writer.close();

            FileReader reader = new FileReader("employee_info_char.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void saveAndDisplayByteStream(String data) {
        try {
            FileOutputStream fos = new FileOutputStream("employee_info_byte.txt");
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.close();


            FileInputStream fis = new FileInputStream("employee_info_byte.txt");
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

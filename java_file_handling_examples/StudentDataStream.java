import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String file = "students.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(101);
            dos.writeUTF("John");
            dos.writeDouble(8.5);
            System.out.println("Data written.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Read: Roll=" + roll + ", Name=" + name + ", GPA=" + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("userdata.txt")) {

            System.out.print("Enter your name: ");
            String name = br.readLine();
            System.out.print("Enter your age: ");
            String age = br.readLine();
            System.out.print("Enter your favorite programming language: ");
            String lang = br.readLine();

            fw.write("Name: " + name + "\nAge: " + age + "\nFavorite Language: " + lang);
            System.out.println("Data saved to userdata.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

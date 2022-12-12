package UserProfile;

import java.io.*;
import com.github.javafaker.Faker;

public class CreateUserFile {
    static Faker faker = new Faker();

    public void CreateUserFile() {
        this.faker = faker;
    }

    public static void main(String[] args) throws IOException {
        createFileUsingFileWriterClass();
    }

    public static void createFileUsingFileWriterClass() throws IOException {
        {
            String userFileName = faker.funnyName().name();
            String filePath = "/Users/christinemaynard/Documents/filehandling//" + userFileName + ".txt";
            String userName = String.valueOf(faker.name().fullName());
            String userProfession = faker.job().title();
            Integer userId = faker.random().hashCode();
            // faker generates some names with whitespace so we use replaceAll to remove the white spaces
            if (userFileName.length() > 1) {
                filePath = filePath.replaceAll("\\s+", "");
            }
            try {
                FileWriter createProfile = new FileWriter(filePath);
                // TODO - have each section write to a new line instead of one line
                createProfile.write("User id: " + userId);
                createProfile.write(" Username: " + userName);
                createProfile.write(" User profession: " + userProfession);
                createProfile.close();
                System.out.println("User profile created");

            }   // Catch block to handle if exception occurs
            catch (IOException e) {
                System.out.print(e.getMessage());
            }

        }
    }
}

import UserProfile.CreateUserFile;
import UserProfile.DeleteUserProfile;
import UserProfile.SearchUserProfile;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class UserProfileOperations {
    static CreateUserFile user = new CreateUserFile();
    static SearchUserProfile findUser = new SearchUserProfile();
    static DeleteUserProfile deleteUser = new DeleteUserProfile();

    public static void main(String[] args) throws IOException {
        String filePath = "/Users/christinemaynard/Documents/filehandling//";
        List<String> results = new ArrayList<>();
        File[] files = new File(filePath).listFiles();
        Scanner s = new Scanner(System.in);
        int ch;

        do {
            System.out.println("Press 1 to create a new user profile");
            System.out.println("Press 2 to get a list of all user profiles");
            System.out.println("Press 3 to search for a user");
            System.out.println("Press 4 to delete a user profile");
            System.out.println("Enter option: ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    user.createFileUsingFileWriterClass();
                    break;
                case 2:
                    for (File file : files) {
                        if (file.isFile()) {
                            results.add(file.getName());
                        }
                    }
                    System.out.println("All users:" + Arrays.toString(files));
                    break;
                case 3:
                    File file = null;
                    findUser.findFile(null, file);
                    break;
                case 4:
                    deleteUser.deleteUserProfileClass();
            }

        } while (ch != 0);
    }
}


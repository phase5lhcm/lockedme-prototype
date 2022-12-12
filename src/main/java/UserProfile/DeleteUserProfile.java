package UserProfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteUserProfile {
    public DeleteUserProfile(){}

    public static void main(String[] args) {
        deleteUserProfileClass();
    }
    public static void deleteUserProfileClass()
    {
        String filePath = "/Users/christinemaynard/Documents/filehandling//";
        List<String> results = new ArrayList<>();
        File[] files = new File(filePath).listFiles();
        // Store all files in an Arraylist
        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }
        // Printing the current ArrayList to verify against arrayList when user is deleted
        System.out.println("All users: " + results);
        // specify the user file to delete
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the file to be searched.. " );
        results.remove(s.nextLine());
        System.out.println("User deleted :" + results);
    }
}




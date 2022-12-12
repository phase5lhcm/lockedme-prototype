package UserProfile;

import java.io.File;
import java.util.Scanner;

/**
 * To search for a user
 * -enter file name to search for
 * -enter directory where file exists
 * Eg. file directory/name
 * /Users/christinemaynard/Documents/filehandling/SueRender.txt
 */
public class SearchUserProfile {
    public void findFile(String name, File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
            for (File fil : list)
            {
                if (fil.isDirectory())
                {
                    findFile(name,fil);
                }
                else if (name.equalsIgnoreCase(fil.getName()))
                {
                    System.out.println(fil.getName());
                }
            }
    }
    public static void main(String[] args)
    {
        SearchUserProfile ff = new SearchUserProfile();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file to be searched.. " );
        String name = scan.next();
        System.out.println("Enter the directory where to search ");
        String directory = scan.next();
        ff.findFile(name,new File(directory));
    }
}




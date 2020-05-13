import java.io.IOException; 
import java.nio.file.*;
import java.io.File; 

class ReportSize{
    File directoryPath = new File("/programmer/words");
    //List of all files and directories
    File filesList[] = directoryPath.listFiles();

    //Finish Step 5
    public boolean countFolderSize(){
        System.out.println("List of files and directories in the specified directory:");
        System.out.println("----------------------------------------");
        System.out.println("|----Directory----|----Size(byte)-------|");
        System.out.println("----------------------------------------");

        for(File file : filesList) {
            System.out.println("|       " + file.getName() + "         |    "+file.getTotalSpace()+"    |");
        }
        System.out.println("----------------------------------------");
        return true;        
    }


    //Finish Step 6
    public boolean countFolderZipSize(){
        System.out.println("List of files and directories in the specified directory:");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("|----Directory----|----Before(byte)-------|----After(zip/byte)----|----Percent(%)-------|");
        System.out.println("-----------------------------------------------------------------------------------------");

        for(File file : filesList) {
            System.out.println("|       " + file.getName() + "         |       "+file.getTotalSpace()+"    |        "  + "              |            "+"          |");
        }
        System.out.println("------------------------------------------------------------------------------------------");
        return true;        
    }
}






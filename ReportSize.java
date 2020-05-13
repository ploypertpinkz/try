import java.io.IOException; 
import java.nio.file.*;
import java.io.File; 
import java.util.ArrayList;

class ReportSize{
    File directoryPath = new File("/programmer/words");
    //List of all files and directories
    File filesList[] = directoryPath.listFiles();
    //ArrayList<long> zipSize = new ArrayList<long>();
    ArrayList<String> name = new ArrayList<String>();

    //Finish Step 5
    public boolean countFolderSize(){
        System.out.println("List of files and directories in the specified directory:");
        System.out.println("------------------------------------------------");
        System.out.println("|\tDirectory\t|\tSize(byte)\t|");
        System.out.println("------------------------------------------------");

        for(File file : filesList) {
            System.out.println("|\t" + file.getName() + "\t\t|\t" + file.getTotalSpace() + "\t|");
            name.add(file.getName());
        }
        System.out.println("------------------------------------------------");
        return true;        
    }

    //Finish Step 6
    public boolean countFolderZipSize(){
        ZipReportSize zip = new ZipReportSize();
        zip.compress("/programmer/words");  

        System.out.println("List of files and directories in the specified directory:");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("|\tDirectory\t|\tBefore(byte)\t|\tAfter(zip/byte)\t|\tPercent(%)\t|");
        System.out.println("------------------------------------------------------------------------------------------------");

        for(File file : filesList) {
            System.out.println("|\t" + file.getName() + "\t\t|\t"+file.getTotalSpace()+"\t|\t"  + "\t\t|\t"+"\t\t|");
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        return true;      
    }
}






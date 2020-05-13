public class MainProgram{
     public static void main(String[] args)
    {
        //Step 2 Words.java
        //Step 4 BuildFolder.java
        // BuildFolder buildFolder = new BuildFolder();
        //System.out.println("Create Folder in Step 4");
        // buildFolder.createFolder();
        // if(buildFolder.createFolder() == true) {
        //     System.out.println("Successfully to Create Folder in Step 4");
        // }
        
        //Step 5 ReportSize.java
        ReportSize reportSize = new ReportSize();
        System.out.println("Report Size in Step 5");
        reportSize.countFolderSize();
        if(reportSize.countFolderSize() == true) {
            System.out.println("Successfully to Report Size in Step 5");
        }
        

        //Step 6 ZipReportSize.java
        ReportSize reportZipSize = new ReportSize();
        System.out.println("Report different Zip Size in Step 6");
        reportZipSize.countFolderZipSize();
        if(reportZipSize.countFolderZipSize() == true) {
            System.out.println("Successfully to Report zip Size in Step 6");
        }

        //Step 7
        //Step 8
          
    }

}


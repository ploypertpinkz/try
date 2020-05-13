import java.io.IOException; 
import java.nio.file.*;
import java.io.File; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class ZipReportSize{

    ZipFolder zf = new ZipFolder();
    String folderToZip = "/programmer/words/";
    String zipName = "/programmer/words/.zip";

    public void setfolderToZip(String folderIn,String zipIn){
        folderToZip = folderIn;
        zipName = zipIn;
        zf.zipFolder(Paths.get(folderToZip), Paths.get(zipName));
    }

    // Uses java.util.zip to create zip file
    private void zipFolder(Path sourceFolderPath, Path zipPath) throws Exception {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));
        Files.walkFileTree(sourceFolderPath, new SimpleFileVisitor<Path>() {
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                zos.putNextEntry(new ZipEntry(sourceFolderPath.relativize(file).toString()));
                Files.copy(file, zos);
                zos.closeEntry();
                return FileVisitResult.CONTINUE;
            }
        });
        zos.close();
    }

}

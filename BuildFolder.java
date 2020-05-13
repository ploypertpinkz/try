import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

class BuildFolder{

    public boolean createFolder(){
        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("/programmer/words_alpha.txt"));
			String line = reader.readLine();
            Words w = new Words();
			while (line != null) {
                //set word
                w.setWord(line);
                //set folder
                String fileOutput;
                if(w.word.length() == 1) {
                    fileOutput = w.setFirstLetter();
                } else {
                    fileOutput = w.setFirstLetter() + "/" + w.steSecondLetter();
                }

                File files = new File("/programmer/words/" + fileOutput);
                //System.out.println("/programmer/words/" + fileOutput);
                //Start ceate folder
                if (!files.exists()) {
                    if (files.mkdirs()) {
                        w.loopWords();
                        //System.out.println("Multiple directories are created!");
                    } else {
                        System.out.println("Failed to create multiple directories!");
                    }
                } else {
                    w.loopWords();
                    //System.out.println("Multiple directories are created!");
                }
				line = reader.readLine();
			}
			reader.close();
            return true;
		} catch (IOException e) {
			e.printStackTrace();
            return false;
	    }  
    }
    

}
 /*
 ที่มา
 https://mkyong.com/java/how-to-get-the-total-number-of-lines-of-a-file-in-java/ 
 
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

class TestCountWords {

    public static void countWords()
    {
        try{

    		File file =new File("D:\\programmer\\words_alpha.txt");

    		if(file.exists()){

    		    FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);

    		    int linenumber = 0;

    	            while (lnr.readLine() != null){
    	        	linenumber++;
    	            }

    	            System.out.println("Total number of words : " + linenumber);

    	            lnr.close();


    		}else{
    			 System.out.println("File does not exists!");
    		}

    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
}
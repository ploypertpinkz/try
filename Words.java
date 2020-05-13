import java.io.PrintWriter;
import java.io.FileNotFoundException;

class Words{
    public String word;
    public String firstLetter;
    public String secondLetter;

    public void setWord(String wordInput){
            word = wordInput;  
    } 

    public String setFirstLetter(){
       firstLetter = word.substring(0,1);
       return firstLetter;
    }

    public String steSecondLetter() {
        secondLetter = word.substring(1,2);
        return secondLetter;
    }

    
    public void loopWords(){
        try {
            if(word.length() == 1){
                PrintWriter myWriter = new PrintWriter("/programmer/words/" + firstLetter + "/" + word + ".txt");
                for(int i = 0 ; i < 100 ; i++)
                {
                    myWriter.println(word);
                }
                myWriter.close();
            } else {
                PrintWriter myWriter = new PrintWriter("/programmer/words/" + firstLetter + "/" + secondLetter + "/" + word + ".txt");
                for(int i = 0 ; i < 100 ; i++)
                {
                    myWriter.println(word);
                }
                myWriter.close();
            }
            
            //System.out.println("Successfully wrote " + word + " to the file.");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
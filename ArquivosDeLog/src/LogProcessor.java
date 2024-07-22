import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.Callable;

public class LogProcessor implements Callable<Integer> {
    public String file;
    public String word;

    public LogProcessor(String word, String file) {
        this.file = file;
        this.word = word;
    }


    @Override
    public Integer call() throws Exception {
        int count = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                for (String word : line.split(" ")) if (word.equals(this.word)) count++;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}

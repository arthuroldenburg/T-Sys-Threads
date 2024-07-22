import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {
        String file = "src/file.txt";
        String word = "aru";

        new ParallelLogProcessor(word, file);
    }
}
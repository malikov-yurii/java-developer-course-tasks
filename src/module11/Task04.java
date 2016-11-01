package module11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Task04 {

    public static String path = "src/module11/1.txt";

    public static void main(String[] args) throws IOException {
        String word = "crews";
        System.out.println(String.format("Quantity of word \"%s\" in the file \"%s\" = %d", word, path, checkWord(word)));
    }

    public static int checkWord(String word) throws IOException{
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        String fileText = new String(encoded, StandardCharsets.UTF_8);
        return (int) Arrays.stream(fileText.split("\\b\\W+\\b")).filter(u -> word.equals(u)).count();
    }
}

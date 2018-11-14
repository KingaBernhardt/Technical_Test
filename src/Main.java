import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            HashMap<String, Integer> countWords = getOccurencesFromFile("src\\file.txt");
            getKeyValuePairs(countWords);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static HashMap getOccurencesFromFile(String fileName) throws FileNotFoundException {
        HashMap<String, Integer> countWords = new HashMap();
        File fileToCheck = new File(fileName);
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(fileToCheck);
            while (fileScanner.hasNext()) {
                String word = fileScanner.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                if (countWords.containsKey(word)) {
                    countWords.put(word, countWords.get(word)+1);
                } else {
                    countWords.put(word, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return countWords;
    }
    
    public static void getKeyValuePairs(HashMap map) {
        Iterator mapIterator = map.entrySet().iterator();
        System.out.println("Name "+ " = " + " Occurance");
        while (mapIterator.hasNext()) {
            Map.Entry pairs = (Map.Entry)mapIterator.next();
            System.out.println(pairs.getKey() + ":" + pairs.getValue()  );
        }
    }
}

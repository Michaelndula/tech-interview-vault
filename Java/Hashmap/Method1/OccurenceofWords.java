// A Hashmap in java that gets the number of occurrences for each word in the given sentence
// "this is a great great experience, This is why I love java very very much, java is great"

import java.util.HashMap;
import java.util.Map;

public class OccurenceofWords {
    public  static void main(String[] args) {
        String sentence = "This is a great great experience, This is why I love java very very much, java is great";

        // Convert the sentence to lowercase, so that 'this' and 'This' are the same
        sentence = sentence.toLowerCase();

        // Remove anything that is not a letter or space
        sentence = sentence.replaceAll("[^a-zA-Z\\s]", "");

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Instantiate a new Hashmap
        Map<String, Integer> wordCount = new HashMap();

        // Iterate through the words
        for(String word : words) {
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1); // add occurence if word exists multiple times
            } else {
                wordCount.put(word, 1); // Add 1 for a new word or non-repeating word.
            }
        }

        // Print the words and there occurence
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
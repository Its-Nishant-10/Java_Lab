
/* Write a Java program that accepts file name and word via command line arguments and counts how many times the word appears in the file */

import java.io.BufferedReader;
import java.io.FileReader;

class WordCount {
    public static void main(String[] args) throws Exception {
        String fname = args[0];
        String word = args[1];
        BufferedReader br = new BufferedReader(new FileReader(fname));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] w = line.split("\\s+");
            for (int i = 0; i < w.length; i++) {
                if (w[i].equals(word))
                    count++;
            }
        }
        br.close();
        System.out.println("Word count: " + count);
    }
}


import java.io.*;
import java.util.*;

public class Unscramble{

    public static void main(String args[]){
        
        ArrayList<String> words = new ArrayList<String>();
        try{
            File f = new File("words_alpha.txt");
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                String line = s.nextLine();
                words.add(line);
            }
            s.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        String w;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter in a word: ");
        w=inputScanner.nextLine();
        inputScanner.close();
        ArrayList<String> res = new ArrayList<String>();
        for(String s : words){
            if(s.length()==w.length()){
                if (match(s,w)) res.add(s);
            }
        }
        for(String s : res){
            System.out.println(s);
        }
    }

    static boolean match(String q, String w){
        char qa [] = q.toCharArray();
        char wa [] = w.toCharArray();
        Arrays.sort(qa);
        Arrays.sort(wa);
        return Arrays.equals(qa, wa);
    }
}
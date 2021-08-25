package CodeWarsPrograms;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("D:\\Devon-dist_3.0.0\\Devon-dist_3.0.0\\workspaces\\MyWorkspace\\CodeWars\\src\\resources\\sampleTextFile.txt");
        File outputFile = new File("D:\\Devon-dist_3.0.0\\Devon-dist_3.0.0\\workspaces\\MyWorkspace\\CodeWars\\src\\resources\\sampleOutputFile.txt");
        countWords(inputFile);
        deleteDuplicateLines(inputFile, outputFile);

    }

    private static void deleteDuplicateLines(File inputFile, File outputFile) throws IOException {
        BufferedReader inputReader = new BufferedReader(new FileReader(inputFile));
        PrintWriter writer = new PrintWriter(outputFile);
        String line1 = inputReader.readLine();
        Set<String> set = new HashSet<>();
        while (line1!=null){

            BufferedReader outputReader = new BufferedReader(new FileReader(outputFile));
            String line2 = outputReader.readLine();
            boolean flag = false;
           /* while(line2!=null){
                if(line2.equals(line1)){
                    flag = true;
                    break;
                }
                line2 = outputReader.readLine();
            }
            if(!flag){
                writer.println(line1);
                writer.flush();
            }*/


           if(set.add(line1)){
               writer.println(line1);
               writer.flush();
           }
            line1 = inputReader.readLine();
        }
        System.out.println("Duplicate lines successfully deleted.");
    }

    private static void countWords(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        String line;
        int count =0;
        while ((line = bufferedReader.readLine())!= null){
            String[] words  = line.split("\\s+");
            count+=words.length;
        }

        System.out.println(count);
    }

}

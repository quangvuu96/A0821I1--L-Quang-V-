package final_exam.common;

import final_exam.models.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper<T> {
    public static List<String> read(String path) {
        List<String> res = new ArrayList<>();

        createFileIfNotExists(path);
        try(BufferedReader reader= new BufferedReader(new FileReader(path))) {
            String line;
            while ((line= reader.readLine())!= null){
                res.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return res;
    }
    public void write(String path, List<Account> ts, boolean isAppend){
        createFileIfNotExists(path);
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(path, isAppend))) {
            for (int i = 0; i < ts.size(); i++) {
                bufferedWriter.write(ts.toString());
                bufferedWriter.newLine();
            }
//            for (T t : ts){
//                bufferedWriter.write(t.toString());
//                bufferedWriter.newLine();
//            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void createFileIfNotExists(String path){
        try {
            File file= new File(path);
            if(!file.exists()) file.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

package chapterFifteen.writer;

import chapterFifteen.utils.AppUtil;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String[] words = {"QWERTY", "ASDFG", "ZXCVB", "POIUY", "LKJHG", "MNBVC"};
        BufferedWriter bufferedWriter = null;
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(AppUtil.APP_ASSET_LOCATION + "\\output.txt"));
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(words[0] + " " + words[3]);
            bufferedWriter.flush();
            bufferedWriter.write(" " + words[1]);
            bufferedWriter.flush();
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
package chapterFifteen.writer;

import chapterFifteen.utils.AppUtil;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterExampleTwo {
    public static void main(String[] args) {
        String[] words = {"QWERTY", "ASDFG", "ZXCVB", "POIUY", "LKJHG", "MNBVC"};
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(AppUtil.APP_ASSET_LOCATION + "\\output2.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(words[0] + " " + words[3]);
            bufferedWriter.flush();
            bufferedWriter.write(" " + words[1]);
            bufferedWriter.close();
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
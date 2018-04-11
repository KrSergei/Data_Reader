package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader {
    public static String[] readFile(String fileName) throws IOException{
        try {

            List<String> strings = new ArrayList<>();

            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;

            while ((strLine = br.readLine()) != null) {
                strings.add(strLine);
            }

            br.close();
            return strings.toArray(new String[strings.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            return new String[0];
        }

    }
}
package com.company;

import javafx.scene.shape.Path;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.Date;

public class ReaderData implements RoadChecker {

    @Override
    public int getRestrictedRoads(String fileName, Date date) {
        String[] lines;

        try {
            lines = Reader.readFile("D:\\JAVA\\Занятие 9\\restrictions\\Данные.csv");

            for (String line : lines){
                //System.out.println(line);
                    String columns[] = line.split(",");
                    String dateStart = columns[10];
                    String dateEnd = columns[11];
                    String dateEndFact = columns[12];
                  {
                      System.out.println(dateStart + " " + dateEnd + " " + dateEndFact);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

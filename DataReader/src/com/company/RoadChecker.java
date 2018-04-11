package com.company;
import java.util.Date;

public interface RoadChecker {
     /* you can use

    Files.readAllLines(Paths.get(fileName)).toArray(new String[]{});

    to read files to string array
     */

    int getRestrictedRoads(String fileName, Date date);
}

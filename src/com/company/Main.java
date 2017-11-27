package com.company;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
//declares variables for each data piece
    private static String[] parts = new String[1000];
    private static Main test = new Main();
    private static Map<String, String> schoolID = new HashMap<>();
    private static Map<String, String> schoolName = new HashMap<>();
    private static Map<String, String> borough = new HashMap<>();
    private static Map<String, String> buildingCode = new HashMap<>();
    private static Map<String, String> address = new HashMap<>();
    private static Map<String, String> city = new HashMap<>();
    private static Map<String, String> state = new HashMap<>();
    private static Map<String, String> zip = new HashMap<>();
    private static Map<String, String> latitude = new HashMap<>();
    private static Map<String, String> longitude = new HashMap<>();
    private static Map<String, String> phoneNumber = new HashMap<>();
    private static Map<String, String> startTime = new HashMap<>();
    private static Map<String, String> endTime = new HashMap<>();
    private static Map<String, String> enrollment = new HashMap<>();
    private static Map<String, String> percentWhite = new HashMap<>();
    private static Map<String, String> percentBlack = new HashMap<>();
    private static Map<String, String> percentHispanic = new HashMap<>();
    private static Map<String, String> percentAsian = new HashMap<>();
    private static Map<String, Integer> avgMath = new HashMap<>();
    private static Map<String, Integer> avgReading = new HashMap<>();
    private static Map<String, Integer> avgWriting = new HashMap<>();
    private static Map<String, String> percentTested = new HashMap<>();

    public static void main(String[] args) throws IOException {

        //String[] parts = new String[1000];
        Scanner sf = new Scanner(new File("scores.txt"));
        int maxIndx = -1;
        String text[] = new String[436];
        while (sf.hasNext()) {

            maxIndx++;
            text[maxIndx] = sf.nextLine();

        }
        sf.close();
        for (int i = 1; i < text.length; i++) {

            if (parts.length == 21) {
                parts = text[i].split("\t");
                String ID = parts[0];
                schoolID.put(ID, ID);
                schoolName.put(ID, parts[1]);
                borough.put(ID, parts[2]);
                buildingCode.put(ID, parts[3]);
                address.put(ID, parts[4]);
                city.put(ID, parts[5]);
                state.put(ID, parts[6]);
                zip.put(ID, parts[7]);
                latitude.put(ID, parts[8]);
                longitude.put(ID, parts[9]);
                phoneNumber.put(ID, parts[10]);
                startTime.put(ID, parts[11]);
                endTime.put(ID, parts[12]);
                enrollment.put(ID, parts[13]);
                percentWhite.put(ID, parts[14]);
                percentBlack.put(ID, parts[15]);
                percentHispanic.put(ID, parts[16]);
                percentAsian.put(ID, parts[17]);
                avgMath.put(ID, Integer.valueOf(parts[18]));
                avgReading.put(ID, Integer.valueOf(parts[19]));
                avgWriting.put(ID, Integer.valueOf(parts[20]));
                percentTested.put(ID, parts[21]);
            }
            /*int ID = text[i].indexOf(9);
            int Name = text[i].indexOf(9, ID+1);
            int Borough = text[i].indexOf(9, Name+1);
            int bc = text[i].indexOf(9, Borough+1);
            int ad = text[i].indexOf(9, bc+1);
            int cy = text[i].indexOf(9, ad+1);
            int st = text[i].indexOf(9, cy+1);
            int zi = text[i].indexOf(9, st+1);
            int lat = text[i].indexOf(9, zi+1);
            int lon = text[i].indexOf(9, lat+1);
            int pho = text[i].indexOf(9, lon+1);
            int star = text[i].indexOf(9, pho+1);
            int en = text[i].indexOf(9, star+1);
            int enr = text[i].indexOf(9, en+1);
            int pw = text[i].indexOf(9, enr+1);
            int pb = text[i].indexOf(9, pw+1);
            int ph = text[i].indexOf(9, pb+1);
            int pa = text[i].indexOf(9, ph+1);
            int avm = text[i].indexOf(9, pa+1);
            int avr = text[i].indexOf(9, avm+1);
            int avw = text[i].indexOf(9, avr+1);
            int pt = text[i].lastIndexOf("%");*
            //String ave = text[i].substring(av+1, ab);
            System.out.println(text[i].substring(star,en));
            */
        }
        //asks user what they want to do
        Scanner record = new Scanner(System.in);
        System.out.println("what would you like to find?");
        System.out.println("Press 0 for the top 3 schools");
        System.out.println("Press 1 for the average of a school");
        System.out.println("Press 2 for the overall NY average");
        int opp = record.nextInt();
        if (opp == 1) {

            System.out.println("what is the school ID?");
            String I = record.next();
            test.getSchoolAverage(I);

        }

    }

    private void getSchoolAverage(String schoolID) {
//this should be adding all 3 scores for the school and dividing by 3, however, it is not working
        if (avgMath.get(schoolID) >= 0) {
            System.out.println((avgMath.get(schoolID) + avgReading.get(schoolID) + avgWriting.get(schoolID)));

        }
        else {

            System.out.println("school did not report scores");

        }
    }
}


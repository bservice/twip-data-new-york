package com.company;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

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
    private static Map<String, String> avgMath = new HashMap<>();
    private static Map<String, String> avgReading = new HashMap<>();
    private static Map<String, String> avgWriting = new HashMap<>();
    private static Map<String, String> percentTested = new HashMap<>();

    public static void main(String[] args) throws IOException {

        Scanner sf = new Scanner(new File("scores.txt"));
        int maxIndx = -1;
        String text[] = new String[436];
        while (sf.hasNext()) {

            maxIndx++;
            text[maxIndx] = sf.nextLine();

        }
        sf.close();
        for (int i = 2; i<text.length; i++) {

            for (int z: text) {

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
            String fullName = text[i].substring(0, Name);
            schoolID.put(fullName,fullName);
            schoolName.put(fullName, text[i].substring(ID+1, Borough));
            /*borough.put(fullName, text[i].substring(Name+1, Borough));
            buildingCode.put(fullName, text[i].substring(Borough+1, bc));
            address.put(fullName, text[i].substring(bc+1, ad));
            city.put(fullName, text[i].substring(ad+1, cy));
            state.put(fullName, text[i].substring(cy+1, st));
            zip.put(fullName, text[i].substring(st+1, zi));
            latitude.put(fullName, text[i].substring(zi+1, lat));
            longitude.put(fullName, text[i].substring(lat+1, lon));
            phoneNumber.put(fullName, text[i].substring(lon+1, pho));
            startTime.put(fullName, text[i].substring(pho+1, star));
            endTime.put(fullName, text[i].substring(star+1, en));
            enrollment.put(fullName, text[i].substring(en+1, enr));
            percentWhite.put(fullName, text[i].substring(enr+1, pw));
            percentBlack.put(fullName, text[i].substring(pw+1, pb));
            percentHispanic.put(fullName, text[i].substring(pb+1, ph));
            percentAsian.put(fullName, text[i].substring(ph+1, pa));

            if (pt != avw) {

                    avgMath.put(fullName, text[i].substring(avm + 1, avr));
                    avgReading.put(fullName, text[i].substring(avr + 1, avw));
                    avgWriting.put(fullName, text[i].substring(avw + 1, pt));
                    //percentTested.put(fullName, text[i].substring(avw+1, pt));

            }
            System.out.println(text[i].substring(star,en));
            */
        }
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

        System.out.println((Integer.valueOf(avgMath.get(schoolID))+Integer.valueOf(avgReading.get(schoolID))+Integer.valueOf(avgWriting.get(schoolID))));

    }
}


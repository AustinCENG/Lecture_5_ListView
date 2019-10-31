package com.ceng319.listviewdemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SampleData {

    public static List<DataItem> dataItemList;

    static {
        dataItemList = new ArrayList<>();
        dataItemList.add(new DataItem(1	, "Anguilla	", "North_America/North_America-Anguilla.png", "12345"));
        dataItemList.add(new DataItem(2	, "Antigua_and_Barbuda"	, "North_America/North_America-Antigua_and_Barbuda.png", "12345"));
        dataItemList.add(new DataItem(3	, "Aruba"	, "North_America/North_America-Aruba.png", "12345"));
        dataItemList.add(new DataItem(4	, "Bahamas"	, "North_America/North_America-Bahamas.png", "385,340"));
        dataItemList.add(new DataItem(5	, "Barbados"	, "North_America/North_America-Barbados.png", "287,025"));
        dataItemList.add(new DataItem(6	, "Belize"	, "North_America/North_America-Belize.png", "408,487"));
        dataItemList.add(new DataItem(7	, "Bermuda"	, "North_America/North_America-Bermuda.png", "12345"));
        dataItemList.add(new DataItem(8	, "British_Virgin_Islands"	, "North_America/North_America-British_Virgin_Islands.png", "12345"));
        dataItemList.add(new DataItem(9	, "Canada"	, "North_America/North_America-Canada.png", "37,799,000"));
        dataItemList.add(new DataItem(10	, "Cayman_Islands"	, "North_America/North_America-Cayman_Islands.png", "12345"));
        dataItemList.add(new DataItem(11	, "Costa_Rica"	, "North_America/North_America-Costa_Rica.png", "5,058,007"));
        dataItemList.add(new DataItem(12	, "Cuba"	, "North_America/North_America-Cuba.png", "11,209,628"));
        dataItemList.add(new DataItem(13	, "Dominica"	, "North_America/North_America-Dominica.png", "12345"));
        dataItemList.add(new DataItem(14	, "Dominican_Republic"	, "North_America/North_America-Dominican_Republic.png", "10,358,320"));
        dataItemList.add(new DataItem(15	, "El_Salvador"	, "North_America/North_America-El_Salvador.png", "12345"));
        dataItemList.add(new DataItem(16	, "Grenada"	, "North_America/North_America-Grenada.png", "112,003"));
        dataItemList.add(new DataItem(17	, "Guatemala"	, "North_America/North_America-Guatemala.png", "14,901,286"));
        dataItemList.add(new DataItem(18	, "Haiti"	, "North_America/North_America-Haiti.png", "11,577,779"));
        dataItemList.add(new DataItem(19	, "Honduras"	, "North_America/North_America-Honduras.png", "9,158,345"));
        dataItemList.add(new DataItem(20	, "Jamaica"	, "North_America/North_America-Jamaica.png", "2,726,667"));
        dataItemList.add(new DataItem(21	, "Martinique"	, "North_America/North_America-Martinique.png", "383,000"));
        dataItemList.add(new DataItem(22	, "Mexico"	, "North_America/North_America-Mexico.png", "126,577,691"));
        dataItemList.add(new DataItem(23	, "Montserrat"	, "North_America/North_America-Montserrat.png", "12345"));
        dataItemList.add(new DataItem(24	, "Nicaragua"	, "North_America/North_America-Nicaragua.png", "6,460,411"));
        dataItemList.add(new DataItem(25	, "Panama"	, "North_America/North_America-Panama.png", "4,218,808"));
        dataItemList.add(new DataItem(26	, "Puerto_Rico"	, "North_America/North_America-Puerto_Rico.png", "3,195,153"));
        dataItemList.add(new DataItem(27	, "Saint_Kitts_and_Nevis"	, "North_America/North_America-Saint_Kitts_and_Nevis.png", "110,608"));
        dataItemList.add(new DataItem(28	, "Saint_Lucia"	, "North_America/North_America-Saint_Lucia.png", "178,696"));
        dataItemList.add(new DataItem(29	, "Saint_Pierre"	, "North_America/North_America-Saint_Pierre.png", "12345"));
        dataItemList.add(new DataItem(30	, "St._Vicent_and_Grenadines"	, "North_America/North_America-St._Vicent_and_Grenadines.png", "12345"));
        dataItemList.add(new DataItem(31	, "Turks_and_Caicos_Islands"	, "North_America/North_America-Turks_and_Caicos_Islands.png", "12345"));
        dataItemList.add(new DataItem(32	, "United_States_of_America"	, "North_America/North_America-United_States_of_America.png", "330,161,000"));
        dataItemList.add(new DataItem(33	, "US_Virgin_Islands"	, "North_America/North_America-US_Virgin_Islands.png", "104,578"));

    }

    private void generateList(){
        File folder = new File("your/path");

        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}

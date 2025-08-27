// 08-27-2025
// hong rot, sdev200
// MODULE 1, ASSIGNMENT 1

import java.text.DecimalFormat;

public class FeetToMeterCoversion {
    public static void main(String[] args) {
        // your tables arrays whatever
        double[] feet_values = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double[] meter_values = {20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0};
    
        System.out.printf("%-10s  %-10s | %-10s  %-10s%n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("-----------------------|--------------------------------");

        // the decimal format to make it readable
        DecimalFormat df = new DecimalFormat("#.###");

        for (int i = 0; i < feet_values.length; i++) {
            double feet = feet_values[i];
            double meters = ConvertUnits.feetToMeter(feet);

            double meters1 = meter_values[i];
            double feet1 = ConvertUnits.meterToFeet(meters1);
            
            // final
            System.out.printf("%-10s  %-10s | %-10s  %-10s%n", df.format(feet), df.format(meters), df.format(meters1), df.format(feet1));
        }
    }

    
    // tachyon
    class ConvertUnits {
        public static double feetToMeter(double feet) {
            // return the feet to meter conversion
            return feet / 3.281;
        }

        public static double meterToFeet(double meter) {
            // meter to feet
            return meter * 3.281;
        }
    }
}

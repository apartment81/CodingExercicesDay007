package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        SpeedConverter speedConverter = new SpeedConverter();
        double c = speedConverter.toMilesPerHour(4);
        System.out.println(c);

       speedConverter.printConversion(-32.66);

    }
}

public class RaceUtility {
    private RaceUtility() {}
    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }
    public static double kmToMiles(double km) {
        return km / 1.60934;
    }
    public static String makeProper(String improper) {
        improper = improper.toLowerCase();
        String[] words = improper.split(" ");
        String proper = "";
        for (String word : words) proper += word.substring(0, 1).toUpperCase() +
                word.substring(1) + " ";
        return proper.substring(0, proper.length() - 1);
    }
}

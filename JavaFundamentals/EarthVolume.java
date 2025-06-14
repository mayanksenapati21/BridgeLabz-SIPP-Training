import java.util.*;
import java.lang.*;
public class EarthVolume {
  public static void main(String[] args) {
    double radiusKm = 6378;
    double radiusMiles = radiusKm * 0.621371;
    double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
    double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
    System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f", volumeKm3, volumeMiles3);
  }
}
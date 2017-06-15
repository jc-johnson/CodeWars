package src.main.java.CatKataOne;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 * Created by Jordan on 6/14/2017.
 */
public class Solution {

    static class Coordinate {
        double x, y;

        public Coordinate(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean peacefulYard(String[] yard, int minDistance) {

        List<Coordinate> coordinates = new ArrayList<>();

        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[i].length(); j++) {
                if (yard[i].charAt(j) != '-') {
                    Coordinate coordinate = new Coordinate(i, j);
                    coordinates.add(coordinate);
                }
            }
        }

        for (int i = 0; i < coordinates.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (coordinateDistance(coordinates.get(i), coordinates.get(j)) < minDistance) return false;
            }
        }

        return true;

    }

    public static double getManhattanDistance(int x1, int y1, int x2, int y2) {

        return abs(x1 - x2) + abs(y1 - y2);
    }

    public static double coordinateDistance(Coordinate c1, Coordinate c2) {
        double x1 = c1.x;
        double y1 = c1.y;

        double x2 = c2.x;
        double y2 = c2.y;

        return getDistance(x1, y1, x2, y2);

    }

    // alt distance
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = Math.abs(x2 - x1);
        double dy = Math.abs(y2 - y1);

        double min = Math.min(dx, dy);
        double max = Math.max(dx, dy);

        double diagonalSteps = min;
        double straightSteps = max - min;

        return sqrt(2) * diagonalSteps + straightSteps;
    }


    // Pythagorean distance
    public static double getDistance (double x1, double y1, double x2, double y2) {

        //double pow1 = Math.pow
        //return Math.sqrt((x1-x2)^2 + (y1-y2)^2);
        // return abs(x1 - x2) + abs(y1 - y2);
        return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));

    }

    public static void main(String[] args) {


        System.out.println(Solution.distance(1,3,4,7));
        System.out.println("Distance: " + distance(0, 11, 1, 2));
        System.out.println("Distance: " + distance(0, 11, 5, 2));
        // System.out.println(getManhattanDistance(1,3,4,7));

        System.out.println("Pythagorean distance: " + getDistance(0, 11, 1, 2));
        System.out.println("Pythagorean distance: " + getDistance(0, 11, 5, 2));
    }
}

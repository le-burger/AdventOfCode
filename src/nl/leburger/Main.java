package nl.leburger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int increased;

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        try {
            File myObj = new File("/Users/leanderburger/Development/AdventOfCode/src/nl/leburger/resources/Day1Ex1Input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                numbers.add(Integer.parseInt(data));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("The depth is measured " + numbers.size() + " times");

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) < numbers.get(i + 1)) {
                System.out.println(numbers.get(i));
                increased++;
            }
        }

        System.out.println("The times the depth increased after the previous measurement is " + increased);

    }
}

package edu.cu.cmsc-230.sumlab;

import java.util.ArrayList;

/**
 * The main class for SumLab, to be edited by students.
 * Contains a function, sum(), that computes the sum of a list of integers.
 * Also contains a main() method for manual testing.
 */
public class SumLab {

    /**
     * Finds the sum of an ArrayList of integers.
     *
     * @param list The list to find the sum of.
     * @return The sum of the list.
     */
    public static int sum(ArrayList<Integer> list) {
        throw new UnsupportedOperationException("STUDENTS: Replace this stub with your implementation.");
    }

    /**
     * Serves as a simple entry point for manual testing.
     * Attempts to parse all command-line arguments as integers,
     * then builds a list out of them and invokes sum() on it.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : args)
            list.add(Integer.parseInt(s));

        System.out.println(sum(list));
    }
}

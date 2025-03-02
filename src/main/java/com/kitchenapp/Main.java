package com.kitchenapp;

import com.kitchenapp.model.Cabinet;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cabinet width (mm):");
        int width = scanner.nextInt();

        System.out.println("Enter cabinet depth (mm):");
        int depth = scanner.nextInt();

        System.out.println("Enter cabinet height (mm):");
        int height = scanner.nextInt();

        Cabinet cabinet = new Cabinet(width, depth, height);

        System.out.println("Enter edging size (1 or 2 mm, default is 2):");
        int edgingSize = scanner.nextInt();
        cabinet.setEdgingSize(edgingSize);

        List<Panel> panels = cabinet.calculatePanels();

        System.out.println("\nCalculated Panels:");
        for (Panel panel : panels) {
            System.out.println(panel);
        }

        System.out.println("\nNote: The edging size used is " + edgingSize + " mm");

        scanner.close();
    }
}
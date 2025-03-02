package com.kitchenapp.model;

import com.kitchenapp.Panel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cabinet {
    private int width;
    private int depth;
    private int height;
    private static final int MATERIAL_THICKNESS = 18; // in mm
    private static final int DEFAULT_EDGING_SIZE = 2; // in mm
    private int edgingSize = DEFAULT_EDGING_SIZE;

    public Cabinet(int width, int depth, int height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public void setEdgingSize(int edgingSize) {
        this.edgingSize = edgingSize;
    }

    public List<Panel> calculatePanels() {
        List<Panel> panels = new ArrayList<>();

        // Calculate top and bottom panels
        int panelWidth = width - (MATERIAL_THICKNESS * 2);
        panels.add(new Panel("Top Panel", panelWidth, depth));
        panels.add(new Panel("Bottom Panel", panelWidth, depth));

        // Calculate side panels
        panels.add(new Panel("Left Side Panel", depth, height));
        panels.add(new Panel("Right Side Panel", depth, height));

        // Calculate doors
        int doorWidth = ((width - 2) / 2) - 2 - (edgingSize * 2);
        int doorHeight = height - 2 - 2 - (edgingSize * 2);
        panels.add(new Panel("Left Door", doorWidth, doorHeight));
        panels.add(new Panel("Right Door", doorWidth, doorHeight));

        // Calculate shelves
        int shelfWidth = width - (MATERIAL_THICKNESS * 2) - 1;
        int shelfDepth = depth - 10;
        panels.add(new Panel("Shelf", shelfWidth, shelfDepth));

        return panels;
    }
}
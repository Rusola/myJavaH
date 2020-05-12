package com.code_wars;

public class Block {
            int width ;
            int length;
            int height;
            int volume;
            int surfaceArea;

    public Block(int[] array) {
        this.width  = array[0];
        this.length = array[1];
        this.height = array[2];
        this.volume = width * length * volume;
        this.surfaceArea = 2 * (length * height) + 2 * (length * width) + 2 * (width * height);
    }
}

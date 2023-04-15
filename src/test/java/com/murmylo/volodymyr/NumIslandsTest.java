package com.murmylo.volodymyr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumIslandsTest {

    @Test
    void shouldReturn1() {
        char[][] grid = new char[][]{{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        NumIslands numIslands = new NumIslands();
        int i = numIslands.numIslands(grid);
        assertEquals(1, i);
    }

    @Test
    void shouldReturn3() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        NumIslands numIslands = new NumIslands();
        int i = numIslands.numIslands(grid);
        assertEquals(3, i);
    }
}

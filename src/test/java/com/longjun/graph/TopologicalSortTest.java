package com.longjun.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TopologicalSortTest {

    private GraphGenerator graphGenerator;
    private TopologicalSort topologicalSort;

    @Before
    public void setUp() throws Exception {
        graphGenerator = new GraphGenerator();
        topologicalSort = new TopologicalSort();
    }

    @Test
    public void testDFSSolution() {
        List<GraphNode> nodes = graphGenerator.init(new int[]{1, 2, 3}, new int[][]{{1, 2}, {1, 3}, {3, 2}});
        int[] ints = topologicalSort.dfsSolution(nodes);
        assertThat(ints, is(new int[]{1, 3, 2}));
    }

    @Test
    public void testDFSSolution2() {
        List<GraphNode> nodes = graphGenerator.init(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, new int[][]{{0, 3}, {3, 5}, {5, 7}, {1, 2}, {1,
                6}, {2, 5}, {6, 7}});
        int[] ints = topologicalSort.dfsSolution(nodes);
        assertThat(ints, is(new int[]{4, 1, 6, 2, 0, 3, 5, 7}));
    }


}
package com.longjun.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DepthFirstSearchTest {
    private GraphGenerator graphGenerator;
    private DepthFirstSearch depthFirstSearch;

    @Before
    public void setUp() throws Exception {
        graphGenerator = new GraphGenerator();
        depthFirstSearch = new DepthFirstSearch();
    }

    @Test
    public void testDFSSolution() {
        List<GraphNode> nodes = graphGenerator.init(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, new int[][]{{0, 1}, {1, 3}, {0, 3}, {0, 4}, {1,
                6}, {4, 2}, {4, 6}, {3, 5}, {5, 3}, {6, 5}});
        int[] ints = depthFirstSearch.solution(nodes.get(0));
        assertThat(ints, is(new int[]{0, 1, 3, 5, 6, 4, 2}));
    }

}
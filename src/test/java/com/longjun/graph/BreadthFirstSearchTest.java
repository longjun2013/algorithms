package com.longjun.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BreadthFirstSearchTest {
    private GraphGenerator graphGenerator;
    private BreadthFirstSearch breadthFirstSearch;

    @Before
    public void setUp() throws Exception {
        graphGenerator = new GraphGenerator();
        breadthFirstSearch = new BreadthFirstSearch();
    }

    @Test
    public void testDFSSolution() {
        List<GraphNode> nodes = graphGenerator.init(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 6}, {2,
                4}, {3, 5}, {5, 6}, {5, 7}, {3, 7}});
        int[] ints = breadthFirstSearch.solution(nodes.get(0));
        assertThat(ints, is(new int[]{0, 1, 2, 3, 6, 4, 5, 7}));
    }


}
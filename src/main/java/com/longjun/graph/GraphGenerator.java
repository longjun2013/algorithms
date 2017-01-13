package com.longjun.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphGenerator {

    /**
     * @param nodes all vertexes
     * @param edges eg. [ [1,2] , [2,3] ] means edge from vertex 1 to vertex 2, and edge from vertex 2 to vertex 3.
     * @return
     */
    public List<GraphNode> init(int[] nodes, int[][] edges) {
        List<GraphNode> graphNodes = new ArrayList<GraphNode>();
        for (int i = 0; i < nodes.length; i++) {
            graphNodes.add(new GraphNode(nodes[i]));
        }

        for (int i = 0; i < edges.length; i++) {
            GraphNode node = findNode(edges[i][0], graphNodes);
            node.neighbors.add(findNode(edges[i][1], graphNodes));
        }
        return graphNodes;
    }

    private GraphNode findNode(int label, List<GraphNode> nodes) {
        for (GraphNode node : nodes) {
            if (node.label == label) {
                return node;
            }
        }
        return null;
    }
}

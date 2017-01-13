package com.longjun.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopologicalSort {
    public int[] dfsSolution(List<GraphNode> nodes) {
        List<Integer> ints = new ArrayList<>();

        Map<Integer, GraphNode> visitedNodes = new HashMap<>();

        for (GraphNode node : nodes) {
            dfs(node, visitedNodes, ints);
        }

        return ints.stream().mapToInt(i -> i).toArray();
    }

    private void dfs(GraphNode node, Map<Integer, GraphNode> visitedNodes, List<Integer> ints) {
        if (visitedNodes.containsKey(node.label)) {
            return;
        }
        visitedNodes.put(node.label, node);

        if (node.neighbors.size() > 0) {
            for (GraphNode neighbor : node.neighbors) {
                dfs(neighbor, visitedNodes, ints);
            }
        }

        ints.add(0, node.label);
    }
}

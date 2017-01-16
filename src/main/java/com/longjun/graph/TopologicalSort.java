package com.longjun.graph;

import java.util.*;

public class TopologicalSort {
    public int[] dfsSolution(List<GraphNode> nodes) {
        List<Integer> ints = new ArrayList<>();

        Map<Integer, GraphNode> visitedNodes = new HashMap<>();
        List<GraphNode> path = new ArrayList<>();

        for (GraphNode node : nodes) {
            dfs(node, path, visitedNodes, ints);
        }

        return ints.stream().mapToInt(i -> i).toArray();
    }

    private void dfs(GraphNode node, List<GraphNode> path, Map<Integer, GraphNode> visitedNodes, List<Integer> ints) {
        if (nodeInPath(node, path)) {
            throw new RuntimeException("cycle found");
        }

        if (visitedNodes.containsKey(node.label)) {
            return;
        }
        visitedNodes.put(node.label, node);

        if (node.neighbors.size() > 0) {
            path.add(node);
            for (GraphNode neighbor : node.neighbors) {
                dfs(neighbor, new ArrayList<>(path), visitedNodes, ints);
            }
        }

        ints.add(0, node.label);
    }

    private boolean nodeInPath(GraphNode node, List<GraphNode> path) {
        for (GraphNode graphNode : path) {
            if (graphNode.label == node.label) {
                return true;
            }
        }
        return false;
    }
}

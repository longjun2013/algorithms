package com.longjun.graph;

import java.util.LinkedList;

public class DepthFirstSearch {
    public int[] solution(GraphNode node) {
        LinkedList<Integer> ints = new LinkedList<>();

        if (node == null) return null;
        dfs(node, ints);

        return ints.stream().mapToInt(i -> i).toArray();
    }

    private void dfs(GraphNode node, LinkedList<Integer> ints) {
        if (ints.contains(node.label)) return;

        ints.add(node.label);

        for (GraphNode neighbor : node.neighbors) {
            dfs(neighbor, ints);
        }
    }
}

package com.longjun.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch {
    public int[] solution(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        LinkedList<Integer> ints = new LinkedList<>();

        if (node == null) return null;
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode n = queue.poll();

            if (visited.contains(n.label)) {
                continue;
            }

            visited.add(n.label);
            ints.add(n.label);

            for (GraphNode neighbor : n.neighbors) {
                queue.add(neighbor);
            }

        }
        return ints.stream().mapToInt(value -> value).toArray();
    }
}

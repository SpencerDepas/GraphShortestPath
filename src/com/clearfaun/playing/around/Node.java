package com.clearfaun.playing.around;

import java.util.HashSet;

/**
 * Created by SpencerDepas on 5/26/16.
 */
public class Node {
    public final String name;
    public final HashSet<Edge> inEdges;
    public final HashSet<Edge> outEdges;
    public Node(String name) {
        this.name = name;
        inEdges = new HashSet<Edge>();
        outEdges = new HashSet<Edge>();
    }
    public Node addEdge(Node node){
        Edge e = new Edge(this, node);
        outEdges.add(e);
        node.inEdges.add(e);
        return this;
    }
    @Override
    public String toString() {
        return name;
    }
}
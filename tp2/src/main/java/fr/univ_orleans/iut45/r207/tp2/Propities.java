package fr.univ_orleans.iut45.r207.tp2;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.SupplierUtil;


public class Propities {
    public static Set<String> unionVoisinages(Graph<String, DefaultEdge> graph, String u, String v) {
        Set<String> union = new HashSet<>();
        

        if (!graph.containsVertex(u) || !graph.containsVertex(v)) {
            return union;
        }

        for(DefaultEdge e : graph.edgesOf(v)){
            union.add(graph.getEdgeTarget(e));    
        }
        for(DefaultEdge e : graph.edgesOf(u)){
            union.add(graph.getEdgeTarget(e));    
        }
        return union;
}
// a faire pour la semaine pro ;
}

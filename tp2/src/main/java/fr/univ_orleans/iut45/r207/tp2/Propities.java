package fr.univ_orleans.iut45.r207.tp2;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.SupplierUtil;

public class Propities {
    public Set<String> unionVoisinages(Graph<String, DefaultEdge> graph, String u, String v) {
        Set<String> union = new HashSet<>();

        if (!graph.containsVertex(u) || !graph.containsVertex(v)) {
            return union;
        }

        for (DefaultEdge e : graph.edgesOf(v)) {
            if (graph.getEdgeSource(e).equals(u)) {
                union.add(graph.getEdgeTarget(e));
            } else {
                union.add(graph.getEdgeSource(e));
            }
        }
        for (DefaultEdge e : graph.edgesOf(u)) {
            if (graph.getEdgeSource(e).equals(v)) {
                union.add(graph.getEdgeTarget(e));
            } else {
                union.add(graph.getEdgeSource(e));
            }
        }
        return union;
    }
    // a faire pour la semaine pro ;

    public static Set<String> lesVoisins(Graph<String, DefaultEdge> graph, String u, String v) {
        Set<String> voisinsU = new HashSet<>();
        Set<String> voisinsV = new HashSet<>();

        for (DefaultEdge e : graph.edgesOf(u)) {
            String source = graph.getEdgeSource(e);
            String target = graph.getEdgeTarget(e);

            if (source.equals(u) && !target.equals(u)) {
                voisinsU.add(target);
            } else if (target.equals(u) && !source.equals(u)) {
                voisinsU.add(source);
            }
        }

        for (DefaultEdge e : graph.edgesOf(v)) {
            String source = graph.getEdgeSource(e);
            String target = graph.getEdgeTarget(e);

            if (source.equals(v) && !target.equals(v)) {
                voisinsV.add(target);
            } else if (target.equals(v) && !source.equals(v)) {
                voisinsV.add(source);
            }
        }
        for (String voisin : voisinsV) {
            if (voisinsU.contains(voisin)) {
                voisinsU.remove(voisin);
            }
        }

        return voisinsU;
    }
}

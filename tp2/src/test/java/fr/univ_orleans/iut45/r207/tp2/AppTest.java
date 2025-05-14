package fr.univ_orleans.iut45.r207.tp2;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedGraph;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.SupplierUtil;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void rigorousTest()
    {
        Graph<String, DefaultEdge> graph = GraphTypeBuilder
				.directed()
				.allowingMultipleEdges(true)
				.allowingSelfLoops(true)
				.vertexSupplier(SupplierUtil.createStringSupplier())
				.edgeSupplier(SupplierUtil.createDefaultEdgeSupplier())
				.buildGraph();
        
        String v0 = graph.addVertex();
        String v1 = graph.addVertex();
        String v2 = graph.addVertex();
        
        graph.addEdge(v0, v1);
        graph.addEdge(v0, v2);
        graph.addEdge(v1, v2);
        
        assertEquals(3, graph.vertexSet().size());
        assertEquals(3, graph.edgeSet().size());
        
        assertEquals(2, graph.outDegreeOf(v0));
        assertEquals(1, graph.outDegreeOf(v1));
        assertEquals(0, graph.outDegreeOf(v2));
    }

    @Test
public void testUnion() {
    Graph<String, DefaultEdge> graph = new DefaultUndirectedGraph<>(DefaultEdge.class);

    // Ajout des sommets
    graph.addVertex("a");
    graph.addVertex("b");
    graph.addVertex("c");
    graph.addVertex("d");

    // Ajout des arêtes
    graph.addEdge("a", "b");
    graph.addEdge("a", "c");
    graph.addEdge("b", "c");
    graph.addEdge("c", "d");

    Propities p = new Propities();

    // Test 1 : union des voisins de a et b
    Set<String> attendu1 = Set.of("a", "b", "c");  // voisins de a et b
    assertEquals(attendu1, p.unionVoisinages(graph,"a", "b"));

    // Test 2 : sommet inexistant
    assertEquals(Set.of(), p.unionVoisinages(graph, "a", "f"));
}


    @Test    
    public void  lesVoisinsTest(){
              Graph<String, DefaultEdge> graph = GraphTypeBuilder
				.undirected()
				.allowingMultipleEdges(true)
				.allowingSelfLoops(true)
				.vertexSupplier(SupplierUtil.createStringSupplier())
				.edgeSupplier(SupplierUtil.createDefaultEdgeSupplier())
				.buildGraph();

        String a = graph.addVertex();
        String b = graph.addVertex();
        String c = graph.addVertex();
        String d = graph.addVertex();

        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(c, b);
        graph.addEdge(b, d);
        new HashSet<>()
 assertEquals(, 0);
    }


}

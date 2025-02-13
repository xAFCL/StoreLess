package at.ac.uibk.scheduler.api;

import at.ac.uibk.scheduler.api.node.AtomicFunctionNode;
import at.ac.uibk.scheduler.api.node.FunctionNode;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;

public interface SchedulingAlgorithm {

    void schedule(DefaultDirectedWeightedGraph<FunctionNode, Communication> graph);

    double calculateAverageTime(final AtomicFunctionNode node);

}

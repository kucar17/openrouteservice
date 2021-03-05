package org.heigit.ors.centrality.algorithms;

import com.graphhopper.routing.weighting.Weighting;
import com.graphhopper.storage.Graph;
import org.heigit.ors.common.Pair;

import java.util.List;
import java.util.Map;

public interface CentralityAlgorithm {
    void init(Graph graph, Weighting weighting);

    Map<Integer, Double> computeNodeCentrality(List<Integer> nodes) throws Exception;

    Map<Pair<Integer, Integer>, Double> computeEdgeCentrality(List<Integer> nodes) throws Exception;
}

package Tree;

import java.util.ArrayList;

public class EquationListNode {
    ArrayList<EquationNode> equations;

    public EquationListNode() {
        equations = new ArrayList<>();
    }

    public void add(EquationListNode list) {
        for(EquationNode node: list.equations)
            equations.add(node);
    }

    public  void addNode(EquationNode node) {
        equations.add(node);
    }
}

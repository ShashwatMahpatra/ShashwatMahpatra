/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node,Node> map=new HashMap<>();
    public Node dfs(Node node){
        if(node==null) return null;
        if(map.containsKey(node)) return map.get(node);
        Node new_node=new Node(node.val);
        map.put(node,new_node);
        for(Node adj_node: node.neighbors){
            new_node.neighbors.add(dfs(adj_node));
        }
        return new_node;
    }
    public Node cloneGraph(Node node) {
        Node node_clone=dfs(node);
        return node_clone;
    }
}
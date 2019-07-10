package cn.notcallme.tree;

import cn.notcallme.tree.node.Node;
import org.apache.logging.log4j.util.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tree {

    private Node root;

    private List<Tree> children;

    public List<Tree> getChildren() {
        return children;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }

    public Tree() {
    }

    public Tree(Node root, List<Tree> children) {
        this.root = root;
        this.children = children;
    }

    public static Tree.TreeBuilder builder() {
        return new Tree.TreeBuilder();
    }

    public static class TreeBuilder {

        private Node root;

        private List<? extends Node> dataList;

        public List<? extends Node> getDataList() {
            return dataList;
        }

        public Tree.TreeBuilder dataList(List<Node> dataList) {
            this.dataList = dataList;
            return this;
        }

        public Tree.TreeBuilder root(Node root) {
            this.root = root;
            return this;
        }

        public TreeBuilder() {
        }

        public TreeBuilder(List<Node> dataList) {
            this.dataList = dataList;
        }

        public Tree build() {
            return new Tree(root, getTree(dataList));
        }

        private List<Tree> getTree(List<? extends Node> dataList) {
            List<? extends Node> fDataNode = getFatherDataNodes();
            return getChildTree(fDataNode);
        }

        private List<Tree> getChildTree(List<? extends Node> fDataNode) {
            List<Tree> childrenNodes = new ArrayList<>();
            fDataNode.forEach(fNode -> childrenNodes.add(getNode(dataList, fNode)));
            return childrenNodes;
        }

        private Tree getNode(List<? extends Node> dataList, Node fNode) {
            List<? extends Node> childrens = dataList.stream()
                    .filter(data -> fNode.getId().equals(((Node) data).getfId()))
                    .collect(Collectors.toList());
            return new Tree(fNode, getChildTree(childrens));
        }

        private List<Node> getFatherDataNodes() {
            return dataList.stream()
                    .filter(data -> Strings.isBlank(data.getfId()))
                    .collect(Collectors.toList());
        }

    }

}

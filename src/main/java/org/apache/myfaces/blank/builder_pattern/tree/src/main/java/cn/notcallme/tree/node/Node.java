package cn.notcallme.tree.node;

public class Node {

    /**
     * 主键id
     */
    private String id;

    /**
     * 父级id
     */
    private String fId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public Node(String id, String fId) {
        this.id = id;
        this.fId = fId;
    }

    public Node() {
    }
}

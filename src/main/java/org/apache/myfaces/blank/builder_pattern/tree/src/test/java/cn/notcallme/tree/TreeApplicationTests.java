package cn.notcallme.tree;

import cn.notcallme.tree.node.Node;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TreeApplicationTests {

    @Test
    public void contextLoads() {
        List<Node> list = new ArrayList<>();
        Node n1 = new Node("1", null);
        Node n2 = new Node("2", null);
        Node n3 = new Node("3", null);
        Node n4 = new Node("4", null);
        Node n5 = new Node("5", "2");
        Node n6 = new Node("6", "2");
        Node n7 = new Node("7", "3");
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n6);
        list.add(n7);
        System.out.println(new Gson().toJson(Tree.builder()
                .root(null)
                .dataList(list)
                .build()));
    }

}

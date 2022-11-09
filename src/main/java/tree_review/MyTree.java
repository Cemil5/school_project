package tree_review;

import lombok.NoArgsConstructor;

public class MyTree {
    Node root;

    void insert(int value){
Node node = new Node(value);
if (root == null){
    root = node;
    return;
}
        Node current = root;
while (true){
    if (value <= current.value){

        if (current.leftChild == null){
            current.leftChild = node;
            break;
        }
        current = current.leftChild;
    }else{
        if (current.rightChild == null){
            current.rightChild = node;
            break;
        }
        current = current.rightChild;
    }
}

    }

    // Root-Left-Right
    void preOrderTraversal(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    void inOrderTraversal(Node root){

    }

    void postOrderTraversal(Node root){

    }

    void levelOrderTraversal(){

    }
}

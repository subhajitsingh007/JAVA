package Tree;
class Node {
    int data;
    Node left, right;

    //constructor
    Node(int val) {
        data = val;
        left = right = null;


    }
}

    class BinaryTree{
        //add the starting node
        Node root;

        //insert new node

        public Node insert(Node root , int key){
            //if there are no elements we create new root node
            if(root==null){
               return new Node(key);
            }

            if(key<root.data){
                root.left = insert(root.left,key);
            }

            else{
                root.right = insert(root.right,key);
            }
            return root;
        }
        // In-order Traversal (Left, Root, Right)
        public void inorder(Node root){
            if(root!=null){
                inorder(root.left);
                System.out.print(root.data+" ");
                inorder(root.right);
            }

        }

        // Pre-order Traversal (Root, Left, Right)

        public void preorder(Node root){
            if(root!=null){
                System.out.print(root.data+" ");
                preorder(root.left);
                preorder(root.right);
            }

        }

        // Post-order Traversal (Left, Right, Root)

        public void postorder(Node root){
            if(root!=null){
                preorder(root.left);
                preorder(root.right);
                System.out.print(root.data+" ");
            }

        }
        //Searching for a value in the tree

        public boolean search(Node root,int key){
            if(root==null) return false;

            if(root.data==key) return true;

            /*if(key< root.data){
                search(root.left,key);
            }

            else{
                search(root.right,key);
            }This is the way but we have to return so returning using ternary operator*/

            return key<root.data?search(root.left,key):search(root.right,key);


        }

        public Node findMinValNode(Node node){
            Node current = node;
            while(current.left!=null){
                current=current.left;
            }
            return current;
        }


        public Node deletenode(Node root , int key){
            if (root == null) return null;

            if(key<root.data){
                deletenode(root.left,key);
            }
            else if(key>root.data){
                deletenode(root.right,key);
            }

            else{
                //case1: no children(leaf node)
                if(root.left==null && root.right==null){
                    return null;
                }
                //case 2: only 1 child
                else if(root.left==null) return root.right;

                else if(root.right==null) return root.left;

                //case3: two children
                Node temp = findMinValNode(root.right);
                root.data=temp.data;
                root.right=deletenode(root.right,temp.data);

            }
            return root;
        }


    }

public class BinaryTreeImplementation {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // Insert nodes
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("In-order Traversal Before Deletion:");
        tree.inorder(tree.root);
        System.out.println();

        // Delete node
        tree.root = tree.deletenode(tree.root, 50);

        System.out.println("In-order Traversal After Deletion:");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Pre-order Traversal:");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Post-order Traversal:");
        tree.postorder(tree.root);
        System.out.println();

    }
}

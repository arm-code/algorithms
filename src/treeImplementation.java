import java.util.Scanner;

class treeImplementation {
    public static void main(String [] args){
        CBinaryTree binaryTree = new CBinaryTree();
        Scanner read = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("\nPlease select an option...\n" +
                    "1 - insert a new nodo.\n" +
                    "2 - inorder traversal.\n" +
                    "3 - preorder traversal.\n" +
                    "4 - postorder traversal.\n" +
                    "10 - Close application\n>>");
            option = read.nextInt();
            switch (option){
                case 1:{
                    System.out.println("Insert a int data type...");
                    int n = read.nextInt();
                    binaryTree.insertNode(n);
                    break;
                }
                case 2: {
                    binaryTree.inorden();
                    break;
                }
                case 3: {
                    binaryTree.preorden();
                    break;
                }
                case 4: {
                    binaryTree.postorden();
                    break;
                }
                case 10:{
                    System.exit(0);
                }
            }
        }while(option != 10);
    }
}

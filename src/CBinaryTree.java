public class CBinaryTree {
    protected CNodo root;

    public void insertNode(int dato){
        if(this.root == null)
            this.root = new CNodo(dato);
        else
            this.insertNodo(this.root, dato);
    }
    //This function insert a int number into Tree
    private void insertNodo(CNodo root, int dato){
        if(dato > root.getValueNodo())
            if(root.getSubTreeRight() == null)
                root.ramaRight(new CNodo(dato));
            else
                this.insertNodo(root.getSubTreeRight(), dato);
        else
            if(root.getSubTreeLeft() ==  null)
                root.ramaLeft(new CNodo(dato));
            else
                this.insertNodo(root.getSubTreeLeft(), dato);
    }

    //Trees traversal
    public void preorden (CNodo n){
        if(n != null){
            n.printDato();
            preorden(n.getSubTreeLeft());
            preorden(n.getSubTreeRight());
        }
    }

    public void inorden(CNodo n){
        if(n != null){
            inorden(n.getSubTreeLeft());
            n.printDato();
            inorden(n.getSubTreeRight());
        }
    }

    public void postorden(CNodo n){
        if(n != null){
            postorden(n.getSubTreeLeft());
            postorden(n.getSubTreeRight());
            n.printDato();
        }
    }

    public void preorden(){
        this.preorden(this.root);
    }

    public void inorden(){
        this.inorden(this.root);
    }

    public void postorden(){
        this.postorden(this.root);
    }

}

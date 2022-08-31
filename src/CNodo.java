public class CNodo {
    /* This abstract class called binary Tree work with integers numbers*/
    protected int data;
    protected CNodo left;
    protected CNodo right;

    public CNodo(int data){
        this.data = data;
        left = right = null;
    }

    public CNodo(CNodo ramaLeft, int value, CNodo ramaRight){
        this(value);
        left = ramaLeft;
        right = ramaRight;
    }

    public int getValueNodo(){
        return data;
    }

    public CNodo getSubTreeLeft(){
        return left;
    }

    public CNodo getSubTreeRight(){
        return right;
    }

    public void newValue(int d){
        data = d;
    }

    public void ramaLeft(CNodo n){
        left = n;
    }

    public void ramaRight(CNodo n){
        right = n;
    }

    public void printDato(){
        System.out.print(this.getValueNodo() +", ");
    }
}

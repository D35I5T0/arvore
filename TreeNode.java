package Arvore;
public class TreeNode {
    private Produto info;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Produto info) {
        this.info = info;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public Produto getInfo() {
        return info;
    }

    public void setRaiz(Produto info) {
        this.info = info;
    }

    void insertNode (Produto p){
        if (p.compareTo(getInfo()) == 0) {
            System.out.println("Valor repetido.");
        }
        else if (p.compareTo(getInfo()) < 0) {
            if (this.getLeft() == null){
                this.setLeft (new TreeNode (p));
            }
            else {
                this.getLeft().insertNode (p);
            }
        }
        else {
            if (this.getRight() == null){
                this.setRight (new TreeNode (p));
            }else {
                this.getRight().insertNode (p);
            }
        }
    }

    Produto findNode (int codigo) {
        if (codigo == getInfo().getCodigo()) {
            return this.getInfo();
        }
        else if (codigo < getInfo().getCodigo()) {
            if (this.getLeft() == null){
                return null;
            }
            else {
                return this.left.findNode (codigo);
            }
        }
        else {
            if (this.getRight() == null){
                return null;
            }
            else {
                return this.right.findNode (codigo);
            }
        }
    }
}

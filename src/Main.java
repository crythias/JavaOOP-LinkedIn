public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,12, TreeType.OAK);
        System.out.println("My favorite tree is a " + myFavoriteOakTree.treeType + 
                           " with a height of " + myFavoriteOakTree.heightFt + 
                           " feet and a trunk diameter of " + myFavoriteOakTree.trunkDiameterIn + 
                           " inches.");

        Tree myFavoriteMapleTree    = new Tree(90, 30, TreeType.MAPLE);    
        myFavoriteMapleTree.announceTallTree();
        myFavoriteOakTree.announceTallTree();
    }
}

public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOaktree = new Tree(25,5, TreeType.OAK);
        System.out.println("My favorite tree is a " + myFavoriteOaktree.treeType + 
                           " with a height of " + myFavoriteOaktree.heightFt + 
                           " feet and a trunk diameter of " + myFavoriteOaktree.trunkDiameterIn + 
                           " inches.");
    }
}

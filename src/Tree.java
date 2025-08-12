public class Tree {
    double heightFt;
    double trunkDiameterIn;
    TreeType treeType;

    Tree(double heightFt, double trunkDiameterIn, TreeType treeType) {
        this.heightFt = heightFt;   // height in feet
        this.trunkDiameterIn = trunkDiameterIn; // trunk diameter in inches
        this.treeType = treeType; // type of tree
      
    }
    
    void grow() {
        // Method to simulate tree growth
        this.heightFt += 10.0; // height grows by 10 feet
        this.trunkDiameterIn = this.trunkDiameterIn + 1.0; // trunk diameter grows by 1.0 inches

    }

    void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("Wow, that's a tall " + this.treeType + " tree!");
        } else {
            System.out.println("That's a nice " + this.treeType + " tree, but not too tall.");
        }
    }
}

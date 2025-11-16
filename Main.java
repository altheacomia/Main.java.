/**
 * The Main class to run our Tree example.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Create the nodes of our tree
        TreeNode<String> ceo = new TreeNode<>("CEO");

        TreeNode<String> vpMarketing = new TreeNode<>("VP of Marketing");
        TreeNode<String> vpEngineering = new TreeNode<>("VP of Engineering");

        TreeNode<String> marketingManager = new TreeNode<>("Marketing Manager");
        TreeNode<String> socialMediaLead = new TreeNode<>("Social Media Lead");

        TreeNode<String> leadEngineer = new TreeNode<>("Lead Engineer");
        TreeNode<String> softwareEngineer1 = new TreeNode<>("Software Engineer");
        TreeNode<String> softwareEngineer2 = new TreeNode<>("Software Engineer");

        // 2. Build the hierarchy
        ceo.addChild(vpMarketing);
        ceo.addChild(vpEngineering);

        vpMarketing.addChild(marketingManager);
        vpMarketing.addChild(socialMediaLead);

        vpEngineering.addChild(leadEngineer);
        leadEngineer.addChild(softwareEngineer1);
        leadEngineer.addChild(softwareEngineer2);

        // 3. Create the Tree with the CEO as root
        Tree<String> companyTree = new Tree<>(ceo);

        // 4. Print the entire tree
        System.out.println("Company Organizational Chart:");
        companyTree.printTree();
    }
}

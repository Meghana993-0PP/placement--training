import java.util*;
class Node{
    int val;
    node left,right;
    public node (int val){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Main1{
    public node insert(Node root, int val)
    {
        if(root==null){
            root.left=insert(root.left,val);
        }else if(val>root.val){
            root.right=insert(root.right,val);
        }
        return root;
        }
        public static void main(String args[]){
	Main1 sol=new Main1();
	Scanner sc=new Scanner(System.in);
	int i,choice,no;
	List<Integer> result;
	System.out.print("Enter Root value : ");
	Node root=new Node(sc.nextInt());

do
{

 System.out.println("\nMenu:\n.............");
 System.out.println("\n1.Insert , 2.Inorder , 3.Preorder , 4.Postorder, 5. Level Order Traversal,  6.Count , 7. Leaf Nodes, 8. Non Leaf Nodes, 9.Sum 10.MinMax, 11.LeftView , 12.RightView,13. Boundary View, 14.LCA ,15.Zigzag ,16. Validate BST , 17. Kth Smallest , 18. ArrayToBST , 19. Delete Node , 20. Serialize , 21. Deserialize , 22.Exit\n");
 System.out.print("\tEnter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
			System.out.println("\t-----Insert Node--------");
			System.outprint("Enter No of Nodes:");;
			no=sc.nextInt();
			for(int i = 0;i<no;i++) {
			System.out.print("Enter value: " +(i+1) + ":");
			sol.insert(root,sc.nextInt());
			}
			System.out.println(no+ "Node are inserted");
                break;6
		case 2:
                break;
		case 3:
                break;
		case 4:
                break;
		case 5:
                break;
		case 6:
                break;
		case 7:
                break;
		case 8:
                break;
		case 9:
                break;
		case 10:
                break;
		case 11:
                break;
		case 12:
                break;
		case 13:
                break;
		case 14:
                break;
		case 15:
                break;
		case 16:
                break;
		case 17:
                break;
		case 18:
                break;
		case 19:
                break;
		case 20:
                break;
		case 21:
                break;
		case 22:
                break;
		default:
		break;
    }
} while(choice!=22){
}

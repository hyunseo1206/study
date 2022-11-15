import javax.swing.*;
import javax.swing.tree.*;

public class TreeTest2 {
	JTree tree;
	
	//Using ICON
	public TreeTest2(String msg) {
		JFrame jf = new JFrame(msg);
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("ROOT");
		DefaultMutableTreeNode parent = new DefaultMutableTreeNode("PARENT");
		DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("CHILD1");
		DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("CHILD2");
		parent.add(child1);
		parent.add(child2);
		root.add(parent);
		tree = new JTree(root);
		JScrollPane sp = new JScrollPane(tree);
		
		DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
		renderer.setLeafIcon(new ImageIcon("Document.jpg"));
		renderer.setClosedIcon(new ImageIcon("Folder.jpg"));
		renderer.setOpenIcon(new ImageIcon("FolderOpen.jpg"));
		tree.setCellRenderer(renderer);
		tree.setEditable(true);
		
		jf.getContentPane().add(sp, "Center");
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
}

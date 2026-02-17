package laiba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTextEditor extends JFrame {
	
	private JTextArea tx;
	public SimpleTextEditor() {
		setTitle("Simple Text Editor");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tx = new JTextArea();
		JScrollPane pane = new JScrollPane(tx);
		add(pane, BorderLayout.CENTER);
		JMenuBar menubar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		menubar.add(fileMenu);
		setJMenuBar(menubar);	
		
		
		
		JMenu EditMenu = new JMenu("Edit");
		JMenuItem copyItem = new JMenuItem("Copy");
		JMenuItem cutItem = new JMenuItem("Cut");
		JMenuItem redoItem = new JMenuItem("Redo"); 
		EditMenu.add(copyItem);
		EditMenu.add(cutItem);
		EditMenu.add(redoItem);
		menubar.add(EditMenu);
		setJMenuBar(menubar);	
		
		
		JMenu SourceMenu = new JMenu("Source");
		JMenuItem ToggleCommentItem = new JMenuItem("Toggle Comment");
		JMenuItem FormatItem = new JMenuItem("Format");
		JMenuItem CleanupItem = new JMenuItem("Clean up");
		SourceMenu.add(ToggleCommentItem);
		SourceMenu.add(FormatItem);
		SourceMenu.add(CleanupItem);
		menubar.add(SourceMenu);
		setJMenuBar(menubar);	
		
		
		JMenu RefactorMenu = new JMenu("Refactor");
		JMenuItem RenameItem = new JMenuItem("Rename");
		JMenuItem MoveItem = new JMenuItem("Move");
		JMenuItem HistoryItem = new JMenuItem("History"); 
		RefactorMenu.add(RenameItem);
		RefactorMenu.add(MoveItem);
		RefactorMenu.add(HistoryItem);
		menubar.add(RefactorMenu);
		setJMenuBar(menubar);	
		
		
		JMenu NavigateMenu = new JMenu("Navigate");
		JMenuItem GoToItem = new JMenuItem("Go To");
		JMenuItem PreviousEditLocationItem = new JMenuItem("Previous Edit Location");
		JMenuItem NextEditItem = new JMenuItem("Next Edit Location"); 
		NavigateMenu.add(GoToItem);
		NavigateMenu.add(PreviousEditLocationItem);
		NavigateMenu.add(NextEditItem);
		menubar.add(NavigateMenu);
		setJMenuBar(menubar);	
		
		
		JMenu SearchMenu = new JMenu("Search");
		JMenuItem searchItem = new JMenuItem("Search");
		JMenuItem fileItem = new JMenuItem("File");
		JMenuItem javaItem = new JMenuItem("Java"); 
		SearchMenu.add(searchItem);
		SearchMenu.add(fileItem);
		SearchMenu.add(javaItem);
		menubar.add(SearchMenu);
		setJMenuBar(menubar);	
		
		
		JMenu ProjectMenu = new JMenu("Project");
		JMenuItem CleanItem = new JMenuItem("Clean");
		JMenuItem PropertiesItem = new JMenuItem("Properties");
		JMenuItem GenerateJavaDocItem = new JMenuItem("Generate Java Doc"); 
		ProjectMenu.add(CleanItem);
		ProjectMenu.add(PropertiesItem);
		ProjectMenu.add(GenerateJavaDocItem);
		menubar.add(ProjectMenu);
		setJMenuBar(menubar);	
		
		
		JMenu RunMenu = new JMenu("Search");
		JMenuItem RunItem = new JMenuItem("Run");
		JMenuItem DebugItem = new JMenuItem("Debug");
		JMenuItem RunAsItem = new JMenuItem("Run As"); 
		RunMenu.add(RunItem);
		RunMenu.add(DebugItem);
		RunMenu.add(RunAsItem);
		menubar.add(RunMenu);
		setJMenuBar(menubar);	
		
		
		JMenu WindowMenu = new JMenu("Window");
		JMenuItem NewWindowItem = new JMenuItem("New Window");
		JMenuItem EditorItem = new JMenuItem("Editor");
		JMenuItem ApperanceItem = new JMenuItem("Apperance"); 
		WindowMenu.add(NewWindowItem);
		WindowMenu.add(EditorItem);
		WindowMenu.add(ApperanceItem);
		menubar.add(WindowMenu);
		setJMenuBar(menubar);	
		
		
		JMenu HelpMenu = new JMenu("Help");
		JMenuItem HelpContentItem = new JMenuItem(" HelpContent");
		JMenuItem SearchItem = new JMenuItem("Search");
		JMenuItem ContributeItem = new JMenuItem("Contribute"); 
		HelpMenu.add(HelpContentItem);
		HelpMenu.add(SearchItem);
		HelpMenu.add(ContributeItem);
		menubar.add(HelpMenu);
		setJMenuBar(menubar);	
		
	}

	public static void main(String[] args) {
		
		SimpleTextEditor ste = new SimpleTextEditor();
		ste.setVisible(true);		// TODO Auto-generated method stub

	}

}




package Interface;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane extends JPanel {
	public TabbedPane() {
        super(new GridLayout(1, 1));
        
        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = null;
        
        JComponent startTournament = new CreateTournament();
        tabbedPane.addTab("Create Tournament", startTournament);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1); 		//Use alt 1 to go to first tab
        
        JComponent currentMatches = new CurrentMatches();
        tabbedPane.addTab("Current Matches", currentMatches);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        
        JComponent nextMatches = new NextMatches();
        tabbedPane.addTab("Current Matches", nextMatches);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        
        JComponent panel4 = makeTextPanel(
                "Panel #4 (has a preferred size of 410 x 50).");
        panel4.setPreferredSize(new Dimension(410, 400));
        tabbedPane.addTab("Tab 4", icon, panel4,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
        
        //Add the tabbed pane to this panel.
        add(tabbedPane);
        
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
    
}

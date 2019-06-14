package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import Interface.TabbedPane;

public class Main {
	    private static final String tournamentName = "";
	    /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from
	     * the event dispatch thread.
	     */
	    private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("Tournament of "+tournamentName);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        //Add content to the window.
	        frame.add(new TabbedPane(), BorderLayout.CENTER);
	        
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	    
	    public static void main(String[] args) {
	        //Schedule a job for the event dispatch thread:
	        //creating and showing this application's GUI.
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                //Turn off metal's use of bold fonts
			UIManager.put("swing.boldMetal", Boolean.FALSE);
			createAndShowGUI();
	            }
	        });
	    }
	}


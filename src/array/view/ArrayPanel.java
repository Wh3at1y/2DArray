package array.view;

import java.awt.event.*;
import javax.swing.*;
import array.controller.ArrayController;

public class ArrayPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		private JButton addButton;
		private JButton removeButton;
		private JTextArea showInfo;
		private JTextField userX;
		private JTextField userY;
		private JTextField userContent;
		
		private ArrayController baseController;
		
		public ArrayPanel(ArrayController baseController)
		{
			baseLayout = new SpringLayout();
			
			addButton = new JButton("Add");
			baseLayout.putConstraint(SpringLayout.NORTH, addButton, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, addButton, 183, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, addButton, -10, SpringLayout.EAST, this);
			removeButton = new JButton("Remove Content");
			baseLayout.putConstraint(SpringLayout.NORTH, removeButton, 6, SpringLayout.SOUTH, addButton);
			baseLayout.putConstraint(SpringLayout.WEST, removeButton, 183, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, removeButton, -10, SpringLayout.EAST, this);
			showInfo = new JTextArea();
			baseLayout.putConstraint(SpringLayout.NORTH, showInfo, 23, SpringLayout.SOUTH, removeButton);
			baseLayout.putConstraint(SpringLayout.WEST, showInfo, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, showInfo, -10, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, showInfo, -10, SpringLayout.EAST, this);
			showInfo.setEditable(false);
			userX = new JTextField();
			baseLayout.putConstraint(SpringLayout.NORTH, userX, -1, SpringLayout.NORTH, addButton);
			baseLayout.putConstraint(SpringLayout.WEST, userX, 0, SpringLayout.WEST, showInfo);
			baseLayout.putConstraint(SpringLayout.EAST, userX, -313, SpringLayout.EAST, this);
			userY = new JTextField();
			baseLayout.putConstraint(SpringLayout.NORTH, userY, -1, SpringLayout.NORTH, addButton);
			baseLayout.putConstraint(SpringLayout.WEST, userY, 13, SpringLayout.EAST, userX);
			baseLayout.putConstraint(SpringLayout.EAST, userY, -6, SpringLayout.WEST, addButton);
			userContent = new JTextField();
			baseLayout.putConstraint(SpringLayout.NORTH, userContent, -1, SpringLayout.NORTH, removeButton);
			baseLayout.putConstraint(SpringLayout.WEST, userContent, 0, SpringLayout.WEST, showInfo);
			baseLayout.putConstraint(SpringLayout.EAST, userContent, -6, SpringLayout.WEST, removeButton);
			
			this.baseController = baseController;
			
			setupPanel();
			setupPlacements();
			setupListeners();
		}
		
		private void setupPanel()
		{
			setLayout(baseLayout);
			
			add(addButton);
			add(removeButton);
			add(showInfo);
			add(userX);
			add(userY);
			add(userContent);
		}
		
		private void setupPlacements()
		{

		}
		
		private void setupListeners()
		{
			addButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent clicked)
					{
						int xPos = Integer.parseInt(userX.getText());
						int yPos = Integer.parseInt(userY.getText());
						
						baseController.getPos(xPos, yPos, userContent.getText());
					}
				});
		}
	}

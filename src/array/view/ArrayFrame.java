package array.view;

import javax.swing.JFrame;
import array.controller.ArrayController;

public class ArrayFrame extends JFrame
	{
		private ArrayPanel basePanel;
		
		public ArrayFrame(ArrayController baseController)
		{
			basePanel = new ArrayPanel(baseController);
			
			buildFrame();
		}
		
		private void buildFrame()
		{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400,300);
			setTitle("2D-Array Assignment");
			setContentPane(basePanel);
			setVisible(true);
		}
	}

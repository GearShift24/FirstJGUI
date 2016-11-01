package graphics.view;

import javax.swing.JPanel;
import graphics.controller.FirstGUIController;

public class FirstPanel extends JPanel
{
	private FirstGUIController baseController;
	
	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		
		setupPanel();
		
	}
	
	private void setupPanel()
	{
		
	}
}

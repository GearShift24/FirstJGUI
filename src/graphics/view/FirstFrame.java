package graphics.view;

import javax.swing.JFrame;
import graphics.controller.FirstGUIController;
import java.awt.Dimension;

public class FirstFrame extends JFrame
{
	private FirstGUIController baseController;
	private FirstPanel appPanel;
	
	public FirstFrame(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new FirstPanel(baseController);
		
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Wow im a window ggez");
		this.setSize(new Dimension(500,500));
		this.setVisible(true);
		
	}
}

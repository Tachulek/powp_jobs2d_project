package edu.kis.powp.jobs2d.drivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.factory.FigureFactory;
import edu.kis.powp.jobs2d.command.factory.RectangleFactory;

public class SelectTestCommandRectangleOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestCommandRectangleOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureFactory factory = new RectangleFactory();
		factory.getShape(driverManager).execute();
	}
}
package edu.kis.powp.jobs2d.drivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.factory.CircleFactory;
import edu.kis.powp.jobs2d.command.factory.FigureFactory;

public class SelectTestCommandCircleOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestCommandCircleOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureFactory factory = new CircleFactory();
		factory.getShape(driverManager).execute();
	}
}
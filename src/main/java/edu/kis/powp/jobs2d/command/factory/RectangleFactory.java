package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;


public class RectangleFactory implements FigureFactory {
    private ComplexCommand complexCommand = new ComplexCommand();

    public DriverCommand getShape(DriverManager driver){
        complexCommand.addCommand(new SetPositionCommand(driver.getCurrentDriver(), -200, -200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), -200, 200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), 200, 200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), 200, -200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), -200, -200));

        return complexCommand;
    }

}
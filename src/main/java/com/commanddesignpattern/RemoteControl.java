package com.commanddesignpattern;

public class RemoteControl {
    ICommand iCommand;

    public void setCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void pressButton() {
        iCommand.execute();
    }
}

package ru.thethenzou.gui;

import ru.thethenzou.gui.components.questions.*;
import ru.thethenzou.gui.components.StartPanel;
import ru.thethenzou.gui.mediator.Akinator;
import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Mediator mediator = new Akinator();
        mediator.registerComponent(new StartPanel());
        mediator.registerComponent(new FirstQuestion());
        mediator.registerComponent(new SecondQuestion());
        mediator.registerComponent(new FoursQuestion());
        mediator.registerComponent(new FifthQuestion());
        mediator.registerComponent(new SixthQuestion());
        mediator.registerComponent(new SeventhQuestion());
        mediator.registerComponent(new EighthQuestion());
        mediator.registerComponent(new NinethQuestion());
        mediator.registerComponent(new TenthQuestion());
        mediator.registerComponent(new EleventhQuestion());

        mediator.createGUI();
    }
}

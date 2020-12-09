package ru.thethenzou.gui;

import ru.thethenzou.akinator.AkinatorProlog;
import ru.thethenzou.gui.components.AnswerPanel;
import ru.thethenzou.gui.components.StartPanel;
import ru.thethenzou.gui.components.questions.*;
import ru.thethenzou.gui.mediator.Akinator;
import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, IOException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Properties properties = new Properties();
        try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties")) {
            properties.load(inputStream);
        }
        Mediator mediator = new Akinator(new AkinatorProlog(properties));
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
        mediator.registerComponent(new AnswerPanel());

        mediator.createGUI();
    }
}

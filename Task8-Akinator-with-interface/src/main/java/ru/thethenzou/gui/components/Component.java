package ru.thethenzou.gui.components;

import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;

public interface Component {
    void setMediator(Mediator mediator);
    void setPenel(JPanel panel);
    void show();
    void hide();
}

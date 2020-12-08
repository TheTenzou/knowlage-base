package ru.thethenzou.gui.components;

import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel implements Component, ActionListener {

    private Mediator mediator;
    JLabel label = new JLabel("Начать игру?");
    JButton button = new JButton("Начать игру.");

    public StartPanel() {

        label.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(400,200,labelSize.width,labelSize.height);
//        label.setOpaque(true);
//        label.setBackground(Color.LIGHT_GRAY);

        button.setFont(new Font("Serif", Font.PLAIN, 14));
        Dimension buttonSize = button.getPreferredSize();
        button.setBounds(400,400, buttonSize.width, buttonSize.height);
        button.setFocusPainted(false);
        button.addActionListener(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "StartPenal";
    }

    @Override
    public void setPenel(JPanel panel) {
        panel.add(label);
        panel.add(button);
    }

    @Override
    public void show() {
        label.setVisible(true);
        button.setVisible(true);
    }

    @Override
    public void hide() {
        label.setVisible(false);
        button.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mediator.nextPage();
    }
}

package ru.thethenzou.gui.components;

import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnswerPanel implements Component, ActionListener {

    private Mediator mediator;
    JLabel backGround = new JLabel();
    JLabel label = new JLabel("Вы загодали ");
    JButton button = new JButton("Начать игру заново.");

    public AnswerPanel() {

        backGround.setBounds(360, 440, 200, 60);
        backGround.setOpaque(true);
        backGround.setBackground(new Color(250,183,60));

        label.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(410,460,labelSize.width,labelSize.height);

        button.setFont(new Font("Serif", Font.PLAIN, 14));
        Dimension buttonSize = button.getPreferredSize();
        button.setBounds(360,540, 200, buttonSize.height);
        button.setFocusPainted(false);
        button.addActionListener(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setPenel(JPanel panel) {
        panel.add(label);
        panel.add(button);
        panel.add(backGround);
    }

    @Override
    public void show() {
        label.setText(label.getText() + mediator.getName());
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(410,460,labelSize.width,labelSize.height);
        label.setVisible(true);
        button.setVisible(true);
        backGround.setVisible(true);
    }

    @Override
    public void hide() {
        label.setVisible(false);
        button.setVisible(false);
        backGround.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

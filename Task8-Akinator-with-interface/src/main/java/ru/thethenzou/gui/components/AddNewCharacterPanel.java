package ru.thethenzou.gui.components;

import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewCharacterPanel implements Component, ActionListener {

    private Mediator mediator;
    JLabel backGround = new JLabel();
    JLabel label = new JLabel("Я не знаю такого персонажа.");
    JLabel label2 = new JLabel("Воведите его имя.");
    JTextField answer = new JTextField();
    JButton button = new JButton("Сохранить");

    public AddNewCharacterPanel() {

        backGround.setBounds(360, 440, 200, 60);
        backGround.setOpaque(true);
        backGround.setBackground(new Color(250,183,60));

        label.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(460 - labelSize.width/2,450,labelSize.width,labelSize.height);

        label2.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize2 = label2.getPreferredSize();
        label2.setBounds(460 - labelSize2.width/2,470,labelSize2.width,labelSize2.height);

        answer.setFont(new Font("Serif", Font.PLAIN, 14));
        Dimension textEditSize = button.getPreferredSize();
        answer.setBounds(360,510, 200, textEditSize.height);

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
        panel.add(label2);
        panel.add(answer);
        panel.add(button);
        panel.add(backGround);
    }

    @Override
    public void show() {
        label.setVisible(true);
        label2.setVisible(true);
        answer.setVisible(true);
        button.setVisible(true);
        backGround.setVisible(true);
    }

    @Override
    public void hide() {
        label.setVisible(false);
        label2.setVisible(false);
        answer.setVisible(false);
        button.setVisible(false);
        backGround.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mediator.setName(answer.getText());
//        System.out.println(answer.getText());
        mediator.startAgain();
    }
}

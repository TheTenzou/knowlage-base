package ru.thethenzou.gui.components.questions;

import ru.thethenzou.gui.components.Component;
import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SixthQuestion implements Component, ActionListener {

    private Mediator mediator;

    JLabel backGround = new JLabel();
    JLabel label = new JLabel("Владеет ли ваш персонаж");
    JLabel label2 = new JLabel("боевыми искусствами?");
    JButton answerOneButton = new JButton("Да");
    JButton answerSecondButton = new JButton("Нет");
    JButton answerThirdButton = new JButton("Не известно");

    public SixthQuestion() {

        backGround.setBounds(320, 390, 250, 60);
        backGround.setOpaque(true);
        backGround.setBackground(new Color(250,183,60));

        label.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(445 - labelSize.width/2,400,labelSize.width,labelSize.height);
        label2.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize2 = label2.getPreferredSize();
        label2.setBounds(445 - labelSize2.width/2,420,labelSize.width,labelSize2.height);

        answerOneButton.setBounds(320,460, 250, 30);
        answerOneButton.setFocusPainted(false);
        answerOneButton.setActionCommand("1");
        answerOneButton.addActionListener(this);

        answerSecondButton.setBounds(320,500, 250, 30);
        answerSecondButton.setFocusPainted(false);
        answerSecondButton.setActionCommand("2");
        answerSecondButton.addActionListener(this);

        answerThirdButton.setBounds(320,540, 250, 30);
        answerThirdButton.setFocusPainted(false);
        answerThirdButton.setActionCommand("3");
        answerThirdButton.addActionListener(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void setPenel(JPanel panel) {
        panel.add(label);
        panel.add(label2);
        panel.add(answerOneButton);
        panel.add(answerSecondButton);
        panel.add(answerThirdButton);
        panel.add(backGround);
    }

    @Override
    public void show() {
        backGround.setVisible(true);
        label.setVisible(true);
        label2.setVisible(true);
        answerOneButton.setVisible(true);
        answerSecondButton.setVisible(true);
        answerThirdButton.setVisible(true);
    }

    @Override
    public void hide() {
        backGround.setVisible(false);
        label.setVisible(false);
        label2.setVisible(false);
        answerOneButton.setVisible(false);
        answerSecondButton.setVisible(false);
        answerThirdButton.setVisible(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "1":
                mediator.setAnswer(6, 1);
                break;
            case "2":
                mediator.setAnswer(6, 2);
                break;
            case "3":
                mediator.setAnswer(6, 3);
                break;
        }
        mediator.nextPage();
    }
}

package com.pos.clints;

import javax.swing.*;

public class FrameUI extends JFrame {
    {
        this.setSize(500,350);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        int x = (int) getToolkit().getScreenSize().getWidth()/2 - (this.getWidth()/2);
        int y = (int) getToolkit().getScreenSize().getHeight()/2 - (this.getHeight()/2);
        this.setLocation(x,y);
    }
    FrameUI(){
        super();

        System.out.println(getToolkit().getScreenSize().getHeight()/2);

    }
}

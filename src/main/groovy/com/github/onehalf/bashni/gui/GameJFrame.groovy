package com.github.onehalf.bashni.gui

import javax.swing.*
import java.awt.*

/**
 *
 *
 * Date: 16.10.2016
 * @author OneHalf
 */
public class GameJFrame extends JFrame {

    GameJFrame() {
        super(title: "Саровские башни");
        add(controlPanel())
        setMinimumSize(new Dimension(width: 400, height: 300));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE)
    }

    private JPanel controlPanel() {
        def panel = new JPanel()

        def closeButton = new Button("Закрыть")
        closeButton.addActionListener({e -> dispose()})
        panel.add(closeButton)
        panel
    }
}

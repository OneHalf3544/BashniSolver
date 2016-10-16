package com.github.onehalf.bashni.gui

import com.github.onehalf.bashni.model.GameField
import com.github.onehalf.bashni.model.ModelGenerator

import javax.swing.*
import java.awt.*

/**
 *
 *
 * Date: 16.10.2016
 * @author OneHalf
 */
public class GameJFrame extends JFrame {

    private TextArea textArea

    GameJFrame() {
        super('Саровские башни');
        setLayout(new BorderLayout())
        textArea = new TextArea()
        add(textArea, BorderLayout.CENTER)
        add(controlPanel(), BorderLayout.SOUTH)
        setMinimumSize(new Dimension(width: 700, height: 300));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE)

        model = ModelGenerator.generate(2, 0)
    }

    private JPanel controlPanel() {
        def panel = new JPanel()

        def closeButton = new Button("Закрыть")
        closeButton.addActionListener({e -> dispose()})
        panel.add(closeButton)
        panel
    }

    def setModel(GameField field) {
        textArea.text = field.asString()
    }
}

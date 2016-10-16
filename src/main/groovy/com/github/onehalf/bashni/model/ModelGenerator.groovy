package com.github.onehalf.bashni.model

/**
 *
 *
 * Date: 16.10.2016
 * @author OneHalf
 */
class ModelGenerator {

    static GameField generate(int towersCount, int positionId) {
        def columns = [];
        for (int i = 0; i < towersCount; i++) {
            columns << column(Color.getEnumConstants()[i])
        }
        columns += [new Column(), new Column()]
        new GameField(columns)
    }

    private static Column column(Color color) {
        def content = []
        for (int i = 6; i >= 0; i--) {
            content << new Brick(color: color, size: i)
        }
        new Column(content: content)
    }
}

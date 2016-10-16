package com.github.onehalf.bashni.model

import java.util.stream.Collectors

/**
 *
 *
 * Date: 16.10.2016
 * @author 123
 */
class GameField {

    final List<Column> columns

    GameField(List<Column> columns) {
        this.columns = columns
    }

    def asString() {
        columns.stream()
                .map({it.toString()})
                .collect(Collectors.joining('\n'))
    }
}

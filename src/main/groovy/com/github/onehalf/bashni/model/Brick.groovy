package com.github.onehalf.bashni.model

/**
 *
 *
 * Date: 16.10.2016
 * @author OneHalf
 */
class Brick {

    Color color
    int size

    @Override
    String toString() {
        return size + '_' + color
    }
}

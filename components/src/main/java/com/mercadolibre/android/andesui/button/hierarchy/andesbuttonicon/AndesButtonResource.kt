package com.mercadolibre.android.andesui.button.hierarchy.andesbuttonicon

import com.mercadolibre.android.andesui.button.hierarchy.AndesButtonIconOrientation

interface AndesButtonResource<out T: Any> {
    val orientation: AndesButtonIconOrientation
    val icon: T?
    fun getRightIcon(): T?
    fun getLeftIcon(): T?
}
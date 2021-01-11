package com.mercadolibre.android.andesui.icons

import android.content.Context
import android.graphics.drawable.Drawable

/**
 * This class has the responsibility of providing the icons.
 */
class IconProvider(private val context: Context) {
    var iconProviderStrategy = OfflineIconProviderStrategy(context)

    /**
     * This method load the desired icon.
     *
     * @param name the name of the icon.
     */
    fun loadIcon(name: Any): Drawable? {
        return when (name) {
            is Drawable -> name
            else -> (name as? String)?.let { iconProviderStrategy.loadIcon(name) }
        }
    }
}

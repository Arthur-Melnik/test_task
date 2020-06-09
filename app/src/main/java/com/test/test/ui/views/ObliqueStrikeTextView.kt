package com.test.test.ui.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.test.test.R

class ObliqueStrikeTextView : AppCompatTextView {


    private var dividerColor: Int = 0
    private lateinit var paint: Paint

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(context)
    }

    private fun init(context: Context) {
        val resources = context.resources
        dividerColor = resources.getColor(R.color.colorBlackAlpha50)

        paint = Paint()
        paint.apply {
            color = dividerColor
            strokeWidth = resources.getDimension(width)
        }

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (::paint.isInitialized) {
            canvas.drawLine(0.0f, height.toFloat(), width.toFloat(), 0.0f, paint)
        }
    }
}

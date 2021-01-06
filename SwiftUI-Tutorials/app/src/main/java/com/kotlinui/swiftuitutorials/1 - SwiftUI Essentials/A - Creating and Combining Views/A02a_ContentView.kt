package com.kotlinui.swiftuitutorials

import android.graphics.fonts.FontStyle
import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A02a_ContentView : View {
    override val body: View =
        Text("Turtle Rock")
            .font(Font.title)
            .foregroundColor(Color.green)
}

object A02a_ContentView_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A02a_ContentView()
        }
}

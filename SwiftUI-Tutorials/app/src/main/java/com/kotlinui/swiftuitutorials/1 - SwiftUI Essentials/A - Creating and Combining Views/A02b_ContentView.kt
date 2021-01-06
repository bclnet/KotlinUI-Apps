package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A02b_ContentView : View {
    override val body: View =
        Text("Turtle Rock")
            .font(Font.title)

}

object A02b_ContentView_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A02b_ContentView()
        }
}

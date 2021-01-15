package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A02b_ContentView : View {
    override val body: View
        get() =
            Text("Turtle Rock")
                .font(Font.title)

}

object A02b_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A02b_ContentView()
            }
}

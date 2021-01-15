package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A03b_ContentView : View {
    override val body: View
        get() =
            VStack {
                Text("Turtle Rock")
                    .font(Font.title)
                Text("Joshua Tree National Park")
                    .font(Font.subheadline)
            }
}

object A03b_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A03b_ContentView()
            }
}

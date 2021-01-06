package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A03a_ContentView : View {
    override val body: View =
        VStack {
            Text("Turtle Rock")
                .font(Font.title)
            Text("Joshua Tree National Park")
        }
}

object A03a_ContentView_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A03a_ContentView()
        }
}

package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A03c_ContentView : View {
    override val body: View
        get() =
            VStack(alignment = HorizontalAlignment.leading) {
                get(
                    Text("Turtle Rock")
                        .font(Font.title),
                    Text("Joshua Tree National Park")
                        .font(Font.subheadline)
                )
            }
}

object A03c_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A03c_ContentView()
            }
}

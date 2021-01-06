package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A01a_ContentView : View {
    override val body: View =
        Text("Hello World")
}

object A01a_ContentView_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A01a_ContentView()
        }
}

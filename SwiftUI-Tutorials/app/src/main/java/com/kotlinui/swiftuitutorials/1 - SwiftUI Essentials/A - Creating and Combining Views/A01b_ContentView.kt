package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A01b_ContentView : View {
    override val body: View =
        Text("Hello SwiftUI!")
}

object A01b_ContentView_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A01b_ContentView()
        }
}

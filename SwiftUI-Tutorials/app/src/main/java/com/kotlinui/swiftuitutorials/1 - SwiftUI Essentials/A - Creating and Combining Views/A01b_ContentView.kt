package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A01b_ContentView : View {
    override val body: View
        get() =
            Text("Hello SwiftUI!")
}

object A01b_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
            A01b_ContentView()
        }
}

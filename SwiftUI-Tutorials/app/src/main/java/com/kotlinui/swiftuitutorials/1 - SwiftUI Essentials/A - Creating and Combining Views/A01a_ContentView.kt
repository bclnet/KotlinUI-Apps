package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A01a_ContentView : View {
    override val body: View
        get() =
            Text("Hello World")
}

object A01a_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A01a_ContentView()
            }
}

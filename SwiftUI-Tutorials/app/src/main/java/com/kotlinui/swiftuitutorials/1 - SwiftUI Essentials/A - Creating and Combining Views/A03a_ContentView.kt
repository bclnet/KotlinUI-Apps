package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A03a_ContentView : View {
    override val body: View
        get() =
            VStack {
                Text("Turtle Rock")
                    .font(Font.title)+
                Text("Joshua Tree National Park")
            }
}

object A03a_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A03a_ContentView()
            }
}

package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A03d_ContentView : View {
    override val body: View
        get() =
            VStack(alignment = HorizontalAlignment.leading) {
                Text("Turtle Rock")
                    .font(Font.title) +
                HStack {
                    Text("Joshua Tree National Park")
                        .font(Font.subheadline) +
                    Text("California")
                        .font(Font.subheadline)
                }
            }
}

object A03d_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A03d_ContentView()
            }
}

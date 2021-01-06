package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A03e_ContentView : View {
    override val body: View =
        VStack(alignment = HorizontalAlignment.leading) {
            Text("Turtle Rock")
                .font(Font.title)
            HStack {
                Text("Joshua Tree National Park")
                    .font(Font.subheadline)
                Spacer()
                Text("California")
                    .font(Font.subheadline)
            }
        }
}

object A03e_ContentView_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A03e_ContentView()
        }
}

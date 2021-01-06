package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A03f_ContentView : View {
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
            .padding()
}

object A03f_ContentView_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A03f_ContentView()
        }
}

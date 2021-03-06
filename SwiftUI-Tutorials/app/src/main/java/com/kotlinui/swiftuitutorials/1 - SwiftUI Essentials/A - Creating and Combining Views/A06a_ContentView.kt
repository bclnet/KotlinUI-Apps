package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A06a_ContentView : View {
    override val body: View
        get() =
            VStack(alignment = HorizontalAlignment.leading) {
                Text("Turtle Rock")
                    .font(Font.title) +
                HStack {
                    Text("Joshua Tree National Park")
                        .font(Font.subheadline) +
                    Spacer() +
                    Text("California")
                        .font(Font.subheadline)
                }
            }
                .padding()
}

object A06a_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A06a_ContentView()
            }
}

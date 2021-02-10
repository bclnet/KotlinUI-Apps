package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A06b_ContentView : View {
    override val body: View
        get() =
            VStack {
                VStack(alignment = HorizontalAlignment.leading) {
                    Text("Turtle Rock")
                        .font(Font.title) +
                    HStack(alignment = VerticalAlignment.top) {
                        Text("Joshua Tree National Park")
                            .font(Font.subheadline) +
                        Spacer() +
                        Text("California")
                            .font(Font.subheadline)
                    }
                }
                    .padding()
            }
}

object A06b_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A06b_ContentView()
            }
}

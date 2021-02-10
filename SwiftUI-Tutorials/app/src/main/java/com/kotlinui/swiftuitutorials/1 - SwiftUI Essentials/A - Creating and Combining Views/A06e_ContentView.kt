package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A06e_ContentView : View {
    override val body: View
        get() =
            VStack {
                A05_MapView()
                    .frame(height = 300f) +

                A04e_CircleImage()
                    .offset(y = -130f)
                    .padding(Edge.Set.bottom, -130f) +

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

object A06e_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A06e_ContentView()
            }
}

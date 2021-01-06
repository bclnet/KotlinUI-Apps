package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A06g_ContentView : View {
    override val body: View =
        VStack {
            A05_MapView()
                .edgesIgnoringSafeArea(Edge.Set.top)
                .frame(height = 300f)

            A04e_CircleImage()
                .offset(y = -130f)
                .padding(Edge.Set.bottom, -130f)

            VStack(alignment = HorizontalAlignment.leading) {
                Text("Turtle Rock")
                    .font(Font.title)
                HStack(alignment = VerticalAlignment.top) {
                    Text("Joshua Tree National Park")
                        .font(Font.subheadline)
                    Spacer()
                    Text("California")
                        .font(Font.subheadline)
                }
            }
                .padding()

            Spacer()
        }
}

object A06g_ContentView_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A06g_ContentView()
        }
}

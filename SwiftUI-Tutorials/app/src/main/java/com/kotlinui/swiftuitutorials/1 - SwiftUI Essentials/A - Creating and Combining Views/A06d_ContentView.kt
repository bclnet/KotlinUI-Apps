package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A06d_ContentView : View {
    override val body: View
        get() =
            VStack {
                A05_MapView()
                    .frame(height = 300f)

                A04e_CircleImage()

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
            }
}

object A06d_ContentView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A06d_ContentView()
            }
}

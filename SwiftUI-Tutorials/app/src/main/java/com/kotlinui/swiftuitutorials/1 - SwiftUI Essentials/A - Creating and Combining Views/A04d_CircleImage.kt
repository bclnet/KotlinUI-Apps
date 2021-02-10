package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A04d_CircleImage : View {
    override val body: View
        get() =
            Image("turtlerock")
                .clipShape(Circle())
                .overlay(
                    Circle().stroke(Color.gray, lineWidth = 4f)
                )
                .shadow(radius = 10f)
}

object A04d_CircleImage_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A04d_CircleImage()
            }
}

package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A04c_CircleImage : View {
    override val body: View =
        Image("turtlerock")
            .clipShape(Circle())
            .overlay(
                Circle().stroke(Color.gray, lineWidth = 4f)
            )
}

class A04c_CircleImage_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A04c_CircleImage()
        }
}

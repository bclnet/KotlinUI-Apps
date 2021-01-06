package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A04a_CircleImage : View {
    override val body: View =
        Image("turtlerock")
}

object A04a_CircleImage_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            A04a_CircleImage()
        }
}

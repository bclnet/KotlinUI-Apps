package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A04b_CircleImage : View {
    override val body: View
        get() =
            Image("turtlerock")
                .clipShape(Circle())
}

object A04b_CircleImage_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A04b_CircleImage()
            }
}

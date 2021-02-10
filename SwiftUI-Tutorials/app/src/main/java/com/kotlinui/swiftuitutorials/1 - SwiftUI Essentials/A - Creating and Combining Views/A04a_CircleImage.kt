package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A04a_CircleImage : View {
    override val body: View
        get() =
            Image("turtlerock")
}

object A04a_CircleImage_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A04a_CircleImage()
            }
}

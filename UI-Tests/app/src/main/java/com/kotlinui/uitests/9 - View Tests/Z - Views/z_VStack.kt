package com.kotlinui.uitests

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class z_VStack : View {
    override val body: View =
        VStack {
            Text("VStack")
            VStack {
                Text("default")
            }
            VStack(alignment = HorizontalAlignment.leading, spacing = 5f) {
                Text("alignment:spacing")
            }
        }
}

object z_VStack_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            z_VStack()
        }
}

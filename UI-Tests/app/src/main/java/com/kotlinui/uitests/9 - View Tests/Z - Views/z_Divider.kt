package com.kotlinui.uitests

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class z_Divider : View {
    override val body: View =
        VStack {
            Text("Divider")
            Divider()
        }
}

object z_Divider_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            z_Divider()
        }
}

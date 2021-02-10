package com.kotlinui.uitests

import kotlinx.kotlinui.*

class z_ZStack : View {
    override val body: View =
        VStack {
            +Text("ZStack")
            +ZStack {
                Text("default")
            }
            +ZStack(alignment = Alignment.top) {
                Text("alignment")
            }
            get()
        }
}

object z_ZStack_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            z_ZStack()
        }
}

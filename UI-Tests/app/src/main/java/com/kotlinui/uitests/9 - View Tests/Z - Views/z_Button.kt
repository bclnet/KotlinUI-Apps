package com.kotlinui.uitests

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class z_Button : View {
    override val body: View =
        VStack {
            Text("Button")
            VStack {
                Button(action = { print("action") }, label = { Text("label") })
//                Button("titleKey", action = { print("action") })
//                Button(String("title"), action = { print("action") })
            }
//            VStack {
//                Button("configuration", action = { print("action") }).buttonStyle(DefaultButtonStyle())
//            }
        }
}

object z_Button_Previews : PreviewProvider {
    override val previews: View =
        JsonPreview {
            z_Button()
        }
}

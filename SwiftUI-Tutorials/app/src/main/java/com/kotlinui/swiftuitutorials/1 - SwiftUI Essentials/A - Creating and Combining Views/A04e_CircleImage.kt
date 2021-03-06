package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*

class A04e_CircleImage : View {
    //var base = BaseView(Self.self)

    override val body: View
        get() =
            Image("turtlerock")
                .clipShape(Circle())
                .overlay(
                    Circle().stroke(Color.white, lineWidth = 4f)
                )
                .shadow(radius = 10f)
}

object A04e_CircleImage_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A04e_CircleImage()
            }
}

//extension A04e_CircleImage: JsonView {
//    public init(from decoder: Decoder, for dynaType: DynaType) throws { self.init() }
//    public func encode(to encoder: Encoder) throws {}
//}

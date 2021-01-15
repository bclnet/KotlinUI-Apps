package com.kotlinui.swiftuitutorials

import kotlinx.kotlinui.*
import kotlinx.kotlinuijson.*

class A05_MapView : UIViewRepresentable {
    //var base = BaseView(Self.self)
    override val body: View get() = Text("TODO")

//    fun makeUIView(context: Context) : MKMapView {
//        MKMapView(frame: .zero)
//    }
//
//    func updateUIView(_ uiView: MKMapView, context: Context) {
//        let coordinate = CLLocationCoordinate2D(
//            latitude: 34.011286, longitude: -116.166868)
//        let span = MKCoordinateSpan(latitudeDelta: 2.0, longitudeDelta: 2.0)
//        let region = MKCoordinateRegion(center: coordinate, span: span)
//        uiView.setRegion(region, animated: true)
//    }
}

object A05_MapView_Previews : PreviewProvider {
    override val previews: View
        get() =
            JsonPreview {
                A05_MapView()
            }
}

//extension A05_MapView: JsonView {
//    public init(from decoder: Decoder, for dynaType: DynaType) throws { self.init() }
//    public func encode(to encoder: Encoder) throws {}
//}

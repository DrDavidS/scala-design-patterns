package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

/**
 *
 * @tparam Data     打印的东西
 * @tparam Material 打印的耗材（墨水等）
 * @tparam Media    打印的媒介（纸张等）
 */
trait GenericPrinter[Data <: PrintData, Material <: PrintMaterial, Media <: PrintMedia] {
  def print(data: Data, material: Material, media: Media) =
    s"Printing $data with $material material on $media media."
}

// 太长了，很容易犯错
class GenericLaserPrinter[Data <: Text, Material <: Toner, Media <: Paper]
  extends GenericPrinter[Data, Material, Media]

class GenericThreeDPrinter[Data <: Model, Material <: Plastic, Media <: Air]
  extends GenericPrinter[Data, Material, Media]

class GenericPrinterImpl[Data <: PrintData, Material <: PrintMaterial, Media <: PrintMedia]
  extends GenericPrinter[Data, Material, Media]
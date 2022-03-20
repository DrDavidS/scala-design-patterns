package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

abstract class PrintData

abstract class PrintMaterial

abstract class PrintMedia

case class Paper() extends PrintMedia

case class Air() extends PrintMedia

case class Text() extends PrintData

case class Model() extends PrintData

case class Toner() extends PrintMaterial

case class Plastic() extends PrintMaterial

trait Printer {
  type Data <: PrintData
  type Material <: PrintMaterial
  type Media <: PrintMedia

  def print(data: Data, material: Material, media: Media) =
    s"Printing $data with $material material on $media media."
}

class LaserPrinter extends Printer {
  type Media = Paper
  type Data = Text
  type Material = Toner
}

class ThreeDPrinter extends Printer {
  type Media = Air
  type Data = Model
  type Material = Plastic
}
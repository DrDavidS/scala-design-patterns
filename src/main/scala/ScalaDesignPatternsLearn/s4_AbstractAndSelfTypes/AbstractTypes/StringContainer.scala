package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

class StringContainer(val data: String) extends ContainerAT {
  override type T = String
}

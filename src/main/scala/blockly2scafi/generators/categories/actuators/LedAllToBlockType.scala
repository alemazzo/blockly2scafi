package blockly2scafi.generators.categories.actuators

import blockly2scafi.Orders
import blockly2scafi.Orders.Order
import blockly2scafi.generables.code.GenerableInput
import blockly2scafi.generators.Generable.Generator
import blockly2scafi.generators.ValueBlockType

class LedAllToBlockType extends ValueBlockType {
  override def name: String = "led_all_to"

  override def order: Order = Orders.ORDER_ATOMIC

  override def fieldNames: Seq[String] = Seq()

  override def inputNames: Seq[String] = Seq("COLOR")

  override def generator: Generator = GenerableInput.builder
    .withInputName("COLOR")
    .withPrepend("ledAll to ")
    .build
    .generator

}

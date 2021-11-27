//[JET-Minecraft](../../index.md)/[de.jet.minecraft.tool.display.ui.panel](index.md)

# Package de.jet.minecraft.tool.display.ui.panel

## Types

| Name | Summary |
|---|---|
| [Panel](-panel/index.md) | [jvm]<br>data class [Panel](-panel/index.md)(content: [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Item](../de.jet.minecraft.tool.display.item/-item/index.md)&gt;, label: Component, lines: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), theme: [ColorType](../de.jet.minecraft.tool.display.color/-color-type/index.md), openSound: [SoundMelody](../de.jet.minecraft.tool.effect.sound/-sound-melody/index.md)?, identity: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), vendor: [Identifiable](../../../JET-Native/-j-e-t--native/de.jet.library.tool.smart.identification/-identifiable/index.md)&lt;[App](../de.jet.minecraft.structure.app/-app/index.md)&gt;, onReceiveEvent: [PanelReceiveData](-panel-receive-data/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), icon: [Item](../de.jet.minecraft.tool.display.item/-item/index.md), overridingBorderProtection: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), singleViewLimitation: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Container](../de.jet.minecraft.tool.display.ui.inventory/-container/index.md), [Cloneable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-cloneable/index.html), [Logging](../de.jet.minecraft.tool.smart/-logging/index.md) |
| [PanelFlag](-panel-flag/index.md) | [jvm]<br>enum [PanelFlag](-panel-flag/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[PanelFlag](-panel-flag/index.md)&gt; |
| [PanelReceiveData](-panel-receive-data/index.md) | [jvm]<br>data class [PanelReceiveData](-panel-receive-data/index.md)(panel: [Panel](-panel/index.md), receiver: Player, receiveParameters: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;) |
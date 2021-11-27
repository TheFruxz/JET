//[JET-Minecraft](../../../../index.md)/[de.jet.minecraft.tool.timing.tasky](../../index.md)/[Tasky](../index.md)/[Companion](index.md)

# Companion

[jvm]\
object [Companion](index.md)

## Functions

| Name | Summary |
|---|---|
| [task](task.md) | [jvm]<br>fun [task](task.md)(vendor: [App](../../../de.jet.minecraft.structure.app/-app/index.md), temporalAdvice: [TemporalAdvice](../../-temporal-advice/index.md), killAtError: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, onStart: [Tasky](../index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onStop: [Tasky](../index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onCrash: [Tasky](../index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, serviceVendor: [Identity](../../../../../JET-Native/-j-e-t--native/de.jet.library.tool.smart.identification/-identity/index.md)&lt;[Service](../../../de.jet.minecraft.structure.service/-service/index.md)&gt; = Identifiable.custom&lt;Service&gt;("dummy").identityObject, process: [Tasky](../index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Tasky](../index.md) |
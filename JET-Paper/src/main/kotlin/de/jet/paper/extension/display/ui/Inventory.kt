package de.jet.paper.extension.display.ui

import de.jet.paper.app.JetCache
import de.jet.paper.extension.paper.createKey
import de.jet.paper.extension.system
import de.jet.paper.tool.display.item.Item
import de.jet.paper.tool.display.ui.inventory.Container
import de.jet.paper.tool.display.ui.panel.Panel
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

fun buildContainer(lines: Int = 3, action: Container<*>.() -> Unit) = Container(size = lines*9).apply(action)

fun emptyContainer(lines: Int = 3) = Container(size = lines*9)

fun buildPanel(lines: Int = 3, action: Panel.() -> Unit) = Panel(lines = lines).apply(action)

fun emptyPanel(lines: Int = 3) = Panel(lines = lines)

operator fun <T : Inventory> T.get(slot: Int) = getItem(slot)

operator fun <T : Inventory> T.set(slot: Int, itemStack: ItemStack) = setItem(slot, itemStack)

operator fun <T : Inventory> T.set(slot: Int, item: Item) = setItem(slot, item.produce())

internal val panelIdentificationKey = system.createKey("panelId")

/**
 * Returns the panel, if the provided inventory is registered as a panel.
 * @return the panel, or null if it is not a completed panel
 * @author Fruxz
 * @since 1.0
 */
fun <T : Inventory> T.getPanel() = this[4]?.item?.dataGet(panelIdentificationKey)?.let { panelIdentity ->
	JetCache.completedPanels.lastOrNull { it.identity == "$panelIdentity" }
}

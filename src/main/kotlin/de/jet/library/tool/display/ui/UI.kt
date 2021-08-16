package de.jet.library.tool.display.ui

import de.jet.library.tool.smart.Identifiable
import org.bukkit.entity.HumanEntity
import org.bukkit.entity.Player

interface UI : Identifiable<UI> {

	fun display(receiver: Player)

	fun display(humanEntity: HumanEntity)

}
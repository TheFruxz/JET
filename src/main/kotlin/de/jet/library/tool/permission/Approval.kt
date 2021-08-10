package de.jet.library.tool.permission

import de.jet.library.structure.app.App
import de.jet.library.tool.smart.Identifiable
import kotlinx.serialization.Serializable
import org.bukkit.permissions.Permissible

@Serializable
data class Approval(
	override val id: String
) : Identifiable<Approval> {

	fun hasApproval(permissible: Permissible) =
		permissible.hasPermission(id)

	companion object {

		fun fromApp(vendor: Identifiable<App>, subPermission: String) =
			Approval("${vendor.id}.$subPermission")

	}

}
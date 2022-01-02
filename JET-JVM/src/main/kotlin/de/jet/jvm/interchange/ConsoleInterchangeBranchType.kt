package de.jet.jvm.interchange

import de.jet.jvm.tool.smart.identification.UUID
import de.jet.jvm.tree.TreeBranchType

/**
 * This class defines the branch types of the console interchanges.
 * @author Fruxz
 * @since 1.0
 */
class ConsoleInterchangeBranchType(identity: String = UUID.randomString()) : TreeBranchType(identity) {

	companion object {

		/**
		 * The general branch type.
		 * @author Fruxz
		 * @since 1.0
		 */
		val OBJECT = ConsoleInterchangeBranchType("OBJECT")

		/**
		 * The branch type of empty interchanges, that only define a bridge to other interchanges.
		 * @author Fruxz
		 * @since 1.0
		 */
		val BRIDGE = ConsoleInterchangeBranchType("BRIDGE")

	}

}
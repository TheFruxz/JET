package de.jet.library.tool.display.color

import de.jet.library.extension.paper.createKey
import de.jet.library.extension.system
import de.jet.library.tool.display.color.ColorType.WHITE
import org.bukkit.Material

enum class DyeableMaterial(
	val produceMaterialProcess: ColorType.() -> Material,
) {

	WOOL(ColorType::wool),
	TERRACOTTA(ColorType::terracotta),
	CONCRETE(ColorType::concrete),
	CONCRETE_POWDER(ColorType::concretePowder),
	CARPET(ColorType::carpet),
	STAINED_GLASS(ColorType::stainedGlass),
	STAINED_GLASS_PANE(ColorType::stainedGlassPane),
	SHULKER_BOX(ColorType::shulker),
	GLAZED_TERRACOTTA(ColorType::glazedTerracotta),
	BED(ColorType::bed),
	BANNER(ColorType::banner),
	BANNER_WALL(ColorType::bannerWall),
	DYE(ColorType::dyeMaterial);

	fun withColor(color: ColorType) = produceMaterialProcess(color)

	val key = system.createKey(name)

	companion object {

		fun fromMaterial(material: Material) = try {
			valueOf(material.name.substringAfter('_'))
		} catch (exception: IllegalArgumentException) {
			null
		}

		// WOOL#WHITE
		fun materialFromMaterialCode(materialCode: String): Material? {
			if (materialCode.contains('#')) {
				val split = materialCode.split('#')

				return if (split.size == 2) {

					try {
						val material = valueOf(split.first().uppercase())
						val colorType = ColorType.valueOf(split.last().uppercase())

						material.withColor(colorType)

					} catch (exception: NoSuchElementException) {
						null
					}

				} else
					null

			} else
				try {
					return valueOf(materialCode.uppercase()).withColor(WHITE)
				} catch (exception: NoSuchElementException) {
					return null
				}
		}

	}

}

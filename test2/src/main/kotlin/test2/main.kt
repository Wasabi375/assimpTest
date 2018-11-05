package test2

import assimp.*

fun main(vararg args: String) {

	val file = requireNotNull(Resources::class.java.classLoader.getResource("glasses.STEP")).file.toString()

	println(file)

	val importer = Importer()
	val result = importer.readFile(file)

	requireNotNull(result)

	println("done")
}

object Resources
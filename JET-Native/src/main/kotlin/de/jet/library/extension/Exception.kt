package de.jet.library.extension

import kotlin.random.Random

fun catchException(exception: Exception) {

	val exceptionIdentity = Random.nextInt(10000, 99999)
	val exceptionTag = "#$exceptionIdentity"
	val exceptionShort = exception.stackTrace.first().className

	println(" > $exceptionTag - $exceptionShort")
	exception.printStackTrace()
	println(" < $exceptionTag - $exceptionShort")

	// TODO: 11.07.2021 Nice error message

}

fun jetTry(catchBlock: () -> Unit = { }, tryBlock: () -> Unit) {
	try {
		tryBlock()
	} catch (e: Exception) {
		catchBlock()
		catchException(e)
	}
}
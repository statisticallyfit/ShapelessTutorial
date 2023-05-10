package temp

import shapeless.HNil

/**
 *
 */
object SmallExample extends App {


	val a = ("Hello" :: 123 :: true :: HNil).last
	// res0: Boolean = true
	val b = ("Hello" :: 123 :: true :: HNil).init
	// res1: String :: Int :: shapeless.HNil = Hello :: 123 :: HNil

	println(a)
	println(b)

}

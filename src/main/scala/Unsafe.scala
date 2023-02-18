package baovitt.unsafe4s

sealed trait UnsafeGetterError

case object IllegalAccessError extends UnsafeGetterError

object Unsafe:
    val unsafe: Either[UnsafeGetterError, sun.misc.Unsafe] =
        util.Try(UnsafeGetter.getUnsafe).toEither.left.map(_ => IllegalAccessError)
end Unsafe
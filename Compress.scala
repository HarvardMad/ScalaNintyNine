package NintyNine

/**
 * Created by LalinPethiyagoda on 04/09/2016.
 * Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced
with a single copy of the element.
The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 *
 *
 * solution:
 * use dropWhile() Drops the longest prefix of elements that satisfy a predicate.
We see the same changes to dropWhile as with takeWhile. It uses a predicate to determine how many elements to drop.

Example

List (1,3,6,5,4,2) dropWhile (x => x < 4)

// Output: List(6, 5, 4, 2)
 */
object Compress extends App{
val xs = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def compressWithDropWhile(xs:List[_]):List[_]= xs match{
      case List()=>xs
      case y::ys=>y::compressWithDropWhile(ys.dropWhile(z=>z==y))
    }

  println(compressWithDropWhile(xs))
}

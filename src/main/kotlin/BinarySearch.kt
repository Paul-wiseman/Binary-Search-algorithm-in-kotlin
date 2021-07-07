import java.util.regex.Pattern

internal object BinarySearch {

    fun binarySearch(array: Array<Int>, target: Int): Int{
        var lPointer = 0
        var rPointer = array.size-1
    while(lPointer <= rPointer) {
        var mPointer = (lPointer + rPointer) / 2
        if (array[mPointer] == target) {
            return mPointer
        } else if (target < array[mPointer]) {
            rPointer = mPointer - 1
        } else {
            lPointer = mPointer + 1
        }
    }
            return -1

    }


    // Driver code
    @JvmStatic
    fun main(args: Array<String>) {
        val array = arrayOf(0,1,21,33,45,45,61,71,72,73)
        val target = 90
        println(binarySearch(array, target))
    }
}
// 리스트 4.22  클래스 위임 사용하기

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {

    var objectsAdded = 0

    override fun add(element: T): Boolean {
	objectsAdded++
	return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
	objectsAdded += c.size
	return innerSet.addAll(c)
    }
}

val cset = CountingSet<Int>()
cset.addAll(listOf(1, 1, 2))
println("${cset.objectsAdded} objects were added, ${cset.size} remain")
// 3 objects were added, 2 remain

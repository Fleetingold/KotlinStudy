package kotlina.study.generic

fun <T : Comparable<T>> sort(list: List<T>) {
	println(list.count())
}

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
	where T : CharSequence,
		  T : Comparable<T> {
	return list.filter { it > threshold }.map { it.toString() }
}

fun main(args: Array<String>) {
	sort(listOf(1, 2, 3))
//	sort(listOf(HashMap<Int, String>()))	// 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型
}

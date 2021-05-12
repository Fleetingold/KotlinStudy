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
//	sort(listOf(HashMap<Int, String>()))	// ����HashMap<Int, String> ���� Comparable<HashMap<Int, String>> ��������
}

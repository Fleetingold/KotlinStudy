package kotlina.study.generic

class A<T>(val t: T, val t2: T, val t3: T)
class Apple(var name: String)
fun main(args: Array<String>) {
	//ʹ����
	val a1: A<*> = A(12, "String", Apple("ƻ��"))
	val a2: A<Any?> = A(12, "String", Apple("ƻ��"))
	val apple = a1.t3
	println(apple)
	val apple2 = a2.t3 as Apple
	println(apple2.name)
	//ʹ������
	val l: ArrayList<*> = arrayListOf("String", 1, 1.2f, Apple("ƻ��"))
	for (item in l) {
		println(item)
	}
}
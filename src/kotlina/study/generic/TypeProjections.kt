package kotlina.study.generic

class A<T>(val t: T, val t2: T, val t3: T)
class Apple(var name: String)
fun main(args: Array<String>) {
	//使用类
	val a1: A<*> = A(12, "String", Apple("苹果"))
	val a2: A<Any?> = A(12, "String", Apple("苹果"))
	val apple = a1.t3
	println(apple)
	val apple2 = a2.t3 as Apple
	println(apple2.name)
	//使用数组
	val l: ArrayList<*> = arrayListOf("String", 1, 1.2f, Apple("苹果"))
	for (item in l) {
		println(item)
	}
}
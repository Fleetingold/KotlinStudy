package kotlina.study.classes

//Kotlin 可以创建一个只包含数据的类
data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
	val jack = User(name = "Jack", age = 1)
	val olderJack = jack.copy(age = 2)
	println(jack)
	println(olderJack)
	
	println(jack.component1())
	println(jack.component2())
	
	val jane = User("jane", 35)
	val (name, age) = jane
	println("$name, $age years of age")
}

//标准数据类
//标准库提供了 Pair 和 Triple 。在大多数情形中，命名数据类是更好的设计选择，因为这样代码可读性更强而且提供了有意义的名字和属性。
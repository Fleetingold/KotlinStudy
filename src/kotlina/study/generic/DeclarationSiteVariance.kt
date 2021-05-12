package kotlina.study.generic

//声明处的类型变异使用协变注解修饰符：in、out，消费者 in, 生产者 out。

//1.使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型：
// 定义一个支持协变的类
class RunoobOut<out A>(val a: A) {
	fun foo(): A {
		return a
	}
}

fun mainOut(args: Array<String>) {
	println(args.count())
	var strCo: RunoobOut<String> = RunoobOut("a")
	var anyCo: RunoobOut<String> = strCo
	println(anyCo.foo())
}

//2.in 使得一个类型参数逆变，逆变类型参数只能用作输入，可以作为入参的类型但是无法作为返回值的类型：
// 定义一个支持逆变的类
class RunoobIn<in A>() {
	fun foo(a: A) {
		println(a)
	}
}

fun main(args: Array<String>) {
	var anyDCo = RunoobIn<String>()
	var strDCo = anyDCo
	strDCo.foo("a")
}
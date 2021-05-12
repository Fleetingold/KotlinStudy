package kotlina.study.delegates

val lazyValue: String by lazy {
	println("computed")
	"Hello"
}

fun main(args: Array<String>) {
	println(lazyValue) //第一次执行，执行两次输出表达式
	println(lazyValue) //第二次执行，只输出返回值
}
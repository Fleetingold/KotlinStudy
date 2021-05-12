package kotlina.study.delegates

import kotlin.properties.Delegates

class User {
	var name: String by Delegates.observable("初始值") {
		prop, old, new ->
		println("属性: ${prop.name} 旧值: $old -> 新值: $new")
	}
}

fun main(args: Array<String>) {
	println("Hello Kotlin World!")
	var user = User()
	user.name = "第一次赋值"
	user.name = "第二次赋值"
}
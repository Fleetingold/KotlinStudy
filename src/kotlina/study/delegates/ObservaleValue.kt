package kotlina.study.delegates

import kotlin.properties.Delegates

class User {
	var name: String by Delegates.observable("��ʼֵ") {
		prop, old, new ->
		println("����: ${prop.name} ��ֵ: $old -> ��ֵ: $new")
	}
}

fun main(args: Array<String>) {
	println("Hello Kotlin World!")
	var user = User()
	user.name = "��һ�θ�ֵ"
	user.name = "�ڶ��θ�ֵ"
}
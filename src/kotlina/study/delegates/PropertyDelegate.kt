package kotlina.study.delegates

import kotlin.reflect.KProperty

// 定义包含属性委托的类
class Example {
	var p: String by Delegate()
}

// 委托的类
class Delegate {
	operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
		return "$thisRef, 这里委托了 ${property.name} 属性"
	}
	
	operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
		println("$thisRef 的 ${property.name} 属性赋值为 $value")
	}
}

fun main(args: Array<String>) {
	val e = Example()
	println(e.p)
	
	e.p = "Runoob"
	println(e.p)
}
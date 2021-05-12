package kotlina.study.delegates

import kotlin.reflect.KProperty

// �����������ί�е���
class Example {
	var p: String by Delegate()
}

// ί�е���
class Delegate {
	operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
		return "$thisRef, ����ί���� ${property.name} ����"
	}
	
	operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
		println("$thisRef �� ${property.name} ���Ը�ֵΪ $value")
	}
}

fun main(args: Array<String>) {
	val e = Example()
	println(e.p)
	
	e.p = "Runoob"
	println(e.p)
}
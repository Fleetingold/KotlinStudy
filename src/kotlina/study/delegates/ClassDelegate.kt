package kotlina.study.delegates

// �����ӿ�
interface Base {
	fun print()
}

// ʵ�ִ˽ӿڵı�ί�е���
class BaseImpl(val x: Int) : Base {
	override fun print() { print(x) }
}

// ͨ���ؼ��� by ����ί����
class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
	val b = BaseImpl(10)
	val derived = Derived(b)
	derived.print()
}
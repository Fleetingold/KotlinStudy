package kotlina.study.delegates

val lazyValue: String by lazy {
	println("computed")
	"Hello"
}

fun main(args: Array<String>) {
	println(lazyValue) //��һ��ִ�У�ִ������������ʽ
	println(lazyValue) //�ڶ���ִ�У�ֻ�������ֵ
}
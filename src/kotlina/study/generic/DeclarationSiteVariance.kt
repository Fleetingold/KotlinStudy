package kotlina.study.generic

//�����������ͱ���ʹ��Э��ע�����η���in��out�������� in, ������ out��

//1.ʹ�� out ʹ��һ�����Ͳ���Э�䣬Э�����Ͳ���ֻ�����������������Ϊ����ֵ���͵����޷���Ϊ��ε����ͣ�
// ����һ��֧��Э�����
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

//2.in ʹ��һ�����Ͳ�����䣬������Ͳ���ֻ���������룬������Ϊ��ε����͵����޷���Ϊ����ֵ�����ͣ�
// ����һ��֧��������
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
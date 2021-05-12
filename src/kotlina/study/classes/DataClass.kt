package kotlina.study.classes

//Kotlin ���Դ���һ��ֻ�������ݵ���
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

//��׼������
//��׼���ṩ�� Pair �� Triple ���ڴ���������У������������Ǹ��õ����ѡ����Ϊ��������ɶ��Ը�ǿ�����ṩ������������ֺ����ԡ�
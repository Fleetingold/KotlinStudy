package kotlina.study.basic

fun main(args: Array<String>) {
	var x = 0
    if(x>0){
        println("x ���� 0")
    }else if(x==0){
        println("x ���� 0")
    }else{
        println("x С�� 0")
    }

    var a = 1
    var b = 2
    val c = if (a>=b) a else b
    println("c ��ֵΪ $c")
	
	x = 5
    if (x in 1..8) {
        println("x ��������")
    }
	
	//When ���ʽ
	when (x) {
		1 -> println("x == 1")
		2 -> println("x == 2")
		else -> { // ע�������
			println("x ���� 1 ��Ҳ���� 2")
		}
	}
	
	when (x) {
		0, 1 -> println("x == 0 or x == 1")
		else -> println("otherwise")
	}
	
	when (x) {
		in 1..10 -> println("x is in the range")
		!in 10..20 -> println("x is outside the range")
		else -> println("none of the above")
	}
	
	x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // ע�������
            println("x ���� 1 ��Ҳ���� 2")
        }
    }

    when (x) {
        in 0..10 -> println("x �ڸ����䷶Χ��")
        else -> println("x ���ڸ����䷶Χ��")
    }
	
	val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}
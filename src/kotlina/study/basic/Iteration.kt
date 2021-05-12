package kotlina.study.basic

fun main(args: Array<String>) {
	//1.For ѭ��
	val items = listOf("apple", "banana", "kiwi")
	for (item in items) {
		println(item)
	}
	
	for (index in items.indices) {
		println("item at $index is ${items[index]}")
	}
	
	for (i in 1..4) print(i) // ��ӡ���Ϊ: "1234"
	for (i in 4 downTo 1) print(i) // ��ӡ���Ϊ: "4321"
	for (i in 1..4 step 2) print(i) // ��ӡ���Ϊ: "13"
	for (i in 4 downTo 1 step 2) print(i) // ��ӡ���Ϊ: "42"
	for (i in 1 until 10) { // i in [1, 10), ������ 10
     println(i)
	}
	
	//2.while �� do...while ѭ��
	println("----while ʹ��-----")
    var x = 5
    while (x > 0) {
        println( x--)
    }
    println("----do...while ʹ��-----")
    var y = 5
    do {
        println(y--)
    } while(y>0)
	
	//3.���غ���ת
	println("----���غ���ת-----")
	for (i in 1..10) {
        if (i==3) continue  // i Ϊ 3 ʱ������ǰѭ����������һ��ѭ��
        println(i)
        if (i>5) break   // i Ϊ 6 ʱ ����ѭ��
    }
	
	//4.Break �� Continue ��ǩ
	println("----Break �� Continue ��ǩ-----")
	loop@ for (i in 1..100) {
		for (j in 1..100) {
			println("i is $i,j is $j")
			if (j>5) break@loop
		}
	}
}
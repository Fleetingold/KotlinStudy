package kotlina.study.basic

fun main(args: Array<String>) {
	//1.For 循环
	val items = listOf("apple", "banana", "kiwi")
	for (item in items) {
		println(item)
	}
	
	for (index in items.indices) {
		println("item at $index is ${items[index]}")
	}
	
	for (i in 1..4) print(i) // 打印结果为: "1234"
	for (i in 4 downTo 1) print(i) // 打印结果为: "4321"
	for (i in 1..4 step 2) print(i) // 打印结果为: "13"
	for (i in 4 downTo 1 step 2) print(i) // 打印结果为: "42"
	for (i in 1 until 10) { // i in [1, 10), 不包含 10
     println(i)
	}
	
	//2.while 与 do...while 循环
	println("----while 使用-----")
    var x = 5
    while (x > 0) {
        println( x--)
    }
    println("----do...while 使用-----")
    var y = 5
    do {
        println(y--)
    } while(y>0)
	
	//3.返回和跳转
	println("----返回和跳转-----")
	for (i in 1..10) {
        if (i==3) continue  // i 为 3 时跳过当前循环，继续下一次循环
        println(i)
        if (i>5) break   // i 为 6 时 跳出循环
    }
	
	//4.Break 和 Continue 标签
	println("----Break 和 Continue 标签-----")
	loop@ for (i in 1..100) {
		for (j in 1..100) {
			println("i is $i,j is $j")
			if (j>5) break@loop
		}
	}
}
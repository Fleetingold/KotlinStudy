package kotlina.study.basic

fun main(args: Array<String>) {
	var x = 0
    if(x>0){
        println("x 大于 0")
    }else if(x==0){
        println("x 等于 0")
    }else{
        println("x 小于 0")
    }

    var a = 1
    var b = 2
    val c = if (a>=b) a else b
    println("c 的值为 $c")
	
	x = 5
    if (x in 1..8) {
        println("x 在区间内")
    }
	
	//When 表达式
	when (x) {
		1 -> println("x == 1")
		2 -> println("x == 2")
		else -> { // 注意这个块
			println("x 不是 1 ，也不是 2")
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
        else -> { // 注意这个块
            println("x 不是 1 ，也不是 2")
        }
    }

    when (x) {
        in 0..10 -> println("x 在该区间范围内")
        else -> println("x 不在该区间范围内")
    }
	
	val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}
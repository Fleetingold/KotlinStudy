package kotlina.study.basic

//Kotlin 的基本数值类型包括 Byte、Short、Int、Long、Float、Double 等。
//不同于 Java 的是，字符不属于数值类型，是一个独立的数据类型。

//Double
//Float
//Long
//Int
//Short
//Byte

fun main(args: Array<String>) {
	val oneMillion = 1_000_000
	val creditCardNumber = 1234_5678_9012_3456L
	val socialSecurityNumber = 999_99_9999L
	val hexBytes = 0xFF_EC_DE_5E
	val bytes = 0b11010010_01101001_10010100_10010010
	
	val a: Int = 10000
    println(a === a) // true，值相等，对象地址相等

    //经过了装箱，创建了两个不同的对象
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    //虽然经过了装箱，但是值是相等的，都是10000
    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
    println(boxedA == anotherBoxedA) // true，值相等
	
	val b: Byte = 1 // OK, 字面值是静态检测的
	val i: Int = b.toInt() // OK
	
	//每种数据类型都有下面的这些方法，可以转化为其它的类型：
	//toByte(): Byte
	//toShort(): Short
	//toInt(): Int
	//toLong(): Long
	//toFloat(): Float
	//toDouble(): Double
	//toChar(): Char
	
	val l = 1L + 3 // Long + Int => Long
	
	//[1,2,3]
    val ar = arrayOf(1, 2, 3)
    //[0,2,4]
    val br = Array(3, { i -> (i * 2) })

    //读取数组内容
    println(ar[0])    // 输出结果：1
    println(br[1])    // 输出结果：2
	
	val x: IntArray = intArrayOf(1, 2, 3)
	x[0] = x[1] + x[2]
	
	 val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """
    println(text)   // 输出有一些前置空格
	
	val vi = 10
    val s = "i = $vi" // 求值结果为 "i = 10"
    println(s)
	
	val s2 = "runoob"
    val str = "$s2.length is ${s2.length}" // 求值结果为 "runoob.length is 6"
    println(str)
	
	val price = """
    ${'$'}9.99
    """
    println(price)  // 求值结果为 $9.99
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显式转换为数字
}


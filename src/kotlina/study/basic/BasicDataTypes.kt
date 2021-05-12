package kotlina.study.basic

//Kotlin �Ļ�����ֵ���Ͱ��� Byte��Short��Int��Long��Float��Double �ȡ�
//��ͬ�� Java ���ǣ��ַ���������ֵ���ͣ���һ���������������͡�

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
    println(a === a) // true��ֵ��ȣ������ַ���

    //������װ�䣬������������ͬ�Ķ���
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    //��Ȼ������װ�䣬����ֵ����ȵģ�����10000
    println(boxedA === anotherBoxedA) //  false��ֵ��ȣ������ַ��һ��
    println(boxedA == anotherBoxedA) // true��ֵ���
	
	val b: Byte = 1 // OK, ����ֵ�Ǿ�̬����
	val i: Int = b.toInt() // OK
	
	//ÿ���������Ͷ����������Щ����������ת��Ϊ���������ͣ�
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

    //��ȡ��������
    println(ar[0])    // ��������1
    println(br[1])    // ��������2
	
	val x: IntArray = intArrayOf(1, 2, 3)
	x[0] = x[1] + x[2]
	
	 val text = """
    |�����ַ���
    |����̳�
    |�����ַ���
    |Runoob
    """
    println(text)   // �����һЩǰ�ÿո�
	
	val vi = 10
    val s = "i = $vi" // ��ֵ���Ϊ "i = 10"
    println(s)
	
	val s2 = "runoob"
    val str = "$s2.length is ${s2.length}" // ��ֵ���Ϊ "runoob.length is 6"
    println(str)
	
	val price = """
    ${'$'}9.99
    """
    println(price)  // ��ֵ���Ϊ $9.99
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // ��ʽת��Ϊ����
}


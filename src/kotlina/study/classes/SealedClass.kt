package kotlina.study.classes

//密封类用来表示受限的类继承结构：当一个值为有限几种的类型, 而不能有任何其他类型时。
//在某种意义上，他们是枚举类的扩展：枚举类型的值集合 也是受限的，但每个枚举常量只存在一个实例，而密封类 的一个子类可以有可包含状态的多个实例。
sealed class Expr

data class Const(val number: Double) : Expr()

data class Sum(val e1: Expr, val e2: Expr) : Expr()

object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
	is Const -> expr.number
	is Sum -> eval(expr.e1) + eval(expr.e2)
	NotANumber -> Double.NaN
}

sealed class UiOp {
	object Show: UiOp()
	object Hide: UiOp()
	class TranslateX(val px: Float): UiOp()
	class TranslateY(val px: Float): UiOp()
}

class View(var value: Int = 0) {
	var visibility: View = View(0);
	var translationX: Float = 0f
	var translationY: Float = 0f
	companion object {
		var VISIBLE = View(1)
		var GONE = View(-1)
	}
}

fun execute(view: View, op: UiOp) = when (op) {
	UiOp.Show -> view.visibility = View.VISIBLE
	UiOp.Hide -> view.visibility = View.GONE
	is UiOp.TranslateX -> view.translationX = op.px
	is UiOp.TranslateY -> view.translationY = op.px
}

//先封装一个UI操作列表
class Ui(val uiOps: List<UiOp> = emptyList()) {
	operator fun plus(uiOp: UiOp) = Ui(uiOps + uiOp)
}

val ui = Ui() +
		UiOp.Show +
		UiOp.TranslateX(20f) +
		UiOp.TranslateY(40f) +
		UiOp.Hide

// 定义调用的函数
fun run(view: View, ui: Ui) {
	ui.uiOps.forEach { execute(view, it) }
}

fun main(args: Array<String>) {
	run(View(), ui)	
}
package kotlina.study.classes

//�ܷ���������ʾ���޵���̳нṹ����һ��ֵΪ���޼��ֵ�����, ���������κ���������ʱ��
//��ĳ�������ϣ�������ö�������չ��ö�����͵�ֵ���� Ҳ�����޵ģ���ÿ��ö�ٳ���ֻ����һ��ʵ�������ܷ��� ��һ����������пɰ���״̬�Ķ��ʵ����
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

//�ȷ�װһ��UI�����б�
class Ui(val uiOps: List<UiOp> = emptyList()) {
	operator fun plus(uiOp: UiOp) = Ui(uiOps + uiOp)
}

val ui = Ui() +
		UiOp.Show +
		UiOp.TranslateX(20f) +
		UiOp.TranslateY(40f) +
		UiOp.Hide

// ������õĺ���
fun run(view: View, ui: Ui) {
	ui.uiOps.forEach { execute(view, it) }
}

fun main(args: Array<String>) {
	run(View(), ui)	
}
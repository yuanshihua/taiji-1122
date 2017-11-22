# 课后笔记
1，函数式接口
	接口中只有一个方法，称为函数式接口。JavaSE1.7常见的有
	java.lang.Runnable
	java.util.concurrent.Callable
	java.security.PrivilegedAction
	java.util.Comparator
	java.io.FileFilter
	java.beans.PropertyChangeListener
	1.8新增了一个包
	java.util.function，其中包含的方法有：
		Predicate<T>——接收 T 并返回 boolean
		Consumer<T>——接收 T，不返回值
		Function<T, R>——接收 T，返回 R
		Supplier<T>——提供 T 对象（例如工厂），不接收值
		UnaryOperator<T>——接收 T 对象，返回 T
		BinaryOperator<T>——接收两个 T，返回 T
2，lambda表达式
	lambda 表达式的语法由参数列表、箭头符号 -> 和函数体组成。函数体既可以是一个表达式，也可以是一个语句块：
	表达式：表达式会被执行然后返回执行结果。
	语句块：语句块中的语句会被依次执行，就像方法中的语句一样——return 语句会把控制权交给匿名方法的调 	用者
	break 和 continue 只能在循环中使用
	如果函数体有返回值，那么函数体内部的每一条路径都必须返回值
3，理解
	lambda表达式就是将函数式接口中的方法以具体的实现的形式表达出来，不需要再新建一个实现类，或者是匿名内部类。

	
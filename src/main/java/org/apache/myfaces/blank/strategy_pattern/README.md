## 策略模式

- what - 什么是策略模式

1. 通过定义算法家族并分别封装起来，可以让他们之间相互替换，此模式让算法的变化不会影响到使用算法的客户。

2. 策略模式是一系列定义算法的方法。从概念上讲，所有这些算法完成的都是相同的工作，只是实现不同。调用者可以用相同的方式调用所有的方法。减少了各种算法与算法使用类之间的耦合。 

- why - 为什么要使用策略模式

### 1. 解耦，策略模式相比简单工厂模式来说，外界需要了解的class更少

Simple_factory:

[![](https://i.loli.net/2019/04/30/5cc7cb75e634e.png)](https://i.loli.net/2019/04/30/5cc7cb75e634e.png)

Strategy:

[![](https://i.loli.net/2019/04/30/5cc7cb22090e5.png)](https://i.loli.net/2019/04/30/5cc7cb22090e5.png)

从上面两段代码的对比中可以看出，简单工厂模式（Simple Factory）需要调用者去了解`Operator.java`和`OperatorFactory.java`这两个类，策略模式(Strategy)需要调用方去了解`CashContext.java`即可。两者的后台逻辑与调用方的耦合度相比而言，策略模式显然代码耦合度更低，代码更加灵活和易于修改，并且不会影响调用方。

### 2. 可重用，策略模式的Strategy类层次为Context定义了一系列可重用的算法或行为。继承有助于析取出这些算法中的公共功能。

[![](https://i.loli.net/2019/04/30/5cc7ce65ddb6e.png)](https://i.loli.net/2019/04/30/5cc7ce65ddb6e.png)

从上图中可以看出，CashContext构造方法中，针对不同的情况，为CashContext.CashSuper属性赋予了不同的对象引用。同时抽象出了三种收费算法的公共功能`getResult(String money)`。

### 3. 简化单元测试

[![](https://i.loli.net/2019/04/30/5cc7cf2d2c783.png)](https://i.loli.net/2019/04/30/5cc7cf2d2c783.png)

同一个接口下有不同的实现，每个实现相互独立，这样在未来的维护和迭代中，新增的算法/功能并不会影响原有的功能。同样，每个实现都可以有自己的测试类。可以对自己的接口单独测试。

**策略模式封装了变化**

项目源码Git地址：https://github.com/CengSin/design_pattern/tree/master/src/main/java/org/apache/myfaces/blank/strategy_pattern
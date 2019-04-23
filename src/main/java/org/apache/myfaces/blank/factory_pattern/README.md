前言：

在上一家公司的时候，发现很多代码中会大量使用重复代码，大量的if{...}else{...}结构，导致代码阅读性极差。同时上家公司我的leader也经常督促我，让我注意代码的整洁度，可阅读性，可拓展性。由此我开始了解java中的设计模式。

假设现在要做一个需求：
> 要求做一个控制台计算器，能够输入两个数字和运算符，得到计算结果。

我们可以这样写：

[![](https://i.loli.net/2019/04/23/5cbed521e0b9e.png)](https://i.loli.net/2019/04/23/5cbed521e0b9e.png)

这就是典型的面向过程的写法。代码中的问题有：
- 命名不够规范，a，b这种命名会让人在之后的代码中不理解这是做什么的。
- 多次使用了if{...}else{...}。这样意味着每个if都会做判断，等于做了多次无用功。
- 除法中没有对可能出现的异常进行处理，例如，除数为0的情况下。

针对以上问题我们修改之后变成:

[![](https://i.loli.net/2019/04/23/5cbed6483d16b.png)](https://i.loli.net/2019/04/23/5cbed6483d16b.png)

可以看到代码中命名变得规范了，同时也去掉了大量的if{...}else{...}，同时对可能发生的异常进行了处理try...catch(Exception e){...}。*但是，此时项目中其他地方也要用到计算器代码*，我们难道要重新写一遍相同的代码吗？这样会造成下面的问题：
- 代码冗余性过高
- 相同的问题多次出现
- 代码复用性变差

所以要将界面(CalculatorOop.java)和操作(Operator.java)分开来写。将操作封装起来，一边其他地方使用的使用可以直接调用该操作。

### 面向对象编程（OOP）

#### Operator.java
[![](https://i.loli.net/2019/04/23/5cbed7aeb051e.png)](https://i.loli.net/2019/04/23/5cbed7aeb051e.png)

#### CalculatorOop.java
[![](https://i.loli.net/2019/04/23/5cbed8171cb7f.png)](https://i.loli.net/2019/04/23/5cbed8171cb7f.png)

面向对象编程的特性：*封装，继承，多态*。我们在之前的代码中使用了封装，将计算操作封装在了Operator.java中。看起来已经没有问题了，但是在实际的项目中，肯定会在原有的功能基础上添加新的功能。如果采用上面的写法，就会导致在添加新功能的同时，也编译了旧的没有变动的功能。这样可能会造成：
- 原有的运行良好的功能出现了问题

所以我们使用*继承，多态*来解耦操作与操作之间的关系。并且使用*简单工程模式使程序变得更加灵活*。

- 首先定义一个所有操作的父类
#### Operator.java
[![](https://i.loli.net/2019/04/23/5cbeda0a588aa.png)](https://i.loli.net/2019/04/23/5cbeda0a588aa.png)

- 针对不同的操作，重写它的getResult(){...}方法
#### OperatorAdd.java
[![](https://i.loli.net/2019/04/23/5cbeda8121734.png)](https://i.loli.net/2019/04/23/5cbeda8121734.png)

其他（减法，乘法，除法）等操作也同样重写此方法即可。

- 创建一个操作工厂类，能够根据运算符决定实例化哪个操作。
#### OperatorFactory.java
[![](https://i.loli.net/2019/04/23/5cbedb20590ae.png)](https://i.loli.net/2019/04/23/5cbedb20590ae.png)

- 进行输入，输出，计算等操作（界面）
#### Calculator.java
[![](https://i.loli.net/2019/04/23/5cbedb91f1a5f.png)](https://i.loli.net/2019/04/23/5cbedb91f1a5f.png)

具体Demo实现见：https://github.com/CengSin/design_pattern

面向对象编程中**使用封装，继承，多态降低代码之间的耦合度**，并且使用**设计模式使程序更加灵活，便于修改，并且容易复用**。
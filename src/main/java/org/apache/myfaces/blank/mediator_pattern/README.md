## 中介者模式（Mediator Pattern）

### 什么是中介者模式

wiki : 中介者模式定义了一个中介者对象，该对象中封装了系统中对象间的交互方式。促进类间的松耦合，使得类间交互关系本身可以独立的修改。客户类通过中介者给其他客户类发送消息，并且通过中介者引发的事件收到消息。

Graphic Design Pattern : 用一个中介对象来封装一系列的对象交互，中介者使得对象间不需要显式的相互引用，从而使其松耦合，并且可以独立改变它们之间的交互。中介者模式又称为调停者模式。

### 为什么要使用中介者模式

中介者模式可以解决什么问题？

* 避免一组相互调用的对象之间出现紧耦合
* 能够独立的改变一组对象间的交互关系而不影响其他对象

中介者模式如何解决上述问题？

* 定义一个独立的中介者（调解员）对象，封装一组对象间的交互关系
* 对象将自己的交互委托给中介者进行，避免与其他对象直接交互

### 中介者模式中都有哪些角色（类）

#### uml类图
![](http://www.plantuml.com/plantuml/png/lP4nIy0m48Nt_8eRMpG5dKLgdJkvk9xf4G9f8hchICN_Rb5xWgcBGpE5t9VtxjtrB5XacQF19vQ2Ji15P8QHfe2I2xmPsCu5v6SgA26dva5AI1vcOaPFbt2VOoJq2u7RRwrvDxyL5LD9fZIDx6l1JtxxjQxjDrh8KNYXYlvosWsIAoIahTEhR0vL5dlKyTNVfUkgr7MTHX1zVcpQVysgJg3KdMOuRNfgD9pX_IDjxQqkofY3ITnOMwsuvePZhgSqBNFy0000)

### 中介者模式实现

见代码 `MediatorTestMain`

### 参考

https://zh.wikipedia.org/wiki/%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F

https://design-patterns.readthedocs.io/zh_CN/latest/behavioral_patterns/mediator.html


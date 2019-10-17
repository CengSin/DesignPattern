## 状态模式

## 什么是状态模式

wiki : 状态模式是行为设计模式，当对象内部状态发生变化时，允许对象改变其行为。状态模式与策略模式相似，可以通过调用模式接口中定义的方法来切换行为。

状态模式在内部封装了同一对象不同时期的不同行为，这使得在对象运行期间改变其行为更加简洁，无需使用分支（if...else...），提高了可维护性。

Graphic Design Pattern : 允许对象在其内部状态发生改变时改变它的行为，对象在不同状态下的调用看起来是不一样的，就像被换了一个新的类一样。这个对象被称为状态对象，状态模式是一种对象行为模式。

### uml描述状态模式

![](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKhEIImkLWWkIIn9TSxFAqcjA56evb9GKD25Y2aKWqYGWBP2KMfXQMfnYOOcX5kSMW9Mee6aK9EhbeihBn_8pKbDAr6mKdYwVkVJ9TEUzgzwDclBiptzoFOytxYRYoingRYaA36vH0797GhL40io4lDISb8rm6OYIOSM5AGMAG0DICrB8Kw7JtvvEJ5QK491InSQ15mEG5t0e080)

## 为什么要使用状态模式

在某些情况下，对象的状态对导致对象处理的逻辑（行为）不同。此时如果使用if...else...去判断，容易导致客户类与类库大量耦合，同样大量的分支也会降低代码的可维护性。

使用状态模式，对象在状态（属性）不同的情况下使用不同的处理逻辑，避免了代码中的大量耦合和分支，提高了代码的简洁度和可维护性。

## 状态模式的缺陷与优点

## 总结

状态模式的思想要点在于：对象在不同的行为处理之后，行为类会修改环境类中的行为属性，之后环境类再次调用，就会出现不同的行为。

```java
stateContext.setState(new StateNew())
```

同样，在初始情况下，要为StateContext赋值一个默认值。


参考文档：

https://design-patterns.readthedocs.io/zh_CN/latest/behavioral_patterns/state.html#id12

https://en.wikipedia.org/wiki/State_pattern
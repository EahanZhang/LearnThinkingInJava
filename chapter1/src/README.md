## 相关包作用说明

## 1. upcasting and downcast
### 1.1 向上转型和向下转型
> **向上转型**是指将导出类看做其基类的过程

> **向下转型**是指将基类向下转化成更具体的类的过程， 该过程中可能会有危险

> **参数化类型**，又称为泛型，用于安全的将基类向下转化成更具体的类型

### 1.2 本包测试了向上转型(upcast)
> Shape 是接口

> Circle, Line 和 Rectangle均实现了Shape接口

> ShapeController通过doSomething()方法实现对Shape对象的调用

> Main新建了Circle, Line, Rectangle和ShapeController对象,并调用了ShapeController中的doSomething方法
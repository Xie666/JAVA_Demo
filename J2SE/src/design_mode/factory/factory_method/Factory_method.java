package design_mode.factory.factory_method;

import design_mode.factory.bean.Sample;

/**
 * 工厂模式2：工厂方法模式
 *
 * 工厂方法模式：是简单工厂的模式的进一步抽象化和推广，工厂方法模式里不在由一个工厂类决定哪一个产品类应该被实例化
 * 这个交给抽象工厂的的子类去做。
 *
 * 组成：
 * 抽象工厂角色：这个是工厂方法模式的核心,它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口实现
 *Factory_method即为抽象工厂角色。
 *具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应具体的对象。如new Factory_methodB();
 *
 *抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口实现。
 *具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体类来实现。
 *
 *
 * 可以看出工厂方法的加入，使对象的数量成倍增长。当产品种类非常多时，会出现大量的与之对应的工厂对象，这不是我们所希望的。因为如果不能避免
 * 这种情况，可以考虑使用简单工厂模式与工厂方法啊模式相结合减少工厂类：即对产品树上类似的种类（一般是树的叶子中互为兄弟的）使用简单工程模式。
 *
 *
 简单工厂和工厂方法模式的比较：
 工厂方法模式和简单工厂模式在定义上的不同是很明显的。工厂方法模式的核心是一个抽象工厂类,而不像简单工厂模式, 把核心放在一个实类上。工厂方法模式可以允许很多实的工厂类从抽象工厂类继承下来, 从而可以在实际上成为多个简单工厂模式的综合,从而推广了简单工厂模式。
 反过来讲,简单工厂模式是由工厂方法模式退化而来。设想如果我们非常确定一个系统只需要一个实的工厂类, 那么就不妨把抽象工厂类合并到实的工厂类中去。而这样一来,我们就退化到简单工厂模式了
 */
public interface Factory_method {
    Sample create();
}
## design-pattern 设计模式
> 关于设计模式的学习，书中源码来源于《大话设计模式》和网络

### 1.包说明
|包名|设计模式|
|----|----|
|adapter|适配器模式|
|bridge|桥接模式|
|builder|建造者模式|
|chain|责任链模式|
|command|命令模式|
|composite|组合模式|
|decorator|装饰者模式|
|facade|外观模式|
|flyweight|享元模式|
|interpreter|解释器模式|
|iterator|迭代器模式|
|mediator|中介者模式|
|memento|备忘录模式|
|observer|观察者模式|
|prototype|原型模式|
|proxy|代理模式|
|singleton|单例模式|
|state|状态模式|
|strategy|策略模式|
|template|模板方法模式|
|visitor|访问者模式|

### 2.分类
<table>
    <tr>
        <th>分类</th> <th>设计模式</th> <th>简述</th> <th>归纳</th> <th>目的</th>
    </tr>
    <tr>
        <td rowspan="4">创建型设计模式（简单来说就是用来创建对象的）</td> 
        <td>工厂模式（Factory Pattern）</td> 
        <td>不同条件下创建不同实例</td>
        <td>产品标准化，生产更高效</td>
        <td>封装创建细节</td>
    </tr>
    <tr>
        <td>单例模式（Singleton Pattern）</td> 
        <td>保证一个类仅有一个实例，并且提供一个全局访问点</td>
        <td>世上只有一个我</td>
        <td>保证独一无二</td>
    </tr>
    <tr>
        <td>原型模式（Prototype Pattern）</td> 
        <td>通过拷贝原型创建新的对象</td>
        <td>拔一根猴毛，吹出千万个</td>
        <td>高效创建对象</td>
    </tr>
    <tr>
        <td>建造者模式（Builder Pattern）</td> 
        <td>用来创建复杂的复合对象</td>
        <td>高配中配和低配，想选哪配就哪配</td>
        <td>开放个性配置步骤</td>
    </tr>
    <tr>
        <td rowspan="7">结构型设计模式（关注类和对象的组合）</td> 
        <td>代理模式（Proxy Pattern）</td> 
        <td>为其他对象提供一种代理以控制对这个对象的访问</td>
        <td>没有资源没时间，得找别人来帮忙</td>
        <td>增强职责</td>
    </tr>
    <tr>
        <td>外观模式（Facade Pattern）</td> 
        <td>对外提供一个统一的接口用来访问子系统</td>
        <td>打开一扇门，通向全世界</td>
        <td>统一访问入口</td>
    </tr>
    <tr>
        <td>装饰器模式（Decorator Pattern）</td> 
        <td>为对象添加新功能</td>
        <td>他大舅他二舅都是他舅</td>
        <td>灵活扩展、同宗同源</td>
    </tr>
    <tr>
        <td>享元模式（Flyweight Pattern）</td> 
        <td>使用对象池来减少重复对象的创建</td>
        <td>优化资源配置，减少重复浪费</td>
        <td>共享资源池</td>
    </tr>
    <tr>
        <td>组合模式（Composite Pattern）</td> 
        <td>将整体与局部（树形结构）进行递归组合，让客户端能够以一种的方式对其进行处理</td>
        <td>人在一起叫团伙，心在一起叫团队</td>
        <td>统一整体和个体</td>
    </tr>
    <tr>
        <td>适配器模式（Adapter Pattern）</td> 
        <td>将原来不兼容的两个类融合在一起</td>
        <td>万能充电器</td>
        <td>兼容转换</td>
    </tr>
    <tr>
        <td>桥接模式（Bridge Pattern）</td> 
        <td>将两个能够独立变化的部分分离开来</td>
        <td>约定优于配置</td>
        <td>不允许用继承</td>
    </tr>
    <tr>
        <td rowspan="11">行为型设计模式（关注对象之间的通信）</td> 
        <td>模板模式（Template Pattern）</td> 
        <td>定义一套流程模板，根据需要实现模板中的操作</td>
        <td>流程全部标准化，需要微调请覆盖</td>
        <td>逻辑复用</td>
    </tr>
    <tr>
        <td>策略模式（Strategy Pattern）</td> 
        <td>封装不同的算法，算法之间能互相替换</td>
        <td>条条大道通罗马，具体哪条你来定</td>
        <td>把选择权交给用户</td>
    </tr>
    <tr>
        <td>责任链模式（Chain of Responsibility Pattern）</td> 
        <td>拦截的类都实现统一接口，每个接收者都包含对下一个接收者的引用。将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止</td>
        <td>各人自扫门前雪，莫管他们瓦上霜</td>
        <td>解耦处理逻辑</td>
    </tr>
    <tr>
        <td>迭代器模式（Iterator Pattern）</td> 
        <td>提供一种方法顺序访问一个聚合对象中的各个元素</td>
        <td>流水线上坐一天，每个包裹扫一遍</td>
        <td>统一对集合的访问方式</td>
    </tr>
    <tr>
        <td>命令模式（Command Pattern）</td> 
        <td>将请求封装成命令，并记录下来，能够撤销与重做</td>
        <td>运筹帷幄之中，决胜千里之外</td>
        <td>解耦请求和处理</td>
    </tr>
    <tr>
        <td>状态模式（State Pattern）</td> 
        <td>根据不同的状态做出不同的行为</td>
        <td>状态驱动行为，行为决定状态</td>
        <td>绑定状态和行为</td>
    </tr>
    <tr>
        <td>备忘录模式（Memento Pattern）</td> 
        <td>保存对象的状态，在需要时进行恢复</td>
        <td>失足不成千古恨，想重来时就重来</td>
        <td>备份、后悔机制</td>
    </tr>
    <tr>
        <td>中介者模式（Mediator Pattern）</td> 
        <td>将对象之间的通信关联关系封装到一个中介类中单独处理，从而使其耦合松散</td>
        <td>联系方式我给你，怎么搞定我不管</td>
        <td>统一管理网状资源</td>
    </tr>
    <tr>
        <td>解释器模式（Interpreter Pattern）</td> 
        <td>给定一个语言，定义它的语法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子</td>
        <td>我想说”方言“，一切解释权都归我</td>
        <td>实现特定语法解析</td>
    </tr>
    <tr>
        <td>观察者模式（Observer Pattern）</td> 
        <td>状态发生改变时通知观察者，一对多的关系</td>
        <td>到点就通知我</td>
        <td>解耦观察者与被观察者</td>
    </tr>
    <tr>
        <td>访问者模式（Visitor Pattern）</td> 
        <td>稳定数据结构，定义新的操作行为</td>
        <td>横看成岭侧成峰，远近高低各不同</td>
        <td>解耦数据结构和数据操作</td>
    </tr>
    <tr>
        <td></td> 
        <td>委派模式（Delegate Pattern）</td> 
        <td>允许对象组合实现与继承相同的代码重用，负责任务的调用和分配</td>
        <td>这个需求很简单，怎么实现我不管</td>
        <td>只对结果负责</td>
    </tr>
</table>

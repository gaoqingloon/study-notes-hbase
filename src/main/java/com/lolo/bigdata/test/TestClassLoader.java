package com.lolo.bigdata.test;

public class TestClassLoader {
    public static void main(String[] args) {

        // 类加载器的双亲委派机制
        // 1) 启动类加载器 : null(不是由java实现), 加载java的核心类库
        //         启动类加载器加载java核心类库
        // 2) 扩展类加载器 : sun.misc.Launcher$ExtClassLoader@c4437c4
        //         扩展类加载器加载java扩展类库
        // 3) 应用类加载器 : sun.misc.Launcher$AppClassLoader@18b4aac2
        //         应用类加载器加载环境变量classpath下面的类

        // 不同的类加载器的位置不一样，所以如果不同的位置有相同的类，那么会遵循双亲委派机制
        System.out.println(TestClassLoader.class.getClassLoader());
        System.out.println(TestClassLoader.class.getClassLoader().getParent());
        System.out.println(TestClassLoader.class.getClassLoader().getParent().getParent());
        System.out.println(String.class.getClassLoader());
    }
}

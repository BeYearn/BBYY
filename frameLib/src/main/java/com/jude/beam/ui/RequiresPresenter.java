package com.jude.beam.ui;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/*
* Annotation只有成员变量，没有方法,Annotation的成员变量在Annotation定义中
* 以“无形参的方法”形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型
*
* 如果Annotation里有一个名为“value“的成员变量，使用该Annotation时，可以直接使用XXX(val)形式为value成员变量赋值，无须使用name=val形式。
*
*/



@Inherited
@Retention(value=RetentionPolicy.RUNTIME)     //@Retention包含一个名为“value”的成员变量，该value成员变量是RetentionPolicy枚举类型。
public @interface RequiresPresenter {
    Class<? extends Presenter> value();
}

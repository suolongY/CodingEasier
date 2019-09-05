# CodingEasier

#### 介绍
一个提升开发效率的idea插件，初衷就是将一些常用的功能写入到这个插件，提高编码效率。但是因为这方面的资料过少加上需要工作的原因，
所以新功能更新可能会相对缓慢，但是一定会慢慢加入更多的功能，我会在代码中加入注释，尽量让代码简单易懂，也算是为了尽量让它成为让一个更多人
能自己编写插件的参考资料吧。当然也欢迎提交反馈，有想要实现的功能也可以建议，要是建议确实不错且时间允许，我就会尝试添加。

#### 当前功能 
- 谷歌中英互译（根据选中的内容自动辨别）`alt shift Q`
- 翻译及便捷替换 `alt shift A`
- 快捷的创建一个final常量 `alt shift Z`
- 字符串相关操作   
为了方便见名识意，这里命名都按照转化后的格式命名
    - all case 显示所有支持的格式 `alt shift W`
    - to CONSTANT 转化成常量
    - to camelCase 转化为小驼峰
    - to underscore_case 转化为下划线命名
    - to PascalCase 转化为大驼峰
    - to Kebab-case 转化为短横线命名(首字母大写)
    - to kebab-case 转化为短横线命名(首字母小写)
    - to words 拆分驼峰、下划线、短横线、常量等正常命名的变量

#### 说明
已经测试了2018.1-2019.2的idea，都没有发现兼容性相关的问题，字符串部分的转化部分暂时就考虑了一些正常命名和我见过的变量格式，
一些奇怪的命名很可能没有涉及到，使用过程中要是有问题，欢迎提交对应的字符串、遇见的问题及idea版本进行反馈。

#### 安装教程

1. 本地安装     
`File-->Settings-->Plugins--> Install Plugin From Disk...`
2. 在线安装(等初版差不多了，有时间就去提交一下)

安装完毕以后重启即可

#### 使用说明
本插件暂时大部分还都是字符相关的处理，所以在没选择字符串的情况下，插件默认是置灰的，选中要处理的字符串，然后再右键就能正常使用了。
为了节省动图大小，字符串都预先输入了，没有看到清楚的点击步骤的均为快捷键操作。
- 中英互译与替换
![translate](/images/translate.gif)
- 字符选择
![switchCase](/images/switchCase.gif)
- 创建常量
![createConstant](/images/createConstant.gif)

# CodingEasier

#### 介绍
一个提升开发效率的idea插件，初衷就是将一些常用的功能写入到这个插件，减少开发过程中一些可以避免且不必要的操作，以提高编码效率。
但是因为这方面的资料有点少，所以新功能更新可能会相对缓慢，但是一定会慢慢加入更多的功能，我会在代码中加入注释，尽量让代码简单易懂，
也算是为了尽量让它成为让一个更多人能自己编写插件的参考资料吧。当然使用过程中有问题、建议或者想要加的功能，欢迎提交issues，
或者邮件到chave_z@163.com，要是新功能或者建议确实不错且时间允许，我就会尝试加入。

## 分支说明
develop分支为开发分支，有些功能的代码可能是正在开发中，不完善的，但是develop中的jar包一定是最新且兼容我自己使用的2019.2版本的idea的，
master分支的代码是相对稳定的代码，但是功能可能没有develop中的全面。

## 更新历史
### 2019-09-13
插件已经通过审核，可以在线安装了，安装步骤请查看安装教程中的在线安装部分
### 2019-09-11
修改翻译结果的显示界面，优化长文本翻译的功能

#### 当前功能 
- 谷歌中英互译（根据选中的内容自动辨别）`alt shift Q`
- 翻译及便捷替换(中英互译，多词备选，方便快捷) `alt shift A`
- 快捷的创建一个常量 `alt shift Z`
- json格式化，支付json与json数组
- 字符串相关操作   
为了方便见名识意，这里命名基本都按照转化后的格式命名
    - all case 显示所有支持的格式 `alt shift W`
    - to CONSTANT 转化成常量
    - to camelCase 转化为小驼峰
    - to underscore_case 转化为下划线命名
    - to PascalCase 转化为大驼峰
    - to Kebab-case 转化为短横线命名(首字母大写)
    - to kebab-case 转化为短横线命名(首字母小写)
    - to words 拆分驼峰、下划线、短横线、常量等正常命名的变量
    - to UpperCase 转化为全大写形式
    - to LowerCase 转化为全小写形式

#### 说明
已经测试了windows系统下2017.3-2019.2的idea，以及mac、ubuntu上的最新版idea2019.2，都没有发现兼容性相关的问题，字符串部分的转化部分暂时就考虑了一些正常命名和我见过的变量格式，
一些奇怪的命名很可能没有涉及到，使用过程中要是有问题，欢迎提交对应的字符串、遇见的问题及idea版本进行反馈。

#### 安装教程

##### 本地安装
- windows、linux下：     
`File --> Settings --> Plugins --> Install Plugin From Disk... --> 选择CodingEasier.jar --> 确定`
- mac下：     
`IntelliJ IDEA --> Preferences --> Settings --> Plugins --> Install Plugin From Disk... --> 选择CodingEasier.jar --> 确定`
##### 在线安装(因为是新插件，可能比较靠后，往下翻翻就行)
- windows、linux下：   
`File --> Settings --> Plugins --> 在Marketplace中输入 Coding Easier然后搜索，点击安装`
- mac下：     
`IntelliJ IDEA --> Preferences --> Settings --> Plugins --> 在Marketplace中输入 Coding Easier然后搜索，点击安装`


安装完毕以后重启即可

#### 使用说明
本插件暂时大部分还都是字符相关的处理，所以在没选择字符串的情况下，插件默认是置灰的，选中要处理的字符串，然后再右键就能正常使用了。
为了节省动图大小，字符串都预先输入了，没有看到清楚的点击步骤的均为快捷键操作。
- 中英互译与替换(一键操作，多词候选，再也不用担心词汇量不足，每次都得临时翻译的尴尬局面了)
![translate](/images/translate.gif)
- 字符选择
![switchCase](/images/switchCase.gif)
- 创建常量
![createConstant](/images/createConstant.gif)
- json格式化
![json](/images/json.gif)


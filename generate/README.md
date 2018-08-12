#生成代码注意事项

>1、配置数据源

路径：/project/idea/workspace/abkproject/generate/src/main/resources/generator.properties

注意事项：

1.1、示例为mysql的，如果是oracle或其他数据库需要响应的jar包

1.2、当前环境是在idea上调试生成代码的，在eclipse上可能有问题，请自行百度解决


>2、xml配置

路径：/project/idea/workspace/abkproject/generate/src/main/resources/generatorConfig.xml

2.1、当前生成代码包括持久层dao和mapper，model模型

2.2、targetProject配置项目实际路径，只要到java级即可，请参考原代码

2.3、targetPackage包生成该包的包名

2.4、


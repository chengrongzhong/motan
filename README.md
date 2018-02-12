## 这个是一个Motan+SpringBoot+Zookeeper的基础demo

#### motan 父项目
#### motan-core 为基础包模块
#### motan-server 为服务器端模块
#### motan-client 为客户端模块
#### zookeeper文件夹内存放着配置好的zookeeper注册中心


## 导入项目
IDEA 可以直接根据已有代码导入项目：File -> New -> Project From Existing Sources... -> 选择motan-parent

Eclipse ...


## 项目运行
### 1、运行zookeeper
解压zookeeper并将其运行
Windows: 直接双击zkServer.cmd即可

Linux:
进入bin目录，执行命令
```bash
./zkServer.sh start
```

这个命令使得zk服务进程在后台进行。如果想在前台中运行以便查看服务器进程的输出日志，可以通过以下命令运行：
```bash
./zkServer.sh start-foreground
```

执行此命令，可以看到大量详细信息的输出，以便允许查看服务器发生了什么。

使用文本编辑器打开zkServer.cmd或者zkServer.sh文件，可以看到其会调用zkEnv.cmd或者zkEnv.sh脚本。zkEnv脚本的作用是设置zk运行的一些环境变量，例如配置文件的位置和名称等。

### 2、运行motan-server
由于项目使用了SpringBoot,以下三种模式都可运行。
1、可直接运行motan-server项目内运行FourgearMotanServer的main函数。
2、可在motan-server的目录下运行mvn spring-boot:run
3、使用mvn install 生成jar后运行
```bash
#先到项目根目录
mvn install
cd target
java -jar   xxxx.jar
```

### 3、运行motan-client(方法同上)


## 测试
motan-client客户端模块上实现了同步处理和异步处理两个controller,可在页面或者书写测试单元调用测试



﻿单元
	一、为什么要学习数据库
	二、数据库的相关概念      
		DBMS、DB、SQL
	三、数据库存储数据的特点
	四、初始MySQL
		MySQL产品的介绍        
		MySQL产品的安装          ★        
		MySQL服务的启动和停止     ★
		MySQL服务的登录和退出     ★      
		MySQL的常见命令和语法规范      
	五、DQL语言的学习   ★              
		基础查询        ★             
		条件查询  	   ★			
		排序查询  	   ★				
		常见函数        ★               
		分组函数        ★              
		分组查询		   ★			
		连接查询	 	★			
		子查询       √                  
		分页查询       ★              
		union联合查询	√			
		

	六、DML语言的学习    ★             
		插入语句						
		修改语句						
		删除语句						
	七、DDL语言的学习  
		库和表的管理	 √				
		常见数据类型介绍  √          
		常见约束  	  √			
	八、TCL语言的学习
		事务和事务处理                 
	九、视图的讲解           √
	十、变量                      
	十一、存储过程和函数   
	十二、流程控制结构       

##数据库的好处
	1.持久化数据到本地
	2.可以实现结构化查询，方便管理
	


##数据库相关概念
	1、DB：数据库，保存一组有组织的数据的容器
	2、DBMS：数据库管理系统，又称为数据库软件（产品），用于管理DB中的数据
	3、SQL:结构化查询语言，用于和DBMS通信的语言

##数据库存储数据的特点
	1、将数据放到表中，表再放到库中
	2、一个数据库中可以有多个表，每个表都有一个的名字，用来标识自己。**表名具有唯一性**。
	3、**表**具有一些特性，这些特性定义了数据在表中如何存储，**类似java中 “类”的设计**。
	4、表由列组成，我们也称为字段。所有表都是由一个或多个列组成的，每一列类似java 中的”属性”
	5、表中的数据是按行存储的，每一**行**类似于**java中的“对象**”。



##MySQL产品的介绍和安装

###MySQL服务的启动和停止
	方式一：计算机——右击管理——服务
	方式二：通过CMD管理员身份运行
	net start 服务名（启动服务）
	net stop 服务名（停止服务）


###MySQL服务的登录和退出   
	方式一：通过mysql自带的客户端
	只限于root用户

```markdown
方式二：通过windows自带的客户端
登录：
mysql 【-h主机名 -P端口号 】-u用户名 -p密码
mysql  -h 【主机名】localhost -P【端口号】 3306 -u【用户名】 root -p

退出：
exit或ctrl+C
```


​	
​	
###MySQL的常见命令 

	1.查看当前所有的数据库
	show databases;
	2.打开指定的库
	use 库名
	3.查看当前库的所有表
	show tables;
	4.查看其它库的所有表
	show tables from 库名;
	5.创建表
	create table 表名(
	
		列名 列类型,
		列名 列类型，
		。。。
	);
	6.查看表结构
	desc 表名;


	7.查看服务器的版本
	方式一：登录到mysql服务端
	select version();
	方式二：没有登录到mysql服务端
	mysql --version
	或
	mysql --V



###MySQL的语法规范
	1.不区分大小写,但建议关键字大写，表名、列名小写
	2.每条命令最好用分号结尾
	3.每条命令根据需要，可以进行缩进 或换行
	4.注释
		单行注释：#注释文字
		单行注释：-- 注释文字
		多行注释：/* 注释文字  */
	
	
	


###SQL的语言分类
	DQL（Data Query Language）：数据查询语言
		select 
	DML(Data Manipulate Language):数据操作语言
		insert 、update、delete
	DDL（Data Define Languge）：数据定义语言
		create、drop、alter
	TCL（Transaction Control Language）：事务控制语言
		commit、rollback
	

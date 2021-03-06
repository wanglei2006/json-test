## fastjson和jackson性能对比
<span id="top"></span>

<h2 id="1">1 实验环境</h2>

**机器 ：联想E480 4核8G**

**fastjson版本 ：1.2.57**

**jackson版本 ：2.9.9**

**java JVM开辟2G内存**

<h2 id="2">2 实验结果</h2>

**实验说明(10个字段)：**
```
10个字段，分别进行循环10次平均耗时，循环100次平均耗时，循环1000次平均耗时，
循环10000次平均耗时，循环100000次平均耗时。耗时单位：毫秒
```
  -- | 十次 | 百次 | 千次 | 万次 | 十万次 
:-------- | :-------- | :-------- | :-------- | :-------- | :--------
Fastjson序列化 | 1 |  2 |  5 |  39 |  448 | 
jackson序列化 | 35 |  2 |  3 |  14 |  168 | 
Fastjson反序列化 | 1 |  1 |  3 |  25 |  214 | 
jackson反序列化 | 6 |  3 |  6 |  21 |  332 | 

**实验说明(20个字段)：**
```
20个字段，分别进行循环10次平均耗时，循环100次平均耗时，循环1000次平均耗时，
循环10000次平均耗时，循环100000次平均耗时。耗时单位：毫秒
```
  -- | 十次 | 百次 | 千次 | 万次 | 十万次 
:-------- | :-------- | :-------- | :-------- | :-------- | :--------
Fastjson序列化 | 3 |  6 |  21 |  198 |  2004 | 
jackson序列化 | 37 |  4 |  10 |  83 |  798 | 
Fastjson反序列化 | 2 |  3 |  10 |  63 |  773 | 
jackson反序列化 | 5 |  4 |  18 |  95 |  1334 | 

**实验说明(50个字段)：**
```
50个字段，分别进行循环10次平均耗时，循环100次平均耗时，循环1000次平均耗时，
循环10000次平均耗时，循环100000次平均耗时。耗时单位：毫秒
```
  -- | 十次 | 百次 | 千次 | 万次 | 十万次 
:-------- | :-------- | :-------- | :-------- | :-------- | :--------
Fastjson序列化 | 4 |  9 |  28 |  272 |  3288 | 
jackson序列化 | 39 |  7 |  26 |  241 |  2024 | 
Fastjson反序列化 | 3 |  7 |  17 |  159 |  1656 | 
jackson反序列化 | 8 |  8 |  29 |  247 |  2055 | 

**实验说明(100个字段)：**
```
100个字段，分别进行循环10次平均耗时，循环100次平均耗时，循环1000次平均耗时，
循环10000次平均耗时，循环100000次平均耗时。耗时单位：毫秒
```
  -- | 十次 | 百次 | 千次 | 万次 | 十万次 
:-------- | :-------- | :-------- | :-------- | :-------- | :--------
Fastjson序列化 | 5 |  11 |  54 |  792 |  7158 | 
jackson序列化 | 42 |  8 |  27 |  372 |  3811 | 
Fastjson反序列化 | 4 |  8 |  29 |  619 |  6260 | 
jackson反序列化 | 10 |  10 |  36 |  359 |  5308 | 

<h2 id="3">3 结论</h2>

```

当反序列化字段小于100个时，jackson序列化性能明显优于fastjson，但是反序列化性能fastjson
性能明显优于jackson，然而当字段接近或大于100时，无论是序列化还是反序列化，都是jackson
性能更优，尤其是序列化方面。

建议：
一般公司建议使用Jackson作为json序列化和反序列化工具
根据业务，如果bean字段通常在100左右，建议用jackson,如果公司业务bean字段通常在60z左右以下，
建议有条件的公司可以序列化用jackson,反序列化用fastjson.
```

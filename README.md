# LG_PopupWindow

api

![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/222.png)

常用方法
```
show 常规的默认显示，自动处理显示在上面还是下面
showRight 显示在右边，自动处理显示在上面还是下面
showCenter 显示在中间，自动处理显示在上面还是下面
showSameWidth 显示宽度和 Anchor 一致，自动处理显示在上面还是下面
showAtScreenBottom 显示在屏幕底部
showAs 开头是具体的显示在哪的 api
```
其他说明
```
所有方法都调用 showAsDropDownCompat 
```




builder api

![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/111.png)

常用方法
```
setView 可以设置自定义 View
setOnDismissListener 设置消失监听
setWidth 设置宽度 可选支持 MATCH_PARENT 、WRAP_CONTENT
setHeight 设置高度 可选支持 MATCH_PARENT 、WRAP_CONTENT
setEnableOutsideTouchDismiss 设置点击外部是否可消失
setAnimationStyle 设置自定义动画
setWindowBackgroundDarkAlpha 设置显示 View 后灰色蒙版的透明度
```
其他方法
```
dismiss 隐藏
getView 获取自定义 View
```



举几个例子：

![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic.png)

Top_AnchorCenter_Center
显示在 anchor 上边，参考线是 anchor 的纵向中线，中间对齐 

```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsTop_AnchorCenter_Center(v);
```

![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic2.png)

列表

```java
 ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);

                Context mContext = mActivity;
                //
                //NestedScrollView 修正 当显示空间过短时候，显示1~9 正常，第10行未出现在 popupwindow 第一屏 导致滚动后第二屏也显示不全
                NestedScrollView nestedScrollView = new NestedScrollView(mContext);
                nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                //
                RecyclerView recyclerView = new RecyclerView(mContext);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
                recyclerView.setHasFixedSize(true);
                recyclerView.setNestedScrollingEnabled(true);
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 25; i++) {
                    strings.add("25__" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);
//
                nestedScrollView.addView(recyclerView);
                builder.setView(nestedScrollView).build().show(v);
```


![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic3.png)

Bottom_AnchorRight_Right
显示在 anchor 下边，参考线是 anchor 的右边，右侧对齐 


```java
 ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsBottom_AnchorRight_Right(v);
```


![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic4.png)

Top_AnchorRight_Right
显示在 anchor 上边，参考线是 anchor 的右边，右侧对齐 

```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsTop_AnchorRight_Right(v);
```

![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic5.png)

Left_AnchorBottom_Bottom
显示在 anchor 左边，参考线是 anchor 的底边，底部对齐 
```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsLeft_AnchorBottom_Bottom(v);
```


![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic6.png)

Right_AnchorCenter_Center
显示在 anchor 右边，参考线是 anchor 的横向中线，中间对齐 
```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsRight_AnchorCenter_Center(v);
```


![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic7.png)

显示在屏幕底部

```java
  ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAtScreenBottom(v);
```

![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic8.png)

android 7.x  ~ 8.x  match_parent 兼容

```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWidth(ViewGroup.LayoutParams.MATCH_PARENT).build().show(v);
```

![1](https://raw.githubusercontent.com/louisgeek/ClassicPopupWindow/master/screenshots/pic9.png)

蒙版

```java
 ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWindowBackgroundDarkAlpha(0.5f).build().show(v);
```

其他详见代码。。。
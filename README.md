# ClassicPopupWindow
ClassicPopupWindow

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency  [![](https://jitpack.io/v/louisgeek/ClassicPopupWindow.svg)](https://jitpack.io/#louisgeek/ClassicPopupWindow)

	dependencies {
	        compile 'com.github.louisgeek:ClassicPopupWindow:x.x.x'
	}


api

![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/222.png)


builder api

![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/111.png)

demo：

![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic.png)

Top_AnchorCenter_Center
显示在 anchor 上边，参考线是 anchor 的纵向中线，中间对齐 

```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsTop_AnchorCenter_Center(v);
```

![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic2.png)

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


![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic3.png)

Bottom_AnchorRight_Right
显示在 anchor 下边，参考线是 anchor 的右边，右侧对齐 


```java
 ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsBottom_AnchorRight_Right(v);
```


![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic4.png)

Top_AnchorRight_Right
显示在 anchor 上边，参考线是 anchor 的右边，右侧对齐 

```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsTop_AnchorRight_Right(v);
```

![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic5.png)

Left_AnchorBottom_Bottom
显示在 anchor 左边，参考线是 anchor 的底边，底部对齐 
```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsLeft_AnchorBottom_Bottom(v);
```


![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic6.png)

Right_AnchorCenter_Center
显示在 anchor 右边，参考线是 anchor 的横向中线，中间对齐 
```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsRight_AnchorCenter_Center(v);
```


![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic7.png)

显示在屏幕底部

```java
  ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAtScreenBottom(v);
```

![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic8.png)

android 7.x  ~ 8.x  match_parent 兼容

```java
ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWidth(ViewGroup.LayoutParams.MATCH_PARENT).build().show(v);
```

![1](https://github.com/louisgeek/ClassicPopupWindow/blob/master/screenshots/pic9.png)

阴影

```java
 ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                View contentView = LayoutInflater.from(v.getContext()).inflate(R.layout.content, null);
                contentView.setBackgroundResource(R.drawable.shape_shadow_bg);
                builder.setView(contentView).build().show(v);
```

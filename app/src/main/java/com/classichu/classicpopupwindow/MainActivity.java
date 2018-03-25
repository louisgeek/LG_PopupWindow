package com.classichu.classicpopupwindow;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.classichu.popupwindow.ui.ClassicPopupWindow;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Activity mActivity;

    private Pair<Integer, Integer> getlistViewItemWidthHeightAfterSetAdapter(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return null;
        }
        int totalHeight = 0;
        int maxWidth = 0;
        int count = listAdapter.getCount();
        for (int i = 0; i < count; i++) {
            View listItemView = listAdapter.getView(i, null, listView);
            listItemView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
            totalHeight += listItemView.getMeasuredHeight();
            int width = listItemView.getMeasuredWidth();
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        int width = maxWidth;
        int height = totalHeight + (listView.getDividerHeight() * (count - 1));
        return Pair.create(width, height);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;

        TextView id_btn_Bottom_AnchorLeft_Left = (TextView) findViewById(R.id.id_btn_Bottom_AnchorLeft_Left);
        TextView id_btn_Bottom_AnchorRight_Right = (TextView) findViewById(R.id.id_btn_Bottom_AnchorRight_Right);
        TextView id_btn_Bottom_AnchorCenter_Center = (TextView) findViewById(R.id.id_btn_Bottom_AnchorCenter_Center);
        TextView id_btn_Bottom_Anchor_Same_Width = (TextView) findViewById(R.id.id_btn_Bottom_Anchor_Same_Width);

        TextView id_btn_Top_AnchorLeft_Left = (TextView) findViewById(R.id.id_btn_Top_AnchorLeft_Left);
        TextView id_btn_Top_AnchorRight_Right = (TextView) findViewById(R.id.id_btn_Top_AnchorRight_Right);
        TextView id_btn_Top_AnchorCenter_Center = (TextView) findViewById(R.id.id_btn_Top_AnchorCenter_Center);
        TextView id_btn_Top_Anchor_Same_Width = (TextView) findViewById(R.id.id_btn_Top_Anchor_Same_Width);

        TextView id_btn_Left_AnchorTop_Top = (TextView) findViewById(R.id.id_btn_Left_AnchorTop_Top);
        TextView id_btn_Left_AnchorBottom_Bottom = (TextView) findViewById(R.id.id_btn_Left_AnchorBottom_Bottom);
        TextView id_btn_Left_AnchorCenter_Center = (TextView) findViewById(R.id.id_btn_Left_AnchorCenter_Center);

        TextView id_btn_Right_AnchorTop_Top = (TextView) findViewById(R.id.id_btn_Right_AnchorTop_Top);
        TextView id_btn_Right_AnchorBottom_Bottom = (TextView) findViewById(R.id.id_btn_Right_AnchorBottom_Bottom);
        TextView id_btn_Right_AnchorCenter_Center = (TextView) findViewById(R.id.id_btn_Right_AnchorCenter_Center);

        TextView id_btn_Screen_Bottom = (TextView) findViewById(R.id.id_btn_Screen_Bottom);


        TextView id_btn_dark = (TextView) findViewById(R.id.id_btn_dark);
        TextView id_btn_dark2 = (TextView) findViewById(R.id.id_btn_dark2);
        TextView id_btn_dark3 = (TextView) findViewById(R.id.id_btn_dark3);


        TextView id_btn_Shadow = (TextView) findViewById(R.id.id_btn_Shadow);
        TextView id_btn_List_View111 = (TextView) findViewById(R.id.id_btn_List_View111);
        TextView id_btn_List_View111_20 = (TextView) findViewById(R.id.id_btn_List_View111_20);
        TextView id_btn_List_View = (TextView) findViewById(R.id.id_btn_List_View);
        TextView id_btn_List_View_10 = (TextView) findViewById(R.id.id_btn_List_View_10);
        TextView id_btn_List_View_15 = (TextView) findViewById(R.id.id_btn_List_View_15);
        TextView id_btn_List_View_20 = (TextView) findViewById(R.id.id_btn_List_View_20);
        TextView id_btn_List_View_25 = (TextView) findViewById(R.id.id_btn_List_View_25);
        TextView id_btn_List_View_30 = (TextView) findViewById(R.id.id_btn_List_View_30);
        TextView id_btn_List_View_Anim = (TextView) findViewById(R.id.id_btn_List_View_Anim);
        TextView id_btn_List_View_Anim_20 = (TextView) findViewById(R.id.id_btn_List_View_Anim_20);
        TextView id_btn_DisabledOutsideTouchDismiss = (TextView) findViewById(R.id.id_btn_DisabledOutsideTouchDismiss);

        TextView id_btn_android7_x_width_match_parent = (TextView) findViewById(R.id.id_btn_android7_x_width_match_parent);
        TextView id_btn_android7_x_width_wrap_content = (TextView) findViewById(R.id.id_btn_android7_x_width_wrap_content);
        TextView id_btn_android7_x_width_size = (TextView) findViewById(R.id.id_btn_android7_x_width_size);
        TextView id_btn_android7_x_height_match_parent = (TextView) findViewById(R.id.id_btn_android7_x_height_match_parent);
        TextView id_btn_android7_x_height_wrap_content = (TextView) findViewById(R.id.id_btn_android7_x_height_wrap_content);
        TextView id_btn_android7_x_height_size = (TextView) findViewById(R.id.id_btn_android7_x_height_size);


        TextView id_btn_android7_x_width_wrap_content_center = (TextView) findViewById(R.id.id_btn_android7_x_width_wrap_content_center);
        TextView id_btn_android7_x_width_size_center = (TextView) findViewById(R.id.id_btn_android7_x_width_size_center);
        TextView id_btn_android7_x_height_match_parent_center = (TextView) findViewById(R.id.id_btn_android7_x_height_match_parent_center);
        TextView id_btn_android7_x_height_wrap_content_center = (TextView) findViewById(R.id.id_btn_android7_x_height_wrap_content_center);
        TextView id_btn_android7_x_height_size_center = (TextView) findViewById(R.id.id_btn_android7_x_height_size_center);

        id_btn_Bottom_AnchorLeft_Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsBottom_AnchorLeft_Left(v);
            }
        });
        id_btn_Bottom_AnchorRight_Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsBottom_AnchorRight_Right(v);
            }
        });
        id_btn_Bottom_AnchorCenter_Center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsBottom_AnchorCenter_Center(v);
            }
        });
        id_btn_Bottom_Anchor_Same_Width.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsBottom_Anchor_Same_Width(v);
            }
        });
        id_btn_Top_AnchorLeft_Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsTop_AnchorLeft_Left(v);
            }
        });
        id_btn_Top_AnchorRight_Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsTop_AnchorRight_Right(v);
            }
        });
        id_btn_Top_AnchorCenter_Center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsTop_AnchorCenter_Center(v);
            }
        });
        id_btn_Top_Anchor_Same_Width.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsTop_Anchor_Same_Width(v);
            }
        });
        id_btn_Left_AnchorTop_Top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsLeft_AnchorTop_Top(v);
            }
        });
        id_btn_Left_AnchorBottom_Bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsLeft_AnchorBottom_Bottom(v);
            }
        });


        id_btn_Left_AnchorCenter_Center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsLeft_AnchorCenter_Center(v);
            }
        });

        id_btn_Right_AnchorTop_Top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsRight_AnchorTop_Top(v);
            }
        });
        id_btn_Right_AnchorBottom_Bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsRight_AnchorBottom_Bottom(v);
            }
        });


        id_btn_Right_AnchorCenter_Center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAsRight_AnchorCenter_Center(v);
            }
        });

        id_btn_Screen_Bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).build().showAtScreenBottom(v);
            }
        });

        id_btn_dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWindowBackgroundDarkAlpha(0).build().show(v);
            }
        });
        id_btn_dark2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWindowBackgroundDarkAlpha(1).build().show(v);
            }
        });
        id_btn_dark3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWindowBackgroundDarkAlpha(0.5f).build().show(v);
            }
        });

        id_btn_Shadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                View contentView = LayoutInflater.from(v.getContext()).inflate(R.layout.content, null);
                contentView.setBackgroundResource(R.drawable.shape_shadow_bg);
                builder.setView(contentView).build().show(v);
            }
        });
        id_btn_List_View111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);

                Context mContext = mActivity;
                //
                ListView listView = new ListView(mContext);
                listView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                listView.setBackgroundResource(android.R.color.holo_green_dark);
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    strings.add("111_10__" + i);
                }
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(view.getContext(), "ss_"+position, Toast.LENGTH_SHORT).show();
                    }
                });
                listView.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, android.R.id.text1, strings));
                Pair<Integer, Integer> pair = getlistViewItemWidthHeightAfterSetAdapter(listView);
                if (pair != null) {
                    //修正宽度高度 WRAP_CONTENT
                    builder.setWidth(pair.first);
                    builder.setHeight(pair.second);
                }
                builder.setView(listView).build().show(v);
            }
        });

        id_btn_List_View111_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);

                Context mContext = mActivity;
                //
                ListView listView = new ListView(mContext);
                listView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                listView.setBackgroundResource(android.R.color.holo_green_dark);
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    strings.add("222_20__" + i);
                }
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(view.getContext(), "ss_"+position, Toast.LENGTH_SHORT).show();
                    }
                });
                listView.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, android.R.id.text1, strings));
                Pair<Integer, Integer> pair = getlistViewItemWidthHeightAfterSetAdapter(listView);
                if (pair != null) {
                    //修正宽度高度 WRAP_CONTENT
                    builder.setWidth(pair.first);
                    builder.setHeight(pair.second);
                }
                builder.setView(listView).build().show(v);
            }
        });

        id_btn_List_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    strings.add("5__" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);
//
                nestedScrollView.addView(recyclerView);
                builder.setView(nestedScrollView).build().show(v);
            }
        });


        id_btn_List_View_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    strings.add("10__" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);
//
                nestedScrollView.addView(recyclerView);
                builder.setView(nestedScrollView).build().show(v);
            }
        });

        id_btn_List_View_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 15; i++) {
                    strings.add("15__" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);
//
                nestedScrollView.addView(recyclerView);
                builder.setView(nestedScrollView).build().show(v);
            }
        });


        id_btn_List_View_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);

                Context mContext = mActivity;
                //NestedScrollView 修正 当显示空间过短时候，显示1~9 正常，第10行未出现在 popupwindow 第一屏 导致滚动后第二屏也显示不全
                NestedScrollView nestedScrollView = new NestedScrollView(mContext);
                nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                //
                RecyclerView recyclerView = new RecyclerView(mContext);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
                //    linearLayoutManager.setAutoMeasureEnabled(true);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    strings.add("20__" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);
//
                nestedScrollView.addView(recyclerView);
                builder.setView(nestedScrollView).build().show(v);
            }
        });

        id_btn_List_View_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });

        id_btn_List_View_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 30; i++) {
                    strings.add("30__" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);
//
                nestedScrollView.addView(recyclerView);
                builder.setView(nestedScrollView).build().show(v);
            }
        });

        id_btn_List_View_Anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                // View contentView = LayoutInflater.from(v.getContext()).inflate(R.layout.content, null);
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
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    strings.add("10=====" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);
//
                nestedScrollView.addView(recyclerView);
                builder.setView(nestedScrollView).setAnimationStyle(R.style.CustomPopupWindowStyle).build().show(v);
            }
        });

        id_btn_List_View_Anim_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                // View contentView = LayoutInflater.from(v.getContext()).inflate(R.layout.content, null);
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
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    strings.add("20=====" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);
//
                nestedScrollView.addView(recyclerView);
                builder.setView(nestedScrollView).setAnimationStyle(R.style.CustomPopupWindowStyle).build().show(v);
            }
        });

        id_btn_DisabledOutsideTouchDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content_close).setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        Toast.makeText(mActivity, "OnDismissListener", Toast.LENGTH_SHORT).show();
                    }
                }).setEnableOutsideTouchDismiss(false);
                builder.getView().findViewById(R.id.id_btn_close).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        builder.dismiss();
                    }
                });
                builder.build().show(v);
            }
        });

        id_btn_android7_x_width_match_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWidth(ViewGroup.LayoutParams.MATCH_PARENT).build().show(v);
            }
        });

        id_btn_android7_x_width_wrap_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWidth(ViewGroup.LayoutParams.WRAP_CONTENT).build().show(v);
            }
        });

        id_btn_android7_x_width_size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWidth(100).build().show(v);
            }
        });


        id_btn_android7_x_height_match_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setHeight(ViewGroup.LayoutParams.MATCH_PARENT).build().show(v);
            }
        });

        id_btn_android7_x_height_wrap_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setHeight(ViewGroup.LayoutParams.WRAP_CONTENT).build().show(v);
            }
        });

        id_btn_android7_x_height_size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setHeight(80).build().show(v);
            }
        });

//////////////////////////


        id_btn_android7_x_width_wrap_content_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWidth(ViewGroup.LayoutParams.WRAP_CONTENT).build().showCenter(v);
            }
        });

        id_btn_android7_x_width_size_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setWidth(100).build().showCenter(v);
            }
        });


        id_btn_android7_x_height_match_parent_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setHeight(ViewGroup.LayoutParams.MATCH_PARENT).build().showCenter(v);
            }
        });

        id_btn_android7_x_height_wrap_content_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setHeight(ViewGroup.LayoutParams.WRAP_CONTENT).build().showCenter(v);
            }
        });

        id_btn_android7_x_height_size_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                builder.setView(R.layout.content).setHeight(80).build().showCenter(v);
            }
        });
    }
}

package com.classichu.classicpopupwindow;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.classichu.popupwindow.ui.ClassicPopupWindow;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private Activity mActivity;

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
        TextView id_btn_List_View = (TextView) findViewById(R.id.id_btn_List_View);
        TextView id_btn_List_View_Anim = (TextView) findViewById(R.id.id_btn_List_View_Anim);
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
        id_btn_List_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);

                Context mContext = mActivity;
                //
                RecyclerView recyclerView = new RecyclerView(mContext);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    strings.add("123456" + i);
                }
                MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);

                builder.setView(recyclerView).build().show(v);
            }
        });


        id_btn_List_View_Anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassicPopupWindow.Builder builder = new ClassicPopupWindow.Builder(mActivity);
                // View contentView = LayoutInflater.from(v.getContext()).inflate(R.layout.content, null);
                Context mContext = mActivity;
                //
                RecyclerView recyclerView = new RecyclerView(mContext);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                List<String> strings = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    strings.add("123456" + i);
                }
               MyAdapter myAdapter = new MyAdapter(strings);
                recyclerView.setAdapter(myAdapter);

                builder.setView(recyclerView).setAnimationStyle(R.style.CustomPopupWindowStyle).build().show(v);
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

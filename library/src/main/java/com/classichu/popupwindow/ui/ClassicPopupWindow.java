package com.classichu.popupwindow.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v4.widget.PopupWindowCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;

import com.classichu.popupwindow.util.ScreenUtil;

/**
 * Created by Classichu on 2017/11/21.
 */

public class ClassicPopupWindow extends PopupWindow {
    private static boolean popupWindowShowing;

    public void show(View anchor) {
        show(anchor, 0);
    }

    public void show(View anchor, int yoff) {
        if (isNeedShowAsTop(anchor)) {
            showAsTop_AnchorLeft_Left(anchor, yoff);
        } else {
            showAsBottom_AnchorLeft_Left(anchor, yoff);
        }
    }

    public void showCenter(View anchor) {
        showCenter(anchor, 0);
    }

    public void showCenter(View anchor, int yoff) {
        if (isNeedShowAsTop(anchor)) {
            showAsTop_AnchorCenter_Center(anchor, yoff);
        } else {
            showAsBottom_AnchorCenter_Center(anchor, yoff);
        }
    }

    public void showRight(View anchor) {
        showRight(anchor, 0);
    }

    public void showRight(View anchor, int yoff) {
        if (isNeedShowAsTop(anchor)) {
            showAsTop_AnchorRight_Right(anchor, yoff);
        } else {
            showAsBottom_AnchorRight_Right(anchor, yoff);
        }
    }

    public void showSameWidth(View anchor) {
        showSameWidth(anchor, 0);
    }

    public void showSameWidth(View anchor, int yoff) {
        if (isNeedShowAsTop(anchor)) {
            showAsTop_Anchor_Same_Width(anchor, yoff);
        } else {
            showAsBottom_Anchor_Same_Width(anchor, yoff);
        }
    }

    public void showAsBottom_AnchorLeft_Left(View anchor) {
        showAsBottom_AnchorLeft_Left(anchor, 0);
    }

    public void showAsBottom_AnchorLeft_Left(View anchor, int yoff) {
        showAsDropDownCompat(anchor, 0, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsBottom_AnchorRight_Right(View anchor) {
        showAsBottom_AnchorRight_Right(anchor, 0);
    }

    public void showAsBottom_AnchorRight_Right(View anchor, int yoff) {
        int contentViewWidth = getContentViewWidth();
        int xoff = anchor.getWidth() - contentViewWidth;
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsBottom_AnchorCenter_Center(View anchor) {
        showAsBottom_AnchorCenter_Center(anchor, 0);
    }

    public void showAsBottom_AnchorCenter_Center(View anchor, int yoff) {
        int contentViewWidth = getContentViewWidth();
        int xoff = (anchor.getWidth() - contentViewWidth) / 2;
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsBottom_Anchor_Same_Width(View anchor) {
        showAsBottom_Anchor_Same_Width(anchor, 0);
    }

    public void showAsBottom_Anchor_Same_Width(View anchor, int yoff) {
        this.setWidth(anchor.getWidth());
        showAsDropDownCompat(anchor, 0, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsTop_AnchorLeft_Left(View anchor) {
        showAsTop_AnchorLeft_Left(anchor, 0);
    }

    public void showAsTop_AnchorLeft_Left(View anchor, int yoff) {
        int contentViewHeight = getContentViewHeight();
        yoff = -(anchor.getHeight() + contentViewHeight) + yoff;
        showAsDropDownCompat(anchor, 0, yoff, Gravity.TOP | Gravity.START);
    }

    private boolean isNeedShowAsTop(View anchor) {
        int[] location = new int[2];
        anchor.getLocationOnScreen(location);
        int x = location[0];
        int y = location[1];
        //
        int contentViewHeight = getContentViewHeight();
        //
        int screenHeight = ScreenUtil.getScreenHeight();
        if (screenHeight - (y + anchor.getHeight()) < contentViewHeight) {//下面的高度不够显示全部
            if (y < contentViewHeight) {//但是上面也不够，那还是显示下面
                return false;
            }
            return true;
        }
        return false;
    }

    private int getContentViewWidth() {
        if (this.getWidth() > 0) {//如果是精确高度
            return this.getWidth();//注意不是contentView.getWidth()
        }
        View contentView = this.getContentView();
        contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        int contentViewWidth = contentView.getMeasuredWidth();
        return contentViewWidth;
    }

    private int getContentViewHeight() {
        if (this.getHeight() > 0) {//如果是精确高度
            return this.getHeight();//注意不是contentView.getHeight()
        }
        View contentView = this.getContentView();
        contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        int contentViewHeight = contentView.getMeasuredHeight();
        return contentViewHeight;
    }

    public void showAsTop_AnchorRight_Right(View anchor) {
        showAsTop_AnchorRight_Right(anchor, 0);
    }

    public void showAsTop_AnchorRight_Right(View anchor, int yoff) {
        int contentViewWidth = getContentViewWidth();
        int contentViewHeight = getContentViewHeight();
        int xoff = anchor.getWidth() - contentViewWidth;
        yoff = -(anchor.getHeight() + contentViewHeight) + yoff;
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsTop_AnchorCenter_Center(View anchor) {
        showAsTop_AnchorCenter_Center(anchor, 0);
    }

    public void showAsTop_AnchorCenter_Center(View anchor, int yoff) {
        int contentViewWidth = getContentViewWidth();
        int contentViewHeight = getContentViewHeight();
        int xoff = (anchor.getWidth() - contentViewWidth) / 2;
        yoff = -(anchor.getHeight() + contentViewHeight) + yoff;
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsTop_Anchor_Same_Width(View anchor) {
        showAsTop_Anchor_Same_Width(anchor, 0);
    }

    public void showAsTop_Anchor_Same_Width(View anchor, int yoff) {
        int contentViewHeight = getContentViewHeight();
        this.setWidth(anchor.getWidth());
        yoff = -(anchor.getHeight() + contentViewHeight) + yoff;
        showAsDropDownCompat(anchor, 0, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsLeft_AnchorTop_Top(View anchor) {
        showAsLeft_AnchorTop_Top(anchor, 0);
    }

    public void showAsLeft_AnchorTop_Top(View anchor, int xoff) {
        int contentViewWidth = getContentViewWidth();
        xoff = -contentViewWidth + xoff;
        int yoff = -anchor.getHeight();
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsLeft_AnchorBottom_Bottom(View anchor) {
        showAsLeft_AnchorBottom_Bottom(anchor, 0);
    }

    public void showAsLeft_AnchorBottom_Bottom(View anchor, int xoff) {
        int contentViewWidth = getContentViewWidth();
        int contentViewHeight = getContentViewHeight();
        xoff = -contentViewWidth + xoff;
        int yoff = -contentViewHeight;
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsLeft_AnchorCenter_Center(View anchor) {
        showAsLeft_AnchorCenter_Center(anchor, 0);
    }

    public void showAsLeft_AnchorCenter_Center(View anchor, int xoff) {
        int contentViewWidth = getContentViewWidth();
        int contentViewHeight = getContentViewHeight();
        xoff = -contentViewWidth + xoff;
        int yoff = -(anchor.getHeight() + contentViewHeight) / 2;
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsRight_AnchorTop_Top(View anchor) {
        showAsRight_AnchorTop_Top(anchor, 0);
    }

    public void showAsRight_AnchorTop_Top(View anchor, int xoff) {
        xoff = anchor.getWidth() + xoff;
        int yoff = -anchor.getHeight();
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsRight_AnchorBottom_Bottom(View anchor) {
        showAsRight_AnchorBottom_Bottom(anchor, 0);
    }

    public void showAsRight_AnchorBottom_Bottom(View anchor, int xoff) {
        int contentViewHeight = getContentViewHeight();
        xoff = anchor.getWidth() + xoff;
        int yoff = -contentViewHeight;
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAsRight_AnchorCenter_Center(View anchor) {
        showAsRight_AnchorCenter_Center(anchor, 0);
    }

    public void showAsRight_AnchorCenter_Center(View anchor, int xoff) {
        int contentViewHeight = getContentViewHeight();
        xoff = anchor.getWidth() + xoff;
        int yoff = -(anchor.getHeight() + contentViewHeight) / 2;
        showAsDropDownCompat(anchor, xoff, yoff, Gravity.TOP | Gravity.START);
    }

    public void showAtScreenBottom(View anchor) {
        showAtScreenBottom(anchor, 0, 0);
    }

    public void showAtScreenBottom(View anchor, int xoff, int yoff) {
        this.showAtLocation(anchor, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, xoff, yoff);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        popupWindowShowing = false;
    }


    private void showAsDropDownCompat(View anchor, int xoff, int yoff, int gravity) {
        if (popupWindowShowing) {
            return;
        }
        popupWindowShowing = true;

        //Build.VERSION_CODES.N api 24  android 7.0
        //Build.VERSION_CODES.N_MR1 api 25  android 7.1.1
        //Build.VERSION_CODES.O api 26  android 8.0
        if (Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25 || Build.VERSION.SDK_INT == 26) {
            int[] location = new int[2];
            anchor.getLocationOnScreen(location);
            int x = location[0];
            int y = location[1];
            if (super.getHeight() == ViewGroup.LayoutParams.MATCH_PARENT) {
                int screenHeight = ScreenUtil.getScreenHeight();
                super.setHeight(screenHeight - y - anchor.getHeight() - yoff);
            }
        }
        PopupWindowCompat.showAsDropDown(this, anchor, xoff, yoff, gravity);
    }


    public static class Builder {
        private ClassicPopupWindow mPopupWindow;
        private OnDismissListener mOnDismissListener;
        private Context mContext;
        private View mContentView;
        /**
         * WindowManager.LayoutParams params = window.getAttributes();
         * params.alpha  默认 是 1.0f;
         */
        private float mWindowBackgroundDarkAlpha = 1.0f;//1.0f 背景全亮  0.0f背景全黑
        private boolean mEnableOutsideTouchDismiss = true;
        private int mAnimationStyle;
        private int mWidth = ViewGroup.LayoutParams.WRAP_CONTENT;
        private int mHeight = ViewGroup.LayoutParams.WRAP_CONTENT;

        public Builder(Context context) {
            mContext = context;
        }

        public Builder setEnableOutsideTouchDismiss(boolean enableOutsideTouchDismiss) {
            mEnableOutsideTouchDismiss = enableOutsideTouchDismiss;
            return this;
        }

        public Builder setView(int layoutResId) {
            mContentView = LayoutInflater.from(mContext).inflate(layoutResId, null);
            return this;
        }

        public View getView() {
            return mContentView;
        }

        public Builder setView(View contentView) {
            mContentView = contentView;
            return this;
        }

        public Builder setWidth(int width) {
            mWidth = width;
            return this;
        }

        public Builder setHeight(int height) {
            mHeight = height;
            return this;
        }

        public Builder setAnimationStyle(int animationStyle) {
            mAnimationStyle = animationStyle;
            return this;
        }

        public void dismiss() {
            if (mPopupWindow != null) {
                mPopupWindow.dismiss();
            }
        }

        public Builder setWindowBackgroundDarkAlpha(float windowBackgroundDarkAlpha) {
            mWindowBackgroundDarkAlpha = windowBackgroundDarkAlpha;
            return this;
        }

        public Builder setOnDismissListener(OnDismissListener onDismissListener) {
            mOnDismissListener = onDismissListener;
            return this;
        }

        public ClassicPopupWindow build() {
            mPopupWindow = new ClassicPopupWindow();
            ///###int linearLayoutWidth = this.getMeasuredWidth();
            //##  mPopupWindow.setWidth(linearLayoutWidth);
            mPopupWindow.setWidth(mWidth);
            mPopupWindow.setHeight(mHeight);
            mPopupWindow.setContentView(mContentView);
            //
            if (mEnableOutsideTouchDismiss) {
                mPopupWindow.setTouchable(true);
                mPopupWindow.setFocusable(true);
                mPopupWindow.setOutsideTouchable(true);
                //Android 6.0 以下要设置BackgroundDrawable
                mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
            if (mAnimationStyle == 0) {
                mAnimationStyle = android.R.style.Animation_Dialog;
            }
            mPopupWindow.setAnimationStyle(mAnimationStyle);
            ///###mPopupWindow.setClippingEnabled(false);//默认true不会超出屏幕边界,false时会采用精准位置, 能超出屏幕范围.
//
            mPopupWindow.setOnDismissListener(new OnDismissListener() {
                @Override
                public void onDismiss() {
                    setWindowBackgroundLight(mContext);
                    if (mOnDismissListener != null) {
                        mOnDismissListener.onDismiss();
                    }
                }
            });
            setWindowBackgroundDark(mContext, mWindowBackgroundDarkAlpha);
            return mPopupWindow;
        }

        /**
         * 设置黑暗度
         *
         * @param activity
         */
        @Deprecated
        private void addWindowbg2(Activity activity) {
            Window mWindow = activity.getWindow();
            WindowManager.LayoutParams params = mWindow.getAttributes();
            params.dimAmount = 1.0f;//0.0f完全不暗，即背景是可见的 ，1.0f背景全部变黑暗
            mWindow.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            mWindow.setAttributes(params);

        }

        /**
         * 设置透明度
         * params.alpha  默认 是 1.0f;
         *
         * @param context
         * @param alpha   1.0f 背景全亮  0.0f背景全黑
         */
        private void setWindowBackground(Context context, float alpha) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                WindowManager.LayoutParams params = window.getAttributes();
                params.alpha = alpha;
                window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);//!!!!
                window.setAttributes(params);

            }
        }

        private void setWindowBackgroundDark(Context context, float mWindowBackgroundDarkAlpha) {
            if (mWindowBackgroundDarkAlpha == 1.0f) {
                return;
            }
            if (mWindowBackgroundDarkAlpha < 0) {
                mWindowBackgroundDarkAlpha = 0;
            } else if (mWindowBackgroundDarkAlpha > 1) {
                mWindowBackgroundDarkAlpha = 1;
            }
            setWindowBackground(context, mWindowBackgroundDarkAlpha);
        }

        private void setWindowBackgroundLight(Context context) {
            if (mWindowBackgroundDarkAlpha == 1.0f) {
                return;
            }
            setWindowBackground(context, 1.0f);
        }

    }


}

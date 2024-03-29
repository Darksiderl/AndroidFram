package com.beiing.baseframe.bases;

import android.content.Context;
import android.os.Bundle;
import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

/**
 * Created by chenliu on 2016/4/14.
 * 描述：1.不使用注入框架，findViewById、setEvent需要自己写
 *       2.MVP模式
 */
public abstract class BaseActivity0<P extends BasePresenter> extends SwipeBackActivity{
    protected SwipeBackLayout mSwipeBackLayout;
    protected Context mContext;
    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init0();
        //模板
        initRoot(savedInstanceState);
        initPresenter();
        initViews();
        initData();
        setListener();
        getNetData();
    }



    protected  void init0(){
        mSwipeBackLayout = getSwipeBackLayout();
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
        mSwipeBackLayout.setEnableGesture(true);
        mContext = this;
    }

    /**
     * 功能描述：<初始化presenter>
     */
    protected abstract void initPresenter();
    /**
     * 功能描述：<加载布局、或特殊处理（如家在首页fragments操作）>
     */
    protected abstract void initRoot(Bundle savedInstanceState);
    /**
     * 功能描述：<初始化控件>
     */
    protected abstract void initViews();
    /**
     * 功能描述：<初始化数据>
     */
    protected abstract void initData();

    /**
     * 功能描述：<设置监听>
     */
    protected abstract void setListener();

    /**
     * 功能描述：<向后台请求数据>
     */
    protected abstract void getNetData();


    //----------------------------生命周期方法中可以进行 友盟统计、自定义Activity管理器处理-----

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

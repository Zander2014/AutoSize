# AutoSize
根据今日头条的屏幕适配解决方案，简单封装一个工具类
# Usage
在Application和Activity的getResources()中
```
public Resources getResources() {
    return AutoSize.applyAdapt(super.getResources(), 375f, ScreenHelper.WIDTH_DP);
}

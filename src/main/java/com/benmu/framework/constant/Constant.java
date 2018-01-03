package com.benmu.framework.constant;

/**
 * Created by Carry on 2017/8/7.
 */

public class Constant {

    /**
     * router参数
     */
    public static final String ROUTERPARAMS = "ROUTERPARAMS";


    /**
     * 首页url
     */
    public static final String HOME_URL = "HOME_URL";

    /**
     * 分享内容key
     */

    public static final String WEBVIEW_PARAMS = "WEBVIEW_PARAMS";

    /*
     地图页面接受参数
     */
    public static final String MAPVIEW_PARAMS = "MAPVIEW_PARAMS";

    public static final String AMAP_KEY = "a3308e6aef150346915922d2ea292590";


    /**
     * 通知相关
     */
    public static class Notification {
        /**
         * 显示通知的ID
         */
        public static final int NOTIFY_ID_MESSAGE = 1;

        /**
         * 消息通知参数key
         */
        public static final String TAG_NOTIFICATION = "TAG_NOTIFICATION";


        /**
         * 推送function type
         */
        public static final class FunctionType {
            //顶号
            public static final String OCCUPY = "APP_OCCUPY";
            //健康助手
            public static final String SEND_REPLY = "SEND_REPLY";
            //健康助手关单
            public static final String SEND_CLOSE = "SEND_CLOSE";
        }
    }


    /**
     * sp存储key
     */
    public static class SP {
        public static final String SP_API_URL = "API_URL_SP";
        public static final String SP_NATIVE_NAME = "BMWEEXOPEN_NATIVE_SP";
        public static final String SP_JS_NAME = "BMWEEXOPEN_JS_SP";
        public static final String SP_TOKEN = "SP_TOKEN";
        public static final String SP_USERINFO = "SP_USERINFO";
        public static final String SP_VERSION = "SP_VERSION";
        public static final String SP_FIRST_LAUNCHER = "SP_FIRST_LAUNCHER";
        public static final String SP_DOWNLOAD_VERSION = "SP_DOWNLOAD_VERSION";
        public static final String SP_CID = "SP_CID";
        public static final String SP_INTERCEPTOR_ACTIVE = "SP_INTERCEPTOR_ACTIVE";
        public static final String SP_DEBUG_ACTIVE = "SP_DEBUG_ACTIVE";
        public static final String SP_FONTSIZE = "SP_FONTSIZE";
        public static final String SP_APPCHANNEL = "SP_APPCHANNEL";
        public static final String SP_KEY_WH = "SP_KEY_WH";
    }

    /**
     * native事件
     */
    public static class Action {
        public static String ACTION_GOBALFONTSIZE_CHANGE = "com.benmu.jyt" +
                ".ACTION_GOBALFONTSIZE_CHANGE";
        public static String ACTION_SCREENSHOT = "com.benmu.jyt.ACTION_SCREENSHOT";
        public static String ACTION_UPDATE_DEBUG = "com.benmu.jyt.ACTION_UPDATE_DEBUG";
        public static final String ACTION_NOTIFICATION = "com.benmu.jyt.ACTION_NOTIFICATION";
        public static final String ACTION_ALERT_UPDATE = "com.benmu.jyt.ACTION_ALERT_UPDATE";
        public static final String ACTION_AUTHLOGIN_CANCEL = "com.benmu.jyt" +
                ".ACTION_AUTHLOGIN_CANCEL";
    }

    /**
     * 本地字体配置
     */
    public static class FontSize {
        public static String NORM = "NORM";
        public static String BIG = "BIG";
        public static String EXTRALARGE = "EXTRALARGE";
    }

    /**
     * -------------------------监控配置-------------------------------
     **/
    public static class Monintor {
        public static final String APP_NAME = "fe_app_jyt";
        public static final String MONINTOR_RENDERTIME = "screenRenderTime";
        public static final String PLATFORM = "Android";
        public static final String MONINTOR_RENDERTIME_ALIAS = "js渲染时间";
        public static final String MONINTOR_REQUEST_TIME = "request_time";
        public static final String MONINTOR_REQUEST_TIME_ALIAS = "接口时间";
        public static final String MONINTOR_REQUEST_FAILED = "request_error";
        public static final String MONINTOR_REQUEST_FAILED_ALIAS = "请求失败";
        public static final String MONINTOR_IMAGE_FAILED = "img_error";
        public static final String MONINTOR_IMAGE_FAILED_ALIAS = "图片错误";
        public static final String MONINTOR_JSERROR = "jsError";
        public static final String MONINTOR_JSERROR_ALIAS = "js错误";
        public static final String MONINTOR_DOWNLOADERROR = "downloadJsFailed";
        public static final String MONINTOR_DOWNLOADERROR_ALIAS = "下载js资源失败";
        public static final String MONINTOR_DIFFERROR = "jsDiffFailed";
        public static final String MONINTOR_DIFFERROR_ALIAS = "jsDiff失败";
    }


    /**
     * -------------------------客制化环境配置-------------------------------
     **/
    public static class CustomOptions {
        //font
        public static final String CUSTOM_FONTSIZE = "bmFontSize";
        //reqeust
        public static final String CUSTOM_REQUESTURL = "request";
        //jsServer
        public static final String CUSTOM_SERVERURL = "jsServer";
        //deviceId
        public static final String CUSTOM_DEVICEID = "deviceId";
        //appName
        public static final String CUSTOM_APPNAME = "appName";
        //状态栏高度
        public static final String CUSTOM_STATUSBARHEIGHT = "statusBarHeight";
        public static final String CUSTOM_REALDEVICEHEIGHT = "realDeviceHeight";
        //导航栏高度
        public static final String CUSTOM_NAVBARHEIGHT = "navBarHeight";
        //内置js版本
        public static final String CUSTOM_JSVERSION = "jsVersion";
    }


    /**
     * ------------------------ImageMager --------------------------
     */
    public static final class ImageConstants {

        public static final int IMAGE_PICKER = 100;
        //上传图片最大宽度像素
        public static int BIGGESTWIDTH = 828;

        public static final String UPLOAD_IMAGE_BEAN = "upload_image_bean";

        public static final int PICK_FROM_CAMERA = 1000;
        public static final int PICK_FROM_GALLERY = 1001;
    }

    /**
     * 唤醒action
     */

    public static final class AwakeAction {
        public static final String ACTION_OPENPAGE = "openPage";
        public static final String ACTION_OPENTAB = "openTab";
    }


    public static final class BROWSE_EVENT {
        public static final String BROWSE_IMG_BEAN = "browse_img_bean";
    }


    public static final String BMPAGE_CATEGORY = "com.benmu.weex.example.categoty.page";

    public static final String BMWEBVIEW_CATEGORY = "com.benmu.weex.example.category.web";

    public static final String BMDEBUG_CATEGORY = "com.benmu.weex.example.category.debug";


    public static final class ACTIVITIES_ANIMATION {
        public static final String ANIMATION_PUSH = "PUSH";
        public static final String ANIMATION_PRESENT = "PRESENT";
        public static final String ANIMATION_TRANSLATION = "TRANSLATION";
    }


    public static final String PLATFORM_CONFIG_NAME = "eros.native.json";

    public static final String BUNDLE_ZIP_NAME = "bundle.zip";

    public static final String DEBUG_ACTIVE = "debug_active";
    public static final String DEBUG_DEACTIVE = "debug_deactivate";
    public static final String INTERCEPTOR_ACTIVE = "active";
    public static final String INTERCEPTOR_DEACTIVE = "deactivate";

    public static class Version {
        public static final int UPDATING = 0;
        public static final int SLEEP = 1;
    }

    /**
     * 解密Key
     */
    public static final String AES_KEY = "176e6f1f7e1bbaf723827caa4c56a4b8";

    /**
     * Request Code 相关
     */
    public static final class REQUEST_CODE {
        public static final int REQUEST_CODE_CONTRACT = 0xf71;
    }
}

package com.yur.util;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommResponse {

        /**
         * 返回的对象。
         */
        private Object msg;

        /**
         * 是否成功标志。
         */
        private boolean success;

        /**
         * 使用成功表示和返回的对象创建通用json格式。
         *
         * @param success
         * @param msg
         */
        public CommResponse(boolean success, Object msg) {
            super();
            this.success = success;
            if (msg != null && StringUtils.isNotBlank(msg.toString())) {
                this.msg = msg;
            } else {
                this.msg = "";
            }

        }

        /**
         * 使用是否成功标志及字符串数据创建通用json对象。,<br/>
         * 例如<br/>
         * 传入参数(true,"userId","00212","userName","admin","age","23")创建出以下格式返回对象:<br/>
         * {<br/>
         * &nbsp;&nbsp;&nbsp;&nbsp;success&nbsp;:&nbsp;true,<br/>
         * &nbsp;&nbsp;&nbsp;&nbsp;msg&nbsp;:&nbsp;{<br/>
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;userId&nbsp;:&nbsp;00212,<br/>
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;userName&nbsp;:&nbsp;
         * admin,<br/>
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;age&nbsp;:&nbsp;23<br/>
         * &nbsp;&nbsp;&nbsp;&nbsp;}<br/>
         * }
         *
         * @param success
         * @param args
         */
        public CommResponse(boolean success, Object... args) {
            super();
            this.success = success;
            Map<String, Object> map = new HashMap<String, Object>();
            if (args != null && args.length>0) {
                for (int i = 0; i < args.length - 1; i++) {
                    if (i % 2 == 0) {
                        if (args[i] != null && args[i + 1] != null) {
                            map.put(args[i].toString(), args[i + 1]);
                        }
                    }
                }
                this.msg = map;
            }else{
                if(success) {
                    this.msg = "";
                } else {
                    this.msg = "";
                }
            }
        }

        public Object getMsg() {
            return msg;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setMsg(Object msg) {
            this.msg = msg;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        /**
         * 将通用json格式转换为的Map类型。
         *
         * @return
         */
       /* public Map<String, Object> toMap() {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success", success);
            map.put("msg", msg);
            return map;
        }*/

        public static CommResponse Ok(Object... args) {
            if(args.length == 1){
                return new CommResponse(true,args[0]);
            }
            return new CommResponse(true, args);
        }

        public static CommResponse Fail(Object... args) {
            if(args.length == 1){
                return new CommResponse(false,args[0]);
            }
            return new CommResponse(false, args);
        }
}

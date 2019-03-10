package com.baijimao.rollapi.bean;

/**
 * @author: baijimao
 * @date: 2019/3/10
 * Description:
 */
public class ResponseBean {

    /**
     * code : 1
     * msg : 数据返回成功
     * data : null
     */

    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

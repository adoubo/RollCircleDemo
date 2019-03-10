package com.baijimao.rollapi.bean;

import java.util.List;

/**
 * @author: baijimao
 * @date: 2019/3/10
 * Description: Get the latest two-color ball winning number list information
 */
public class PageSsqBean {

    /**
     * code : 1
     * msg : 数据返回成功
     * data : {"page":1,"totalCount":941,"totalPage":95,"limit":10,"list":[{"openCode":"02,05,07,08,20,27+04","code":"ssq","expect":"2019021","name":"双色球","time":"2019-02-24 21:18:20"},{"openCode":"02,12,13,23,27,28+12","code":"ssq","expect":"2019020","name":"双色球","time":"2019-02-21 21:18:20"},{"openCode":"03,11,17,18,24,25+06","code":"ssq","expect":"2019019","name":"双色球","time":"2019-02-19 21:18:20"},{"openCode":"04,11,18,19,26,32+04","code":"ssq","expect":"2019018","name":"双色球","time":"2019-02-17 21:18:20"},{"openCode":"04,05,24,28,30,33+09","code":"ssq","expect":"2019017","name":"双色球","time":"2019-02-14 21:18:20"},{"openCode":"05,07,09,11,19,25+05","code":"ssq","expect":"2019016","name":"双色球","time":"2019-02-12 21:18:20"},{"openCode":"11,15,16,20,24,31+04","code":"ssq","expect":"2019015","name":"双色球","time":"2019-02-03 21:18:20"},{"openCode":"01,02,03,14,19,33+03","code":"ssq","expect":"2019014","name":"双色球","time":"2019-01-31 21:18:20"},{"openCode":"05,07,14,16,18,21+01","code":"ssq","expect":"2019013","name":"双色球","time":"2019-01-29 21:18:20"},{"openCode":"07,10,21,23,31,33+14","code":"ssq","expect":"2019012","name":"双色球","time":"2019-01-27 21:18:20"}]}
     */

    private int code;
    private String msg;
    private DataBean data;

    @Override
    public String toString() {
        return "PageSsqBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * page : 1
         * totalCount : 941
         * totalPage : 95
         * limit : 10
         * list : [{"openCode":"02,05,07,08,20,27+04","code":"ssq","expect":"2019021","name":"双色球","time":"2019-02-24 21:18:20"},{"openCode":"02,12,13,23,27,28+12","code":"ssq","expect":"2019020","name":"双色球","time":"2019-02-21 21:18:20"},{"openCode":"03,11,17,18,24,25+06","code":"ssq","expect":"2019019","name":"双色球","time":"2019-02-19 21:18:20"},{"openCode":"04,11,18,19,26,32+04","code":"ssq","expect":"2019018","name":"双色球","time":"2019-02-17 21:18:20"},{"openCode":"04,05,24,28,30,33+09","code":"ssq","expect":"2019017","name":"双色球","time":"2019-02-14 21:18:20"},{"openCode":"05,07,09,11,19,25+05","code":"ssq","expect":"2019016","name":"双色球","time":"2019-02-12 21:18:20"},{"openCode":"11,15,16,20,24,31+04","code":"ssq","expect":"2019015","name":"双色球","time":"2019-02-03 21:18:20"},{"openCode":"01,02,03,14,19,33+03","code":"ssq","expect":"2019014","name":"双色球","time":"2019-01-31 21:18:20"},{"openCode":"05,07,14,16,18,21+01","code":"ssq","expect":"2019013","name":"双色球","time":"2019-01-29 21:18:20"},{"openCode":"07,10,21,23,31,33+14","code":"ssq","expect":"2019012","name":"双色球","time":"2019-01-27 21:18:20"}]
         */

        private int page;
        private int totalCount;
        private int totalPage;
        private int limit;
        private List<WinSsqBean.DataBean> list;

        @Override
        public String toString() {
            return "DataBean{" +
                    "page=" + page +
                    ", totalCount=" + totalCount +
                    ", totalPage=" + totalPage +
                    ", limit=" + limit +
                    ", list=" + list +
                    '}';
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public List<WinSsqBean.DataBean> getList() {
            return list;
        }

        public void setList(List<WinSsqBean.DataBean> list) {
            this.list = list;
        }
    }
}

package com.nevic.taipeitravel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyData {
    @SerializedName("data")
    private Data data;// FIXME check this code
    @SerializedName("status")
    private int status;
    @SerializedName("statusText")
    private String statusText;
    @SerializedName("headers")
    private Headers headers;
    public Data getData() {
        return data;
    }
    public static class Data {
        /**
         * result : {"limit":5,"offset":0,"count":118,"sort":"","results":[{"_id":1,"公務車數量(含特種車)":"11","機關名稱":"秘書處"},{"_id":2,"公務車數量(含特種車)":"6","機關名稱":"兵役局"},{"_id":3,"公務車數量(含特種車)":"3","機關名稱":"政風處"},{"_id":4,"公務車數量(含特種車)":"110","機關名稱":"新工處"},{"_id":5,"公務車數量(含特種車)":"67","機關名稱":"水利處"}]}
         */

        @SerializedName("result")
        private Result result;

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public static class Result {
            /**
             * limit : 5
             * offset : 0
             * count : 118
             * sort :
             * results : [{"_id":1,"公務車數量(含特種車)":"11","機關名稱":"秘書處"},{"_id":2,"公務車數量(含特種車)":"6","機關名稱":"兵役局"},{"_id":3,"公務車數量(含特種車)":"3","機關名稱":"政風處"},{"_id":4,"公務車數量(含特種車)":"110","機關名稱":"新工處"},{"_id":5,"公務車數量(含特種車)":"67","機關名稱":"水利處"}]
             */

            @SerializedName("limit")
            private int limit;
            @SerializedName("offset")
            private int offset;
            @SerializedName("count")
            private int count;
            @SerializedName("sort")
            private String sort;
            @SerializedName("results")
            private java.util.List<Results> results;

            public int getLimit() {
                return limit;
            }

            public void setLimit(int limit) {
                this.limit = limit;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getSort() {
                return sort;
            }

            public void setSort(String sort) {
                this.sort = sort;
            }

            public List<Results> getResults() {
                return results;
            }

            public void setResults(List<Results> results) {
                this.results = results;
            }

            public static class Results {
                /**
                 * _id : 1
                 * 公務車數量(含特種車) : 11
                 * 機關名稱 : 秘書處
                 */

                @SerializedName("_id")
                private int id;
                @SerializedName("公務車數量(含特種車)")
                private String _$305;// FIXME check this code
                @SerializedName("機關名稱")
                private String 機關名稱;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String get_$305() {
                    return _$305;
                }

                public void set_$305(String _$305) {
                    this._$305 = _$305;
                }

                public String get機關名稱() {
                    return 機關名稱;
                }

                public void set機關名稱(String 機關名稱) {
                    this.機關名稱 = 機關名稱;
                }
            }
        }
    }

    public static class Headers {
        /**
         * access-control-allow-headers : X-Requested-With, Content-Type, Accept, Origin, Authorization
         * access-control-allow-methods : GET, POST, PUT, DELETE, PATCH, OPTIONS
         * access-control-allow-origin : *
         * cache-control : no-store, no-cache, must-revalidate
         * connection : keep-alive
         * content-length : 436
         * content-security-policy : frame-ancestors https://www.tgos.tw, frame-ancestors https://www.tgos.tw
         * content-type : application/json
         * date : Tue, 30 Mar 2021 01:53:18 GMT
         * expires : Thu, 19 Nov 1981 08:52:00 GMT
         * pragma : no-cache
         * server : nginx
         * x-content-type-options : nosniff, nosniff
         * x-frame-options : SAMEORIGIN, SAMEORIGIN
         * x-xss-protection : 1;mode=block, 1;mode=block
         */

        @SerializedName("access-control-allow-headers")
        private String accesscontrolallowheaders;
        @SerializedName("access-control-allow-methods")
        private String accesscontrolallowmethods;
        @SerializedName("access-control-allow-origin")
        private String accesscontrolalloworigin;
        @SerializedName("cache-control")
        private String cachecontrol;
        @SerializedName("connection")
        private String connection;
        @SerializedName("content-length")
        private String contentlength;
        @SerializedName("content-security-policy")
        private String contentsecuritypolicy;
        @SerializedName("content-type")
        private String contenttype;
        @SerializedName("date")
        private String date;
        @SerializedName("expires")
        private String expires;
        @SerializedName("pragma")
        private String pragma;
        @SerializedName("server")
        private String server;
        @SerializedName("x-content-type-options")
        private String xcontenttypeoptions;
        @SerializedName("x-frame-options")
        private String xframeoptions;
        @SerializedName("x-xss-protection")
        private String xxssprotection;

        public String getAccesscontrolallowheaders() {
            return accesscontrolallowheaders;
        }

        public void setAccesscontrolallowheaders(String accesscontrolallowheaders) {
            this.accesscontrolallowheaders = accesscontrolallowheaders;
        }

        public String getAccesscontrolallowmethods() {
            return accesscontrolallowmethods;
        }

        public void setAccesscontrolallowmethods(String accesscontrolallowmethods) {
            this.accesscontrolallowmethods = accesscontrolallowmethods;
        }

        public String getAccesscontrolalloworigin() {
            return accesscontrolalloworigin;
        }

        public void setAccesscontrolalloworigin(String accesscontrolalloworigin) {
            this.accesscontrolalloworigin = accesscontrolalloworigin;
        }

        public String getCachecontrol() {
            return cachecontrol;
        }

        public void setCachecontrol(String cachecontrol) {
            this.cachecontrol = cachecontrol;
        }

        public String getConnection() {
            return connection;
        }

        public void setConnection(String connection) {
            this.connection = connection;
        }

        public String getContentlength() {
            return contentlength;
        }

        public void setContentlength(String contentlength) {
            this.contentlength = contentlength;
        }

        public String getContentsecuritypolicy() {
            return contentsecuritypolicy;
        }

        public void setContentsecuritypolicy(String contentsecuritypolicy) {
            this.contentsecuritypolicy = contentsecuritypolicy;
        }

        public String getContenttype() {
            return contenttype;
        }

        public void setContenttype(String contenttype) {
            this.contenttype = contenttype;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getExpires() {
            return expires;
        }

        public void setExpires(String expires) {
            this.expires = expires;
        }

        public String getPragma() {
            return pragma;
        }

        public void setPragma(String pragma) {
            this.pragma = pragma;
        }

        public String getServer() {
            return server;
        }

        public void setServer(String server) {
            this.server = server;
        }

        public String getXcontenttypeoptions() {
            return xcontenttypeoptions;
        }

        public void setXcontenttypeoptions(String xcontenttypeoptions) {
            this.xcontenttypeoptions = xcontenttypeoptions;
        }

        public String getXframeoptions() {
            return xframeoptions;
        }

        public void setXframeoptions(String xframeoptions) {
            this.xframeoptions = xframeoptions;
        }

        public String getXxssprotection() {
            return xxssprotection;
        }

        public void setXxssprotection(String xxssprotection) {
            this.xxssprotection = xxssprotection;
        }
    }
}

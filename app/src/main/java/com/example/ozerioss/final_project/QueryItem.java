package com.example.ozerioss.final_project;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.List;

public class QueryItem {
    /**
     * kind : youtube#searchListResponse
     * etag : "uQc-MPTsstrHkQcRXL3IWLmeNsM/fLoeATK_40QZHeoehb2pUJorBaw"
     * nextPageToken : CAUQAA
     * regionCode : FR
     * pageInfo : {"totalResults":1000000,"resultsPerPage":5}
     * items : [{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/zBfi9eVYwlyxPx5Pegu4lCNSETM\"","id":{"kind":"youtube#video","videoId":"Ip3G3EHBNrA"},"snippet":{"publishedAt":"2015-12-11T16:01:38.000Z","channelId":"UCpeKpGjdi31BhdO6qPRQbVQ","title":"TOP 5 : TRUC DE FOU sur GTA 5","description":"TOP 5 : TRUC DE FOU sur GTA 5 JEUX ET CLÉS STEAM -70% ici : https://www.instant-gaming.com/fr/?igr=PlayComedyClub1 Gros DÉLIRE sur GTA V, FUN ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/hqdefault.jpg","width":480,"height":360}},"channelTitle":"PlayComedyClub","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/GsEBSYgAw5lfxEYTZ74R0q-2W90\"","id":{"kind":"youtube#video","videoId":"rjzU2dwlaVs"},"snippet":{"publishedAt":"2016-08-17T02:45:25.000Z","channelId":"UCXapmUVeUhgRAbKKog6w5sw","title":"My love story ♡Truc's hobbies♡","description":"WATCHE IN HD♡ Mọi thông tin ở dưới này nha mọi người Nhân dịp kỉ niệm 2 năm ngày cưới ( 16-08-2014), Trúc sửa và post lại video này cho các bạn...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/rjzU2dwlaVs/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/rjzU2dwlaVs/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/rjzU2dwlaVs/hqdefault.jpg","width":480,"height":360}},"channelTitle":"Truc's hobbies","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/qfLJ4B5AGHOLYKy1JYBDGXAtSR8\"","id":{"kind":"youtube#video","videoId":"9l54AL4dVpY"},"snippet":{"publishedAt":"2016-12-03T16:55:35.000Z","channelId":"UCElRA3e8QeWX3zTifRnXHJA","title":"Nicolae Guta - Am eu un truc ( oficial video 2017 ) hit","description":"click pe link-u de mai jos pentru lista completa de videoclipuri in varianta full ⤵⤵⤵⤵⤵ http://vid.io/xckY NU COPIATI CLIPU CA RISCATI SA VI SE STEARGA ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/9l54AL4dVpY/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/9l54AL4dVpY/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/9l54AL4dVpY/hqdefault.jpg","width":480,"height":360}},"channelTitle":"Fero Music Production","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/pbuC96XOso3lzlLsoleKGnBRIsw\"","id":{"kind":"youtube#video","videoId":"v6NTX2gH_uM"},"snippet":{"publishedAt":"2015-11-19T00:15:45.000Z","channelId":"UCPde4guD9yFBRzkxk2PatoA","title":"Online LIVE idol channel [ALL THE KPOP]","description":"ALL THE K-POP Online IDOL CHANNEL Welcome To ALL THE K-POP! NEXT WEEK FRIDAY [SEVENTEEN One Fine Day in Japan] Coming Soon [weekly idol] ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/v6NTX2gH_uM/default_live.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/v6NTX2gH_uM/mqdefault_live.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/v6NTX2gH_uM/hqdefault_live.jpg","width":480,"height":360}},"channelTitle":"ALL THE K-POP","liveBroadcastContent":"live"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/uGUHGNpfNHEPgAnrLP9j4o5ZJAw\"","id":{"kind":"youtube#video","videoId":"d1A084CDnuU"},"snippet":{"publishedAt":"2017-03-22T13:00:05.000Z","channelId":"UCPSa0VZOtl49OoDhtiuGdwg","title":"Le Mystère de Nokris, Fils caché d'Oryx. / Un Truc Pas si Useless sur Destiny #25","description":"Merci à Snipemen pour le tuyau! Yo les gens! On se retrouve aujourd'hui pour une petite vidéo sur Destiny pour un truc totalement useless! Ou alors pas tant ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/d1A084CDnuU/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/d1A084CDnuU/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/d1A084CDnuU/hqdefault.jpg","width":480,"height":360}},"channelTitle":"GijohnDo","liveBroadcastContent":"none"}}]
     */

    private String kind;
    private String etag;
    private String nextPageToken;
    private String regionCode;
    private PageInfoBean pageInfo;
    private List<ItemsBean> items;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public PageInfoBean getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoBean pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class PageInfoBean {
        /**
         * totalResults : 1000000
         * resultsPerPage : 5
         */

        private int totalResults;
        private int resultsPerPage;

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public int getResultsPerPage() {
            return resultsPerPage;
        }

        public void setResultsPerPage(int resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }
    }

    public static class ItemsBean {
        /**
         * kind : youtube#searchResult
         * etag : "uQc-MPTsstrHkQcRXL3IWLmeNsM/zBfi9eVYwlyxPx5Pegu4lCNSETM"
         * id : {"kind":"youtube#video","videoId":"Ip3G3EHBNrA"}
         * snippet : {"publishedAt":"2015-12-11T16:01:38.000Z","channelId":"UCpeKpGjdi31BhdO6qPRQbVQ","title":"TOP 5 : TRUC DE FOU sur GTA 5","description":"TOP 5 : TRUC DE FOU sur GTA 5 JEUX ET CLÉS STEAM -70% ici : https://www.instant-gaming.com/fr/?igr=PlayComedyClub1 Gros DÉLIRE sur GTA V, FUN ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/hqdefault.jpg","width":480,"height":360}},"channelTitle":"PlayComedyClub","liveBroadcastContent":"none"}
         */

        private String kind;
        private String etag;
        private IdBean id;
        private SnippetBean snippet;

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getEtag() {
            return etag;
        }

        public void setEtag(String etag) {
            this.etag = etag;
        }

        public IdBean getId() {
            return id;
        }

        public void setId(IdBean id) {
            this.id = id;
        }

        public SnippetBean getSnippet() {
            return snippet;
        }

        public void setSnippet(SnippetBean snippet) {
            this.snippet = snippet;
        }

        public static class IdBean {
            /**
             * kind : youtube#video
             * videoId : Ip3G3EHBNrA
             */

            private String kind;
            private String videoId;

            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public String getVideoId() {
                return videoId;
            }

            public void setVideoId(String videoId) {
                this.videoId = videoId;
            }
        }

        public static class SnippetBean {
            /**
             * publishedAt : 2015-12-11T16:01:38.000Z
             * channelId : UCpeKpGjdi31BhdO6qPRQbVQ
             * title : TOP 5 : TRUC DE FOU sur GTA 5
             * description : TOP 5 : TRUC DE FOU sur GTA 5 JEUX ET CLÉS STEAM -70% ici : https://www.instant-gaming.com/fr/?igr=PlayComedyClub1 Gros DÉLIRE sur GTA V, FUN ...
             * thumbnails : {"default":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/hqdefault.jpg","width":480,"height":360}}
             * channelTitle : PlayComedyClub
             * liveBroadcastContent : none
             */

            private String publishedAt;
            private String channelId;
            private String title;
            private String description;
            private ThumbnailsBean thumbnails;
            private String channelTitle;
            private String liveBroadcastContent;

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getChannelId() {
                return channelId;
            }

            public void setChannelId(String channelId) {
                this.channelId = channelId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public ThumbnailsBean getThumbnails() {
                return thumbnails;
            }

            public void setThumbnails(ThumbnailsBean thumbnails) {
                this.thumbnails = thumbnails;
            }

            public String getChannelTitle() {
                return channelTitle;
            }

            public void setChannelTitle(String channelTitle) {
                this.channelTitle = channelTitle;
            }

            public String getLiveBroadcastContent() {
                return liveBroadcastContent;
            }

            public void setLiveBroadcastContent(String liveBroadcastContent) {
                this.liveBroadcastContent = liveBroadcastContent;
            }

            public static class ThumbnailsBean {
                /**
                 * default : {"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/default.jpg","width":120,"height":90}
                 * medium : {"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/mqdefault.jpg","width":320,"height":180}
                 * high : {"url":"https://i.ytimg.com/vi/Ip3G3EHBNrA/hqdefault.jpg","width":480,"height":360}
                 */

                @SerializedName("default")
                private DefaultBean defaultX;
                private MediumBean medium;
                private HighBean high;

                public DefaultBean getDefaultX() {
                    return defaultX;
                }

                public void setDefaultX(DefaultBean defaultX) {
                    this.defaultX = defaultX;
                }

                public MediumBean getMedium() {
                    return medium;
                }

                public void setMedium(MediumBean medium) {
                    this.medium = medium;
                }

                public HighBean getHigh() {
                    return high;
                }

                public void setHigh(HighBean high) {
                    this.high = high;
                }

                public static class DefaultBean {
                    /**
                     * url : https://i.ytimg.com/vi/Ip3G3EHBNrA/default.jpg
                     * width : 120
                     * height : 90
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class MediumBean {
                    /**
                     * url : https://i.ytimg.com/vi/Ip3G3EHBNrA/mqdefault.jpg
                     * width : 320
                     * height : 180
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class HighBean {
                    /**
                     * url : https://i.ytimg.com/vi/Ip3G3EHBNrA/hqdefault.jpg
                     * width : 480
                     * height : 360
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }
            }
        }
    }
}

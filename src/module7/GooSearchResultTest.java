package module7;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

class GooSearchResult{
    private String url;

    public GooSearchResult(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain(){
        String str;
        if (url.startsWith("http://") == true){
            url = url.substring(7, url.length());
        }else{
            url = url.substring(8, url.length());
        }

        int index = url.indexOf('/');
        if (index > 0) {
            url = url.substring(0, index);
        }
        return url;
    }
}

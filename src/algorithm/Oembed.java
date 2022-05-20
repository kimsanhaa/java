package algorithm;

public class Oembed {
    public String youtubeHandler(String url) {
        String mid = url.split("watch\\?v=")[1];
        String top="https://www.youtube.com/oembed?url=https%3A//youtube.com/watch%3Fv%3D ";
        String botm="&format=json";
        String result=top+mid+botm;

        return result;
    }
    public static void main(String[] args) {
        Oembed oembed = new Oembed();
        String url = "https://www.youtube.com/watch?v=SwlnDXytBSE";
        oembed.youtubeHandler(url);

    }

}

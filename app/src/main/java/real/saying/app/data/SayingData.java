package real.saying.app.data;

/**
 * Created by Baek on 2016-02-04.
 */
public class SayingData {
    private String saying;
    private String sayingTranslated;

    public SayingData(String saying, String sayingTranslated) {
        this.saying = saying;
        this.sayingTranslated = sayingTranslated;
    }

    public String getSaying() {
        return saying;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }

    public String getSayingTranslated() {
        return sayingTranslated;
    }

    public void setSayingTranslated(String sayingTranslated) {
        this.sayingTranslated = sayingTranslated;
    }
}

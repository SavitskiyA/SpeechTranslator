package streamspeechrecognition.com.streamspeechrecognition;

/**
 * Created by Andrey on 10.05.2017.
 */

class SpinnerModel{
    String language;
    String alfaLanguage;
    int image;

    public SpinnerModel(String language, String alfaLanguage, int image) {
        this.language = language;
        this.alfaLanguage = alfaLanguage;
        this.image = image;
    }


    public String getLanguage() {
        return language;
    }

    public String getAlfaLanguage() {
        return alfaLanguage;
    }

    public int getImage() {
        return image;
    }
}

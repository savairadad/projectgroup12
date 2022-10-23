package project1;

public interface Webdriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenshot{
    void getScreenshot();
}
interface RemoteWebdriver extends Webdriver,TakeScreenshot{
    void navigate();
}

class ChromeDriver implements RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("Open the Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("close the chrome browser");
    }

    @Override
    public String getTitle() {

        return "Title of Chrome Browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate in chrome browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot of a chrome browser");
    }
}
class FireFoxDriver implements RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("open firefox in the browser");
    }

    @Override
    public void close() {
        System.out.println("close the firefox browser");
    }

    @Override
    public String getTitle() {
        return "Title of firefox browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate with firefox browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("take screenshot of firefox browser");
    }
}
class Safari implements RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("open safari browser");
    }

    @Override
    public void close() {
        System.out.println("close safari browser");
    }

    @Override
    public String getTitle() {
        return "title of safari browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate with safari browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("take a screenshot of safari browser");
    }
}
class tester{
    public static void main(String[] args) {
         RemoteWebdriver[] arr={new ChromeDriver(),new FireFoxDriver(),new Safari()};
         for(RemoteWebdriver obj:arr){
             obj.open();
             obj.close();
             System.out.println(obj.getTitle());
             obj.getScreenshot();
             obj.navigate();
         }
    }
}

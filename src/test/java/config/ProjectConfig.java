package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${device}.properties"
})
public interface ProjectConfig extends Config{
    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();


    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    String getRemoteUrl();

    @Key("browserSize")
    @DefaultValue("100")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();

}

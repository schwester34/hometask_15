package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "classpath:config/API.properties"
})

public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String baseUrl();

    @Key("token")
    default String token() {
        return null;
    }
}

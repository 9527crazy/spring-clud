package cn.cqcet.yidong1702.ch0301.Until;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: ServicelnfoUtil
 * Author:   刘帅
 * Date:     2019-9-19 12:05
 */
@Configuration
public class ServicelnfoUtil implements ApplicationListener<WebServerInitializedEvent> {

    private static WebServerInitializedEvent event;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        ServicelnfoUtil.event=webServerInitializedEvent;
    }
    public static int getPort(){
        int port=event.getWebServer().getPort();
        return port;
    }
}

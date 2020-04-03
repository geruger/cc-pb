package cc.permissiom;

import cc.permissiom.service.ServerMain;

import java.io.IOException;

/**
 * 描述:
 *
 * @author wangyan
 * @date 2020/4/1
 */
public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        final ServerMain server = new ServerMain();
        server.start();
        server.blockUntilShutdown();
    }
}

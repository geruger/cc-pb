package cc.permissiom.service;


import cc.permissiom.other.AnnoationClassScaner;
import cc.permissiom.other.GrpcService;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <br>@see
 * <br>@author chenghao
 * <br>@version v1.0 2019-07-09 5:03 PM
 **/
public class ServerMain {


    private int port = 20080;
    private Server server;

    public void start() throws IOException {
        System.out.println("*** 开始启动GRPC服务......");
        List<Class<?>> grpcServices = new ArrayList<>();
        try {
            grpcServices = AnnoationClassScaner.scanPackage(this.getClass().getPackage().getName(), Arrays.asList(GrpcService.class));
        } catch (URISyntaxException e) {
            System.err.println("*** GrpcService扫描异常终止");
            return;
        }
        if (grpcServices.isEmpty()){
            System.out.println("*** 未扫描到任何GrpcService");
            return;
        }
        ServerBuilder builder = ServerBuilder.forPort(port);
        grpcServices.forEach(service -> {
            System.out.println(String.format("** GrpcService - [%s]",service.getName()));
            try {
                builder.addService((BindableService)service.newInstance());
            } catch (Exception e) {
                System.err.println(String.format("** %s 创建失败",service.getName()));
            }
        });
        server = builder
                .build()
                .start();

        System.out.println(String.format("*** GRPC服务启动成功, IP:%s ,端口号:%s " , "127.0.0.1",port));
        //计算启动时间
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** JVM关闭");
                ServerMain.this.stop();
                System.err.println("*** GRPC服务已关闭");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    // block一直到退出程序
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            System.out.println("*** ");
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final ServerMain server = new ServerMain();
        server.start();
        server.blockUntilShutdown();
    }
}

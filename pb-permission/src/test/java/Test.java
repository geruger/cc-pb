import com.jtzy.aisteel.proto.ucenter.user.IntegerEntity;
import com.jtzy.aisteel.proto.ucenter.user.UserAddEntity;
import com.jtzy.aisteel.proto.ucenter.user.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

/**
 * 描述:
 *
 * @author wangyan
 * @date 2020/4/1
 */
public class Test {

    private final ManagedChannel channel;
    private final UserServiceGrpc.UserServiceBlockingStub blockingStub;

    public Test(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build();
        blockingStub = UserServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name) {
        UserAddEntity request = UserAddEntity.newBuilder().setUsername(name).build();
        IntegerEntity response = blockingStub.userAdd(request);
        System.out.println(response.getIntEnt());
    }

    public static void main(String[] args) throws InterruptedException {
        Test client = new Test("127.0.0.1", 20080);
        client.greet("wwww");
    }
}

package cc.permissiom.service;

import cc.permissiom.other.GrpcService;
import com.jtzy.aisteel.proto.ucenter.user.IntegerEntity;
import com.jtzy.aisteel.proto.ucenter.user.UserAddEntity;
import com.jtzy.aisteel.proto.ucenter.user.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author wangyan
 * @date 2020/4/1
 */

@GrpcService
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase{

    @Override
    public void userAdd(UserAddEntity request, StreamObserver<IntegerEntity> responseObserver) {
        System.out.println("service:" + request.getUsername());
        IntegerEntity builder = IntegerEntity.newBuilder().setIntEnt(1).build();
        // 返回
        responseObserver.onNext(builder);
        // 指出我们已经完成了和 RPC的交互
        responseObserver.onCompleted();
    }
}

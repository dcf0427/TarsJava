// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.2.
// **********************************************************************

package com.qq.tars.netty;

import com.qq.tars.common.support.Holder;
import com.qq.tars.protocol.annotation.Servant;
import com.qq.tars.protocol.tars.annotation.TarsHolder;
import com.qq.tars.protocol.tars.annotation.TarsMethodParameter;

import java.util.concurrent.CompletableFuture;

@Servant
public interface MonitorQueryPrx {
    int query(@TarsMethodParameter(name = "req") MonitorQueryReq req, @TarsHolder(name = "rsp") Holder<MonitorQueryRsp> rsp);

    CompletableFuture<Integer> promise_query(@TarsMethodParameter(name = "req") MonitorQueryReq req, @TarsHolder(name = "rsp") Holder<MonitorQueryRsp> rsp);

}

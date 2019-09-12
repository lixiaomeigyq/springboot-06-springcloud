package com.atguigu.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/9/12.
 */
@Service
public class TicketService {
    public String getTicket(){
        System.out.println("8002");
        return "《厉害了，我的国》";
    }
}

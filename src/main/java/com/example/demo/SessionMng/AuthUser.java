package com.example.demo.SessionMng;

import sun.net.www.MessageHeader;
import sun.net.www.protocol.http.AuthenticationHeader;
import sun.net.www.protocol.http.HttpCallerInfo;

import java.util.Set;

public class AuthUser extends AuthenticationHeader {

    public AuthUser(String s, MessageHeader messageHeader, HttpCallerInfo httpCallerInfo, boolean b) {
        super(s, messageHeader, httpCallerInfo, b);
    }

    public AuthUser(String s, MessageHeader messageHeader, HttpCallerInfo httpCallerInfo, boolean b, Set<String> set) {
        super(s, messageHeader, httpCallerInfo, b, set);
    }
}

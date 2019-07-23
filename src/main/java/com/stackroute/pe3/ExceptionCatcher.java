package com.stackroute.pe3;

public class ExceptionCatcher {
    public String createException(String msg) {
//
//            msg = "Exception received";
//            return msg;
         try {
                throw new Exception();
            } catch (Exception exception) {
                exception.printStackTrace();
            } finally {
                return "finally";
            }

        }
}

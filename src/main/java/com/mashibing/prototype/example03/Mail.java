package com.mashibing.prototype.example03;

import com.mashibing.prototype.example02.AdvTemplate;

public class Mail implements Cloneable{

    private String receiver;  //收件人

    private String subject;   //邮件名称

    private String application;  //称呼

    private String context;  //邮件内容

    private String tail;  //邮件尾部："***版权所有"

    public Mail() {

    }

    public Mail(String receiver, String subject, String application, String context, String tail) {
        this.receiver = receiver;
        this.subject = subject;
        this.application = application;
        this.context = context;
        this.tail = tail;
    }

    public Mail(AdvTemplate advTemplate) {
        this.subject=advTemplate.getAdvSubject();
        this.context=advTemplate.getAdvContext();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "receiver='" + receiver + '\'' +
                ", subject='" + subject + '\'' +
                ", application='" + application + '\'' +
                ", context='" + context + '\'' +
                ", tail='" + tail + '\'' +
                '}';
    }

    @Override
    protected Mail clone()  {

        Mail mail=null;
        try {
            return (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

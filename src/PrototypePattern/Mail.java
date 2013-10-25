package PrototypePattern;

import java.util.ArrayList;

public class Mail implements Cloneable
{
    private ArrayList<String> list = new ArrayList<String>();
    private String            receiver;
    private String            subject;
    private String            appellation;
    private String            context;

    private String            tail;

    public Mail(AdvTemplate tmpleate)
    {
        this.context = tmpleate.getAdvContext();
        this.subject = tmpleate.getAdvSubject();

    }

    @Override
    protected Object clone()
    {
        Mail mail = null;
        try
        {
            mail = (Mail) super.clone();
            mail.list = (ArrayList<String>) this.list.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return mail;
    }

    public final String getReceiver()
    {
        return receiver;
    }

    public final void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    public final String getSubject()
    {
        return subject;
    }

    public final void setSubject(String subject)
    {
        this.subject = subject;
    }

    public final String getAppellation()
    {
        return appellation;
    }

    public final void setAppellation(String appellation)
    {
        this.appellation = appellation;
    }

    public final String getContext()
    {
        return context;
    }

    public final void setContext(String context)
    {
        this.context = context;
    }

    public final String getTail()
    {
        return tail;
    }

    public final void setTail(String tail)
    {
        this.tail = tail;
    }

}

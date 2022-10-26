package com.example.bank_management.Model;

import com.example.bank_management.View_manager.View_manager;

public class Model
{
    private static Model model;
    private final View_manager view_manager;

    private Model()
    {
        this.view_manager=new View_manager();
    }

    public static synchronized Model get_model()
    {
        if(model==null) model=new Model();
        return model;
    }

    public View_manager get_view_manager()
    {
        return view_manager;
    }
}

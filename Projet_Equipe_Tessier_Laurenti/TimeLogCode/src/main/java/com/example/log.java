package com.example;

import java.util.Date;

public class Log {
    private Date date_operation;
    private String operation_type;
    private int id;
    private int employee_id;

    public Log(Date date_operation, int project_id, String operation_type, int employee_id){
        this.date_operation = date_operation;
        this.operation_type = operation_type;
        this.id = project_id;
        this.employee_id = employee_id;

    }

    public Date get_date_operation() { return date_operation; }

    public String get_operation_type() { return operation_type; }

    public int get_project_id() { return id; }

    public int get_employee_id() { return employee_id;}
}

package com.example.admin.service;

import com.example.admin.model.Admin;

import java.util.List;

public interface AdminService {
    public Admin addAdmin(Admin admin);

   public List<Admin> addAllAdmins(List<Admin> admins);

    public Admin getAdmin(int id);

/*
   public Admin getAdmin(int id);
*/
}

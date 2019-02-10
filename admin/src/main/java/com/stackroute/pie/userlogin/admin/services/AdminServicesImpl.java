package com.stackroute.pie.userlogin.admin.services;

import com.stackroute.pie.userlogin.admin.domain.FormFormat;
import com.stackroute.pie.userlogin.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServicesImpl implements AdminServices{
    private AdminRepository adminRepository;
    @Autowired
    public AdminServicesImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    public FormFormat addNewFormFormat(FormFormat formFormat) {
        FormFormat savedFormFormat = adminRepository.save(formFormat);
        return savedFormFormat;
    }
    @Override
    public List<FormFormat> getAllFormFormats() {
        List<FormFormat> allFormFormats = adminRepository.findAll();
        return allFormFormats;
    }

    @Override
    public void deleteFormFormat(int formId) {
        adminRepository.deleteById(formId);
    }

    @Override
    public Optional<FormFormat> getFormFormat(int formId) {
        if(adminRepository.existsById(formId) == false)
            return null;
        Optional<FormFormat> retrievedFormFormat = adminRepository.findById(formId);
        return retrievedFormFormat;
    }

    @Override
    public FormFormat updateFormFormat(int formId, FormFormat updatedFormFormat) {
        adminRepository.deleteById(formId);
        updatedFormFormat.setFormId(formId);
        FormFormat newFormFormat = adminRepository.save(updatedFormFormat);
        return newFormFormat;
    }
}

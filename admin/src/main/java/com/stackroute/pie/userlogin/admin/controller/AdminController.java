package com.stackroute.pie.userlogin.admin.controller;

import com.stackroute.pie.userlogin.admin.domain.FormFormat;
import com.stackroute.pie.userlogin.admin.services.AdminServices;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Data
@Controller
@RequestMapping("/api/v1/")
public class AdminController {
    private AdminServices adminServices;
    @Autowired
    public AdminController(AdminServices adminServices) {
        this.adminServices = adminServices;
    }
    @PostMapping("formformat")
    public ResponseEntity<?> addNewFormFormat(@RequestBody FormFormat formFormat) {
        FormFormat savedFormFormat = adminServices.addNewFormFormat(formFormat);
        return new ResponseEntity<FormFormat>(savedFormFormat, HttpStatus.CREATED);
    }
    @GetMapping("formformats")
    public ResponseEntity<?> getAllFormFormats() {
        List<FormFormat> listOfAllFormFormats = adminServices.getAllFormFormats();
        return new ResponseEntity<List<FormFormat>>(listOfAllFormFormats, HttpStatus.OK);
    }
    @GetMapping("formformat/{formId}")
    public ResponseEntity<Optional<FormFormat>> getFormFormat(@PathVariable(value = "formId", required = true) int formId) {
        Optional<FormFormat> retreivedFormFormat = adminServices.getFormFormat(formId);
        if(retreivedFormFormat == null)
            return new ResponseEntity<Optional<FormFormat>>(retreivedFormFormat, HttpStatus.NOT_FOUND);
        return new ResponseEntity<Optional<FormFormat>>(retreivedFormFormat, HttpStatus.FOUND);
    }
    @DeleteMapping("formformat/{formId}")
    public ResponseEntity<?> deleteFormFormat(@PathVariable(value = "formId", required = true) int formId) {
        adminServices.deleteFormFormat(formId);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @PutMapping("formformat/{formId}")
    public ResponseEntity<FormFormat> updateFormFormat(@PathVariable(value = "formId", required = true) int formId, @RequestBody FormFormat updatedFormFormat) {
        FormFormat newFormFormat = adminServices.updateFormFormat(formId, updatedFormFormat);
        return new ResponseEntity<FormFormat>(newFormFormat, HttpStatus.OK);
    }
}

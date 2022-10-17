package com.msc.DTwinBackend.controller;

import com.msc.DTwinBackend.constant.AssemblyUnitConstant;
import com.msc.DTwinBackend.utils.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.controller
 * @Description:
 */
@RestController
@CrossOrigin
public class AccuracyPredictionController {
    @Autowired
    private CommonMethod commonMethod;

    @GetMapping("/camera")
    public String getCamera() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.CAMERA);
    }

    @GetMapping("/tightenForce")
    public String getTightenForce() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.TIGHTEN_FORCE);
    }
}

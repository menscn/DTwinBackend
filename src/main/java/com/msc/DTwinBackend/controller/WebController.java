package com.msc.DTwinBackend.controller;

import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
@CrossOrigin
public class WebController {
    @GetMapping("/all")
    public String getAll() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("Pro10", jedis.get("Pro10"));
        jsonObject.addProperty("Pro6", jedis.get("Pro6"));
        jsonObject.addProperty("Fix6", jedis.get("Fix6"));
        jsonObject.addProperty("Fix3", jedis.get("Fix3"));
        jsonObject.addProperty("A5", jedis.get("A5"));
        jsonObject.addProperty("Pro9", jedis.get("Pro9"));
        jsonObject.addProperty("B2", jedis.get("B2"));
        jsonObject.addProperty("B4", jedis.get("B4"));
        jsonObject.addProperty("tForce", jedis.get("tForce"));
        jsonObject.addProperty("CamX", jedis.get("CamX"));
        jsonObject.addProperty("Pro11", jedis.get("Pro11"));
        jsonObject.addProperty("CamA", jedis.get("CamA"));
        jsonObject.addProperty("Pro7", jedis.get("Pro7"));
        jsonObject.addProperty("B1", jedis.get("B1"));
        jsonObject.addProperty("BZ", jedis.get("BZ"));
        jsonObject.addProperty("CamY", jedis.get("CamY"));
        jsonObject.addProperty("Pro0", jedis.get("Pro0"));
        jsonObject.addProperty("Fix1", jedis.get("Fix1"));
        jsonObject.addProperty("BX", jedis.get("BX"));
        jsonObject.addProperty("BA", jedis.get("BA"));
        jsonObject.addProperty("B3", jedis.get("B3"));
        jsonObject.addProperty("B6", jedis.get("B6"));
        jsonObject.addProperty("BY", jedis.get("BY"));
        jsonObject.addProperty("A4", jedis.get("A4"));
        jsonObject.addProperty("A6", jedis.get("A6"));
        jsonObject.addProperty("A1", jedis.get("A1"));
        jsonObject.addProperty("Pro5", jedis.get("Pro5"));
        jsonObject.addProperty("FixOpen", jedis.get("FixOpen"));
        jsonObject.addProperty("Pro1", jedis.get("Pro1"));
        jsonObject.addProperty("Fix5", jedis.get("Fix5"));
        jsonObject.addProperty("B5", jedis.get("B5"));
        jsonObject.addProperty("FixClose", jedis.get("FixClose"));
        jsonObject.addProperty("AZ", jedis.get("AZ"));
        jsonObject.addProperty("AB", jedis.get("AB"));
        jsonObject.addProperty("BB", jedis.get("BB"));
        jsonObject.addProperty("AC", jedis.get("AC"));
        jsonObject.addProperty("Pro4", jedis.get("Pro4"));
        jsonObject.addProperty("Fix4", jedis.get("Fix4"));
        jsonObject.addProperty("AA", jedis.get("AA"));
        jsonObject.addProperty("Fix2", jedis.get("Fix2"));
        jsonObject.addProperty("A2", jedis.get("A2"));
        jsonObject.addProperty("BC", jedis.get("BC"));
        jsonObject.addProperty("A3", jedis.get("A3"));
        jsonObject.addProperty("Pro2", jedis.get("Pro2"));
        jsonObject.addProperty("AX", jedis.get("AX"));
        jsonObject.addProperty("AY", jedis.get("AY"));
        return jsonObject.toString();
    }

}
